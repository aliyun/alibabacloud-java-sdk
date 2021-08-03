// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210803_112546244.models;

import com.aliyun.tea.*;

public class SingleComplexResponseBody extends TeaModel {
    @NameInMap("stringValue")
    public java.io.InputStream stringValue;

    @NameInMap("secondOutput")
    public SingleComplexResponseBodySecondOutput secondOutput;

    @NameInMap("intValue")
    public Integer intValue;

    @NameInMap("booleanValue")
    public Boolean booleanValue;

    @NameInMap("integerValue")
    public Integer integerValue;

    @NameInMap("longValue")
    public Long longValue;

    public static SingleComplexResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SingleComplexResponseBody self = new SingleComplexResponseBody();
        return TeaModel.build(map, self);
    }

    public SingleComplexResponseBody setStringValue(java.io.InputStream stringValue) {
        this.stringValue = stringValue;
        return this;
    }
    public java.io.InputStream getStringValue() {
        return this.stringValue;
    }

    public SingleComplexResponseBody setSecondOutput(SingleComplexResponseBodySecondOutput secondOutput) {
        this.secondOutput = secondOutput;
        return this;
    }
    public SingleComplexResponseBodySecondOutput getSecondOutput() {
        return this.secondOutput;
    }

    public SingleComplexResponseBody setIntValue(Integer intValue) {
        this.intValue = intValue;
        return this;
    }
    public Integer getIntValue() {
        return this.intValue;
    }

    public SingleComplexResponseBody setBooleanValue(Boolean booleanValue) {
        this.booleanValue = booleanValue;
        return this;
    }
    public Boolean getBooleanValue() {
        return this.booleanValue;
    }

    public SingleComplexResponseBody setIntegerValue(Integer integerValue) {
        this.integerValue = integerValue;
        return this;
    }
    public Integer getIntegerValue() {
        return this.integerValue;
    }

    public SingleComplexResponseBody setLongValue(Long longValue) {
        this.longValue = longValue;
        return this;
    }
    public Long getLongValue() {
        return this.longValue;
    }

    public static class SingleComplexResponseBodySecondOutputThirdList extends TeaModel {
        @NameInMap("thirdInt")
        public Integer thirdInt;

        @NameInMap("thirdString")
        public java.io.InputStream thirdString;

        public static SingleComplexResponseBodySecondOutputThirdList build(java.util.Map<String, ?> map) throws Exception {
            SingleComplexResponseBodySecondOutputThirdList self = new SingleComplexResponseBodySecondOutputThirdList();
            return TeaModel.build(map, self);
        }

        public SingleComplexResponseBodySecondOutputThirdList setThirdInt(Integer thirdInt) {
            this.thirdInt = thirdInt;
            return this;
        }
        public Integer getThirdInt() {
            return this.thirdInt;
        }

        public SingleComplexResponseBodySecondOutputThirdList setThirdString(java.io.InputStream thirdString) {
            this.thirdString = thirdString;
            return this;
        }
        public java.io.InputStream getThirdString() {
            return this.thirdString;
        }

    }

    public static class SingleComplexResponseBodySecondOutput extends TeaModel {
        @NameInMap("secondString")
        public java.io.InputStream secondString;

        @NameInMap("thirdList")
        public java.util.List<SingleComplexResponseBodySecondOutputThirdList> thirdList;

        @NameInMap("secondInt")
        public Integer secondInt;

        public static SingleComplexResponseBodySecondOutput build(java.util.Map<String, ?> map) throws Exception {
            SingleComplexResponseBodySecondOutput self = new SingleComplexResponseBodySecondOutput();
            return TeaModel.build(map, self);
        }

        public SingleComplexResponseBodySecondOutput setSecondString(java.io.InputStream secondString) {
            this.secondString = secondString;
            return this;
        }
        public java.io.InputStream getSecondString() {
            return this.secondString;
        }

        public SingleComplexResponseBodySecondOutput setThirdList(java.util.List<SingleComplexResponseBodySecondOutputThirdList> thirdList) {
            this.thirdList = thirdList;
            return this;
        }
        public java.util.List<SingleComplexResponseBodySecondOutputThirdList> getThirdList() {
            return this.thirdList;
        }

        public SingleComplexResponseBodySecondOutput setSecondInt(Integer secondInt) {
            this.secondInt = secondInt;
            return this;
        }
        public Integer getSecondInt() {
            return this.secondInt;
        }

    }

}
