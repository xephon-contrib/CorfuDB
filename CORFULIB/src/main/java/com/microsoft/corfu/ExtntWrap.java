/**
 * Copyright (C) 2014 Microsoft Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.microsoft.corfu;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
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

public class ExtntWrap implements org.apache.thrift.TBase<ExtntWrap, ExtntWrap._Fields>, java.io.Serializable, Cloneable, Comparable<ExtntWrap> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ExtntWrap");

  private static final org.apache.thrift.protocol.TField ERR_FIELD_DESC = new org.apache.thrift.protocol.TField("err", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField INF_FIELD_DESC = new org.apache.thrift.protocol.TField("inf", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField CTNT_FIELD_DESC = new org.apache.thrift.protocol.TField("ctnt", org.apache.thrift.protocol.TType.LIST, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ExtntWrapStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ExtntWrapTupleSchemeFactory());
  }

  /**
   * 
   * @see ErrorCode
   */
  public ErrorCode err; // required
  public ExtntInfo inf; // required
  public List<ByteBuffer> ctnt; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see ErrorCode
     */
    ERR((short)1, "err"),
    INF((short)2, "inf"),
    CTNT((short)3, "ctnt");

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
        case 1: // ERR
          return ERR;
        case 2: // INF
          return INF;
        case 3: // CTNT
          return CTNT;
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
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ERR, new org.apache.thrift.meta_data.FieldMetaData("err", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, ErrorCode.class)));
    tmpMap.put(_Fields.INF, new org.apache.thrift.meta_data.FieldMetaData("inf", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ExtntInfo.class)));
    tmpMap.put(_Fields.CTNT, new org.apache.thrift.meta_data.FieldMetaData("ctnt", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING            , "LogPayload"))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ExtntWrap.class, metaDataMap);
  }

  public ExtntWrap() {
  }

  public ExtntWrap(
    ErrorCode err,
    ExtntInfo inf,
    List<ByteBuffer> ctnt)
  {
    this();
    this.err = err;
    this.inf = inf;
    this.ctnt = ctnt;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ExtntWrap(ExtntWrap other) {
    if (other.isSetErr()) {
      this.err = other.err;
    }
    if (other.isSetInf()) {
      this.inf = new ExtntInfo(other.inf);
    }
    if (other.isSetCtnt()) {
      List<ByteBuffer> __this__ctnt = new ArrayList<ByteBuffer>(other.ctnt.size());
      for (ByteBuffer other_element : other.ctnt) {
        __this__ctnt.add(other_element);
      }
      this.ctnt = __this__ctnt;
    }
  }

  public ExtntWrap deepCopy() {
    return new ExtntWrap(this);
  }

  @Override
  public void clear() {
    this.err = null;
    this.inf = null;
    this.ctnt = null;
  }

  /**
   * 
   * @see ErrorCode
   */
  public ErrorCode getErr() {
    return this.err;
  }

  /**
   * 
   * @see ErrorCode
   */
  public ExtntWrap setErr(ErrorCode err) {
    this.err = err;
    return this;
  }

  public void unsetErr() {
    this.err = null;
  }

  /** Returns true if field err is set (has been assigned a value) and false otherwise */
  public boolean isSetErr() {
    return this.err != null;
  }

  public void setErrIsSet(boolean value) {
    if (!value) {
      this.err = null;
    }
  }

  public ExtntInfo getInf() {
    return this.inf;
  }

  public ExtntWrap setInf(ExtntInfo inf) {
    this.inf = inf;
    return this;
  }

  public void unsetInf() {
    this.inf = null;
  }

  /** Returns true if field inf is set (has been assigned a value) and false otherwise */
  public boolean isSetInf() {
    return this.inf != null;
  }

  public void setInfIsSet(boolean value) {
    if (!value) {
      this.inf = null;
    }
  }

  public int getCtntSize() {
    return (this.ctnt == null) ? 0 : this.ctnt.size();
  }

  public java.util.Iterator<ByteBuffer> getCtntIterator() {
    return (this.ctnt == null) ? null : this.ctnt.iterator();
  }

  public void addToCtnt(ByteBuffer elem) {
    if (this.ctnt == null) {
      this.ctnt = new ArrayList<ByteBuffer>();
    }
    this.ctnt.add(elem);
  }

  public List<ByteBuffer> getCtnt() {
    return this.ctnt;
  }

  public ExtntWrap setCtnt(List<ByteBuffer> ctnt) {
    this.ctnt = ctnt;
    return this;
  }

  public void unsetCtnt() {
    this.ctnt = null;
  }

  /** Returns true if field ctnt is set (has been assigned a value) and false otherwise */
  public boolean isSetCtnt() {
    return this.ctnt != null;
  }

  public void setCtntIsSet(boolean value) {
    if (!value) {
      this.ctnt = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ERR:
      if (value == null) {
        unsetErr();
      } else {
        setErr((ErrorCode)value);
      }
      break;

    case INF:
      if (value == null) {
        unsetInf();
      } else {
        setInf((ExtntInfo)value);
      }
      break;

    case CTNT:
      if (value == null) {
        unsetCtnt();
      } else {
        setCtnt((List<ByteBuffer>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ERR:
      return getErr();

    case INF:
      return getInf();

    case CTNT:
      return getCtnt();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ERR:
      return isSetErr();
    case INF:
      return isSetInf();
    case CTNT:
      return isSetCtnt();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ExtntWrap)
      return this.equals((ExtntWrap)that);
    return false;
  }

  public boolean equals(ExtntWrap that) {
    if (that == null)
      return false;

    boolean this_present_err = true && this.isSetErr();
    boolean that_present_err = true && that.isSetErr();
    if (this_present_err || that_present_err) {
      if (!(this_present_err && that_present_err))
        return false;
      if (!this.err.equals(that.err))
        return false;
    }

    boolean this_present_inf = true && this.isSetInf();
    boolean that_present_inf = true && that.isSetInf();
    if (this_present_inf || that_present_inf) {
      if (!(this_present_inf && that_present_inf))
        return false;
      if (!this.inf.equals(that.inf))
        return false;
    }

    boolean this_present_ctnt = true && this.isSetCtnt();
    boolean that_present_ctnt = true && that.isSetCtnt();
    if (this_present_ctnt || that_present_ctnt) {
      if (!(this_present_ctnt && that_present_ctnt))
        return false;
      if (!this.ctnt.equals(that.ctnt))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(ExtntWrap other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetErr()).compareTo(other.isSetErr());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetErr()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.err, other.err);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetInf()).compareTo(other.isSetInf());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInf()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.inf, other.inf);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCtnt()).compareTo(other.isSetCtnt());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCtnt()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ctnt, other.ctnt);
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
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ExtntWrap(");
    boolean first = true;

    sb.append("err:");
    if (this.err == null) {
      sb.append("null");
    } else {
      sb.append(this.err);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("inf:");
    if (this.inf == null) {
      sb.append("null");
    } else {
      sb.append(this.inf);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("ctnt:");
    if (this.ctnt == null) {
      sb.append("null");
    } else {
      sb.append(this.ctnt);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (inf != null) {
      inf.validate();
    }
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ExtntWrapStandardSchemeFactory implements SchemeFactory {
    public ExtntWrapStandardScheme getScheme() {
      return new ExtntWrapStandardScheme();
    }
  }

  private static class ExtntWrapStandardScheme extends StandardScheme<ExtntWrap> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ExtntWrap struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ERR
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.err = ErrorCode.findByValue(iprot.readI32());
              struct.setErrIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // INF
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.inf = new ExtntInfo();
              struct.inf.read(iprot);
              struct.setInfIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // CTNT
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.ctnt = new ArrayList<ByteBuffer>(_list0.size);
                for (int _i1 = 0; _i1 < _list0.size; ++_i1)
                {
                  ByteBuffer _elem2;
                  _elem2 = iprot.readBinary();
                  struct.ctnt.add(_elem2);
                }
                iprot.readListEnd();
              }
              struct.setCtntIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, ExtntWrap struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.err != null) {
        oprot.writeFieldBegin(ERR_FIELD_DESC);
        oprot.writeI32(struct.err.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.inf != null) {
        oprot.writeFieldBegin(INF_FIELD_DESC);
        struct.inf.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.ctnt != null) {
        oprot.writeFieldBegin(CTNT_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.ctnt.size()));
          for (ByteBuffer _iter3 : struct.ctnt)
          {
            oprot.writeBinary(_iter3);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ExtntWrapTupleSchemeFactory implements SchemeFactory {
    public ExtntWrapTupleScheme getScheme() {
      return new ExtntWrapTupleScheme();
    }
  }

  private static class ExtntWrapTupleScheme extends TupleScheme<ExtntWrap> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ExtntWrap struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetErr()) {
        optionals.set(0);
      }
      if (struct.isSetInf()) {
        optionals.set(1);
      }
      if (struct.isSetCtnt()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetErr()) {
        oprot.writeI32(struct.err.getValue());
      }
      if (struct.isSetInf()) {
        struct.inf.write(oprot);
      }
      if (struct.isSetCtnt()) {
        {
          oprot.writeI32(struct.ctnt.size());
          for (ByteBuffer _iter4 : struct.ctnt)
          {
            oprot.writeBinary(_iter4);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ExtntWrap struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.err = ErrorCode.findByValue(iprot.readI32());
        struct.setErrIsSet(true);
      }
      if (incoming.get(1)) {
        struct.inf = new ExtntInfo();
        struct.inf.read(iprot);
        struct.setInfIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list5 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.ctnt = new ArrayList<ByteBuffer>(_list5.size);
          for (int _i6 = 0; _i6 < _list5.size; ++_i6)
          {
            ByteBuffer _elem7;
            _elem7 = iprot.readBinary();
            struct.ctnt.add(_elem7);
          }
        }
        struct.setCtntIsSet(true);
      }
    }
  }

}

