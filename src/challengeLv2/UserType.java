package challengeLv2;

public enum UserType {

    NONE(0, "일반", 0.0),
    PUBLIC_BENEFACTOR(1, "국가유공자", 0.1),
    SOLDIER(2, "군인", 0.5),
    STUDENT(3, "학생", 0.3);

    private final int code;
    private final String description;
    private final double discountRate;

    UserType(int code, String description, double discountRate) {
        this.code = code;
        this.description = description;
        this.discountRate = discountRate;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    // 번호로 UserType 찾기 메서드
    public static UserType fromCode(int code) {
        for (UserType type : UserType.values()) {
            if (type.getCode() == code) {
                return type;
            }
        }
        return NONE; // 기본값 반환
    }

    // 사용자 선택 안내 메시지 출력
    public static void printUserTypes() {
        for (UserType type : UserType.values()) {
            System.out.println(type.getCode() + ". " + type.getDescription());
        }
    }
}
