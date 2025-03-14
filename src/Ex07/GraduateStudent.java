package Ex07;
class GraduateStudent extends Student {
    private String researchTopic;
    private String supervisorName;

    public GraduateStudent(String name, String id, double gpa, String researchTopic, String supervisorName) {
        super(name, id, gpa);
        if (researchTopic.isEmpty() || supervisorName.isEmpty()) {
            throw new IllegalArgumentException("Đề tài nghiên cứu và tên giảng viên không được để trống.");
        }
        this.researchTopic = researchTopic;
        this.supervisorName = supervisorName;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Đề tài nghiên cứu: " + researchTopic + ", Giảng viên hướng dẫn: " + supervisorName;
    }
}
