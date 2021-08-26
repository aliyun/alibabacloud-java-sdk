// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbftestpop20210806_151255420.models;

import com.aliyun.tea.*;

public class MutilComplexRequest extends TeaModel {
    @NameInMap("arg0")
    public String arg0;

    @NameInMap("arg1")
    public Integer arg1;

    @NameInMap("arg2")
    public MutilComplexRequestArg2 arg2;

    public static MutilComplexRequest build(java.util.Map<String, ?> map) throws Exception {
        MutilComplexRequest self = new MutilComplexRequest();
        return TeaModel.build(map, self);
    }

    public MutilComplexRequest setArg0(String arg0) {
        this.arg0 = arg0;
        return this;
    }
    public String getArg0() {
        return this.arg0;
    }

    public MutilComplexRequest setArg1(Integer arg1) {
        this.arg1 = arg1;
        return this;
    }
    public Integer getArg1() {
        return this.arg1;
    }

    public MutilComplexRequest setArg2(MutilComplexRequestArg2 arg2) {
        this.arg2 = arg2;
        return this;
    }
    public MutilComplexRequestArg2 getArg2() {
        return this.arg2;
    }

    public static class MutilComplexRequestArg2SecondInputThirdList extends TeaModel {
        @NameInMap("thirdInt")
        public Integer thirdInt;

        @NameInMap("thirdString")
        public String thirdString;

        public static MutilComplexRequestArg2SecondInputThirdList build(java.util.Map<String, ?> map) throws Exception {
            MutilComplexRequestArg2SecondInputThirdList self = new MutilComplexRequestArg2SecondInputThirdList();
            return TeaModel.build(map, self);
        }

        public MutilComplexRequestArg2SecondInputThirdList setThirdInt(Integer thirdInt) {
            this.thirdInt = thirdInt;
            return this;
        }
        public Integer getThirdInt() {
            return this.thirdInt;
        }

        public MutilComplexRequestArg2SecondInputThirdList setThirdString(String thirdString) {
            this.thirdString = thirdString;
            return this;
        }
        public String getThirdString() {
            return this.thirdString;
        }

    }

    public static class MutilComplexRequestArg2SecondInput extends TeaModel {
        @NameInMap("secondString")
        public String secondString;

        @NameInMap("thirdList")
        public java.util.List<MutilComplexRequestArg2SecondInputThirdList> thirdList;

        @NameInMap("secondInt")
        public Integer secondInt;

        public static MutilComplexRequestArg2SecondInput build(java.util.Map<String, ?> map) throws Exception {
            MutilComplexRequestArg2SecondInput self = new MutilComplexRequestArg2SecondInput();
            return TeaModel.build(map, self);
        }

        public MutilComplexRequestArg2SecondInput setSecondString(String secondString) {
            this.secondString = secondString;
            return this;
        }
        public String getSecondString() {
            return this.secondString;
        }

        public MutilComplexRequestArg2SecondInput setThirdList(java.util.List<MutilComplexRequestArg2SecondInputThirdList> thirdList) {
            this.thirdList = thirdList;
            return this;
        }
        public java.util.List<MutilComplexRequestArg2SecondInputThirdList> getThirdList() {
            return this.thirdList;
        }

        public MutilComplexRequestArg2SecondInput setSecondInt(Integer secondInt) {
            this.secondInt = secondInt;
            return this;
        }
        public Integer getSecondInt() {
            return this.secondInt;
        }

    }

    public static class MutilComplexRequestArg2 extends TeaModel {
        @NameInMap("stringValue")
        public String stringValue;

        @NameInMap("intValue")
        public Integer intValue;

        @NameInMap("booleanValue")
        public Boolean booleanValue;

        @NameInMap("integerValue")
        public Integer integerValue;

        @NameInMap("longValue")
        public Long longValue;

        @NameInMap("secondInput")
        public MutilComplexRequestArg2SecondInput secondInput;

        public static MutilComplexRequestArg2 build(java.util.Map<String, ?> map) throws Exception {
            MutilComplexRequestArg2 self = new MutilComplexRequestArg2();
            return TeaModel.build(map, self);
        }

        public MutilComplexRequestArg2 setStringValue(String stringValue) {
            this.stringValue = stringValue;
            return this;
        }
        public String getStringValue() {
            return this.stringValue;
        }

        public MutilComplexRequestArg2 setIntValue(Integer intValue) {
            this.intValue = intValue;
            return this;
        }
        public Integer getIntValue() {
            return this.intValue;
        }

        public MutilComplexRequestArg2 setBooleanValue(Boolean booleanValue) {
            this.booleanValue = booleanValue;
            return this;
        }
        public Boolean getBooleanValue() {
            return this.booleanValue;
        }

        public MutilComplexRequestArg2 setIntegerValue(Integer integerValue) {
            this.integerValue = integerValue;
            return this;
        }
        public Integer getIntegerValue() {
            return this.integerValue;
        }

        public MutilComplexRequestArg2 setLongValue(Long longValue) {
            this.longValue = longValue;
            return this;
        }
        public Long getLongValue() {
            return this.longValue;
        }

        public MutilComplexRequestArg2 setSecondInput(MutilComplexRequestArg2SecondInput secondInput) {
            this.secondInput = secondInput;
            return this;
        }
        public MutilComplexRequestArg2SecondInput getSecondInput() {
            return this.secondInput;
        }

    }

}
