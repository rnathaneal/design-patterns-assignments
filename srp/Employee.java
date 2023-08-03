package solid.live.srp;

public class Employee {
    private int empId;

    public int getEmpId() {
        return empId;
    }

    private static int TOTAL_LEAVES_ALLOWED = 30;

    private double monthlySalary;
    private String name;
    private String addressStreet;
    private String addressCity;
    private String addressCountry;
    private int leavesTaken;
    private int totalLeaveAllowed;
    private int leaveTaken;
    private String manager;
    private int yearsInOrg;
    private int thisYeard;
    private int[] leavesLeftPreviously;

    public Employee(int empId, double monthlySalary, String name, String addressStreet, String addressCity,
            String addressCountry, int leavesTaken, int[] leavesLeftPreviously) {
        this.empId = empId;
        this.monthlySalary = monthlySalary;
        this.name = name;
        this.addressStreet = addressStreet;
        this.addressCity = addressCity;
        this.addressCountry = addressCountry;
        this.leavesTaken = leavesTaken;
        this.leavesLeftPreviously = leavesLeftPreviously;
        this.yearsInOrg = leavesLeftPreviously.length;
    }

    public Employee() {
    }

    public void renderToHtml() {
        Renderer htmlRenderer = new Renderer();
        htmlRenderer.toHtml(this);
    }

    public int totalLeavesLeft() {
        int years = 3;
        if (yearsInOrg < 3) {
            years = yearsInOrg;
        }
        int totalLeaveLeftPreviously = 0;
        for (int i = 0; i < years; i++) {
            totalLeaveLeftPreviously += leavesLeftPreviously[yearsInOrg - i - 1];
        }
        return totalLeaveLeftPreviously;
    }

    public static int getTOTAL_LEAVES_ALLOWED() {
        return TOTAL_LEAVES_ALLOWED;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public String getName() {
        return name;
    }

    public String getAddressStreet() {
        return addressStreet;
    }

    public String getAddressCity() {
        return addressCity;
    }

    public String getAddressCountry() {
        return addressCountry;
    }

    public int getLeavesTaken() {
        return leavesTaken;
    }

    public int getTotalLeaveAllowed() {
        return totalLeaveAllowed;
    }

    public int getLeaveTaken() {
        return leaveTaken;
    }

    public String getManager() {
        return manager;
    }

    public int getYearsInOrg() {
        return yearsInOrg;
    }

    public int getThisYeard() {
        return thisYeard;
    }

    public int[] getLeavesLeftPreviously() {
        return leavesLeftPreviously;
    }

    // other method related to customer
}
