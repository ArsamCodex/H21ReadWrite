package ReaWriteI;


import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;


public class Test {
    public static void main(String[] args) throws IOException {
        // Path re = Paths.get("c://Armin//reg.reg");
        try (
                FileInputStream in = new FileInputStream("c://Armin//reg.reg");
                FileOutputStream out = new FileOutputStream("c://Armin//reg.txt");


        ) {
            System.out.println(out.toString());
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();


        }
        System.out.println("MISSION COMPLETE ANY KEY TO EXIT");
    }
}


//        Path source = Paths.get("C:\\Windows\\System32\\config\\SYSTEM");
//        System.out.println(source.getFileName());
//        System.out.println(source.getParent());
//        System.out.println(source.isAbsolute());
//        System.out.println(source.toRealPath());
//
//        Path target = Paths.get("c://Armin//java//tII.txt" );
//        System.out.println(target.getFileName());
//
//        Charset charset = StandardCharsets.US_ASCII;
//
//        ArrayList<String> lines = new ArrayList<>();
//
//        try (BufferedReader reader = Files.newBufferedReader(source, charset)) {
//            String line = null;
//            while ((line = reader.readLine()) != null) {
//                System.out.println(line);
//                lines.add(line);
//
//            }
//        } catch (IOException e) {
//            System.err.println(e.getMessage());
//        }
//
////        FileWriter fw = new FileWriter(target,true);
//
//        try (BufferedWriter write = Files.newBufferedWriter(target, charset)) {
//
//            Iterator<String> iterator = lines.iterator();
//            while (iterator.hasNext()) {
//                String s = iterator.next();
//                write.append(s, 0, s.length());
//                write.newLine();
//            }
//
//
//        } catch (IOException e) {
//            System.err.println(e.getMessage());
//        }
//
//
//    }
//
//
//}


//        try (
//                FileInputStream in = new FileInputStream("c://Armin//q.JPG");
//                FileOutputStream out = new FileOutputStream("c://Armin//new.JPG");
//
//        ) {
//            int c;
//            while ((c = in.read()) != -1) {
//                out.write(c );
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//
//
//        }
//        System.out.println("MISSION COMPLETE ANY KEY TO EXIT");
//    }
//}
//
//


//        File dir = new File("c://Armin//exe");
//
//        String source = dir.getCanonicalPath() + File.separator + "jitsi.exe";
//        String dest = dir.getCanonicalPath() + File.separator + "b.txt";
//
//        File fin = new File(source);
//        FileInputStream fis = new FileInputStream(fin);
//        BufferedReader in = new BufferedReader(new InputStreamReader(fis));
//
//        FileWriter fstream = new FileWriter(dest, false);
//        BufferedWriter out = new BufferedWriter(fstream);
//
//        String aLine = null;
//        while ((aLine = in.readLine()) != null) {
//            //Process each line and add output to Dest.txt file
//            out.write(aLine);
//            out.newLine();
//        }
//
//        // do not forget to close the buffer reader
//        in.close();

//        // close buffer writer
//        out.close();
//        System.out.println("COPY FILE SUCCESS ENDED  , EXIT PROGRAM ");


//        FileInputStream fis = new FileInputStream("c://Armin//exe//jitsi.exe");
//
//        FileWriter writer = new FileWriter("a.txt", true);
//        writer.write("Hello World");
//        writer.write("\r\n");   // write new line
//        writer.write("Good Bye!");
//        writer.close();


//        FileInputStream fis = new FileInputStream("c://Armin//exe//jitsi.exe");
//        byte[] buffer = new byte[10];
//        StringBuilder sb = new StringBuilder();
//        while (fis.read(buffer) != -1) {
//            sb.append(new String(buffer));
//            buffer = new byte[10];
//        }
//        fis.close();
//
//        String content = sb.toString();
//        System.out.println(content);

//        PipedWriter writer = new PipedWriter();
//        PipedReader reader = new PipedReader();
//
//        writer.connect(reader);
//
//        writer.write(70);
//        writer.write(71);
//        writer.write(80);
//
//        int k = 0;
//
//        while ((k = reader.read()) != -1) {
//            char ch = (char) k;
//            System.out.print(ch + " : ");
//            System.out.println(k);


//        Path p = Path.of("c:/Armin/copy.txt");
//        String fileText = Files.readString(p);
//        List<String > line = Files.readAllLines(p);
//        line.forEach(System.out::println);
//        System.out.println( Files.isReadable(p));


//        OutputStream o = new FileOutputStream("C:\\Armin\\output.txt");
//        OutputStreamWriter ow = new OutputStreamWriter(o , "UTF-8");

//        Writer
//
//            out = new BufferedWriter(
//                    new OutputStreamWriter(new FileOutputStream("c://Armin//outpput.txt"), "UTF-8" ));
//
//
//            String text = "This text will be added to File !!";
//
//            out.write(text);
//            out.append("EZAFW KON BEBINSM ");
//            out.close();


//        FileWriter fr = new FileWriter("c:\\Armin\\copy.txt", true);
//        BufferedWriter bf = new BufferedWriter(fr);
//        bf.write("WElcoko to test me ");
//        bf.close();
//        System.out.println("good POINT");


//        Path pI = Paths.get("c:\\Armin\\copy.txt");
//
//        File fI = pI.toFile();
//        System.out.println(
//                    "File Name Is :" +fI.getName() +
//                     "Is Readable  : " + fI.canRead() +
//                     "Is Execuble : "  + fI.canExecute()+
//                     " Is writable : " + fI.canWrite()


//        Path path =Paths.get("C:/Armin/text1.txt");
//        Files.createDirectories(path.getParent());
//        if(Files.notExists(path)){
//            Files.createFile(path);
//            System.out.printf("Created");}
//        else {
//            System.out.println("A;ready exist");}
//
//        List<String> lines = new ArrayList<>();
//        lines.add( "hello");
//        lines.add("THIS IS SECOND LINE");
//        lines.add("to check it");
//
//        Files.write(path,lines,Charset.forName("UTF-8"),StandardOpenOption.APPEND);
//
//        DosFileAttributes attr = Files.readAttributes(path,DosFileAttributes.class);
//        System.out.println(attr.size());
//        System.out.println(attr.creationTime());
//        System.out.println(attr.lastAccessTime());
//        System.out.println(attr.lastModifiedTime());
//        System.out.println(attr.isArchive());
//        System.out.println(attr.isHidden());
//        System.out.println(attr.isReadOnly());
//           System.out.println();

//        Files.lines(path).forEach(System.out::println);
//
//
//        Path p2 = Paths.get("c:/Armin/copy.txt");
//        Files.copy(path,p2,StandardCopyOption.REPLACE_EXISTING);
//
//        Files.deleteIfExists(path);
//        System.out.println(Files.getOwner(p2));
//        System.out.println(pI);
//        System.out.println(pI.toAbsolutePath());
//        System.out.println(path.getFileSystem());
//        System.out.println(path.normalize());
//        System.out.println(path.getNameCount());
//        System.out.println(path.getParent());
//        System.out.println(pI.toRealPath());
//        }
//    }

