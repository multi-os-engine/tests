import libcore.io.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({

    org.apache.harmony.tests.java.io.BufferedInputStreamTest.class,
    org.apache.harmony.tests.java.io.BufferedOutputStreamTest.class,
    org.apache.harmony.tests.java.io.BufferedReaderTest.class,
    org.apache.harmony.tests.java.io.BufferedWriterTest.class,
    org.apache.harmony.tests.java.io.ByteArrayInputStreamTest.class,
    org.apache.harmony.tests.java.io.ByteArrayOutputStreamTest.class,
    org.apache.harmony.tests.java.io.CharArrayReaderTest.class,
    org.apache.harmony.tests.java.io.CharArrayWriterTest.class,
    org.apache.harmony.tests.java.io.CharConversionExceptionTest.class,
    org.apache.harmony.tests.java.io.ComputeSerialVersionUIDTest.class,
    org.apache.harmony.tests.java.io.ConsoleTest.class,
    org.apache.harmony.tests.java.io.DataInputStreamTest.class,
    org.apache.harmony.tests.java.io.DataOutputStreamTest.class,
    org.apache.harmony.tests.java.io.EOFExceptionTest.class,
    org.apache.harmony.tests.java.io.FileDescriptorTest.class,
    org.apache.harmony.tests.java.io.FileInputStreamTest.class,
    org.apache.harmony.tests.java.io.FileNotFoundExceptionTest.class,
    org.apache.harmony.tests.java.io.FileOutputStreamTest.class,
    org.apache.harmony.tests.java.io.FileReaderTest.class,
    org.apache.harmony.tests.java.io.FileTest.class,
    org.apache.harmony.tests.java.io.FileWriterTest.class,
    org.apache.harmony.tests.java.io.FilterInputStreamTest.class,
    org.apache.harmony.tests.java.io.FilterOutputStreamTest.class,
    org.apache.harmony.tests.java.io.IOErrorTest.class,
    org.apache.harmony.tests.java.io.IOExceptionTest.class,
    org.apache.harmony.tests.java.io.InputStreamReaderTest.class,
    org.apache.harmony.tests.java.io.InputStreamTest.class,
    org.apache.harmony.tests.java.io.InterruptedIOExceptionTest.class,
    org.apache.harmony.tests.java.io.InvalidClassExceptionTest.class,
    org.apache.harmony.tests.java.io.LineNumberInputStreamTest.class,
    org.apache.harmony.tests.java.io.LineNumberReaderTest.class,
    org.apache.harmony.tests.java.io.NotActiveExceptionTest.class,
    org.apache.harmony.tests.java.io.NotSerializableExceptionTest.class,
    org.apache.harmony.tests.java.io.ObjectInputStream2Test.class,
    org.apache.harmony.tests.java.io.ObjectOutputStream2Test.class,
    org.apache.harmony.tests.java.io.ObjectOutputStreamTest.class,
    org.apache.harmony.tests.java.io.ObjectStreamClassTest.class,
    org.apache.harmony.tests.java.io.ObjectStreamConstantsTest.class,
    org.apache.harmony.tests.java.io.ObjectStreamFieldTest.class,
    org.apache.harmony.tests.java.io.OpenRandomFileTest.class,
    org.apache.harmony.tests.java.io.OutputStreamTesterTest.class,
    org.apache.harmony.tests.java.io.OutputStreamWriterTest.class,
    org.apache.harmony.tests.java.io.PipedInputStreamTest.class,
    org.apache.harmony.tests.java.io.PipedOutputStreamTest.class,
    org.apache.harmony.tests.java.io.PipedReaderTest.class,
    org.apache.harmony.tests.java.io.PipedWriterTest.class,
    org.apache.harmony.tests.java.io.PrintStreamTest.class,
    org.apache.harmony.tests.java.io.PrintWriterTest.class,
    org.apache.harmony.tests.java.io.PushbackInputStreamTest.class,
    org.apache.harmony.tests.java.io.PushbackReaderTest.class,
    org.apache.harmony.tests.java.io.ReaderTest.class,
    org.apache.harmony.tests.java.io.SequenceInputStreamTest.class,
    org.apache.harmony.tests.java.io.SerializationStressTest.class,
    org.apache.harmony.tests.java.io.SerializationStressTest1.class,
    org.apache.harmony.tests.java.io.SerializationStressTest2.class,
    org.apache.harmony.tests.java.io.SerializationStressTest3.class,
    org.apache.harmony.tests.java.io.SerializationStressTest4.class,
    org.apache.harmony.tests.java.io.StreamCorruptedExceptionTest.class,
    org.apache.harmony.tests.java.io.StreamTokenizerTest.class,
    org.apache.harmony.tests.java.io.StringBufferInputStreamTest.class,
    org.apache.harmony.tests.java.io.StringReaderTest.class,
    org.apache.harmony.tests.java.io.StringWriterTest.class,
    org.apache.harmony.tests.java.io.SyncFailedExceptionTest.class,
    org.apache.harmony.tests.java.io.UTFDataFormatExceptionTest.class,
    org.apache.harmony.tests.java.io.UnsupportedEncodingExceptionTest.class,
    org.apache.harmony.tests.java.io.WriteAbortedExceptionTest.class,
    org.apache.harmony.tests.java.io.WriterTest.class,
    org.apache.harmony.tests.java.io.WriterTesterTest.class,
    org.apache.harmony.luni.tests.java.io.ObjectInputStreamTest.class,
    org.apache.harmony.tests.java.io.RandomAccessFileTest.class,
    libcore.java.io.CharArrayWriterTest.class,
    libcore.java.io.DataOutputStreamTest.class,
    libcore.java.io.FileDescriptorTest.class,
    libcore.java.io.FileInputStreamTest.class,
    libcore.java.io.FileOutputStreamTest.class,
    libcore.java.io.FileTest.class,
    libcore.java.io.FilterInputStreamNullSourceTest.class,
    libcore.java.io.InputStreamReaderTest.class,
    libcore.java.io.InterruptedStreamTest.class, //crash
    libcore.java.io.ObjectOutputStreamTest.class,
    libcore.java.io.OldAndroidBufferedInputStreamTest.class,
    libcore.java.io.OldAndroidBufferedOutputStreamTest.class,
    libcore.java.io.OldAndroidBufferedReaderTest.class,
    libcore.java.io.OldAndroidBufferedWriterTest.class,
    libcore.java.io.OldAndroidByteArrayInputStreamTest.class,
    libcore.java.io.OldAndroidByteArrayOutputStreamTest.class,
    libcore.java.io.OldAndroidCharArrayReaderTest.class,
    libcore.java.io.OldAndroidDataInputStreamTest.class,
    libcore.java.io.OldAndroidDataOutputStreamTest.class,
    libcore.java.io.OldAndroidFileTest.class,
    libcore.java.io.OldAndroidInputStreamReaderTest.class,
    libcore.java.io.OldAndroidLineNumberReaderTest.class,
    libcore.java.io.OldAndroidOutputStreamWriterTest.class,
    libcore.java.io.OldAndroidPipedStreamTest.class,
    libcore.java.io.OldAndroidPrintWriterTest.class,
    libcore.java.io.OldAndroidPushbackInputStreamTest.class,
    libcore.java.io.OldAndroidPushbackReaderTest.class,
    libcore.java.io.OldAndroidSerializationTest.class,
    libcore.java.io.OldAndroidStreamTokenizerTest.class,
    libcore.java.io.OldAndroidStringReaderTest.class,
    libcore.java.io.OldAndroidStringWriterTest.class,
    libcore.java.io.OldBufferedOutputStreamTest.class,
    libcore.java.io.OldBufferedReaderTest.class,
    libcore.java.io.OldBufferedWriterTest.class,
    libcore.java.io.OldByteArrayInputStreamTest.class,
    libcore.java.io.OldByteArrayOutputStreamTest.class,
    libcore.java.io.OldCharArrayReaderTest.class,
    libcore.java.io.OldCharArrayWriterTest.class,
    libcore.java.io.OldDataInputOutputStreamTest.class,
    libcore.java.io.OldDataInputStreamTest.class,
    libcore.java.io.OldDataOutputStreamTest.class,
    libcore.java.io.OldFileReaderTest.class,
    libcore.java.io.OldFileTest.class,
    libcore.java.io.OldFileWriterTest.class,
    libcore.java.io.OldFilterInputStreamTest.class,
    libcore.java.io.OldFilterOutputStreamTest.class,
    libcore.java.io.OldFilterReaderTest.class,
    libcore.java.io.OldFilterWriterTest.class,
    libcore.java.io.OldInputStreamReaderTest.class,
    libcore.java.io.OldInputStreamTest.class,
    libcore.java.io.OldLineNumberInputStreamTest.class,
    libcore.java.io.OldLineNumberReaderTest.class,
    libcore.java.io.OldObjectInputOutputStreamTest.class,
    libcore.java.io.OldObjectInputStreamGetFieldTest.class,
    libcore.java.io.OldObjectOutputStreamPutFieldTest.class,
    libcore.java.io.OldObjectOutputStreamTest.class,
    libcore.java.io.OldObjectStreamFieldTest.class,
    libcore.java.io.OldOutputStreamTest.class,
    libcore.java.io.OldOutputStreamWriterTest.class,
    libcore.java.io.OldPipedOutputStreamTest.class,
    libcore.java.io.OldPipedWriterTest.class,
    libcore.java.io.OldPushbackInputStreamTest.class,
    libcore.java.io.OldPushbackReaderTest.class,
    libcore.java.io.OldRandomAccessFileTest.class,
    libcore.java.io.OldReaderTest.class,
    libcore.java.io.OldSequenceInputStreamTest.class,
    libcore.java.io.OldStreamTokenizerTest.class,
    libcore.java.io.OldStringBufferInputStreamTest.class,
    libcore.java.io.OldStringReaderTest.class,
    libcore.java.io.OldStringWriterTest.class,
    libcore.java.io.OldWriterTest.class,
    libcore.java.io.OutputStreamWriterTest.class,
    libcore.java.io.RandomAccessFileTest.class,
    libcore.java.io.SerializationTest.class,
    libcore.java.io.StreamTokenizerTest.class,

})

public class JunitExtJavaIo {
}