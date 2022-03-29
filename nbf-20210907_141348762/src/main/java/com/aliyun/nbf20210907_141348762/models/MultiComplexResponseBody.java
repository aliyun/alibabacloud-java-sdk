// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210907_141348762.models;

import com.aliyun.tea.*;

public class MultiComplexResponseBody extends TeaModel {
    @NameInMap("booleanValue")
    public Boolean booleanValue;

    @NameInMap("intValue")
    public Integer intValue;

    @NameInMap("integerValue")
    public Integer integerValue;

    @NameInMap("longValue")
    public Long longValue;

    @NameInMap("secondOutput")
    public MultiComplexResponseBodySecondOutput secondOutput;

    @NameInMap("stringValue")
    public String stringValue;

    public static MultiComplexResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MultiComplexResponseBody self = new MultiComplexResponseBody();
        return TeaModel.build(map, self);
    }

    public MultiComplexResponseBody setBooleanValue(Boolean booleanValue) {
        this.booleanValue = booleanValue;
        return this;
    }
    public Boolean getBooleanValue() {
        return this.booleanValue;
    }

    public MultiComplexResponseBody setIntValue(Integer intValue) {
        this.intValue = intValue;
        return this;
    }
    public Integer getIntValue() {
        return this.intValue;
    }

    public MultiComplexResponseBody setIntegerValue(Integer integerValue) {
        this.integerValue = integerValue;
        return this;
    }
    public Integer getIntegerValue() {
        return this.integerValue;
    }

    public MultiComplexResponseBody setLongValue(Long longValue) {
        this.longValue = longValue;
        return this;
    }
    public Long getLongValue() {
        return this.longValue;
    }

    public MultiComplexResponseBody setSecondOutput(MultiComplexResponseBodySecondOutput secondOutput) {
        this.secondOutput = secondOutput;
        return this;
    }
    public MultiComplexResponseBodySecondOutput getSecondOutput() {
        return this.secondOutput;
    }

    public MultiComplexResponseBody setStringValue(String stringValue) {
        this.stringValue = stringValue;
        return this;
    }
    public String getStringValue() {
        return this.stringValue;
    }

    public static class MultiComplexResponseBodySecondOutputThirdList extends TeaModel {
        @NameInMap("thirdInt")
        public Integer thirdInt;

        @NameInMap("thirdString")
        public String thirdString;

        public static MultiComplexResponseBodySecondOutputThirdList build(java.util.Map<String, ?> map) throws Exception {
            MultiComplexResponseBodySecondOutputThirdList self = new MultiComplexResponseBodySecondOutputThirdList();
            return TeaModel.build(map, self);
        }

        public MultiComplexResponseBodySecondOutputThirdList setThirdInt(Integer thirdInt) {
            this.thirdInt = thirdInt;
            return this;
        }
        public Integer getThirdInt() {
            return this.thirdInt;
        }

        public MultiComplexResponseBodySecondOutputThirdList setThirdString(String thirdString) {
            this.thirdString = thirdString;
            return this;
        }
        public String getThirdString() {
            return this.thirdString;
        }

    }

    public static class MultiComplexResponseBodySecondOutput extends TeaModel {
        @NameInMap("secondInt")
        public Integer secondInt;

        @NameInMap("secondString")
        public String secondString;

        @NameInMap("thirdList")
        public java.util.List<MultiComplexResponseBodySecondOutputThirdList> thirdList;

        public static MultiComplexResponseBodySecondOutput build(java.util.Map<String, ?> map) throws Exception {
            MultiComplexResponseBodySecondOutput self = new MultiComplexResponseBodySecondOutput();
            return TeaModel.build(map, self);
        }

        public MultiComplexResponseBodySecondOutput setSecondInt(Integer secondInt) {
            this.secondInt = secondInt;
            return this;
        }
        public Integer getSecondInt() {
            return this.secondInt;
        }

        public MultiComplexResponseBodySecondOutput setSecondString(String secondString) {
            this.secondString = secondString;
            return this;
        }
        public String getSecondString() {
            return this.secondString;
        }

        public MultiComplexResponseBodySecondOutput setThirdList(java.util.List<MultiComplexResponseBodySecondOutputThirdList> thirdList) {
            this.thirdList = thirdList;
            return this;
        }
        public java.util.List<MultiComplexResponseBodySecondOutputThirdList> getThirdList() {
            return this.thirdList;
        }

    }

}
