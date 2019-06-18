// ORM class for table 'task2'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Tue Jun 18 07:49:21 UTC 2019
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

public class task2 extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("app", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        app = (String)value;
      }
    });
    setters.put("rating", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rating = (java.math.BigDecimal)value;
      }
    });
  }
  public task2() {
    init0();
  }
  private String app;
  public String get_app() {
    return app;
  }
  public void set_app(String app) {
    this.app = app;
  }
  public task2 with_app(String app) {
    this.app = app;
    return this;
  }
  private java.math.BigDecimal rating;
  public java.math.BigDecimal get_rating() {
    return rating;
  }
  public void set_rating(java.math.BigDecimal rating) {
    this.rating = rating;
  }
  public task2 with_rating(java.math.BigDecimal rating) {
    this.rating = rating;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof task2)) {
      return false;
    }
    task2 that = (task2) o;
    boolean equal = true;
    equal = equal && (this.app == null ? that.app == null : this.app.equals(that.app));
    equal = equal && (this.rating == null ? that.rating == null : this.rating.equals(that.rating));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof task2)) {
      return false;
    }
    task2 that = (task2) o;
    boolean equal = true;
    equal = equal && (this.app == null ? that.app == null : this.app.equals(that.app));
    equal = equal && (this.rating == null ? that.rating == null : this.rating.equals(that.rating));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.app = JdbcWritableBridge.readString(1, __dbResults);
    this.rating = JdbcWritableBridge.readBigDecimal(2, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.app = JdbcWritableBridge.readString(1, __dbResults);
    this.rating = JdbcWritableBridge.readBigDecimal(2, __dbResults);
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
    JdbcWritableBridge.writeString(app, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(rating, 2 + __off, 3, __dbStmt);
    return 2;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(app, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(rating, 2 + __off, 3, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.app = null;
    } else {
    this.app = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.rating = null;
    } else {
    this.rating = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.app) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, app);
    }
    if (null == this.rating) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.rating, __dataOut);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.app) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, app);
    }
    if (null == this.rating) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.rating, __dataOut);
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
    __sb.append(FieldFormatter.escapeAndEnclose(app==null?"null":app, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(rating==null?"null":rating.toPlainString(), delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(app==null?"null":app, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(rating==null?"null":rating.toPlainString(), delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 9, (char) 10, (char) 0, (char) 0, false);
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
    if (__cur_str.equals("null")) { this.app = null; } else {
      this.app = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.rating = null; } else {
      this.rating = new java.math.BigDecimal(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.app = null; } else {
      this.app = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.rating = null; } else {
      this.rating = new java.math.BigDecimal(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    task2 o = (task2) super.clone();
    return o;
  }

  public void clone0(task2 o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("app", this.app);
    __sqoop$field_map.put("rating", this.rating);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("app", this.app);
    __sqoop$field_map.put("rating", this.rating);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
