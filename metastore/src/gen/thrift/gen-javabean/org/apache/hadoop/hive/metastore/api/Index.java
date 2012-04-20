/**
 * Autogenerated by Thrift Compiler (0.7.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.apache.hadoop.hive.metastore.api;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Index implements org.apache.thrift.TBase<Index, Index._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Index");

  private static final org.apache.thrift.protocol.TField INDEX_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("indexName", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField INDEX_HANDLER_CLASS_FIELD_DESC = new org.apache.thrift.protocol.TField("indexHandlerClass", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField DB_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("dbName", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField ORIG_TABLE_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("origTableName", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField CREATE_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("createTime", org.apache.thrift.protocol.TType.I32, (short)5);
  private static final org.apache.thrift.protocol.TField LAST_ACCESS_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("lastAccessTime", org.apache.thrift.protocol.TType.I32, (short)6);
  private static final org.apache.thrift.protocol.TField INDEX_TABLE_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("indexTableName", org.apache.thrift.protocol.TType.STRING, (short)7);
  private static final org.apache.thrift.protocol.TField SD_FIELD_DESC = new org.apache.thrift.protocol.TField("sd", org.apache.thrift.protocol.TType.STRUCT, (short)8);
  private static final org.apache.thrift.protocol.TField PARAMETERS_FIELD_DESC = new org.apache.thrift.protocol.TField("parameters", org.apache.thrift.protocol.TType.MAP, (short)9);
  private static final org.apache.thrift.protocol.TField DEFERRED_REBUILD_FIELD_DESC = new org.apache.thrift.protocol.TField("deferredRebuild", org.apache.thrift.protocol.TType.BOOL, (short)10);

  private String indexName; // required
  private String indexHandlerClass; // required
  private String dbName; // required
  private String origTableName; // required
  private int createTime; // required
  private int lastAccessTime; // required
  private String indexTableName; // required
  private StorageDescriptor sd; // required
  private Map<String,String> parameters; // required
  private boolean deferredRebuild; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    INDEX_NAME((short)1, "indexName"),
    INDEX_HANDLER_CLASS((short)2, "indexHandlerClass"),
    DB_NAME((short)3, "dbName"),
    ORIG_TABLE_NAME((short)4, "origTableName"),
    CREATE_TIME((short)5, "createTime"),
    LAST_ACCESS_TIME((short)6, "lastAccessTime"),
    INDEX_TABLE_NAME((short)7, "indexTableName"),
    SD((short)8, "sd"),
    PARAMETERS((short)9, "parameters"),
    DEFERRED_REBUILD((short)10, "deferredRebuild");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // INDEX_NAME
          return INDEX_NAME;
        case 2: // INDEX_HANDLER_CLASS
          return INDEX_HANDLER_CLASS;
        case 3: // DB_NAME
          return DB_NAME;
        case 4: // ORIG_TABLE_NAME
          return ORIG_TABLE_NAME;
        case 5: // CREATE_TIME
          return CREATE_TIME;
        case 6: // LAST_ACCESS_TIME
          return LAST_ACCESS_TIME;
        case 7: // INDEX_TABLE_NAME
          return INDEX_TABLE_NAME;
        case 8: // SD
          return SD;
        case 9: // PARAMETERS
          return PARAMETERS;
        case 10: // DEFERRED_REBUILD
          return DEFERRED_REBUILD;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __CREATETIME_ISSET_ID = 0;
  private static final int __LASTACCESSTIME_ISSET_ID = 1;
  private static final int __DEFERREDREBUILD_ISSET_ID = 2;
  private BitSet __isset_bit_vector = new BitSet(3);

  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.INDEX_NAME, new org.apache.thrift.meta_data.FieldMetaData("indexName", org.apache.thrift.TFieldRequirementType.DEFAULT,
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.INDEX_HANDLER_CLASS, new org.apache.thrift.meta_data.FieldMetaData("indexHandlerClass", org.apache.thrift.TFieldRequirementType.DEFAULT,
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DB_NAME, new org.apache.thrift.meta_data.FieldMetaData("dbName", org.apache.thrift.TFieldRequirementType.DEFAULT,
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ORIG_TABLE_NAME, new org.apache.thrift.meta_data.FieldMetaData("origTableName", org.apache.thrift.TFieldRequirementType.DEFAULT,
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CREATE_TIME, new org.apache.thrift.meta_data.FieldMetaData("createTime", org.apache.thrift.TFieldRequirementType.DEFAULT,
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.LAST_ACCESS_TIME, new org.apache.thrift.meta_data.FieldMetaData("lastAccessTime", org.apache.thrift.TFieldRequirementType.DEFAULT,
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.INDEX_TABLE_NAME, new org.apache.thrift.meta_data.FieldMetaData("indexTableName", org.apache.thrift.TFieldRequirementType.DEFAULT,
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SD, new org.apache.thrift.meta_data.FieldMetaData("sd", org.apache.thrift.TFieldRequirementType.DEFAULT,
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, StorageDescriptor.class)));
    tmpMap.put(_Fields.PARAMETERS, new org.apache.thrift.meta_data.FieldMetaData("parameters", org.apache.thrift.TFieldRequirementType.DEFAULT,
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP,
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING),
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.DEFERRED_REBUILD, new org.apache.thrift.meta_data.FieldMetaData("deferredRebuild", org.apache.thrift.TFieldRequirementType.DEFAULT,
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Index.class, metaDataMap);
  }

  public Index() {
  }

  public Index(
    String indexName,
    String indexHandlerClass,
    String dbName,
    String origTableName,
    int createTime,
    int lastAccessTime,
    String indexTableName,
    StorageDescriptor sd,
    Map<String,String> parameters,
    boolean deferredRebuild)
  {
    this();
    this.indexName = indexName;
    this.indexHandlerClass = indexHandlerClass;
    this.dbName = dbName;
    this.origTableName = origTableName;
    this.createTime = createTime;
    setCreateTimeIsSet(true);
    this.lastAccessTime = lastAccessTime;
    setLastAccessTimeIsSet(true);
    this.indexTableName = indexTableName;
    this.sd = sd;
    this.parameters = parameters;
    this.deferredRebuild = deferredRebuild;
    setDeferredRebuildIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Index(Index other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetIndexName()) {
      this.indexName = other.indexName;
    }
    if (other.isSetIndexHandlerClass()) {
      this.indexHandlerClass = other.indexHandlerClass;
    }
    if (other.isSetDbName()) {
      this.dbName = other.dbName;
    }
    if (other.isSetOrigTableName()) {
      this.origTableName = other.origTableName;
    }
    this.createTime = other.createTime;
    this.lastAccessTime = other.lastAccessTime;
    if (other.isSetIndexTableName()) {
      this.indexTableName = other.indexTableName;
    }
    if (other.isSetSd()) {
      this.sd = new StorageDescriptor(other.sd);
    }
    if (other.isSetParameters()) {
      Map<String,String> __this__parameters = new HashMap<String,String>();
      for (Map.Entry<String, String> other_element : other.parameters.entrySet()) {

        String other_element_key = other_element.getKey();
        String other_element_value = other_element.getValue();

        String __this__parameters_copy_key = other_element_key;

        String __this__parameters_copy_value = other_element_value;

        __this__parameters.put(__this__parameters_copy_key, __this__parameters_copy_value);
      }
      this.parameters = __this__parameters;
    }
    this.deferredRebuild = other.deferredRebuild;
  }

  public Index deepCopy() {
    return new Index(this);
  }

  @Override
  public void clear() {
    this.indexName = null;
    this.indexHandlerClass = null;
    this.dbName = null;
    this.origTableName = null;
    setCreateTimeIsSet(false);
    this.createTime = 0;
    setLastAccessTimeIsSet(false);
    this.lastAccessTime = 0;
    this.indexTableName = null;
    this.sd = null;
    this.parameters = null;
    setDeferredRebuildIsSet(false);
    this.deferredRebuild = false;
  }

  public String getIndexName() {
    return this.indexName;
  }

  public void setIndexName(String indexName) {
    this.indexName = indexName;
  }

  public void unsetIndexName() {
    this.indexName = null;
  }

  /** Returns true if field indexName is set (has been assigned a value) and false otherwise */
  public boolean isSetIndexName() {
    return this.indexName != null;
  }

  public void setIndexNameIsSet(boolean value) {
    if (!value) {
      this.indexName = null;
    }
  }

  public String getIndexHandlerClass() {
    return this.indexHandlerClass;
  }

  public void setIndexHandlerClass(String indexHandlerClass) {
    this.indexHandlerClass = indexHandlerClass;
  }

  public void unsetIndexHandlerClass() {
    this.indexHandlerClass = null;
  }

  /** Returns true if field indexHandlerClass is set (has been assigned a value) and false otherwise */
  public boolean isSetIndexHandlerClass() {
    return this.indexHandlerClass != null;
  }

  public void setIndexHandlerClassIsSet(boolean value) {
    if (!value) {
      this.indexHandlerClass = null;
    }
  }

  public String getDbName() {
    return this.dbName;
  }

  public void setDbName(String dbName) {
    this.dbName = dbName;
  }

  public void unsetDbName() {
    this.dbName = null;
  }

  /** Returns true if field dbName is set (has been assigned a value) and false otherwise */
  public boolean isSetDbName() {
    return this.dbName != null;
  }

  public void setDbNameIsSet(boolean value) {
    if (!value) {
      this.dbName = null;
    }
  }

  public String getOrigTableName() {
    return this.origTableName;
  }

  public void setOrigTableName(String origTableName) {
    this.origTableName = origTableName;
  }

  public void unsetOrigTableName() {
    this.origTableName = null;
  }

  /** Returns true if field origTableName is set (has been assigned a value) and false otherwise */
  public boolean isSetOrigTableName() {
    return this.origTableName != null;
  }

  public void setOrigTableNameIsSet(boolean value) {
    if (!value) {
      this.origTableName = null;
    }
  }

  public int getCreateTime() {
    return this.createTime;
  }

  public void setCreateTime(int createTime) {
    this.createTime = createTime;
    setCreateTimeIsSet(true);
  }

  public void unsetCreateTime() {
    __isset_bit_vector.clear(__CREATETIME_ISSET_ID);
  }

  /** Returns true if field createTime is set (has been assigned a value) and false otherwise */
  public boolean isSetCreateTime() {
    return __isset_bit_vector.get(__CREATETIME_ISSET_ID);
  }

  public void setCreateTimeIsSet(boolean value) {
    __isset_bit_vector.set(__CREATETIME_ISSET_ID, value);
  }

  public int getLastAccessTime() {
    return this.lastAccessTime;
  }

  public void setLastAccessTime(int lastAccessTime) {
    this.lastAccessTime = lastAccessTime;
    setLastAccessTimeIsSet(true);
  }

  public void unsetLastAccessTime() {
    __isset_bit_vector.clear(__LASTACCESSTIME_ISSET_ID);
  }

  /** Returns true if field lastAccessTime is set (has been assigned a value) and false otherwise */
  public boolean isSetLastAccessTime() {
    return __isset_bit_vector.get(__LASTACCESSTIME_ISSET_ID);
  }

  public void setLastAccessTimeIsSet(boolean value) {
    __isset_bit_vector.set(__LASTACCESSTIME_ISSET_ID, value);
  }

  public String getIndexTableName() {
    return this.indexTableName;
  }

  public void setIndexTableName(String indexTableName) {
    this.indexTableName = indexTableName;
  }

  public void unsetIndexTableName() {
    this.indexTableName = null;
  }

  /** Returns true if field indexTableName is set (has been assigned a value) and false otherwise */
  public boolean isSetIndexTableName() {
    return this.indexTableName != null;
  }

  public void setIndexTableNameIsSet(boolean value) {
    if (!value) {
      this.indexTableName = null;
    }
  }

  public StorageDescriptor getSd() {
    return this.sd;
  }

  public void setSd(StorageDescriptor sd) {
    this.sd = sd;
  }

  public void unsetSd() {
    this.sd = null;
  }

  /** Returns true if field sd is set (has been assigned a value) and false otherwise */
  public boolean isSetSd() {
    return this.sd != null;
  }

  public void setSdIsSet(boolean value) {
    if (!value) {
      this.sd = null;
    }
  }

  public int getParametersSize() {
    return (this.parameters == null) ? 0 : this.parameters.size();
  }

  public void putToParameters(String key, String val) {
    if (this.parameters == null) {
      this.parameters = new HashMap<String,String>();
    }
    this.parameters.put(key, val);
  }

  public Map<String,String> getParameters() {
    return this.parameters;
  }

  public void setParameters(Map<String,String> parameters) {
    this.parameters = parameters;
  }

  public void unsetParameters() {
    this.parameters = null;
  }

  /** Returns true if field parameters is set (has been assigned a value) and false otherwise */
  public boolean isSetParameters() {
    return this.parameters != null;
  }

  public void setParametersIsSet(boolean value) {
    if (!value) {
      this.parameters = null;
    }
  }

  public boolean isDeferredRebuild() {
    return this.deferredRebuild;
  }

  public void setDeferredRebuild(boolean deferredRebuild) {
    this.deferredRebuild = deferredRebuild;
    setDeferredRebuildIsSet(true);
  }

  public void unsetDeferredRebuild() {
    __isset_bit_vector.clear(__DEFERREDREBUILD_ISSET_ID);
  }

  /** Returns true if field deferredRebuild is set (has been assigned a value) and false otherwise */
  public boolean isSetDeferredRebuild() {
    return __isset_bit_vector.get(__DEFERREDREBUILD_ISSET_ID);
  }

  public void setDeferredRebuildIsSet(boolean value) {
    __isset_bit_vector.set(__DEFERREDREBUILD_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case INDEX_NAME:
      if (value == null) {
        unsetIndexName();
      } else {
        setIndexName((String)value);
      }
      break;

    case INDEX_HANDLER_CLASS:
      if (value == null) {
        unsetIndexHandlerClass();
      } else {
        setIndexHandlerClass((String)value);
      }
      break;

    case DB_NAME:
      if (value == null) {
        unsetDbName();
      } else {
        setDbName((String)value);
      }
      break;

    case ORIG_TABLE_NAME:
      if (value == null) {
        unsetOrigTableName();
      } else {
        setOrigTableName((String)value);
      }
      break;

    case CREATE_TIME:
      if (value == null) {
        unsetCreateTime();
      } else {
        setCreateTime((Integer)value);
      }
      break;

    case LAST_ACCESS_TIME:
      if (value == null) {
        unsetLastAccessTime();
      } else {
        setLastAccessTime((Integer)value);
      }
      break;

    case INDEX_TABLE_NAME:
      if (value == null) {
        unsetIndexTableName();
      } else {
        setIndexTableName((String)value);
      }
      break;

    case SD:
      if (value == null) {
        unsetSd();
      } else {
        setSd((StorageDescriptor)value);
      }
      break;

    case PARAMETERS:
      if (value == null) {
        unsetParameters();
      } else {
        setParameters((Map<String,String>)value);
      }
      break;

    case DEFERRED_REBUILD:
      if (value == null) {
        unsetDeferredRebuild();
      } else {
        setDeferredRebuild((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case INDEX_NAME:
      return getIndexName();

    case INDEX_HANDLER_CLASS:
      return getIndexHandlerClass();

    case DB_NAME:
      return getDbName();

    case ORIG_TABLE_NAME:
      return getOrigTableName();

    case CREATE_TIME:
      return Integer.valueOf(getCreateTime());

    case LAST_ACCESS_TIME:
      return Integer.valueOf(getLastAccessTime());

    case INDEX_TABLE_NAME:
      return getIndexTableName();

    case SD:
      return getSd();

    case PARAMETERS:
      return getParameters();

    case DEFERRED_REBUILD:
      return Boolean.valueOf(isDeferredRebuild());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case INDEX_NAME:
      return isSetIndexName();
    case INDEX_HANDLER_CLASS:
      return isSetIndexHandlerClass();
    case DB_NAME:
      return isSetDbName();
    case ORIG_TABLE_NAME:
      return isSetOrigTableName();
    case CREATE_TIME:
      return isSetCreateTime();
    case LAST_ACCESS_TIME:
      return isSetLastAccessTime();
    case INDEX_TABLE_NAME:
      return isSetIndexTableName();
    case SD:
      return isSetSd();
    case PARAMETERS:
      return isSetParameters();
    case DEFERRED_REBUILD:
      return isSetDeferredRebuild();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Index)
      return this.equals((Index)that);
    return false;
  }

  public boolean equals(Index that) {
    if (that == null)
      return false;

    boolean this_present_indexName = true && this.isSetIndexName();
    boolean that_present_indexName = true && that.isSetIndexName();
    if (this_present_indexName || that_present_indexName) {
      if (!(this_present_indexName && that_present_indexName))
        return false;
      if (!this.indexName.equals(that.indexName))
        return false;
    }

    boolean this_present_indexHandlerClass = true && this.isSetIndexHandlerClass();
    boolean that_present_indexHandlerClass = true && that.isSetIndexHandlerClass();
    if (this_present_indexHandlerClass || that_present_indexHandlerClass) {
      if (!(this_present_indexHandlerClass && that_present_indexHandlerClass))
        return false;
      if (!this.indexHandlerClass.equals(that.indexHandlerClass))
        return false;
    }

    boolean this_present_dbName = true && this.isSetDbName();
    boolean that_present_dbName = true && that.isSetDbName();
    if (this_present_dbName || that_present_dbName) {
      if (!(this_present_dbName && that_present_dbName))
        return false;
      if (!this.dbName.equals(that.dbName))
        return false;
    }

    boolean this_present_origTableName = true && this.isSetOrigTableName();
    boolean that_present_origTableName = true && that.isSetOrigTableName();
    if (this_present_origTableName || that_present_origTableName) {
      if (!(this_present_origTableName && that_present_origTableName))
        return false;
      if (!this.origTableName.equals(that.origTableName))
        return false;
    }

    boolean this_present_createTime = true;
    boolean that_present_createTime = true;
    if (this_present_createTime || that_present_createTime) {
      if (!(this_present_createTime && that_present_createTime))
        return false;
      if (this.createTime != that.createTime)
        return false;
    }

    boolean this_present_lastAccessTime = true;
    boolean that_present_lastAccessTime = true;
    if (this_present_lastAccessTime || that_present_lastAccessTime) {
      if (!(this_present_lastAccessTime && that_present_lastAccessTime))
        return false;
      if (this.lastAccessTime != that.lastAccessTime)
        return false;
    }

    boolean this_present_indexTableName = true && this.isSetIndexTableName();
    boolean that_present_indexTableName = true && that.isSetIndexTableName();
    if (this_present_indexTableName || that_present_indexTableName) {
      if (!(this_present_indexTableName && that_present_indexTableName))
        return false;
      if (!this.indexTableName.equals(that.indexTableName))
        return false;
    }

    boolean this_present_sd = true && this.isSetSd();
    boolean that_present_sd = true && that.isSetSd();
    if (this_present_sd || that_present_sd) {
      if (!(this_present_sd && that_present_sd))
        return false;
      if (!this.sd.equals(that.sd))
        return false;
    }

    boolean this_present_parameters = true && this.isSetParameters();
    boolean that_present_parameters = true && that.isSetParameters();
    if (this_present_parameters || that_present_parameters) {
      if (!(this_present_parameters && that_present_parameters))
        return false;
      if (!this.parameters.equals(that.parameters))
        return false;
    }

    boolean this_present_deferredRebuild = true;
    boolean that_present_deferredRebuild = true;
    if (this_present_deferredRebuild || that_present_deferredRebuild) {
      if (!(this_present_deferredRebuild && that_present_deferredRebuild))
        return false;
      if (this.deferredRebuild != that.deferredRebuild)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(Index other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    Index typedOther = (Index)other;

    lastComparison = Boolean.valueOf(isSetIndexName()).compareTo(typedOther.isSetIndexName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIndexName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.indexName, typedOther.indexName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIndexHandlerClass()).compareTo(typedOther.isSetIndexHandlerClass());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIndexHandlerClass()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.indexHandlerClass, typedOther.indexHandlerClass);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDbName()).compareTo(typedOther.isSetDbName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDbName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.dbName, typedOther.dbName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOrigTableName()).compareTo(typedOther.isSetOrigTableName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOrigTableName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.origTableName, typedOther.origTableName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCreateTime()).compareTo(typedOther.isSetCreateTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCreateTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.createTime, typedOther.createTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLastAccessTime()).compareTo(typedOther.isSetLastAccessTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLastAccessTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.lastAccessTime, typedOther.lastAccessTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIndexTableName()).compareTo(typedOther.isSetIndexTableName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIndexTableName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.indexTableName, typedOther.indexTableName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSd()).compareTo(typedOther.isSetSd());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSd()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sd, typedOther.sd);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetParameters()).compareTo(typedOther.isSetParameters());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetParameters()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.parameters, typedOther.parameters);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDeferredRebuild()).compareTo(typedOther.isSetDeferredRebuild());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDeferredRebuild()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.deferredRebuild, typedOther.deferredRebuild);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    org.apache.thrift.protocol.TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == org.apache.thrift.protocol.TType.STOP) {
        break;
      }
      switch (field.id) {
        case 1: // INDEX_NAME
          if (field.type == org.apache.thrift.protocol.TType.STRING) {
            this.indexName = iprot.readString();
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // INDEX_HANDLER_CLASS
          if (field.type == org.apache.thrift.protocol.TType.STRING) {
            this.indexHandlerClass = iprot.readString();
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // DB_NAME
          if (field.type == org.apache.thrift.protocol.TType.STRING) {
            this.dbName = iprot.readString();
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // ORIG_TABLE_NAME
          if (field.type == org.apache.thrift.protocol.TType.STRING) {
            this.origTableName = iprot.readString();
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 5: // CREATE_TIME
          if (field.type == org.apache.thrift.protocol.TType.I32) {
            this.createTime = iprot.readI32();
            setCreateTimeIsSet(true);
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 6: // LAST_ACCESS_TIME
          if (field.type == org.apache.thrift.protocol.TType.I32) {
            this.lastAccessTime = iprot.readI32();
            setLastAccessTimeIsSet(true);
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 7: // INDEX_TABLE_NAME
          if (field.type == org.apache.thrift.protocol.TType.STRING) {
            this.indexTableName = iprot.readString();
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 8: // SD
          if (field.type == org.apache.thrift.protocol.TType.STRUCT) {
            this.sd = new StorageDescriptor();
            this.sd.read(iprot);
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 9: // PARAMETERS
          if (field.type == org.apache.thrift.protocol.TType.MAP) {
            {
              org.apache.thrift.protocol.TMap _map84 = iprot.readMapBegin();
              this.parameters = new HashMap<String,String>(2*_map84.size);
              for (int _i85 = 0; _i85 < _map84.size; ++_i85)
              {
                String _key86; // required
                String _val87; // required
                _key86 = iprot.readString();
                _val87 = iprot.readString();
                this.parameters.put(_key86, _val87);
              }
              iprot.readMapEnd();
            }
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 10: // DEFERRED_REBUILD
          if (field.type == org.apache.thrift.protocol.TType.BOOL) {
            this.deferredRebuild = iprot.readBool();
            setDeferredRebuildIsSet(true);
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();
    validate();
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.indexName != null) {
      oprot.writeFieldBegin(INDEX_NAME_FIELD_DESC);
      oprot.writeString(this.indexName);
      oprot.writeFieldEnd();
    }
    if (this.indexHandlerClass != null) {
      oprot.writeFieldBegin(INDEX_HANDLER_CLASS_FIELD_DESC);
      oprot.writeString(this.indexHandlerClass);
      oprot.writeFieldEnd();
    }
    if (this.dbName != null) {
      oprot.writeFieldBegin(DB_NAME_FIELD_DESC);
      oprot.writeString(this.dbName);
      oprot.writeFieldEnd();
    }
    if (this.origTableName != null) {
      oprot.writeFieldBegin(ORIG_TABLE_NAME_FIELD_DESC);
      oprot.writeString(this.origTableName);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(CREATE_TIME_FIELD_DESC);
    oprot.writeI32(this.createTime);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(LAST_ACCESS_TIME_FIELD_DESC);
    oprot.writeI32(this.lastAccessTime);
    oprot.writeFieldEnd();
    if (this.indexTableName != null) {
      oprot.writeFieldBegin(INDEX_TABLE_NAME_FIELD_DESC);
      oprot.writeString(this.indexTableName);
      oprot.writeFieldEnd();
    }
    if (this.sd != null) {
      oprot.writeFieldBegin(SD_FIELD_DESC);
      this.sd.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.parameters != null) {
      oprot.writeFieldBegin(PARAMETERS_FIELD_DESC);
      {
        oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, this.parameters.size()));
        for (Map.Entry<String, String> _iter88 : this.parameters.entrySet())
        {
          oprot.writeString(_iter88.getKey());
          oprot.writeString(_iter88.getValue());
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(DEFERRED_REBUILD_FIELD_DESC);
    oprot.writeBool(this.deferredRebuild);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Index(");
    boolean first = true;

    sb.append("indexName:");
    if (this.indexName == null) {
      sb.append("null");
    } else {
      sb.append(this.indexName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("indexHandlerClass:");
    if (this.indexHandlerClass == null) {
      sb.append("null");
    } else {
      sb.append(this.indexHandlerClass);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("dbName:");
    if (this.dbName == null) {
      sb.append("null");
    } else {
      sb.append(this.dbName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("origTableName:");
    if (this.origTableName == null) {
      sb.append("null");
    } else {
      sb.append(this.origTableName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("createTime:");
    sb.append(this.createTime);
    first = false;
    if (!first) sb.append(", ");
    sb.append("lastAccessTime:");
    sb.append(this.lastAccessTime);
    first = false;
    if (!first) sb.append(", ");
    sb.append("indexTableName:");
    if (this.indexTableName == null) {
      sb.append("null");
    } else {
      sb.append(this.indexTableName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("sd:");
    if (this.sd == null) {
      sb.append("null");
    } else {
      sb.append(this.sd);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("parameters:");
    if (this.parameters == null) {
      sb.append("null");
    } else {
      sb.append(this.parameters);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("deferredRebuild:");
    sb.append(this.deferredRebuild);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bit_vector = new BitSet(1);
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

}

