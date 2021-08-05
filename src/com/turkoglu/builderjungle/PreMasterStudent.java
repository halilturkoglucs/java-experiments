package com.turkoglu.builderjungle;

public class PreMasterStudent extends MasterStudent {

    private String subSpecialisation;

    public PreMasterStudent(Builder builder) {
        super(builder);
        this.subSpecialisation = builder.subSpecialisation;
    }

    @Override
    public String toString() {
        return super.toString() + ", subSpecilisation: " + this.subSpecialisation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder extends MasterStudent.Builder<Builder> {

        private String subSpecialisation;

        @Override
        public Builder getThis() {
            return this;
        }

        public Builder subSpecialisation(String subSpecialisation) {
            this.subSpecialisation = subSpecialisation;
            return this;
        }

        public PreMasterStudent build() {
            return new PreMasterStudent(this);
        }

    }

}
