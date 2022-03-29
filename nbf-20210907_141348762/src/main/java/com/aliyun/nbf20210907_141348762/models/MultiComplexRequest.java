// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210907_141348762.models;

import com.aliyun.tea.*;

public class MultiComplexRequest extends TeaModel {
    @NameInMap("arg0")
    public String arg0;

    @NameInMap("arg1")
    public Integer arg1;

    @NameInMap("arg2")
    public MultiComplexRequestArg2 arg2;

    public static MultiComplexRequest build(java.util.Map<String, ?> map) throws Exception {
        MultiComplexRequest self = new MultiComplexRequest();
        return TeaModel.build(map, self);
    }

    public MultiComplexRequest setArg0(String arg0) {
        this.arg0 = arg0;
        return this;
    }
    public String getArg0() {
        return this.arg0;
    }

    public MultiComplexRequest setArg1(Integer arg1) {
        this.arg1 = arg1;
        return this;
    }
    public Integer getArg1() {
        return this.arg1;
    }

    public MultiComplexRequest setArg2(MultiComplexRequestArg2 arg2) {
        this.arg2 = arg2;
        return this;
    }
    public MultiComplexRequestArg2 getArg2() {
        return this.arg2;
    }

    public static class MultiComplexRequestArg2SecondInputThirdList extends TeaModel {
        @NameInMap("thirdInt")
        public Integer thirdInt;

        @NameInMap("thirdString")
        public java.io.InputStream thirdString;

        public static MultiComplexRequestArg2SecondInputThirdList build(java.util.Map<String, ?> map) throws Exception {
            MultiComplexRequestArg2SecondInputThirdList self = new MultiComplexRequestArg2SecondInputThirdList();
            return TeaModel.build(map, self);
        }

        public MultiComplexRequestArg2SecondInputThirdList setThirdInt(Integer thirdInt) {
            this.thirdInt = thirdInt;
            return this;
        }
        public Integer getThirdInt() {
            return this.thirdInt;
        }

        public MultiComplexRequestArg2SecondInputThirdList setThirdString(java.io.InputStream thirdString) {
            this.thirdString = thirdString;
            return this;
        }
        public java.io.InputStream getThirdString() {
            return this.thirdString;
        }

    }

    public static class MultiComplexRequestArg2SecondInput extends TeaModel {
        @NameInMap("secondInt")
        public Integer secondInt;

        @NameInMap("secondString")
        public String secondString;

        @NameInMap("thirdList")
        public java.util.List<MultiComplexRequestArg2SecondInputThirdList> thirdList;

        public static MultiComplexRequestArg2SecondInput build(java.util.Map<String, ?> map) throws Exception {
            MultiComplexRequestArg2SecondInput self = new MultiComplexRequestArg2SecondInput();
            return TeaModel.build(map, self);
        }

        public MultiComplexRequestArg2SecondInput setSecondInt(Integer secondInt) {
            this.secondInt = secondInt;
            return this;
        }
        public Integer getSecondInt() {
            return this.secondInt;
        }

        public MultiComplexRequestArg2SecondInput setSecondString(String secondString) {
            this.secondString = secondString;
            return this;
        }
        public String getSecondString() {
            return this.secondString;
        }

        public MultiComplexRequestArg2SecondInput setThirdList(java.util.List<MultiComplexRequestArg2SecondInputThirdList> thirdList) {
            this.thirdList = thirdList;
            return this;
        }
        public java.util.List<MultiComplexRequestArg2SecondInputThirdList> getThirdList() {
            return this.thirdList;
        }

    }

    public static class MultiComplexRequestArg2 extends TeaModel {
        @NameInMap("booleanValue")
        public Boolean booleanValue;

        @NameInMap("intValue")
        public Integer intValue;

        @NameInMap("integerValue")
        public Integer integerValue;

        @NameInMap("longValue")
        public Long longValue;

        @NameInMap("secondInput")
        public MultiComplexRequestArg2SecondInput secondInput;

        @NameInMap("stringValue")
        public String stringValue;

        public static MultiComplexRequestArg2 build(java.util.Map<String, ?> map) throws Exception {
            MultiComplexRequestArg2 self = new MultiComplexRequestArg2();
            return TeaModel.build(map, self);
        }

        public MultiComplexRequestArg2 setBooleanValue(Boolean booleanValue) {
            this.booleanValue = booleanValue;
            return this;
        }
        public Boolean getBooleanValue() {
            return this.booleanValue;
        }

        public MultiComplexRequestArg2 setIntValue(Integer intValue) {
            this.intValue = intValue;
            return this;
        }
        public Integer getIntValue() {
            return this.intValue;
        }

        public MultiComplexRequestArg2 setIntegerValue(Integer integerValue) {
            this.integerValue = integerValue;
            return this;
        }
        public Integer getIntegerValue() {
            return this.integerValue;
        }

        public MultiComplexRequestArg2 setLongValue(Long longValue) {
            this.longValue = longValue;
            return this;
        }
        public Long getLongValue() {
            return this.longValue;
        }

        public MultiComplexRequestArg2 setSecondInput(MultiComplexRequestArg2SecondInput secondInput) {
            this.secondInput = secondInput;
            return this;
        }
        public MultiComplexRequestArg2SecondInput getSecondInput() {
            return this.secondInput;
        }

        public MultiComplexRequestArg2 setStringValue(String stringValue) {
            this.stringValue = stringValue;
            return this;
        }
        public String getStringValue() {
            return this.stringValue;
        }

    }

}
