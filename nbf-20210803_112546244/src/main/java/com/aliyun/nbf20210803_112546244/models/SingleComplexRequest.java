// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210803_112546244.models;

import com.aliyun.tea.*;

public class SingleComplexRequest extends TeaModel {
    @NameInMap("input")
    public SingleComplexRequestInput input;

    public static SingleComplexRequest build(java.util.Map<String, ?> map) throws Exception {
        SingleComplexRequest self = new SingleComplexRequest();
        return TeaModel.build(map, self);
    }

    public SingleComplexRequest setInput(SingleComplexRequestInput input) {
        this.input = input;
        return this;
    }
    public SingleComplexRequestInput getInput() {
        return this.input;
    }

    public static class SingleComplexRequestInputSecondInputThirdList extends TeaModel {
        @NameInMap("thirdInt")
        public Integer thirdInt;

        @NameInMap("thirdString")
        public java.io.InputStream thirdString;

        public static SingleComplexRequestInputSecondInputThirdList build(java.util.Map<String, ?> map) throws Exception {
            SingleComplexRequestInputSecondInputThirdList self = new SingleComplexRequestInputSecondInputThirdList();
            return TeaModel.build(map, self);
        }

        public SingleComplexRequestInputSecondInputThirdList setThirdInt(Integer thirdInt) {
            this.thirdInt = thirdInt;
            return this;
        }
        public Integer getThirdInt() {
            return this.thirdInt;
        }

        public SingleComplexRequestInputSecondInputThirdList setThirdString(java.io.InputStream thirdString) {
            this.thirdString = thirdString;
            return this;
        }
        public java.io.InputStream getThirdString() {
            return this.thirdString;
        }

    }

    public static class SingleComplexRequestInputSecondInput extends TeaModel {
        @NameInMap("secondString")
        public java.io.InputStream secondString;

        @NameInMap("thirdList")
        public java.util.List<SingleComplexRequestInputSecondInputThirdList> thirdList;

        @NameInMap("secondInt")
        public Integer secondInt;

        public static SingleComplexRequestInputSecondInput build(java.util.Map<String, ?> map) throws Exception {
            SingleComplexRequestInputSecondInput self = new SingleComplexRequestInputSecondInput();
            return TeaModel.build(map, self);
        }

        public SingleComplexRequestInputSecondInput setSecondString(java.io.InputStream secondString) {
            this.secondString = secondString;
            return this;
        }
        public java.io.InputStream getSecondString() {
            return this.secondString;
        }

        public SingleComplexRequestInputSecondInput setThirdList(java.util.List<SingleComplexRequestInputSecondInputThirdList> thirdList) {
            this.thirdList = thirdList;
            return this;
        }
        public java.util.List<SingleComplexRequestInputSecondInputThirdList> getThirdList() {
            return this.thirdList;
        }

        public SingleComplexRequestInputSecondInput setSecondInt(Integer secondInt) {
            this.secondInt = secondInt;
            return this;
        }
        public Integer getSecondInt() {
            return this.secondInt;
        }

    }

    public static class SingleComplexRequestInput extends TeaModel {
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
        public SingleComplexRequestInputSecondInput secondInput;

        public static SingleComplexRequestInput build(java.util.Map<String, ?> map) throws Exception {
            SingleComplexRequestInput self = new SingleComplexRequestInput();
            return TeaModel.build(map, self);
        }

        public SingleComplexRequestInput setStringValue(String stringValue) {
            this.stringValue = stringValue;
            return this;
        }
        public String getStringValue() {
            return this.stringValue;
        }

        public SingleComplexRequestInput setIntValue(Integer intValue) {
            this.intValue = intValue;
            return this;
        }
        public Integer getIntValue() {
            return this.intValue;
        }

        public SingleComplexRequestInput setBooleanValue(Boolean booleanValue) {
            this.booleanValue = booleanValue;
            return this;
        }
        public Boolean getBooleanValue() {
            return this.booleanValue;
        }

        public SingleComplexRequestInput setIntegerValue(Integer integerValue) {
            this.integerValue = integerValue;
            return this;
        }
        public Integer getIntegerValue() {
            return this.integerValue;
        }

        public SingleComplexRequestInput setLongValue(Long longValue) {
            this.longValue = longValue;
            return this;
        }
        public Long getLongValue() {
            return this.longValue;
        }

        public SingleComplexRequestInput setSecondInput(SingleComplexRequestInputSecondInput secondInput) {
            this.secondInput = secondInput;
            return this;
        }
        public SingleComplexRequestInputSecondInput getSecondInput() {
            return this.secondInput;
        }

    }

}
