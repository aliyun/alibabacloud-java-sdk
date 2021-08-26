// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbftestpop20210806_151255420.models;

import com.aliyun.tea.*;

public class MutilComplexResponseBody extends TeaModel {
    @NameInMap("stringValue")
    public String stringValue;

    @NameInMap("secondOutput")
    public MutilComplexResponseBodySecondOutput secondOutput;

    @NameInMap("intValue")
    public Integer intValue;

    @NameInMap("booleanValue")
    public Boolean booleanValue;

    @NameInMap("integerValue")
    public Integer integerValue;

    @NameInMap("longValue")
    public Long longValue;

    public static MutilComplexResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MutilComplexResponseBody self = new MutilComplexResponseBody();
        return TeaModel.build(map, self);
    }

    public MutilComplexResponseBody setStringValue(String stringValue) {
        this.stringValue = stringValue;
        return this;
    }
    public String getStringValue() {
        return this.stringValue;
    }

    public MutilComplexResponseBody setSecondOutput(MutilComplexResponseBodySecondOutput secondOutput) {
        this.secondOutput = secondOutput;
        return this;
    }
    public MutilComplexResponseBodySecondOutput getSecondOutput() {
        return this.secondOutput;
    }

    public MutilComplexResponseBody setIntValue(Integer intValue) {
        this.intValue = intValue;
        return this;
    }
    public Integer getIntValue() {
        return this.intValue;
    }

    public MutilComplexResponseBody setBooleanValue(Boolean booleanValue) {
        this.booleanValue = booleanValue;
        return this;
    }
    public Boolean getBooleanValue() {
        return this.booleanValue;
    }

    public MutilComplexResponseBody setIntegerValue(Integer integerValue) {
        this.integerValue = integerValue;
        return this;
    }
    public Integer getIntegerValue() {
        return this.integerValue;
    }

    public MutilComplexResponseBody setLongValue(Long longValue) {
        this.longValue = longValue;
        return this;
    }
    public Long getLongValue() {
        return this.longValue;
    }

    public static class MutilComplexResponseBodySecondOutputThirdList extends TeaModel {
        @NameInMap("thirdInt")
        public Integer thirdInt;

        @NameInMap("thirdString")
        public String thirdString;

        public static MutilComplexResponseBodySecondOutputThirdList build(java.util.Map<String, ?> map) throws Exception {
            MutilComplexResponseBodySecondOutputThirdList self = new MutilComplexResponseBodySecondOutputThirdList();
            return TeaModel.build(map, self);
        }

        public MutilComplexResponseBodySecondOutputThirdList setThirdInt(Integer thirdInt) {
            this.thirdInt = thirdInt;
            return this;
        }
        public Integer getThirdInt() {
            return this.thirdInt;
        }

        public MutilComplexResponseBodySecondOutputThirdList setThirdString(String thirdString) {
            this.thirdString = thirdString;
            return this;
        }
        public String getThirdString() {
            return this.thirdString;
        }

    }

    public static class MutilComplexResponseBodySecondOutput extends TeaModel {
        @NameInMap("thirdList")
        public java.util.List<MutilComplexResponseBodySecondOutputThirdList> thirdList;

        public static MutilComplexResponseBodySecondOutput build(java.util.Map<String, ?> map) throws Exception {
            MutilComplexResponseBodySecondOutput self = new MutilComplexResponseBodySecondOutput();
            return TeaModel.build(map, self);
        }

        public MutilComplexResponseBodySecondOutput setThirdList(java.util.List<MutilComplexResponseBodySecondOutputThirdList> thirdList) {
            this.thirdList = thirdList;
            return this;
        }
        public java.util.List<MutilComplexResponseBodySecondOutputThirdList> getThirdList() {
            return this.thirdList;
        }

    }

}
