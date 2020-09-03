// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeTakeoutOrderResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public RecognizeTakeoutOrderResponseData data;

    public static RecognizeTakeoutOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeTakeoutOrderResponse self = new RecognizeTakeoutOrderResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeTakeoutOrderResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RecognizeTakeoutOrderResponse setData(RecognizeTakeoutOrderResponseData data) {
        this.data = data;
        return this;
    }
    public RecognizeTakeoutOrderResponseData getData() {
        return this.data;
    }

    public static class RecognizeTakeoutOrderResponseDataElements extends TeaModel {
        @NameInMap("Score")
        @Validation(required = true)
        public Float score;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        @NameInMap("Boxes")
        @Validation(required = true)
        public java.util.List<Integer> boxes;

        public static RecognizeTakeoutOrderResponseDataElements build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTakeoutOrderResponseDataElements self = new RecognizeTakeoutOrderResponseDataElements();
            return TeaModel.build(map, self);
        }

        public RecognizeTakeoutOrderResponseDataElements setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public RecognizeTakeoutOrderResponseDataElements setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public RecognizeTakeoutOrderResponseDataElements setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public RecognizeTakeoutOrderResponseDataElements setBoxes(java.util.List<Integer> boxes) {
            this.boxes = boxes;
            return this;
        }
        public java.util.List<Integer> getBoxes() {
            return this.boxes;
        }

    }

    public static class RecognizeTakeoutOrderResponseData extends TeaModel {
        @NameInMap("Elements")
        @Validation(required = true)
        public java.util.List<RecognizeTakeoutOrderResponseDataElements> elements;

        public static RecognizeTakeoutOrderResponseData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTakeoutOrderResponseData self = new RecognizeTakeoutOrderResponseData();
            return TeaModel.build(map, self);
        }

        public RecognizeTakeoutOrderResponseData setElements(java.util.List<RecognizeTakeoutOrderResponseDataElements> elements) {
            this.elements = elements;
            return this;
        }
        public java.util.List<RecognizeTakeoutOrderResponseDataElements> getElements() {
            return this.elements;
        }

    }

}
