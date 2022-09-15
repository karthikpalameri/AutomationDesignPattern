package com.pojo;

public class Student {

    private String name;
    private String address;
    private String id;
    private boolean lovesCofee;

    private Student(String name, String address, String id, boolean lovesCofee) {
        this.name = name;
        this.address = address;
        this.id = id;
        this.lovesCofee = lovesCofee;
    }

    public static StudentBuilder builder() {
        return new StudentBuilder();
    }

    @Override
    public String toString() {
        return "StudentBuilder{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", id='" + id + '\'' +
                ", lovesCofee=" + lovesCofee +
                '}';
    }
    
    public static class StudentBuilder {
        private String name;
        private String address;
        private String id;
        private boolean lovesCofee;

        public Student build() {
            return new Student(name, address, id, lovesCofee);
        }


        public StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public StudentBuilder setId(String id) {
            this.id = id;
            return this;
        }

        public StudentBuilder setLovesCofee(boolean lovesCofee) {
            this.lovesCofee = lovesCofee;
            return this;
        }

    }

}
