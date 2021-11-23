// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeTakeoutOrderResponseBody extends TeaModel {
    @NameInMap("Data")
    public RecognizeTakeoutOrderResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static RecognizeTakeoutOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecognizeTakeoutOrderResponseBody self = new RecognizeTakeoutOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public RecognizeTakeoutOrderResponseBody setData(RecognizeTakeoutOrderResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RecognizeTakeoutOrderResponseBodyData getData() {
        return this.data;
    }

    public RecognizeTakeoutOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RecognizeTakeoutOrderResponseBodyDataElements extends TeaModel {
        @NameInMap("Boxes")
        public java.util.List<Integer> boxes;

        @NameInMap("Name")
        public String name;

        @NameInMap("Score")
        public Float score;

        @NameInMap("Value")
        public String value;

        public static RecognizeTakeoutOrderResponseBodyDataElements build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTakeoutOrderResponseBodyDataElements self = new RecognizeTakeoutOrderResponseBodyDataElements();
            return TeaModel.build(map, self);
        }

        public RecognizeTakeoutOrderResponseBodyDataElements setBoxes(java.util.List<Integer> boxes) {
            this.boxes = boxes;
            return this;
        }
        public java.util.List<Integer> getBoxes() {
            return this.boxes;
        }

        public RecognizeTakeoutOrderResponseBodyDataElements setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public RecognizeTakeoutOrderResponseBodyDataElements setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public RecognizeTakeoutOrderResponseBodyDataElements setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class RecognizeTakeoutOrderResponseBodyData extends TeaModel {
        @NameInMap("Elements")
        public java.util.List<RecognizeTakeoutOrderResponseBodyDataElements> elements;

        public static RecognizeTakeoutOrderResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTakeoutOrderResponseBodyData self = new RecognizeTakeoutOrderResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RecognizeTakeoutOrderResponseBodyData setElements(java.util.List<RecognizeTakeoutOrderResponseBodyDataElements> elements) {
            this.elements = elements;
            return this;
        }
        public java.util.List<RecognizeTakeoutOrderResponseBodyDataElements> getElements() {
            return this.elements;
        }

    }

}
