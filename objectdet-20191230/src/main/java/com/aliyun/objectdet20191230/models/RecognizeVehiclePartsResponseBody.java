// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class RecognizeVehiclePartsResponseBody extends TeaModel {
    @NameInMap("Data")
    public RecognizeVehiclePartsResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static RecognizeVehiclePartsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecognizeVehiclePartsResponseBody self = new RecognizeVehiclePartsResponseBody();
        return TeaModel.build(map, self);
    }

    public RecognizeVehiclePartsResponseBody setData(RecognizeVehiclePartsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RecognizeVehiclePartsResponseBodyData getData() {
        return this.data;
    }

    public RecognizeVehiclePartsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RecognizeVehiclePartsResponseBodyDataElements extends TeaModel {
        @NameInMap("Boxes")
        public java.util.List<Integer> boxes;

        @NameInMap("Score")
        public Float score;

        @NameInMap("Type")
        public String type;

        public static RecognizeVehiclePartsResponseBodyDataElements build(java.util.Map<String, ?> map) throws Exception {
            RecognizeVehiclePartsResponseBodyDataElements self = new RecognizeVehiclePartsResponseBodyDataElements();
            return TeaModel.build(map, self);
        }

        public RecognizeVehiclePartsResponseBodyDataElements setBoxes(java.util.List<Integer> boxes) {
            this.boxes = boxes;
            return this;
        }
        public java.util.List<Integer> getBoxes() {
            return this.boxes;
        }

        public RecognizeVehiclePartsResponseBodyDataElements setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public RecognizeVehiclePartsResponseBodyDataElements setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class RecognizeVehiclePartsResponseBodyData extends TeaModel {
        @NameInMap("Elements")
        public java.util.List<RecognizeVehiclePartsResponseBodyDataElements> elements;

        @NameInMap("OriginShapes")
        public java.util.List<Integer> originShapes;

        public static RecognizeVehiclePartsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeVehiclePartsResponseBodyData self = new RecognizeVehiclePartsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RecognizeVehiclePartsResponseBodyData setElements(java.util.List<RecognizeVehiclePartsResponseBodyDataElements> elements) {
            this.elements = elements;
            return this;
        }
        public java.util.List<RecognizeVehiclePartsResponseBodyDataElements> getElements() {
            return this.elements;
        }

        public RecognizeVehiclePartsResponseBodyData setOriginShapes(java.util.List<Integer> originShapes) {
            this.originShapes = originShapes;
            return this;
        }
        public java.util.List<Integer> getOriginShapes() {
            return this.originShapes;
        }

    }

}
