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


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum ErrorCode implements org.apache.thrift.TEnum {
  OK(0),
  ERR_OVERWRITE(1),
  ERR_TRIMMED(2),
  ERR_UNWRITTEN(3),
  ERR_BADPARAM(4),
  ERR_FULL(5),
  ERR_IO(6),
  OK_SKIP(7),
  ERR_STALEEPOCH(8);

  private final int value;

  private ErrorCode(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static ErrorCode findByValue(int value) { 
    switch (value) {
      case 0:
        return OK;
      case 1:
        return ERR_OVERWRITE;
      case 2:
        return ERR_TRIMMED;
      case 3:
        return ERR_UNWRITTEN;
      case 4:
        return ERR_BADPARAM;
      case 5:
        return ERR_FULL;
      case 6:
        return ERR_IO;
      case 7:
        return OK_SKIP;
      case 8:
        return ERR_STALEEPOCH;
      default:
        return null;
    }
  }
}