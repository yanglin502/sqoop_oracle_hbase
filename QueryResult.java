// ORM class for table 'null'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 14 03:36:23 GMT 2018
// For connector: org.apache.sqoop.manager.OracleManager
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

public class QueryResult extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("ROWKEY", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.ROWKEY = (String)value;
      }
    });
    setters.put("DATETIME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.DATETIME = (java.sql.Timestamp)value;
      }
    });
    setters.put("OUT_PATIENT_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.OUT_PATIENT_ID = (String)value;
      }
    });
    setters.put("HEALTH_CARD_NO", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.HEALTH_CARD_NO = (String)value;
      }
    });
    setters.put("OUTP_NO", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.OUTP_NO = (String)value;
      }
    });
    setters.put("VISIT_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.VISIT_ID = (String)value;
      }
    });
    setters.put("VISIT_TYPE_CODE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.VISIT_TYPE_CODE = (String)value;
      }
    });
    setters.put("VISIT_TYPE_NAME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.VISIT_TYPE_NAME = (String)value;
      }
    });
    setters.put("EMERGENCY_VISIT_IND", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.EMERGENCY_VISIT_IND = (String)value;
      }
    });
    setters.put("PERSON_NAME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.PERSON_NAME = (String)value;
      }
    });
    setters.put("CHARGE_TYPE_CODE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.CHARGE_TYPE_CODE = (String)value;
      }
    });
    setters.put("CHARGE_TYPE_NAME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.CHARGE_TYPE_NAME = (String)value;
      }
    });
    setters.put("DATE_OF_BIRTH", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.DATE_OF_BIRTH = (String)value;
      }
    });
    setters.put("ID_CARD_NO", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.ID_CARD_NO = (String)value;
      }
    });
    setters.put("SEX_CODE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.SEX_CODE = (String)value;
      }
    });
    setters.put("SEX_NAME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.SEX_NAME = (String)value;
      }
    });
    setters.put("MARITAL_STATUS_CODE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.MARITAL_STATUS_CODE = (String)value;
      }
    });
    setters.put("MARITAL_STATUS_NAME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.MARITAL_STATUS_NAME = (String)value;
      }
    });
    setters.put("OCCUPATION_CODE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.OCCUPATION_CODE = (String)value;
      }
    });
    setters.put("OCCUPATION_NAME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.OCCUPATION_NAME = (String)value;
      }
    });
    setters.put("PHONE_NUMBER", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.PHONE_NUMBER = (String)value;
      }
    });
    setters.put("MAILING_ADDRESS", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.MAILING_ADDRESS = (String)value;
      }
    });
    setters.put("VISIT_DEPT_CODE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.VISIT_DEPT_CODE = (String)value;
      }
    });
    setters.put("VISIT_DEPT_NAME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.VISIT_DEPT_NAME = (String)value;
      }
    });
    setters.put("VISIT_DOCTOR_CODE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.VISIT_DOCTOR_CODE = (String)value;
      }
    });
    setters.put("VISIT_DOCTOR_NAME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.VISIT_DOCTOR_NAME = (String)value;
      }
    });
    setters.put("REG_CATEGORY_CODE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.REG_CATEGORY_CODE = (String)value;
      }
    });
    setters.put("REG_CATEGORY_NAME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.REG_CATEGORY_NAME = (String)value;
      }
    });
    setters.put("REG_TYPE_CODE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.REG_TYPE_CODE = (String)value;
      }
    });
    setters.put("REG_TYPE_NAME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.REG_TYPE_NAME = (String)value;
      }
    });
    setters.put("REG_VISIT_SECTION_CODE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.REG_VISIT_SECTION_CODE = (String)value;
      }
    });
    setters.put("REG_VISIT_SECTION_NAME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.REG_VISIT_SECTION_NAME = (String)value;
      }
    });
    setters.put("REGISTER_BY_CODE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.REGISTER_BY_CODE = (String)value;
      }
    });
    setters.put("REGISTER_BY_NAME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.REGISTER_BY_NAME = (String)value;
      }
    });
    setters.put("REGISTING_TIME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.REGISTING_TIME = (String)value;
      }
    });
    setters.put("REGISTER_CANCEL_BY_CODE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.REGISTER_CANCEL_BY_CODE = (String)value;
      }
    });
    setters.put("REGISTER_CANCEL_BY_NAME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.REGISTER_CANCEL_BY_NAME = (String)value;
      }
    });
    setters.put("REGISTER_CANCEL_TIME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.REGISTER_CANCEL_TIME = (String)value;
      }
    });
    setters.put("SEPARATE_TIME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.SEPARATE_TIME = (String)value;
      }
    });
    setters.put("SEPARATE_OPER", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.SEPARATE_OPER = (String)value;
      }
    });
    setters.put("SEPARATE_NO", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.SEPARATE_NO = (String)value;
      }
    });
    setters.put("FIRSTV_INDICATOR", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.FIRSTV_INDICATOR = (String)value;
      }
    });
    setters.put("VISIT_TIME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.VISIT_TIME = (String)value;
      }
    });
    setters.put("VISIT_CONSALT_ROOM", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.VISIT_CONSALT_ROOM = (String)value;
      }
    });
  }
  public QueryResult() {
    init0();
  }
  private String ROWKEY;
  public String get_ROWKEY() {
    return ROWKEY;
  }
  public void set_ROWKEY(String ROWKEY) {
    this.ROWKEY = ROWKEY;
  }
  public QueryResult with_ROWKEY(String ROWKEY) {
    this.ROWKEY = ROWKEY;
    return this;
  }
  private java.sql.Timestamp DATETIME;
  public java.sql.Timestamp get_DATETIME() {
    return DATETIME;
  }
  public void set_DATETIME(java.sql.Timestamp DATETIME) {
    this.DATETIME = DATETIME;
  }
  public QueryResult with_DATETIME(java.sql.Timestamp DATETIME) {
    this.DATETIME = DATETIME;
    return this;
  }
  private String OUT_PATIENT_ID;
  public String get_OUT_PATIENT_ID() {
    return OUT_PATIENT_ID;
  }
  public void set_OUT_PATIENT_ID(String OUT_PATIENT_ID) {
    this.OUT_PATIENT_ID = OUT_PATIENT_ID;
  }
  public QueryResult with_OUT_PATIENT_ID(String OUT_PATIENT_ID) {
    this.OUT_PATIENT_ID = OUT_PATIENT_ID;
    return this;
  }
  private String HEALTH_CARD_NO;
  public String get_HEALTH_CARD_NO() {
    return HEALTH_CARD_NO;
  }
  public void set_HEALTH_CARD_NO(String HEALTH_CARD_NO) {
    this.HEALTH_CARD_NO = HEALTH_CARD_NO;
  }
  public QueryResult with_HEALTH_CARD_NO(String HEALTH_CARD_NO) {
    this.HEALTH_CARD_NO = HEALTH_CARD_NO;
    return this;
  }
  private String OUTP_NO;
  public String get_OUTP_NO() {
    return OUTP_NO;
  }
  public void set_OUTP_NO(String OUTP_NO) {
    this.OUTP_NO = OUTP_NO;
  }
  public QueryResult with_OUTP_NO(String OUTP_NO) {
    this.OUTP_NO = OUTP_NO;
    return this;
  }
  private String VISIT_ID;
  public String get_VISIT_ID() {
    return VISIT_ID;
  }
  public void set_VISIT_ID(String VISIT_ID) {
    this.VISIT_ID = VISIT_ID;
  }
  public QueryResult with_VISIT_ID(String VISIT_ID) {
    this.VISIT_ID = VISIT_ID;
    return this;
  }
  private String VISIT_TYPE_CODE;
  public String get_VISIT_TYPE_CODE() {
    return VISIT_TYPE_CODE;
  }
  public void set_VISIT_TYPE_CODE(String VISIT_TYPE_CODE) {
    this.VISIT_TYPE_CODE = VISIT_TYPE_CODE;
  }
  public QueryResult with_VISIT_TYPE_CODE(String VISIT_TYPE_CODE) {
    this.VISIT_TYPE_CODE = VISIT_TYPE_CODE;
    return this;
  }
  private String VISIT_TYPE_NAME;
  public String get_VISIT_TYPE_NAME() {
    return VISIT_TYPE_NAME;
  }
  public void set_VISIT_TYPE_NAME(String VISIT_TYPE_NAME) {
    this.VISIT_TYPE_NAME = VISIT_TYPE_NAME;
  }
  public QueryResult with_VISIT_TYPE_NAME(String VISIT_TYPE_NAME) {
    this.VISIT_TYPE_NAME = VISIT_TYPE_NAME;
    return this;
  }
  private String EMERGENCY_VISIT_IND;
  public String get_EMERGENCY_VISIT_IND() {
    return EMERGENCY_VISIT_IND;
  }
  public void set_EMERGENCY_VISIT_IND(String EMERGENCY_VISIT_IND) {
    this.EMERGENCY_VISIT_IND = EMERGENCY_VISIT_IND;
  }
  public QueryResult with_EMERGENCY_VISIT_IND(String EMERGENCY_VISIT_IND) {
    this.EMERGENCY_VISIT_IND = EMERGENCY_VISIT_IND;
    return this;
  }
  private String PERSON_NAME;
  public String get_PERSON_NAME() {
    return PERSON_NAME;
  }
  public void set_PERSON_NAME(String PERSON_NAME) {
    this.PERSON_NAME = PERSON_NAME;
  }
  public QueryResult with_PERSON_NAME(String PERSON_NAME) {
    this.PERSON_NAME = PERSON_NAME;
    return this;
  }
  private String CHARGE_TYPE_CODE;
  public String get_CHARGE_TYPE_CODE() {
    return CHARGE_TYPE_CODE;
  }
  public void set_CHARGE_TYPE_CODE(String CHARGE_TYPE_CODE) {
    this.CHARGE_TYPE_CODE = CHARGE_TYPE_CODE;
  }
  public QueryResult with_CHARGE_TYPE_CODE(String CHARGE_TYPE_CODE) {
    this.CHARGE_TYPE_CODE = CHARGE_TYPE_CODE;
    return this;
  }
  private String CHARGE_TYPE_NAME;
  public String get_CHARGE_TYPE_NAME() {
    return CHARGE_TYPE_NAME;
  }
  public void set_CHARGE_TYPE_NAME(String CHARGE_TYPE_NAME) {
    this.CHARGE_TYPE_NAME = CHARGE_TYPE_NAME;
  }
  public QueryResult with_CHARGE_TYPE_NAME(String CHARGE_TYPE_NAME) {
    this.CHARGE_TYPE_NAME = CHARGE_TYPE_NAME;
    return this;
  }
  private String DATE_OF_BIRTH;
  public String get_DATE_OF_BIRTH() {
    return DATE_OF_BIRTH;
  }
  public void set_DATE_OF_BIRTH(String DATE_OF_BIRTH) {
    this.DATE_OF_BIRTH = DATE_OF_BIRTH;
  }
  public QueryResult with_DATE_OF_BIRTH(String DATE_OF_BIRTH) {
    this.DATE_OF_BIRTH = DATE_OF_BIRTH;
    return this;
  }
  private String ID_CARD_NO;
  public String get_ID_CARD_NO() {
    return ID_CARD_NO;
  }
  public void set_ID_CARD_NO(String ID_CARD_NO) {
    this.ID_CARD_NO = ID_CARD_NO;
  }
  public QueryResult with_ID_CARD_NO(String ID_CARD_NO) {
    this.ID_CARD_NO = ID_CARD_NO;
    return this;
  }
  private String SEX_CODE;
  public String get_SEX_CODE() {
    return SEX_CODE;
  }
  public void set_SEX_CODE(String SEX_CODE) {
    this.SEX_CODE = SEX_CODE;
  }
  public QueryResult with_SEX_CODE(String SEX_CODE) {
    this.SEX_CODE = SEX_CODE;
    return this;
  }
  private String SEX_NAME;
  public String get_SEX_NAME() {
    return SEX_NAME;
  }
  public void set_SEX_NAME(String SEX_NAME) {
    this.SEX_NAME = SEX_NAME;
  }
  public QueryResult with_SEX_NAME(String SEX_NAME) {
    this.SEX_NAME = SEX_NAME;
    return this;
  }
  private String MARITAL_STATUS_CODE;
  public String get_MARITAL_STATUS_CODE() {
    return MARITAL_STATUS_CODE;
  }
  public void set_MARITAL_STATUS_CODE(String MARITAL_STATUS_CODE) {
    this.MARITAL_STATUS_CODE = MARITAL_STATUS_CODE;
  }
  public QueryResult with_MARITAL_STATUS_CODE(String MARITAL_STATUS_CODE) {
    this.MARITAL_STATUS_CODE = MARITAL_STATUS_CODE;
    return this;
  }
  private String MARITAL_STATUS_NAME;
  public String get_MARITAL_STATUS_NAME() {
    return MARITAL_STATUS_NAME;
  }
  public void set_MARITAL_STATUS_NAME(String MARITAL_STATUS_NAME) {
    this.MARITAL_STATUS_NAME = MARITAL_STATUS_NAME;
  }
  public QueryResult with_MARITAL_STATUS_NAME(String MARITAL_STATUS_NAME) {
    this.MARITAL_STATUS_NAME = MARITAL_STATUS_NAME;
    return this;
  }
  private String OCCUPATION_CODE;
  public String get_OCCUPATION_CODE() {
    return OCCUPATION_CODE;
  }
  public void set_OCCUPATION_CODE(String OCCUPATION_CODE) {
    this.OCCUPATION_CODE = OCCUPATION_CODE;
  }
  public QueryResult with_OCCUPATION_CODE(String OCCUPATION_CODE) {
    this.OCCUPATION_CODE = OCCUPATION_CODE;
    return this;
  }
  private String OCCUPATION_NAME;
  public String get_OCCUPATION_NAME() {
    return OCCUPATION_NAME;
  }
  public void set_OCCUPATION_NAME(String OCCUPATION_NAME) {
    this.OCCUPATION_NAME = OCCUPATION_NAME;
  }
  public QueryResult with_OCCUPATION_NAME(String OCCUPATION_NAME) {
    this.OCCUPATION_NAME = OCCUPATION_NAME;
    return this;
  }
  private String PHONE_NUMBER;
  public String get_PHONE_NUMBER() {
    return PHONE_NUMBER;
  }
  public void set_PHONE_NUMBER(String PHONE_NUMBER) {
    this.PHONE_NUMBER = PHONE_NUMBER;
  }
  public QueryResult with_PHONE_NUMBER(String PHONE_NUMBER) {
    this.PHONE_NUMBER = PHONE_NUMBER;
    return this;
  }
  private String MAILING_ADDRESS;
  public String get_MAILING_ADDRESS() {
    return MAILING_ADDRESS;
  }
  public void set_MAILING_ADDRESS(String MAILING_ADDRESS) {
    this.MAILING_ADDRESS = MAILING_ADDRESS;
  }
  public QueryResult with_MAILING_ADDRESS(String MAILING_ADDRESS) {
    this.MAILING_ADDRESS = MAILING_ADDRESS;
    return this;
  }
  private String VISIT_DEPT_CODE;
  public String get_VISIT_DEPT_CODE() {
    return VISIT_DEPT_CODE;
  }
  public void set_VISIT_DEPT_CODE(String VISIT_DEPT_CODE) {
    this.VISIT_DEPT_CODE = VISIT_DEPT_CODE;
  }
  public QueryResult with_VISIT_DEPT_CODE(String VISIT_DEPT_CODE) {
    this.VISIT_DEPT_CODE = VISIT_DEPT_CODE;
    return this;
  }
  private String VISIT_DEPT_NAME;
  public String get_VISIT_DEPT_NAME() {
    return VISIT_DEPT_NAME;
  }
  public void set_VISIT_DEPT_NAME(String VISIT_DEPT_NAME) {
    this.VISIT_DEPT_NAME = VISIT_DEPT_NAME;
  }
  public QueryResult with_VISIT_DEPT_NAME(String VISIT_DEPT_NAME) {
    this.VISIT_DEPT_NAME = VISIT_DEPT_NAME;
    return this;
  }
  private String VISIT_DOCTOR_CODE;
  public String get_VISIT_DOCTOR_CODE() {
    return VISIT_DOCTOR_CODE;
  }
  public void set_VISIT_DOCTOR_CODE(String VISIT_DOCTOR_CODE) {
    this.VISIT_DOCTOR_CODE = VISIT_DOCTOR_CODE;
  }
  public QueryResult with_VISIT_DOCTOR_CODE(String VISIT_DOCTOR_CODE) {
    this.VISIT_DOCTOR_CODE = VISIT_DOCTOR_CODE;
    return this;
  }
  private String VISIT_DOCTOR_NAME;
  public String get_VISIT_DOCTOR_NAME() {
    return VISIT_DOCTOR_NAME;
  }
  public void set_VISIT_DOCTOR_NAME(String VISIT_DOCTOR_NAME) {
    this.VISIT_DOCTOR_NAME = VISIT_DOCTOR_NAME;
  }
  public QueryResult with_VISIT_DOCTOR_NAME(String VISIT_DOCTOR_NAME) {
    this.VISIT_DOCTOR_NAME = VISIT_DOCTOR_NAME;
    return this;
  }
  private String REG_CATEGORY_CODE;
  public String get_REG_CATEGORY_CODE() {
    return REG_CATEGORY_CODE;
  }
  public void set_REG_CATEGORY_CODE(String REG_CATEGORY_CODE) {
    this.REG_CATEGORY_CODE = REG_CATEGORY_CODE;
  }
  public QueryResult with_REG_CATEGORY_CODE(String REG_CATEGORY_CODE) {
    this.REG_CATEGORY_CODE = REG_CATEGORY_CODE;
    return this;
  }
  private String REG_CATEGORY_NAME;
  public String get_REG_CATEGORY_NAME() {
    return REG_CATEGORY_NAME;
  }
  public void set_REG_CATEGORY_NAME(String REG_CATEGORY_NAME) {
    this.REG_CATEGORY_NAME = REG_CATEGORY_NAME;
  }
  public QueryResult with_REG_CATEGORY_NAME(String REG_CATEGORY_NAME) {
    this.REG_CATEGORY_NAME = REG_CATEGORY_NAME;
    return this;
  }
  private String REG_TYPE_CODE;
  public String get_REG_TYPE_CODE() {
    return REG_TYPE_CODE;
  }
  public void set_REG_TYPE_CODE(String REG_TYPE_CODE) {
    this.REG_TYPE_CODE = REG_TYPE_CODE;
  }
  public QueryResult with_REG_TYPE_CODE(String REG_TYPE_CODE) {
    this.REG_TYPE_CODE = REG_TYPE_CODE;
    return this;
  }
  private String REG_TYPE_NAME;
  public String get_REG_TYPE_NAME() {
    return REG_TYPE_NAME;
  }
  public void set_REG_TYPE_NAME(String REG_TYPE_NAME) {
    this.REG_TYPE_NAME = REG_TYPE_NAME;
  }
  public QueryResult with_REG_TYPE_NAME(String REG_TYPE_NAME) {
    this.REG_TYPE_NAME = REG_TYPE_NAME;
    return this;
  }
  private String REG_VISIT_SECTION_CODE;
  public String get_REG_VISIT_SECTION_CODE() {
    return REG_VISIT_SECTION_CODE;
  }
  public void set_REG_VISIT_SECTION_CODE(String REG_VISIT_SECTION_CODE) {
    this.REG_VISIT_SECTION_CODE = REG_VISIT_SECTION_CODE;
  }
  public QueryResult with_REG_VISIT_SECTION_CODE(String REG_VISIT_SECTION_CODE) {
    this.REG_VISIT_SECTION_CODE = REG_VISIT_SECTION_CODE;
    return this;
  }
  private String REG_VISIT_SECTION_NAME;
  public String get_REG_VISIT_SECTION_NAME() {
    return REG_VISIT_SECTION_NAME;
  }
  public void set_REG_VISIT_SECTION_NAME(String REG_VISIT_SECTION_NAME) {
    this.REG_VISIT_SECTION_NAME = REG_VISIT_SECTION_NAME;
  }
  public QueryResult with_REG_VISIT_SECTION_NAME(String REG_VISIT_SECTION_NAME) {
    this.REG_VISIT_SECTION_NAME = REG_VISIT_SECTION_NAME;
    return this;
  }
  private String REGISTER_BY_CODE;
  public String get_REGISTER_BY_CODE() {
    return REGISTER_BY_CODE;
  }
  public void set_REGISTER_BY_CODE(String REGISTER_BY_CODE) {
    this.REGISTER_BY_CODE = REGISTER_BY_CODE;
  }
  public QueryResult with_REGISTER_BY_CODE(String REGISTER_BY_CODE) {
    this.REGISTER_BY_CODE = REGISTER_BY_CODE;
    return this;
  }
  private String REGISTER_BY_NAME;
  public String get_REGISTER_BY_NAME() {
    return REGISTER_BY_NAME;
  }
  public void set_REGISTER_BY_NAME(String REGISTER_BY_NAME) {
    this.REGISTER_BY_NAME = REGISTER_BY_NAME;
  }
  public QueryResult with_REGISTER_BY_NAME(String REGISTER_BY_NAME) {
    this.REGISTER_BY_NAME = REGISTER_BY_NAME;
    return this;
  }
  private String REGISTING_TIME;
  public String get_REGISTING_TIME() {
    return REGISTING_TIME;
  }
  public void set_REGISTING_TIME(String REGISTING_TIME) {
    this.REGISTING_TIME = REGISTING_TIME;
  }
  public QueryResult with_REGISTING_TIME(String REGISTING_TIME) {
    this.REGISTING_TIME = REGISTING_TIME;
    return this;
  }
  private String REGISTER_CANCEL_BY_CODE;
  public String get_REGISTER_CANCEL_BY_CODE() {
    return REGISTER_CANCEL_BY_CODE;
  }
  public void set_REGISTER_CANCEL_BY_CODE(String REGISTER_CANCEL_BY_CODE) {
    this.REGISTER_CANCEL_BY_CODE = REGISTER_CANCEL_BY_CODE;
  }
  public QueryResult with_REGISTER_CANCEL_BY_CODE(String REGISTER_CANCEL_BY_CODE) {
    this.REGISTER_CANCEL_BY_CODE = REGISTER_CANCEL_BY_CODE;
    return this;
  }
  private String REGISTER_CANCEL_BY_NAME;
  public String get_REGISTER_CANCEL_BY_NAME() {
    return REGISTER_CANCEL_BY_NAME;
  }
  public void set_REGISTER_CANCEL_BY_NAME(String REGISTER_CANCEL_BY_NAME) {
    this.REGISTER_CANCEL_BY_NAME = REGISTER_CANCEL_BY_NAME;
  }
  public QueryResult with_REGISTER_CANCEL_BY_NAME(String REGISTER_CANCEL_BY_NAME) {
    this.REGISTER_CANCEL_BY_NAME = REGISTER_CANCEL_BY_NAME;
    return this;
  }
  private String REGISTER_CANCEL_TIME;
  public String get_REGISTER_CANCEL_TIME() {
    return REGISTER_CANCEL_TIME;
  }
  public void set_REGISTER_CANCEL_TIME(String REGISTER_CANCEL_TIME) {
    this.REGISTER_CANCEL_TIME = REGISTER_CANCEL_TIME;
  }
  public QueryResult with_REGISTER_CANCEL_TIME(String REGISTER_CANCEL_TIME) {
    this.REGISTER_CANCEL_TIME = REGISTER_CANCEL_TIME;
    return this;
  }
  private String SEPARATE_TIME;
  public String get_SEPARATE_TIME() {
    return SEPARATE_TIME;
  }
  public void set_SEPARATE_TIME(String SEPARATE_TIME) {
    this.SEPARATE_TIME = SEPARATE_TIME;
  }
  public QueryResult with_SEPARATE_TIME(String SEPARATE_TIME) {
    this.SEPARATE_TIME = SEPARATE_TIME;
    return this;
  }
  private String SEPARATE_OPER;
  public String get_SEPARATE_OPER() {
    return SEPARATE_OPER;
  }
  public void set_SEPARATE_OPER(String SEPARATE_OPER) {
    this.SEPARATE_OPER = SEPARATE_OPER;
  }
  public QueryResult with_SEPARATE_OPER(String SEPARATE_OPER) {
    this.SEPARATE_OPER = SEPARATE_OPER;
    return this;
  }
  private String SEPARATE_NO;
  public String get_SEPARATE_NO() {
    return SEPARATE_NO;
  }
  public void set_SEPARATE_NO(String SEPARATE_NO) {
    this.SEPARATE_NO = SEPARATE_NO;
  }
  public QueryResult with_SEPARATE_NO(String SEPARATE_NO) {
    this.SEPARATE_NO = SEPARATE_NO;
    return this;
  }
  private String FIRSTV_INDICATOR;
  public String get_FIRSTV_INDICATOR() {
    return FIRSTV_INDICATOR;
  }
  public void set_FIRSTV_INDICATOR(String FIRSTV_INDICATOR) {
    this.FIRSTV_INDICATOR = FIRSTV_INDICATOR;
  }
  public QueryResult with_FIRSTV_INDICATOR(String FIRSTV_INDICATOR) {
    this.FIRSTV_INDICATOR = FIRSTV_INDICATOR;
    return this;
  }
  private String VISIT_TIME;
  public String get_VISIT_TIME() {
    return VISIT_TIME;
  }
  public void set_VISIT_TIME(String VISIT_TIME) {
    this.VISIT_TIME = VISIT_TIME;
  }
  public QueryResult with_VISIT_TIME(String VISIT_TIME) {
    this.VISIT_TIME = VISIT_TIME;
    return this;
  }
  private String VISIT_CONSALT_ROOM;
  public String get_VISIT_CONSALT_ROOM() {
    return VISIT_CONSALT_ROOM;
  }
  public void set_VISIT_CONSALT_ROOM(String VISIT_CONSALT_ROOM) {
    this.VISIT_CONSALT_ROOM = VISIT_CONSALT_ROOM;
  }
  public QueryResult with_VISIT_CONSALT_ROOM(String VISIT_CONSALT_ROOM) {
    this.VISIT_CONSALT_ROOM = VISIT_CONSALT_ROOM;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof QueryResult)) {
      return false;
    }
    QueryResult that = (QueryResult) o;
    boolean equal = true;
    equal = equal && (this.ROWKEY == null ? that.ROWKEY == null : this.ROWKEY.equals(that.ROWKEY));
    equal = equal && (this.DATETIME == null ? that.DATETIME == null : this.DATETIME.equals(that.DATETIME));
    equal = equal && (this.OUT_PATIENT_ID == null ? that.OUT_PATIENT_ID == null : this.OUT_PATIENT_ID.equals(that.OUT_PATIENT_ID));
    equal = equal && (this.HEALTH_CARD_NO == null ? that.HEALTH_CARD_NO == null : this.HEALTH_CARD_NO.equals(that.HEALTH_CARD_NO));
    equal = equal && (this.OUTP_NO == null ? that.OUTP_NO == null : this.OUTP_NO.equals(that.OUTP_NO));
    equal = equal && (this.VISIT_ID == null ? that.VISIT_ID == null : this.VISIT_ID.equals(that.VISIT_ID));
    equal = equal && (this.VISIT_TYPE_CODE == null ? that.VISIT_TYPE_CODE == null : this.VISIT_TYPE_CODE.equals(that.VISIT_TYPE_CODE));
    equal = equal && (this.VISIT_TYPE_NAME == null ? that.VISIT_TYPE_NAME == null : this.VISIT_TYPE_NAME.equals(that.VISIT_TYPE_NAME));
    equal = equal && (this.EMERGENCY_VISIT_IND == null ? that.EMERGENCY_VISIT_IND == null : this.EMERGENCY_VISIT_IND.equals(that.EMERGENCY_VISIT_IND));
    equal = equal && (this.PERSON_NAME == null ? that.PERSON_NAME == null : this.PERSON_NAME.equals(that.PERSON_NAME));
    equal = equal && (this.CHARGE_TYPE_CODE == null ? that.CHARGE_TYPE_CODE == null : this.CHARGE_TYPE_CODE.equals(that.CHARGE_TYPE_CODE));
    equal = equal && (this.CHARGE_TYPE_NAME == null ? that.CHARGE_TYPE_NAME == null : this.CHARGE_TYPE_NAME.equals(that.CHARGE_TYPE_NAME));
    equal = equal && (this.DATE_OF_BIRTH == null ? that.DATE_OF_BIRTH == null : this.DATE_OF_BIRTH.equals(that.DATE_OF_BIRTH));
    equal = equal && (this.ID_CARD_NO == null ? that.ID_CARD_NO == null : this.ID_CARD_NO.equals(that.ID_CARD_NO));
    equal = equal && (this.SEX_CODE == null ? that.SEX_CODE == null : this.SEX_CODE.equals(that.SEX_CODE));
    equal = equal && (this.SEX_NAME == null ? that.SEX_NAME == null : this.SEX_NAME.equals(that.SEX_NAME));
    equal = equal && (this.MARITAL_STATUS_CODE == null ? that.MARITAL_STATUS_CODE == null : this.MARITAL_STATUS_CODE.equals(that.MARITAL_STATUS_CODE));
    equal = equal && (this.MARITAL_STATUS_NAME == null ? that.MARITAL_STATUS_NAME == null : this.MARITAL_STATUS_NAME.equals(that.MARITAL_STATUS_NAME));
    equal = equal && (this.OCCUPATION_CODE == null ? that.OCCUPATION_CODE == null : this.OCCUPATION_CODE.equals(that.OCCUPATION_CODE));
    equal = equal && (this.OCCUPATION_NAME == null ? that.OCCUPATION_NAME == null : this.OCCUPATION_NAME.equals(that.OCCUPATION_NAME));
    equal = equal && (this.PHONE_NUMBER == null ? that.PHONE_NUMBER == null : this.PHONE_NUMBER.equals(that.PHONE_NUMBER));
    equal = equal && (this.MAILING_ADDRESS == null ? that.MAILING_ADDRESS == null : this.MAILING_ADDRESS.equals(that.MAILING_ADDRESS));
    equal = equal && (this.VISIT_DEPT_CODE == null ? that.VISIT_DEPT_CODE == null : this.VISIT_DEPT_CODE.equals(that.VISIT_DEPT_CODE));
    equal = equal && (this.VISIT_DEPT_NAME == null ? that.VISIT_DEPT_NAME == null : this.VISIT_DEPT_NAME.equals(that.VISIT_DEPT_NAME));
    equal = equal && (this.VISIT_DOCTOR_CODE == null ? that.VISIT_DOCTOR_CODE == null : this.VISIT_DOCTOR_CODE.equals(that.VISIT_DOCTOR_CODE));
    equal = equal && (this.VISIT_DOCTOR_NAME == null ? that.VISIT_DOCTOR_NAME == null : this.VISIT_DOCTOR_NAME.equals(that.VISIT_DOCTOR_NAME));
    equal = equal && (this.REG_CATEGORY_CODE == null ? that.REG_CATEGORY_CODE == null : this.REG_CATEGORY_CODE.equals(that.REG_CATEGORY_CODE));
    equal = equal && (this.REG_CATEGORY_NAME == null ? that.REG_CATEGORY_NAME == null : this.REG_CATEGORY_NAME.equals(that.REG_CATEGORY_NAME));
    equal = equal && (this.REG_TYPE_CODE == null ? that.REG_TYPE_CODE == null : this.REG_TYPE_CODE.equals(that.REG_TYPE_CODE));
    equal = equal && (this.REG_TYPE_NAME == null ? that.REG_TYPE_NAME == null : this.REG_TYPE_NAME.equals(that.REG_TYPE_NAME));
    equal = equal && (this.REG_VISIT_SECTION_CODE == null ? that.REG_VISIT_SECTION_CODE == null : this.REG_VISIT_SECTION_CODE.equals(that.REG_VISIT_SECTION_CODE));
    equal = equal && (this.REG_VISIT_SECTION_NAME == null ? that.REG_VISIT_SECTION_NAME == null : this.REG_VISIT_SECTION_NAME.equals(that.REG_VISIT_SECTION_NAME));
    equal = equal && (this.REGISTER_BY_CODE == null ? that.REGISTER_BY_CODE == null : this.REGISTER_BY_CODE.equals(that.REGISTER_BY_CODE));
    equal = equal && (this.REGISTER_BY_NAME == null ? that.REGISTER_BY_NAME == null : this.REGISTER_BY_NAME.equals(that.REGISTER_BY_NAME));
    equal = equal && (this.REGISTING_TIME == null ? that.REGISTING_TIME == null : this.REGISTING_TIME.equals(that.REGISTING_TIME));
    equal = equal && (this.REGISTER_CANCEL_BY_CODE == null ? that.REGISTER_CANCEL_BY_CODE == null : this.REGISTER_CANCEL_BY_CODE.equals(that.REGISTER_CANCEL_BY_CODE));
    equal = equal && (this.REGISTER_CANCEL_BY_NAME == null ? that.REGISTER_CANCEL_BY_NAME == null : this.REGISTER_CANCEL_BY_NAME.equals(that.REGISTER_CANCEL_BY_NAME));
    equal = equal && (this.REGISTER_CANCEL_TIME == null ? that.REGISTER_CANCEL_TIME == null : this.REGISTER_CANCEL_TIME.equals(that.REGISTER_CANCEL_TIME));
    equal = equal && (this.SEPARATE_TIME == null ? that.SEPARATE_TIME == null : this.SEPARATE_TIME.equals(that.SEPARATE_TIME));
    equal = equal && (this.SEPARATE_OPER == null ? that.SEPARATE_OPER == null : this.SEPARATE_OPER.equals(that.SEPARATE_OPER));
    equal = equal && (this.SEPARATE_NO == null ? that.SEPARATE_NO == null : this.SEPARATE_NO.equals(that.SEPARATE_NO));
    equal = equal && (this.FIRSTV_INDICATOR == null ? that.FIRSTV_INDICATOR == null : this.FIRSTV_INDICATOR.equals(that.FIRSTV_INDICATOR));
    equal = equal && (this.VISIT_TIME == null ? that.VISIT_TIME == null : this.VISIT_TIME.equals(that.VISIT_TIME));
    equal = equal && (this.VISIT_CONSALT_ROOM == null ? that.VISIT_CONSALT_ROOM == null : this.VISIT_CONSALT_ROOM.equals(that.VISIT_CONSALT_ROOM));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof QueryResult)) {
      return false;
    }
    QueryResult that = (QueryResult) o;
    boolean equal = true;
    equal = equal && (this.ROWKEY == null ? that.ROWKEY == null : this.ROWKEY.equals(that.ROWKEY));
    equal = equal && (this.DATETIME == null ? that.DATETIME == null : this.DATETIME.equals(that.DATETIME));
    equal = equal && (this.OUT_PATIENT_ID == null ? that.OUT_PATIENT_ID == null : this.OUT_PATIENT_ID.equals(that.OUT_PATIENT_ID));
    equal = equal && (this.HEALTH_CARD_NO == null ? that.HEALTH_CARD_NO == null : this.HEALTH_CARD_NO.equals(that.HEALTH_CARD_NO));
    equal = equal && (this.OUTP_NO == null ? that.OUTP_NO == null : this.OUTP_NO.equals(that.OUTP_NO));
    equal = equal && (this.VISIT_ID == null ? that.VISIT_ID == null : this.VISIT_ID.equals(that.VISIT_ID));
    equal = equal && (this.VISIT_TYPE_CODE == null ? that.VISIT_TYPE_CODE == null : this.VISIT_TYPE_CODE.equals(that.VISIT_TYPE_CODE));
    equal = equal && (this.VISIT_TYPE_NAME == null ? that.VISIT_TYPE_NAME == null : this.VISIT_TYPE_NAME.equals(that.VISIT_TYPE_NAME));
    equal = equal && (this.EMERGENCY_VISIT_IND == null ? that.EMERGENCY_VISIT_IND == null : this.EMERGENCY_VISIT_IND.equals(that.EMERGENCY_VISIT_IND));
    equal = equal && (this.PERSON_NAME == null ? that.PERSON_NAME == null : this.PERSON_NAME.equals(that.PERSON_NAME));
    equal = equal && (this.CHARGE_TYPE_CODE == null ? that.CHARGE_TYPE_CODE == null : this.CHARGE_TYPE_CODE.equals(that.CHARGE_TYPE_CODE));
    equal = equal && (this.CHARGE_TYPE_NAME == null ? that.CHARGE_TYPE_NAME == null : this.CHARGE_TYPE_NAME.equals(that.CHARGE_TYPE_NAME));
    equal = equal && (this.DATE_OF_BIRTH == null ? that.DATE_OF_BIRTH == null : this.DATE_OF_BIRTH.equals(that.DATE_OF_BIRTH));
    equal = equal && (this.ID_CARD_NO == null ? that.ID_CARD_NO == null : this.ID_CARD_NO.equals(that.ID_CARD_NO));
    equal = equal && (this.SEX_CODE == null ? that.SEX_CODE == null : this.SEX_CODE.equals(that.SEX_CODE));
    equal = equal && (this.SEX_NAME == null ? that.SEX_NAME == null : this.SEX_NAME.equals(that.SEX_NAME));
    equal = equal && (this.MARITAL_STATUS_CODE == null ? that.MARITAL_STATUS_CODE == null : this.MARITAL_STATUS_CODE.equals(that.MARITAL_STATUS_CODE));
    equal = equal && (this.MARITAL_STATUS_NAME == null ? that.MARITAL_STATUS_NAME == null : this.MARITAL_STATUS_NAME.equals(that.MARITAL_STATUS_NAME));
    equal = equal && (this.OCCUPATION_CODE == null ? that.OCCUPATION_CODE == null : this.OCCUPATION_CODE.equals(that.OCCUPATION_CODE));
    equal = equal && (this.OCCUPATION_NAME == null ? that.OCCUPATION_NAME == null : this.OCCUPATION_NAME.equals(that.OCCUPATION_NAME));
    equal = equal && (this.PHONE_NUMBER == null ? that.PHONE_NUMBER == null : this.PHONE_NUMBER.equals(that.PHONE_NUMBER));
    equal = equal && (this.MAILING_ADDRESS == null ? that.MAILING_ADDRESS == null : this.MAILING_ADDRESS.equals(that.MAILING_ADDRESS));
    equal = equal && (this.VISIT_DEPT_CODE == null ? that.VISIT_DEPT_CODE == null : this.VISIT_DEPT_CODE.equals(that.VISIT_DEPT_CODE));
    equal = equal && (this.VISIT_DEPT_NAME == null ? that.VISIT_DEPT_NAME == null : this.VISIT_DEPT_NAME.equals(that.VISIT_DEPT_NAME));
    equal = equal && (this.VISIT_DOCTOR_CODE == null ? that.VISIT_DOCTOR_CODE == null : this.VISIT_DOCTOR_CODE.equals(that.VISIT_DOCTOR_CODE));
    equal = equal && (this.VISIT_DOCTOR_NAME == null ? that.VISIT_DOCTOR_NAME == null : this.VISIT_DOCTOR_NAME.equals(that.VISIT_DOCTOR_NAME));
    equal = equal && (this.REG_CATEGORY_CODE == null ? that.REG_CATEGORY_CODE == null : this.REG_CATEGORY_CODE.equals(that.REG_CATEGORY_CODE));
    equal = equal && (this.REG_CATEGORY_NAME == null ? that.REG_CATEGORY_NAME == null : this.REG_CATEGORY_NAME.equals(that.REG_CATEGORY_NAME));
    equal = equal && (this.REG_TYPE_CODE == null ? that.REG_TYPE_CODE == null : this.REG_TYPE_CODE.equals(that.REG_TYPE_CODE));
    equal = equal && (this.REG_TYPE_NAME == null ? that.REG_TYPE_NAME == null : this.REG_TYPE_NAME.equals(that.REG_TYPE_NAME));
    equal = equal && (this.REG_VISIT_SECTION_CODE == null ? that.REG_VISIT_SECTION_CODE == null : this.REG_VISIT_SECTION_CODE.equals(that.REG_VISIT_SECTION_CODE));
    equal = equal && (this.REG_VISIT_SECTION_NAME == null ? that.REG_VISIT_SECTION_NAME == null : this.REG_VISIT_SECTION_NAME.equals(that.REG_VISIT_SECTION_NAME));
    equal = equal && (this.REGISTER_BY_CODE == null ? that.REGISTER_BY_CODE == null : this.REGISTER_BY_CODE.equals(that.REGISTER_BY_CODE));
    equal = equal && (this.REGISTER_BY_NAME == null ? that.REGISTER_BY_NAME == null : this.REGISTER_BY_NAME.equals(that.REGISTER_BY_NAME));
    equal = equal && (this.REGISTING_TIME == null ? that.REGISTING_TIME == null : this.REGISTING_TIME.equals(that.REGISTING_TIME));
    equal = equal && (this.REGISTER_CANCEL_BY_CODE == null ? that.REGISTER_CANCEL_BY_CODE == null : this.REGISTER_CANCEL_BY_CODE.equals(that.REGISTER_CANCEL_BY_CODE));
    equal = equal && (this.REGISTER_CANCEL_BY_NAME == null ? that.REGISTER_CANCEL_BY_NAME == null : this.REGISTER_CANCEL_BY_NAME.equals(that.REGISTER_CANCEL_BY_NAME));
    equal = equal && (this.REGISTER_CANCEL_TIME == null ? that.REGISTER_CANCEL_TIME == null : this.REGISTER_CANCEL_TIME.equals(that.REGISTER_CANCEL_TIME));
    equal = equal && (this.SEPARATE_TIME == null ? that.SEPARATE_TIME == null : this.SEPARATE_TIME.equals(that.SEPARATE_TIME));
    equal = equal && (this.SEPARATE_OPER == null ? that.SEPARATE_OPER == null : this.SEPARATE_OPER.equals(that.SEPARATE_OPER));
    equal = equal && (this.SEPARATE_NO == null ? that.SEPARATE_NO == null : this.SEPARATE_NO.equals(that.SEPARATE_NO));
    equal = equal && (this.FIRSTV_INDICATOR == null ? that.FIRSTV_INDICATOR == null : this.FIRSTV_INDICATOR.equals(that.FIRSTV_INDICATOR));
    equal = equal && (this.VISIT_TIME == null ? that.VISIT_TIME == null : this.VISIT_TIME.equals(that.VISIT_TIME));
    equal = equal && (this.VISIT_CONSALT_ROOM == null ? that.VISIT_CONSALT_ROOM == null : this.VISIT_CONSALT_ROOM.equals(that.VISIT_CONSALT_ROOM));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.ROWKEY = JdbcWritableBridge.readString(1, __dbResults);
    this.DATETIME = JdbcWritableBridge.readTimestamp(2, __dbResults);
    this.OUT_PATIENT_ID = JdbcWritableBridge.readString(3, __dbResults);
    this.HEALTH_CARD_NO = JdbcWritableBridge.readString(4, __dbResults);
    this.OUTP_NO = JdbcWritableBridge.readString(5, __dbResults);
    this.VISIT_ID = JdbcWritableBridge.readString(6, __dbResults);
    this.VISIT_TYPE_CODE = JdbcWritableBridge.readString(7, __dbResults);
    this.VISIT_TYPE_NAME = JdbcWritableBridge.readString(8, __dbResults);
    this.EMERGENCY_VISIT_IND = JdbcWritableBridge.readString(9, __dbResults);
    this.PERSON_NAME = JdbcWritableBridge.readString(10, __dbResults);
    this.CHARGE_TYPE_CODE = JdbcWritableBridge.readString(11, __dbResults);
    this.CHARGE_TYPE_NAME = JdbcWritableBridge.readString(12, __dbResults);
    this.DATE_OF_BIRTH = JdbcWritableBridge.readString(13, __dbResults);
    this.ID_CARD_NO = JdbcWritableBridge.readString(14, __dbResults);
    this.SEX_CODE = JdbcWritableBridge.readString(15, __dbResults);
    this.SEX_NAME = JdbcWritableBridge.readString(16, __dbResults);
    this.MARITAL_STATUS_CODE = JdbcWritableBridge.readString(17, __dbResults);
    this.MARITAL_STATUS_NAME = JdbcWritableBridge.readString(18, __dbResults);
    this.OCCUPATION_CODE = JdbcWritableBridge.readString(19, __dbResults);
    this.OCCUPATION_NAME = JdbcWritableBridge.readString(20, __dbResults);
    this.PHONE_NUMBER = JdbcWritableBridge.readString(21, __dbResults);
    this.MAILING_ADDRESS = JdbcWritableBridge.readString(22, __dbResults);
    this.VISIT_DEPT_CODE = JdbcWritableBridge.readString(23, __dbResults);
    this.VISIT_DEPT_NAME = JdbcWritableBridge.readString(24, __dbResults);
    this.VISIT_DOCTOR_CODE = JdbcWritableBridge.readString(25, __dbResults);
    this.VISIT_DOCTOR_NAME = JdbcWritableBridge.readString(26, __dbResults);
    this.REG_CATEGORY_CODE = JdbcWritableBridge.readString(27, __dbResults);
    this.REG_CATEGORY_NAME = JdbcWritableBridge.readString(28, __dbResults);
    this.REG_TYPE_CODE = JdbcWritableBridge.readString(29, __dbResults);
    this.REG_TYPE_NAME = JdbcWritableBridge.readString(30, __dbResults);
    this.REG_VISIT_SECTION_CODE = JdbcWritableBridge.readString(31, __dbResults);
    this.REG_VISIT_SECTION_NAME = JdbcWritableBridge.readString(32, __dbResults);
    this.REGISTER_BY_CODE = JdbcWritableBridge.readString(33, __dbResults);
    this.REGISTER_BY_NAME = JdbcWritableBridge.readString(34, __dbResults);
    this.REGISTING_TIME = JdbcWritableBridge.readString(35, __dbResults);
    this.REGISTER_CANCEL_BY_CODE = JdbcWritableBridge.readString(36, __dbResults);
    this.REGISTER_CANCEL_BY_NAME = JdbcWritableBridge.readString(37, __dbResults);
    this.REGISTER_CANCEL_TIME = JdbcWritableBridge.readString(38, __dbResults);
    this.SEPARATE_TIME = JdbcWritableBridge.readString(39, __dbResults);
    this.SEPARATE_OPER = JdbcWritableBridge.readString(40, __dbResults);
    this.SEPARATE_NO = JdbcWritableBridge.readString(41, __dbResults);
    this.FIRSTV_INDICATOR = JdbcWritableBridge.readString(42, __dbResults);
    this.VISIT_TIME = JdbcWritableBridge.readString(43, __dbResults);
    this.VISIT_CONSALT_ROOM = JdbcWritableBridge.readString(44, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.ROWKEY = JdbcWritableBridge.readString(1, __dbResults);
    this.DATETIME = JdbcWritableBridge.readTimestamp(2, __dbResults);
    this.OUT_PATIENT_ID = JdbcWritableBridge.readString(3, __dbResults);
    this.HEALTH_CARD_NO = JdbcWritableBridge.readString(4, __dbResults);
    this.OUTP_NO = JdbcWritableBridge.readString(5, __dbResults);
    this.VISIT_ID = JdbcWritableBridge.readString(6, __dbResults);
    this.VISIT_TYPE_CODE = JdbcWritableBridge.readString(7, __dbResults);
    this.VISIT_TYPE_NAME = JdbcWritableBridge.readString(8, __dbResults);
    this.EMERGENCY_VISIT_IND = JdbcWritableBridge.readString(9, __dbResults);
    this.PERSON_NAME = JdbcWritableBridge.readString(10, __dbResults);
    this.CHARGE_TYPE_CODE = JdbcWritableBridge.readString(11, __dbResults);
    this.CHARGE_TYPE_NAME = JdbcWritableBridge.readString(12, __dbResults);
    this.DATE_OF_BIRTH = JdbcWritableBridge.readString(13, __dbResults);
    this.ID_CARD_NO = JdbcWritableBridge.readString(14, __dbResults);
    this.SEX_CODE = JdbcWritableBridge.readString(15, __dbResults);
    this.SEX_NAME = JdbcWritableBridge.readString(16, __dbResults);
    this.MARITAL_STATUS_CODE = JdbcWritableBridge.readString(17, __dbResults);
    this.MARITAL_STATUS_NAME = JdbcWritableBridge.readString(18, __dbResults);
    this.OCCUPATION_CODE = JdbcWritableBridge.readString(19, __dbResults);
    this.OCCUPATION_NAME = JdbcWritableBridge.readString(20, __dbResults);
    this.PHONE_NUMBER = JdbcWritableBridge.readString(21, __dbResults);
    this.MAILING_ADDRESS = JdbcWritableBridge.readString(22, __dbResults);
    this.VISIT_DEPT_CODE = JdbcWritableBridge.readString(23, __dbResults);
    this.VISIT_DEPT_NAME = JdbcWritableBridge.readString(24, __dbResults);
    this.VISIT_DOCTOR_CODE = JdbcWritableBridge.readString(25, __dbResults);
    this.VISIT_DOCTOR_NAME = JdbcWritableBridge.readString(26, __dbResults);
    this.REG_CATEGORY_CODE = JdbcWritableBridge.readString(27, __dbResults);
    this.REG_CATEGORY_NAME = JdbcWritableBridge.readString(28, __dbResults);
    this.REG_TYPE_CODE = JdbcWritableBridge.readString(29, __dbResults);
    this.REG_TYPE_NAME = JdbcWritableBridge.readString(30, __dbResults);
    this.REG_VISIT_SECTION_CODE = JdbcWritableBridge.readString(31, __dbResults);
    this.REG_VISIT_SECTION_NAME = JdbcWritableBridge.readString(32, __dbResults);
    this.REGISTER_BY_CODE = JdbcWritableBridge.readString(33, __dbResults);
    this.REGISTER_BY_NAME = JdbcWritableBridge.readString(34, __dbResults);
    this.REGISTING_TIME = JdbcWritableBridge.readString(35, __dbResults);
    this.REGISTER_CANCEL_BY_CODE = JdbcWritableBridge.readString(36, __dbResults);
    this.REGISTER_CANCEL_BY_NAME = JdbcWritableBridge.readString(37, __dbResults);
    this.REGISTER_CANCEL_TIME = JdbcWritableBridge.readString(38, __dbResults);
    this.SEPARATE_TIME = JdbcWritableBridge.readString(39, __dbResults);
    this.SEPARATE_OPER = JdbcWritableBridge.readString(40, __dbResults);
    this.SEPARATE_NO = JdbcWritableBridge.readString(41, __dbResults);
    this.FIRSTV_INDICATOR = JdbcWritableBridge.readString(42, __dbResults);
    this.VISIT_TIME = JdbcWritableBridge.readString(43, __dbResults);
    this.VISIT_CONSALT_ROOM = JdbcWritableBridge.readString(44, __dbResults);
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
    JdbcWritableBridge.writeString(ROWKEY, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(DATETIME, 2 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(OUT_PATIENT_ID, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(HEALTH_CARD_NO, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(OUTP_NO, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(VISIT_ID, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(VISIT_TYPE_CODE, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(VISIT_TYPE_NAME, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(EMERGENCY_VISIT_IND, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(PERSON_NAME, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CHARGE_TYPE_CODE, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CHARGE_TYPE_NAME, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DATE_OF_BIRTH, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ID_CARD_NO, 14 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(SEX_CODE, 15 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(SEX_NAME, 16 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MARITAL_STATUS_CODE, 17 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MARITAL_STATUS_NAME, 18 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(OCCUPATION_CODE, 19 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(OCCUPATION_NAME, 20 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(PHONE_NUMBER, 21 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MAILING_ADDRESS, 22 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(VISIT_DEPT_CODE, 23 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(VISIT_DEPT_NAME, 24 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(VISIT_DOCTOR_CODE, 25 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(VISIT_DOCTOR_NAME, 26 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(REG_CATEGORY_CODE, 27 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(REG_CATEGORY_NAME, 28 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(REG_TYPE_CODE, 29 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(REG_TYPE_NAME, 30 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(REG_VISIT_SECTION_CODE, 31 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(REG_VISIT_SECTION_NAME, 32 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(REGISTER_BY_CODE, 33 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(REGISTER_BY_NAME, 34 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(REGISTING_TIME, 35 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(REGISTER_CANCEL_BY_CODE, 36 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(REGISTER_CANCEL_BY_NAME, 37 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(REGISTER_CANCEL_TIME, 38 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(SEPARATE_TIME, 39 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(SEPARATE_OPER, 40 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(SEPARATE_NO, 41 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(FIRSTV_INDICATOR, 42 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(VISIT_TIME, 43 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(VISIT_CONSALT_ROOM, 44 + __off, 12, __dbStmt);
    return 44;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(ROWKEY, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(DATETIME, 2 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(OUT_PATIENT_ID, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(HEALTH_CARD_NO, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(OUTP_NO, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(VISIT_ID, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(VISIT_TYPE_CODE, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(VISIT_TYPE_NAME, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(EMERGENCY_VISIT_IND, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(PERSON_NAME, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CHARGE_TYPE_CODE, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CHARGE_TYPE_NAME, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DATE_OF_BIRTH, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ID_CARD_NO, 14 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(SEX_CODE, 15 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(SEX_NAME, 16 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MARITAL_STATUS_CODE, 17 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MARITAL_STATUS_NAME, 18 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(OCCUPATION_CODE, 19 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(OCCUPATION_NAME, 20 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(PHONE_NUMBER, 21 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MAILING_ADDRESS, 22 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(VISIT_DEPT_CODE, 23 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(VISIT_DEPT_NAME, 24 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(VISIT_DOCTOR_CODE, 25 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(VISIT_DOCTOR_NAME, 26 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(REG_CATEGORY_CODE, 27 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(REG_CATEGORY_NAME, 28 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(REG_TYPE_CODE, 29 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(REG_TYPE_NAME, 30 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(REG_VISIT_SECTION_CODE, 31 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(REG_VISIT_SECTION_NAME, 32 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(REGISTER_BY_CODE, 33 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(REGISTER_BY_NAME, 34 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(REGISTING_TIME, 35 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(REGISTER_CANCEL_BY_CODE, 36 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(REGISTER_CANCEL_BY_NAME, 37 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(REGISTER_CANCEL_TIME, 38 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(SEPARATE_TIME, 39 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(SEPARATE_OPER, 40 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(SEPARATE_NO, 41 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(FIRSTV_INDICATOR, 42 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(VISIT_TIME, 43 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(VISIT_CONSALT_ROOM, 44 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.ROWKEY = null;
    } else {
    this.ROWKEY = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DATETIME = null;
    } else {
    this.DATETIME = new Timestamp(__dataIn.readLong());
    this.DATETIME.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.OUT_PATIENT_ID = null;
    } else {
    this.OUT_PATIENT_ID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.HEALTH_CARD_NO = null;
    } else {
    this.HEALTH_CARD_NO = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.OUTP_NO = null;
    } else {
    this.OUTP_NO = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.VISIT_ID = null;
    } else {
    this.VISIT_ID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.VISIT_TYPE_CODE = null;
    } else {
    this.VISIT_TYPE_CODE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.VISIT_TYPE_NAME = null;
    } else {
    this.VISIT_TYPE_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.EMERGENCY_VISIT_IND = null;
    } else {
    this.EMERGENCY_VISIT_IND = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PERSON_NAME = null;
    } else {
    this.PERSON_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CHARGE_TYPE_CODE = null;
    } else {
    this.CHARGE_TYPE_CODE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CHARGE_TYPE_NAME = null;
    } else {
    this.CHARGE_TYPE_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DATE_OF_BIRTH = null;
    } else {
    this.DATE_OF_BIRTH = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ID_CARD_NO = null;
    } else {
    this.ID_CARD_NO = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.SEX_CODE = null;
    } else {
    this.SEX_CODE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.SEX_NAME = null;
    } else {
    this.SEX_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.MARITAL_STATUS_CODE = null;
    } else {
    this.MARITAL_STATUS_CODE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.MARITAL_STATUS_NAME = null;
    } else {
    this.MARITAL_STATUS_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.OCCUPATION_CODE = null;
    } else {
    this.OCCUPATION_CODE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.OCCUPATION_NAME = null;
    } else {
    this.OCCUPATION_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PHONE_NUMBER = null;
    } else {
    this.PHONE_NUMBER = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.MAILING_ADDRESS = null;
    } else {
    this.MAILING_ADDRESS = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.VISIT_DEPT_CODE = null;
    } else {
    this.VISIT_DEPT_CODE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.VISIT_DEPT_NAME = null;
    } else {
    this.VISIT_DEPT_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.VISIT_DOCTOR_CODE = null;
    } else {
    this.VISIT_DOCTOR_CODE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.VISIT_DOCTOR_NAME = null;
    } else {
    this.VISIT_DOCTOR_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.REG_CATEGORY_CODE = null;
    } else {
    this.REG_CATEGORY_CODE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.REG_CATEGORY_NAME = null;
    } else {
    this.REG_CATEGORY_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.REG_TYPE_CODE = null;
    } else {
    this.REG_TYPE_CODE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.REG_TYPE_NAME = null;
    } else {
    this.REG_TYPE_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.REG_VISIT_SECTION_CODE = null;
    } else {
    this.REG_VISIT_SECTION_CODE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.REG_VISIT_SECTION_NAME = null;
    } else {
    this.REG_VISIT_SECTION_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.REGISTER_BY_CODE = null;
    } else {
    this.REGISTER_BY_CODE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.REGISTER_BY_NAME = null;
    } else {
    this.REGISTER_BY_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.REGISTING_TIME = null;
    } else {
    this.REGISTING_TIME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.REGISTER_CANCEL_BY_CODE = null;
    } else {
    this.REGISTER_CANCEL_BY_CODE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.REGISTER_CANCEL_BY_NAME = null;
    } else {
    this.REGISTER_CANCEL_BY_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.REGISTER_CANCEL_TIME = null;
    } else {
    this.REGISTER_CANCEL_TIME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.SEPARATE_TIME = null;
    } else {
    this.SEPARATE_TIME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.SEPARATE_OPER = null;
    } else {
    this.SEPARATE_OPER = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.SEPARATE_NO = null;
    } else {
    this.SEPARATE_NO = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FIRSTV_INDICATOR = null;
    } else {
    this.FIRSTV_INDICATOR = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.VISIT_TIME = null;
    } else {
    this.VISIT_TIME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.VISIT_CONSALT_ROOM = null;
    } else {
    this.VISIT_CONSALT_ROOM = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.ROWKEY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ROWKEY);
    }
    if (null == this.DATETIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.DATETIME.getTime());
    __dataOut.writeInt(this.DATETIME.getNanos());
    }
    if (null == this.OUT_PATIENT_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, OUT_PATIENT_ID);
    }
    if (null == this.HEALTH_CARD_NO) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, HEALTH_CARD_NO);
    }
    if (null == this.OUTP_NO) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, OUTP_NO);
    }
    if (null == this.VISIT_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, VISIT_ID);
    }
    if (null == this.VISIT_TYPE_CODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, VISIT_TYPE_CODE);
    }
    if (null == this.VISIT_TYPE_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, VISIT_TYPE_NAME);
    }
    if (null == this.EMERGENCY_VISIT_IND) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, EMERGENCY_VISIT_IND);
    }
    if (null == this.PERSON_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PERSON_NAME);
    }
    if (null == this.CHARGE_TYPE_CODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CHARGE_TYPE_CODE);
    }
    if (null == this.CHARGE_TYPE_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CHARGE_TYPE_NAME);
    }
    if (null == this.DATE_OF_BIRTH) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DATE_OF_BIRTH);
    }
    if (null == this.ID_CARD_NO) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ID_CARD_NO);
    }
    if (null == this.SEX_CODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SEX_CODE);
    }
    if (null == this.SEX_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SEX_NAME);
    }
    if (null == this.MARITAL_STATUS_CODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MARITAL_STATUS_CODE);
    }
    if (null == this.MARITAL_STATUS_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MARITAL_STATUS_NAME);
    }
    if (null == this.OCCUPATION_CODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, OCCUPATION_CODE);
    }
    if (null == this.OCCUPATION_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, OCCUPATION_NAME);
    }
    if (null == this.PHONE_NUMBER) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PHONE_NUMBER);
    }
    if (null == this.MAILING_ADDRESS) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MAILING_ADDRESS);
    }
    if (null == this.VISIT_DEPT_CODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, VISIT_DEPT_CODE);
    }
    if (null == this.VISIT_DEPT_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, VISIT_DEPT_NAME);
    }
    if (null == this.VISIT_DOCTOR_CODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, VISIT_DOCTOR_CODE);
    }
    if (null == this.VISIT_DOCTOR_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, VISIT_DOCTOR_NAME);
    }
    if (null == this.REG_CATEGORY_CODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, REG_CATEGORY_CODE);
    }
    if (null == this.REG_CATEGORY_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, REG_CATEGORY_NAME);
    }
    if (null == this.REG_TYPE_CODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, REG_TYPE_CODE);
    }
    if (null == this.REG_TYPE_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, REG_TYPE_NAME);
    }
    if (null == this.REG_VISIT_SECTION_CODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, REG_VISIT_SECTION_CODE);
    }
    if (null == this.REG_VISIT_SECTION_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, REG_VISIT_SECTION_NAME);
    }
    if (null == this.REGISTER_BY_CODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, REGISTER_BY_CODE);
    }
    if (null == this.REGISTER_BY_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, REGISTER_BY_NAME);
    }
    if (null == this.REGISTING_TIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, REGISTING_TIME);
    }
    if (null == this.REGISTER_CANCEL_BY_CODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, REGISTER_CANCEL_BY_CODE);
    }
    if (null == this.REGISTER_CANCEL_BY_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, REGISTER_CANCEL_BY_NAME);
    }
    if (null == this.REGISTER_CANCEL_TIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, REGISTER_CANCEL_TIME);
    }
    if (null == this.SEPARATE_TIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SEPARATE_TIME);
    }
    if (null == this.SEPARATE_OPER) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SEPARATE_OPER);
    }
    if (null == this.SEPARATE_NO) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SEPARATE_NO);
    }
    if (null == this.FIRSTV_INDICATOR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FIRSTV_INDICATOR);
    }
    if (null == this.VISIT_TIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, VISIT_TIME);
    }
    if (null == this.VISIT_CONSALT_ROOM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, VISIT_CONSALT_ROOM);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.ROWKEY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ROWKEY);
    }
    if (null == this.DATETIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.DATETIME.getTime());
    __dataOut.writeInt(this.DATETIME.getNanos());
    }
    if (null == this.OUT_PATIENT_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, OUT_PATIENT_ID);
    }
    if (null == this.HEALTH_CARD_NO) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, HEALTH_CARD_NO);
    }
    if (null == this.OUTP_NO) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, OUTP_NO);
    }
    if (null == this.VISIT_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, VISIT_ID);
    }
    if (null == this.VISIT_TYPE_CODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, VISIT_TYPE_CODE);
    }
    if (null == this.VISIT_TYPE_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, VISIT_TYPE_NAME);
    }
    if (null == this.EMERGENCY_VISIT_IND) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, EMERGENCY_VISIT_IND);
    }
    if (null == this.PERSON_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PERSON_NAME);
    }
    if (null == this.CHARGE_TYPE_CODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CHARGE_TYPE_CODE);
    }
    if (null == this.CHARGE_TYPE_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CHARGE_TYPE_NAME);
    }
    if (null == this.DATE_OF_BIRTH) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DATE_OF_BIRTH);
    }
    if (null == this.ID_CARD_NO) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ID_CARD_NO);
    }
    if (null == this.SEX_CODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SEX_CODE);
    }
    if (null == this.SEX_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SEX_NAME);
    }
    if (null == this.MARITAL_STATUS_CODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MARITAL_STATUS_CODE);
    }
    if (null == this.MARITAL_STATUS_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MARITAL_STATUS_NAME);
    }
    if (null == this.OCCUPATION_CODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, OCCUPATION_CODE);
    }
    if (null == this.OCCUPATION_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, OCCUPATION_NAME);
    }
    if (null == this.PHONE_NUMBER) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PHONE_NUMBER);
    }
    if (null == this.MAILING_ADDRESS) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MAILING_ADDRESS);
    }
    if (null == this.VISIT_DEPT_CODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, VISIT_DEPT_CODE);
    }
    if (null == this.VISIT_DEPT_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, VISIT_DEPT_NAME);
    }
    if (null == this.VISIT_DOCTOR_CODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, VISIT_DOCTOR_CODE);
    }
    if (null == this.VISIT_DOCTOR_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, VISIT_DOCTOR_NAME);
    }
    if (null == this.REG_CATEGORY_CODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, REG_CATEGORY_CODE);
    }
    if (null == this.REG_CATEGORY_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, REG_CATEGORY_NAME);
    }
    if (null == this.REG_TYPE_CODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, REG_TYPE_CODE);
    }
    if (null == this.REG_TYPE_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, REG_TYPE_NAME);
    }
    if (null == this.REG_VISIT_SECTION_CODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, REG_VISIT_SECTION_CODE);
    }
    if (null == this.REG_VISIT_SECTION_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, REG_VISIT_SECTION_NAME);
    }
    if (null == this.REGISTER_BY_CODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, REGISTER_BY_CODE);
    }
    if (null == this.REGISTER_BY_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, REGISTER_BY_NAME);
    }
    if (null == this.REGISTING_TIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, REGISTING_TIME);
    }
    if (null == this.REGISTER_CANCEL_BY_CODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, REGISTER_CANCEL_BY_CODE);
    }
    if (null == this.REGISTER_CANCEL_BY_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, REGISTER_CANCEL_BY_NAME);
    }
    if (null == this.REGISTER_CANCEL_TIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, REGISTER_CANCEL_TIME);
    }
    if (null == this.SEPARATE_TIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SEPARATE_TIME);
    }
    if (null == this.SEPARATE_OPER) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SEPARATE_OPER);
    }
    if (null == this.SEPARATE_NO) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SEPARATE_NO);
    }
    if (null == this.FIRSTV_INDICATOR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FIRSTV_INDICATOR);
    }
    if (null == this.VISIT_TIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, VISIT_TIME);
    }
    if (null == this.VISIT_CONSALT_ROOM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, VISIT_CONSALT_ROOM);
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
    __sb.append(FieldFormatter.escapeAndEnclose(ROWKEY==null?"null":ROWKEY, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DATETIME==null?"null":"" + DATETIME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OUT_PATIENT_ID==null?"null":OUT_PATIENT_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HEALTH_CARD_NO==null?"null":HEALTH_CARD_NO, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OUTP_NO==null?"null":OUTP_NO, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VISIT_ID==null?"null":VISIT_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VISIT_TYPE_CODE==null?"null":VISIT_TYPE_CODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VISIT_TYPE_NAME==null?"null":VISIT_TYPE_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(EMERGENCY_VISIT_IND==null?"null":EMERGENCY_VISIT_IND, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PERSON_NAME==null?"null":PERSON_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CHARGE_TYPE_CODE==null?"null":CHARGE_TYPE_CODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CHARGE_TYPE_NAME==null?"null":CHARGE_TYPE_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DATE_OF_BIRTH==null?"null":DATE_OF_BIRTH, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ID_CARD_NO==null?"null":ID_CARD_NO, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SEX_CODE==null?"null":SEX_CODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SEX_NAME==null?"null":SEX_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MARITAL_STATUS_CODE==null?"null":MARITAL_STATUS_CODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MARITAL_STATUS_NAME==null?"null":MARITAL_STATUS_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OCCUPATION_CODE==null?"null":OCCUPATION_CODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OCCUPATION_NAME==null?"null":OCCUPATION_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PHONE_NUMBER==null?"null":PHONE_NUMBER, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MAILING_ADDRESS==null?"null":MAILING_ADDRESS, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VISIT_DEPT_CODE==null?"null":VISIT_DEPT_CODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VISIT_DEPT_NAME==null?"null":VISIT_DEPT_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VISIT_DOCTOR_CODE==null?"null":VISIT_DOCTOR_CODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VISIT_DOCTOR_NAME==null?"null":VISIT_DOCTOR_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(REG_CATEGORY_CODE==null?"null":REG_CATEGORY_CODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(REG_CATEGORY_NAME==null?"null":REG_CATEGORY_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(REG_TYPE_CODE==null?"null":REG_TYPE_CODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(REG_TYPE_NAME==null?"null":REG_TYPE_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(REG_VISIT_SECTION_CODE==null?"null":REG_VISIT_SECTION_CODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(REG_VISIT_SECTION_NAME==null?"null":REG_VISIT_SECTION_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(REGISTER_BY_CODE==null?"null":REGISTER_BY_CODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(REGISTER_BY_NAME==null?"null":REGISTER_BY_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(REGISTING_TIME==null?"null":REGISTING_TIME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(REGISTER_CANCEL_BY_CODE==null?"null":REGISTER_CANCEL_BY_CODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(REGISTER_CANCEL_BY_NAME==null?"null":REGISTER_CANCEL_BY_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(REGISTER_CANCEL_TIME==null?"null":REGISTER_CANCEL_TIME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SEPARATE_TIME==null?"null":SEPARATE_TIME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SEPARATE_OPER==null?"null":SEPARATE_OPER, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SEPARATE_NO==null?"null":SEPARATE_NO, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FIRSTV_INDICATOR==null?"null":FIRSTV_INDICATOR, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VISIT_TIME==null?"null":VISIT_TIME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VISIT_CONSALT_ROOM==null?"null":VISIT_CONSALT_ROOM, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(ROWKEY==null?"null":ROWKEY, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DATETIME==null?"null":"" + DATETIME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OUT_PATIENT_ID==null?"null":OUT_PATIENT_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HEALTH_CARD_NO==null?"null":HEALTH_CARD_NO, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OUTP_NO==null?"null":OUTP_NO, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VISIT_ID==null?"null":VISIT_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VISIT_TYPE_CODE==null?"null":VISIT_TYPE_CODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VISIT_TYPE_NAME==null?"null":VISIT_TYPE_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(EMERGENCY_VISIT_IND==null?"null":EMERGENCY_VISIT_IND, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PERSON_NAME==null?"null":PERSON_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CHARGE_TYPE_CODE==null?"null":CHARGE_TYPE_CODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CHARGE_TYPE_NAME==null?"null":CHARGE_TYPE_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DATE_OF_BIRTH==null?"null":DATE_OF_BIRTH, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ID_CARD_NO==null?"null":ID_CARD_NO, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SEX_CODE==null?"null":SEX_CODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SEX_NAME==null?"null":SEX_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MARITAL_STATUS_CODE==null?"null":MARITAL_STATUS_CODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MARITAL_STATUS_NAME==null?"null":MARITAL_STATUS_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OCCUPATION_CODE==null?"null":OCCUPATION_CODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OCCUPATION_NAME==null?"null":OCCUPATION_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PHONE_NUMBER==null?"null":PHONE_NUMBER, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MAILING_ADDRESS==null?"null":MAILING_ADDRESS, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VISIT_DEPT_CODE==null?"null":VISIT_DEPT_CODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VISIT_DEPT_NAME==null?"null":VISIT_DEPT_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VISIT_DOCTOR_CODE==null?"null":VISIT_DOCTOR_CODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VISIT_DOCTOR_NAME==null?"null":VISIT_DOCTOR_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(REG_CATEGORY_CODE==null?"null":REG_CATEGORY_CODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(REG_CATEGORY_NAME==null?"null":REG_CATEGORY_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(REG_TYPE_CODE==null?"null":REG_TYPE_CODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(REG_TYPE_NAME==null?"null":REG_TYPE_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(REG_VISIT_SECTION_CODE==null?"null":REG_VISIT_SECTION_CODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(REG_VISIT_SECTION_NAME==null?"null":REG_VISIT_SECTION_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(REGISTER_BY_CODE==null?"null":REGISTER_BY_CODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(REGISTER_BY_NAME==null?"null":REGISTER_BY_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(REGISTING_TIME==null?"null":REGISTING_TIME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(REGISTER_CANCEL_BY_CODE==null?"null":REGISTER_CANCEL_BY_CODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(REGISTER_CANCEL_BY_NAME==null?"null":REGISTER_CANCEL_BY_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(REGISTER_CANCEL_TIME==null?"null":REGISTER_CANCEL_TIME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SEPARATE_TIME==null?"null":SEPARATE_TIME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SEPARATE_OPER==null?"null":SEPARATE_OPER, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SEPARATE_NO==null?"null":SEPARATE_NO, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FIRSTV_INDICATOR==null?"null":FIRSTV_INDICATOR, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VISIT_TIME==null?"null":VISIT_TIME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VISIT_CONSALT_ROOM==null?"null":VISIT_CONSALT_ROOM, delimiters));
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
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.ROWKEY = null; } else {
      this.ROWKEY = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DATETIME = null; } else {
      this.DATETIME = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.OUT_PATIENT_ID = null; } else {
      this.OUT_PATIENT_ID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.HEALTH_CARD_NO = null; } else {
      this.HEALTH_CARD_NO = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.OUTP_NO = null; } else {
      this.OUTP_NO = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.VISIT_ID = null; } else {
      this.VISIT_ID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.VISIT_TYPE_CODE = null; } else {
      this.VISIT_TYPE_CODE = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.VISIT_TYPE_NAME = null; } else {
      this.VISIT_TYPE_NAME = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.EMERGENCY_VISIT_IND = null; } else {
      this.EMERGENCY_VISIT_IND = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.PERSON_NAME = null; } else {
      this.PERSON_NAME = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.CHARGE_TYPE_CODE = null; } else {
      this.CHARGE_TYPE_CODE = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.CHARGE_TYPE_NAME = null; } else {
      this.CHARGE_TYPE_NAME = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.DATE_OF_BIRTH = null; } else {
      this.DATE_OF_BIRTH = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.ID_CARD_NO = null; } else {
      this.ID_CARD_NO = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.SEX_CODE = null; } else {
      this.SEX_CODE = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.SEX_NAME = null; } else {
      this.SEX_NAME = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.MARITAL_STATUS_CODE = null; } else {
      this.MARITAL_STATUS_CODE = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.MARITAL_STATUS_NAME = null; } else {
      this.MARITAL_STATUS_NAME = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.OCCUPATION_CODE = null; } else {
      this.OCCUPATION_CODE = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.OCCUPATION_NAME = null; } else {
      this.OCCUPATION_NAME = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.PHONE_NUMBER = null; } else {
      this.PHONE_NUMBER = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.MAILING_ADDRESS = null; } else {
      this.MAILING_ADDRESS = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.VISIT_DEPT_CODE = null; } else {
      this.VISIT_DEPT_CODE = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.VISIT_DEPT_NAME = null; } else {
      this.VISIT_DEPT_NAME = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.VISIT_DOCTOR_CODE = null; } else {
      this.VISIT_DOCTOR_CODE = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.VISIT_DOCTOR_NAME = null; } else {
      this.VISIT_DOCTOR_NAME = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.REG_CATEGORY_CODE = null; } else {
      this.REG_CATEGORY_CODE = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.REG_CATEGORY_NAME = null; } else {
      this.REG_CATEGORY_NAME = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.REG_TYPE_CODE = null; } else {
      this.REG_TYPE_CODE = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.REG_TYPE_NAME = null; } else {
      this.REG_TYPE_NAME = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.REG_VISIT_SECTION_CODE = null; } else {
      this.REG_VISIT_SECTION_CODE = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.REG_VISIT_SECTION_NAME = null; } else {
      this.REG_VISIT_SECTION_NAME = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.REGISTER_BY_CODE = null; } else {
      this.REGISTER_BY_CODE = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.REGISTER_BY_NAME = null; } else {
      this.REGISTER_BY_NAME = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.REGISTING_TIME = null; } else {
      this.REGISTING_TIME = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.REGISTER_CANCEL_BY_CODE = null; } else {
      this.REGISTER_CANCEL_BY_CODE = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.REGISTER_CANCEL_BY_NAME = null; } else {
      this.REGISTER_CANCEL_BY_NAME = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.REGISTER_CANCEL_TIME = null; } else {
      this.REGISTER_CANCEL_TIME = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.SEPARATE_TIME = null; } else {
      this.SEPARATE_TIME = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.SEPARATE_OPER = null; } else {
      this.SEPARATE_OPER = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.SEPARATE_NO = null; } else {
      this.SEPARATE_NO = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.FIRSTV_INDICATOR = null; } else {
      this.FIRSTV_INDICATOR = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.VISIT_TIME = null; } else {
      this.VISIT_TIME = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.VISIT_CONSALT_ROOM = null; } else {
      this.VISIT_CONSALT_ROOM = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.ROWKEY = null; } else {
      this.ROWKEY = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DATETIME = null; } else {
      this.DATETIME = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.OUT_PATIENT_ID = null; } else {
      this.OUT_PATIENT_ID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.HEALTH_CARD_NO = null; } else {
      this.HEALTH_CARD_NO = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.OUTP_NO = null; } else {
      this.OUTP_NO = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.VISIT_ID = null; } else {
      this.VISIT_ID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.VISIT_TYPE_CODE = null; } else {
      this.VISIT_TYPE_CODE = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.VISIT_TYPE_NAME = null; } else {
      this.VISIT_TYPE_NAME = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.EMERGENCY_VISIT_IND = null; } else {
      this.EMERGENCY_VISIT_IND = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.PERSON_NAME = null; } else {
      this.PERSON_NAME = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.CHARGE_TYPE_CODE = null; } else {
      this.CHARGE_TYPE_CODE = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.CHARGE_TYPE_NAME = null; } else {
      this.CHARGE_TYPE_NAME = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.DATE_OF_BIRTH = null; } else {
      this.DATE_OF_BIRTH = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.ID_CARD_NO = null; } else {
      this.ID_CARD_NO = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.SEX_CODE = null; } else {
      this.SEX_CODE = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.SEX_NAME = null; } else {
      this.SEX_NAME = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.MARITAL_STATUS_CODE = null; } else {
      this.MARITAL_STATUS_CODE = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.MARITAL_STATUS_NAME = null; } else {
      this.MARITAL_STATUS_NAME = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.OCCUPATION_CODE = null; } else {
      this.OCCUPATION_CODE = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.OCCUPATION_NAME = null; } else {
      this.OCCUPATION_NAME = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.PHONE_NUMBER = null; } else {
      this.PHONE_NUMBER = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.MAILING_ADDRESS = null; } else {
      this.MAILING_ADDRESS = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.VISIT_DEPT_CODE = null; } else {
      this.VISIT_DEPT_CODE = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.VISIT_DEPT_NAME = null; } else {
      this.VISIT_DEPT_NAME = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.VISIT_DOCTOR_CODE = null; } else {
      this.VISIT_DOCTOR_CODE = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.VISIT_DOCTOR_NAME = null; } else {
      this.VISIT_DOCTOR_NAME = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.REG_CATEGORY_CODE = null; } else {
      this.REG_CATEGORY_CODE = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.REG_CATEGORY_NAME = null; } else {
      this.REG_CATEGORY_NAME = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.REG_TYPE_CODE = null; } else {
      this.REG_TYPE_CODE = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.REG_TYPE_NAME = null; } else {
      this.REG_TYPE_NAME = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.REG_VISIT_SECTION_CODE = null; } else {
      this.REG_VISIT_SECTION_CODE = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.REG_VISIT_SECTION_NAME = null; } else {
      this.REG_VISIT_SECTION_NAME = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.REGISTER_BY_CODE = null; } else {
      this.REGISTER_BY_CODE = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.REGISTER_BY_NAME = null; } else {
      this.REGISTER_BY_NAME = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.REGISTING_TIME = null; } else {
      this.REGISTING_TIME = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.REGISTER_CANCEL_BY_CODE = null; } else {
      this.REGISTER_CANCEL_BY_CODE = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.REGISTER_CANCEL_BY_NAME = null; } else {
      this.REGISTER_CANCEL_BY_NAME = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.REGISTER_CANCEL_TIME = null; } else {
      this.REGISTER_CANCEL_TIME = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.SEPARATE_TIME = null; } else {
      this.SEPARATE_TIME = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.SEPARATE_OPER = null; } else {
      this.SEPARATE_OPER = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.SEPARATE_NO = null; } else {
      this.SEPARATE_NO = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.FIRSTV_INDICATOR = null; } else {
      this.FIRSTV_INDICATOR = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.VISIT_TIME = null; } else {
      this.VISIT_TIME = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.VISIT_CONSALT_ROOM = null; } else {
      this.VISIT_CONSALT_ROOM = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    QueryResult o = (QueryResult) super.clone();
    o.DATETIME = (o.DATETIME != null) ? (java.sql.Timestamp) o.DATETIME.clone() : null;
    return o;
  }

  public void clone0(QueryResult o) throws CloneNotSupportedException {
    o.DATETIME = (o.DATETIME != null) ? (java.sql.Timestamp) o.DATETIME.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("ROWKEY", this.ROWKEY);
    __sqoop$field_map.put("DATETIME", this.DATETIME);
    __sqoop$field_map.put("OUT_PATIENT_ID", this.OUT_PATIENT_ID);
    __sqoop$field_map.put("HEALTH_CARD_NO", this.HEALTH_CARD_NO);
    __sqoop$field_map.put("OUTP_NO", this.OUTP_NO);
    __sqoop$field_map.put("VISIT_ID", this.VISIT_ID);
    __sqoop$field_map.put("VISIT_TYPE_CODE", this.VISIT_TYPE_CODE);
    __sqoop$field_map.put("VISIT_TYPE_NAME", this.VISIT_TYPE_NAME);
    __sqoop$field_map.put("EMERGENCY_VISIT_IND", this.EMERGENCY_VISIT_IND);
    __sqoop$field_map.put("PERSON_NAME", this.PERSON_NAME);
    __sqoop$field_map.put("CHARGE_TYPE_CODE", this.CHARGE_TYPE_CODE);
    __sqoop$field_map.put("CHARGE_TYPE_NAME", this.CHARGE_TYPE_NAME);
    __sqoop$field_map.put("DATE_OF_BIRTH", this.DATE_OF_BIRTH);
    __sqoop$field_map.put("ID_CARD_NO", this.ID_CARD_NO);
    __sqoop$field_map.put("SEX_CODE", this.SEX_CODE);
    __sqoop$field_map.put("SEX_NAME", this.SEX_NAME);
    __sqoop$field_map.put("MARITAL_STATUS_CODE", this.MARITAL_STATUS_CODE);
    __sqoop$field_map.put("MARITAL_STATUS_NAME", this.MARITAL_STATUS_NAME);
    __sqoop$field_map.put("OCCUPATION_CODE", this.OCCUPATION_CODE);
    __sqoop$field_map.put("OCCUPATION_NAME", this.OCCUPATION_NAME);
    __sqoop$field_map.put("PHONE_NUMBER", this.PHONE_NUMBER);
    __sqoop$field_map.put("MAILING_ADDRESS", this.MAILING_ADDRESS);
    __sqoop$field_map.put("VISIT_DEPT_CODE", this.VISIT_DEPT_CODE);
    __sqoop$field_map.put("VISIT_DEPT_NAME", this.VISIT_DEPT_NAME);
    __sqoop$field_map.put("VISIT_DOCTOR_CODE", this.VISIT_DOCTOR_CODE);
    __sqoop$field_map.put("VISIT_DOCTOR_NAME", this.VISIT_DOCTOR_NAME);
    __sqoop$field_map.put("REG_CATEGORY_CODE", this.REG_CATEGORY_CODE);
    __sqoop$field_map.put("REG_CATEGORY_NAME", this.REG_CATEGORY_NAME);
    __sqoop$field_map.put("REG_TYPE_CODE", this.REG_TYPE_CODE);
    __sqoop$field_map.put("REG_TYPE_NAME", this.REG_TYPE_NAME);
    __sqoop$field_map.put("REG_VISIT_SECTION_CODE", this.REG_VISIT_SECTION_CODE);
    __sqoop$field_map.put("REG_VISIT_SECTION_NAME", this.REG_VISIT_SECTION_NAME);
    __sqoop$field_map.put("REGISTER_BY_CODE", this.REGISTER_BY_CODE);
    __sqoop$field_map.put("REGISTER_BY_NAME", this.REGISTER_BY_NAME);
    __sqoop$field_map.put("REGISTING_TIME", this.REGISTING_TIME);
    __sqoop$field_map.put("REGISTER_CANCEL_BY_CODE", this.REGISTER_CANCEL_BY_CODE);
    __sqoop$field_map.put("REGISTER_CANCEL_BY_NAME", this.REGISTER_CANCEL_BY_NAME);
    __sqoop$field_map.put("REGISTER_CANCEL_TIME", this.REGISTER_CANCEL_TIME);
    __sqoop$field_map.put("SEPARATE_TIME", this.SEPARATE_TIME);
    __sqoop$field_map.put("SEPARATE_OPER", this.SEPARATE_OPER);
    __sqoop$field_map.put("SEPARATE_NO", this.SEPARATE_NO);
    __sqoop$field_map.put("FIRSTV_INDICATOR", this.FIRSTV_INDICATOR);
    __sqoop$field_map.put("VISIT_TIME", this.VISIT_TIME);
    __sqoop$field_map.put("VISIT_CONSALT_ROOM", this.VISIT_CONSALT_ROOM);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("ROWKEY", this.ROWKEY);
    __sqoop$field_map.put("DATETIME", this.DATETIME);
    __sqoop$field_map.put("OUT_PATIENT_ID", this.OUT_PATIENT_ID);
    __sqoop$field_map.put("HEALTH_CARD_NO", this.HEALTH_CARD_NO);
    __sqoop$field_map.put("OUTP_NO", this.OUTP_NO);
    __sqoop$field_map.put("VISIT_ID", this.VISIT_ID);
    __sqoop$field_map.put("VISIT_TYPE_CODE", this.VISIT_TYPE_CODE);
    __sqoop$field_map.put("VISIT_TYPE_NAME", this.VISIT_TYPE_NAME);
    __sqoop$field_map.put("EMERGENCY_VISIT_IND", this.EMERGENCY_VISIT_IND);
    __sqoop$field_map.put("PERSON_NAME", this.PERSON_NAME);
    __sqoop$field_map.put("CHARGE_TYPE_CODE", this.CHARGE_TYPE_CODE);
    __sqoop$field_map.put("CHARGE_TYPE_NAME", this.CHARGE_TYPE_NAME);
    __sqoop$field_map.put("DATE_OF_BIRTH", this.DATE_OF_BIRTH);
    __sqoop$field_map.put("ID_CARD_NO", this.ID_CARD_NO);
    __sqoop$field_map.put("SEX_CODE", this.SEX_CODE);
    __sqoop$field_map.put("SEX_NAME", this.SEX_NAME);
    __sqoop$field_map.put("MARITAL_STATUS_CODE", this.MARITAL_STATUS_CODE);
    __sqoop$field_map.put("MARITAL_STATUS_NAME", this.MARITAL_STATUS_NAME);
    __sqoop$field_map.put("OCCUPATION_CODE", this.OCCUPATION_CODE);
    __sqoop$field_map.put("OCCUPATION_NAME", this.OCCUPATION_NAME);
    __sqoop$field_map.put("PHONE_NUMBER", this.PHONE_NUMBER);
    __sqoop$field_map.put("MAILING_ADDRESS", this.MAILING_ADDRESS);
    __sqoop$field_map.put("VISIT_DEPT_CODE", this.VISIT_DEPT_CODE);
    __sqoop$field_map.put("VISIT_DEPT_NAME", this.VISIT_DEPT_NAME);
    __sqoop$field_map.put("VISIT_DOCTOR_CODE", this.VISIT_DOCTOR_CODE);
    __sqoop$field_map.put("VISIT_DOCTOR_NAME", this.VISIT_DOCTOR_NAME);
    __sqoop$field_map.put("REG_CATEGORY_CODE", this.REG_CATEGORY_CODE);
    __sqoop$field_map.put("REG_CATEGORY_NAME", this.REG_CATEGORY_NAME);
    __sqoop$field_map.put("REG_TYPE_CODE", this.REG_TYPE_CODE);
    __sqoop$field_map.put("REG_TYPE_NAME", this.REG_TYPE_NAME);
    __sqoop$field_map.put("REG_VISIT_SECTION_CODE", this.REG_VISIT_SECTION_CODE);
    __sqoop$field_map.put("REG_VISIT_SECTION_NAME", this.REG_VISIT_SECTION_NAME);
    __sqoop$field_map.put("REGISTER_BY_CODE", this.REGISTER_BY_CODE);
    __sqoop$field_map.put("REGISTER_BY_NAME", this.REGISTER_BY_NAME);
    __sqoop$field_map.put("REGISTING_TIME", this.REGISTING_TIME);
    __sqoop$field_map.put("REGISTER_CANCEL_BY_CODE", this.REGISTER_CANCEL_BY_CODE);
    __sqoop$field_map.put("REGISTER_CANCEL_BY_NAME", this.REGISTER_CANCEL_BY_NAME);
    __sqoop$field_map.put("REGISTER_CANCEL_TIME", this.REGISTER_CANCEL_TIME);
    __sqoop$field_map.put("SEPARATE_TIME", this.SEPARATE_TIME);
    __sqoop$field_map.put("SEPARATE_OPER", this.SEPARATE_OPER);
    __sqoop$field_map.put("SEPARATE_NO", this.SEPARATE_NO);
    __sqoop$field_map.put("FIRSTV_INDICATOR", this.FIRSTV_INDICATOR);
    __sqoop$field_map.put("VISIT_TIME", this.VISIT_TIME);
    __sqoop$field_map.put("VISIT_CONSALT_ROOM", this.VISIT_CONSALT_ROOM);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
