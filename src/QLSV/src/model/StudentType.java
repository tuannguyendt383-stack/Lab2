package QLSV.src.model;

public enum StudentType {
   REGULAR("sinh vien chinh quy"),
   PART_TIME("sinh vien vua hoc vua lam"),
   INTERNATIONAL("sinh vien quoc te");

   private final String description;

   StudentType(String description) {
        this.description = description;
   }
   @Override
   public String toString() {
      return description;
   }
   public String getDescription() {
      return description;
   }
}
