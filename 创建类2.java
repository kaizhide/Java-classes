import java.util.Scanner;
public class Gun2 {
	private String name;                // 枪名
    private String type;                // 类型
    private int ammoCapacity;           // 载弹量
    private String bulletType;          // 子弹类型
    private double gunLength;           // 枪长
    private double weight;              // 净重
    private int maxEffectiveRange;      // 最大有效射程
    private boolean canBurstFire;       // 是否可以连击
    private String origin;              // 产地
    private int magazineCapacity;       // 弹夹容量
    private int totalAmmo;              // 子弹总量

    public Gun2(String name, String type, int ammoCapacity, String bulletType, double gunLength, double weight, int maxEffectiveRange, boolean canBurstFire, String origin, int magazineCapacity) {
        this.name = name;
        this.type = type;
        this.ammoCapacity = ammoCapacity;
        this.bulletType = bulletType;
        this.gunLength = gunLength;
        this.weight = weight;
        this.maxEffectiveRange = maxEffectiveRange;
        this.canBurstFire = canBurstFire;
        this.origin = origin;
        this.magazineCapacity = magazineCapacity;
        this.totalAmmo = magazineCapacity;   // 初始子弹总量等于弹夹容量
    }
    public void displayGunProperties() {
        System.out.println("Gun Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Ammo Capacity: " + ammoCapacity);
        System.out.println("Bullet Type: " + bulletType);
        System.out.println("Gun Length: " + gunLength);
        System.out.println("Weight: " + weight);
        System.out.println("Max Effective Range: " + maxEffectiveRange);
        System.out.println("Burst Fire: " + (canBurstFire ? "Yes" : "No"));
        System.out.println("Origin: " + origin);
        System.out.println("Magazine Capacity: " + magazineCapacity);
    }
    public void shoot() {
        if (totalAmmo <= 0) {
            System.out.println("Out of ammo. Please reload!");//(弹药用完了。请重新换弹！)
            return;
        }
        if (canBurstFire) {
            if (totalAmmo < 3) {
                System.out.println("Insufficient ammo for burst fire. Please reload!");//(弹药不足，无法开火。请重新换弹！)
                return;
            }
            System.out.println("Burst Fire: Bang! Bang! Bang!");
            totalAmmo -= 3;                 // 一次打出3颗子弹
        } else {
            System.out.println("Single Fire: Bang!");
            totalAmmo--;                    // 一次打出1颗子弹
        }
    }
    public void reload() {
        int bulletsNeeded = magazineCapacity - totalAmmo;
        if (bulletsNeeded <= 0) {
            System.out.println("No need to reload. Magazine is already full!");//（无需重新加载。杂志已经满了）
            return;
        }
        if (ammoCapacity < bulletsNeeded) {
            System.out.println("Insufficient ammo to fully reload. Available ammo: " + ammoCapacity);//(弹药不足，无法完全重新装弹可用弹药容量)
            totalAmmo += ammoCapacity;      // 使用剩余的所有弹药
            ammoCapacity = 0;
        } else {
            System.out.println("Reloading...");
            totalAmmo += bulletsNeeded;     // 使子弹总量等于弹夹含量
            ammoCapacity -= bulletsNeeded;  // 减去使用的弹药数
        }
    }
}


import java.util.Scanner;
public class Main2 {
	    public static void main(String[] args) {
	        Gun2 gun = new Gun2("M4A1", "Assault Rifle", 30, "5.56mm", 90.0, 7.31, 500, true, "United States", 30);
	        Scanner scanner = new Scanner(System.in);
	        boolean isContinuousFire = false;   // 连发状态，默认为关闭

	        System.out.println("Gun Properties:");
	        gun.displayGunProperties();
	        System.out.println("\nControls:");//(\n控制)
	        System.out.println("Press SPACE to shoot");//(按空格键进行射击)
	        System.out.println("Press 'r' to reload");//(按“r”换子弹)
	        System.out.println("Press 'b' to toggle between single fire and burst fire");//(按“b”在单火和连发之间切换)

	        while (true) {
	            String input = scanner.nextLine();
	            if (input.equals(" ")) {  //(输入等于)
	                gun.shoot();
	            } else if (input.equals("r")) {
	                gun.reload(); 
	            } else if (input.equals("b")) {
	                isContinuousFire = !isContinuousFire;
	                System.out.println("Firing mode changed to " + (isContinuousFire ? "Burst Fire" : "Single Fire"));//(切换单发连发)
	            }
	        }
	    }
}