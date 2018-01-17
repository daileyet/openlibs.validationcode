# openlibs.validationcode
The lib of java validation code generation

###

```xml
<dependency>
  <groupId>com.openthinks</groupId>
  <artifactId>openlibs.validationcode</artifactId>
  <version>1.0</version>
</dependency>
```

### usage

1. 纯数字

   ```java
   Validata validata = new NumberValidata(4);
   String generateCode = validata.create();
   ```

   ​

2. 纯字母

   ```java
    Validata validata = new LetterValidata(4);
    String generateCode = validata.create();
   ```

   ​

3. 纯中文

   ```java
   Validata validata = new CharacterValidata(4);
   String generateCode = validata.create();
   ```

   ​