// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class RecognizeVehicleDamageResponseBody extends TeaModel {
    @NameInMap("Data")
    public RecognizeVehicleDamageResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static RecognizeVehicleDamageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecognizeVehicleDamageResponseBody self = new RecognizeVehicleDamageResponseBody();
        return TeaModel.build(map, self);
    }

    public RecognizeVehicleDamageResponseBody setData(RecognizeVehicleDamageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RecognizeVehicleDamageResponseBodyData getData() {
        return this.data;
    }

    public RecognizeVehicleDamageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RecognizeVehicleDamageResponseBodyDataElements extends TeaModel {
        @NameInMap("Boxes")
        public java.util.List<Integer> boxes;

        @NameInMap("Score")
        public Float score;

        @NameInMap("Scores")
        public java.util.List<Float> scores;

        @NameInMap("Type")
        public String type;

        public static RecognizeVehicleDamageResponseBodyDataElements build(java.util.Map<String, ?> map) throws Exception {
            RecognizeVehicleDamageResponseBodyDataElements self = new RecognizeVehicleDamageResponseBodyDataElements();
            return TeaModel.build(map, self);
        }

        public RecognizeVehicleDamageResponseBodyDataElements setBoxes(java.util.List<Integer> boxes) {
            this.boxes = boxes;
            return this;
        }
        public java.util.List<Integer> getBoxes() {
            return this.boxes;
        }

        public RecognizeVehicleDamageResponseBodyDataElements setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public RecognizeVehicleDamageResponseBodyDataElements setScores(java.util.List<Float> scores) {
            this.scores = scores;
            return this;
        }
        public java.util.List<Float> getScores() {
            return this.scores;
        }

        public RecognizeVehicleDamageResponseBodyDataElements setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class RecognizeVehicleDamageResponseBodyData extends TeaModel {
        @NameInMap("Elements")
        public java.util.List<RecognizeVehicleDamageResponseBodyDataElements> elements;

        public static RecognizeVehicleDamageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeVehicleDamageResponseBodyData self = new RecognizeVehicleDamageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RecognizeVehicleDamageResponseBodyData setElements(java.util.List<RecognizeVehicleDamageResponseBodyDataElements> elements) {
            this.elements = elements;
            return this;
        }
        public java.util.List<RecognizeVehicleDamageResponseBodyDataElements> getElements() {
            return this.elements;
        }

    }

}
