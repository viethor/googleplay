// ORM class for table 'task5'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Wed Jun 19 20:20:39 UTC 2019
// For connector: org.apache.sqoop.manager.SQLServerManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class task5 extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("col1", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        col1 = (String)value;
      }
    });
    setters.put("col2", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        col2 = (String)value;
      }
    });
    setters.put("col3", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        col3 = (String)value;
      }
    });
  }
  public task5() {
    init0();
  }
  private String col1;
  public String get_col1() {
    return col1;
  }
  public void set_col1(String col1) {
    this.col1 = col1;
  }
  public task5 with_col1(String col1) {
    this.col1 = col1;
    return this;
  }
  private String col2;
  public String get_col2() {
    return col2;
  }
  public void set_col2(String col2) {
    this.col2 = col2;
  }
  public task5 with_col2(String col2) {
    this.col2 = col2;
    return this;
  }
  private String col3;
  public String get_col3() {
    return col3;
  }
  public void set_col3(String col3) {
    this.col3 = col3;
  }
  public task5 with_col3(String col3) {
    this.col3 = col3;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof task5)) {
      return false;
    }
    task5 that = (task5) o;
    boolean equal = true;
    equal = equal && (this.col1 == null ? that.col1 == null : this.col1.equals(that.col1));
    equal = equal && (this.col2 == null ? that.col2 == null : this.col2.equals(that.col2));
    equal = equal && (this.col3 == null ? that.col3 == null : this.col3.equals(that.col3));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof task5)) {
      return false;
    }
    task5 that = (task5) o;
    boolean equal = true;
    equal = equal && (this.col1 == null ? that.col1 == null : this.col1.equals(that.col1));
    equal = equal && (this.col2 == null ? that.col2 == null : this.col2.equals(that.col2));
    equal = equal && (this.col3 == null ? that.col3 == null : this.col3.equals(that.col3));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.col1 = JdbcWritableBridge.readString(1, __dbResults);
    this.col2 = JdbcWritableBridge.readString(2, __dbResults);
    this.col3 = JdbcWritableBridge.readString(3, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.col1 = JdbcWritableBridge.readString(1, __dbResults);
    this.col2 = JdbcWritableBridge.readString(2, __dbResults);
    this.col3 = JdbcWritableBridge.readString(3, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(col1, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(col2, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(col3, 3 + __off, 12, __dbStmt);
    return 3;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(col1, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(col2, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(col3, 3 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.col1 = null;
    } else {
    this.col1 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.col2 = null;
    } else {
    this.col2 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.col3 = null;
    } else {
    this.col3 = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.col1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, col1);
    }
    if (null == this.col2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, col2);
    }
    if (null == this.col3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, col3);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.col1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, col1);
    }
    if (null == this.col2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, col2);
    }
    if (null == this.col3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, col3);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(col1==null?"null":col1, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(col2==null?"null":col2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(col3==null?"null":col3, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(col1==null?"null":col1, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(col2==null?"null":col2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(col3==null?"null":col3, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.col1 = null; } else {
      this.col1 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.col2 = null; } else {
      this.col2 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.col3 = null; } else {
      this.col3 = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.col1 = null; } else {
      this.col1 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.col2 = null; } else {
      this.col2 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.col3 = null; } else {
      this.col3 = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    task5 o = (task5) super.clone();
    return o;
  }

  public void clone0(task5 o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("col1", this.col1);
    __sqoop$field_map.put("col2", this.col2);
    __sqoop$field_map.put("col3", this.col3);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("col1", this.col1);
    __sqoop$field_map.put("col2", this.col2);
    __sqoop$field_map.put("col3", this.col3);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
