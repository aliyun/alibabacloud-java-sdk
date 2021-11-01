// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class RecognizeVehicleDashboardResponseBody extends TeaModel {
    @NameInMap("Data")
    public RecognizeVehicleDashboardResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static RecognizeVehicleDashboardResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecognizeVehicleDashboardResponseBody self = new RecognizeVehicleDashboardResponseBody();
        return TeaModel.build(map, self);
    }

    public RecognizeVehicleDashboardResponseBody setData(RecognizeVehicleDashboardResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RecognizeVehicleDashboardResponseBodyData getData() {
        return this.data;
    }

    public RecognizeVehicleDashboardResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RecognizeVehicleDashboardResponseBodyDataElements extends TeaModel {
        @NameInMap("Boxes")
        public java.util.List<Float> boxes;

        @NameInMap("ClassName")
        public String className;

        @NameInMap("Label")
        public String label;

        @NameInMap("Score")
        public Float score;

        public static RecognizeVehicleDashboardResponseBodyDataElements build(java.util.Map<String, ?> map) throws Exception {
            RecognizeVehicleDashboardResponseBodyDataElements self = new RecognizeVehicleDashboardResponseBodyDataElements();
            return TeaModel.build(map, self);
        }

        public RecognizeVehicleDashboardResponseBodyDataElements setBoxes(java.util.List<Float> boxes) {
            this.boxes = boxes;
            return this;
        }
        public java.util.List<Float> getBoxes() {
            return this.boxes;
        }

        public RecognizeVehicleDashboardResponseBodyDataElements setClassName(String className) {
            this.className = className;
            return this;
        }
        public String getClassName() {
            return this.className;
        }

        public RecognizeVehicleDashboardResponseBodyDataElements setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public RecognizeVehicleDashboardResponseBodyDataElements setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

    }

    public static class RecognizeVehicleDashboardResponseBodyData extends TeaModel {
        @NameInMap("Elements")
        public java.util.List<RecognizeVehicleDashboardResponseBodyDataElements> elements;

        public static RecognizeVehicleDashboardResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeVehicleDashboardResponseBodyData self = new RecognizeVehicleDashboardResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RecognizeVehicleDashboardResponseBodyData setElements(java.util.List<RecognizeVehicleDashboardResponseBodyDataElements> elements) {
            this.elements = elements;
            return this;
        }
        public java.util.List<RecognizeVehicleDashboardResponseBodyDataElements> getElements() {
            return this.elements;
        }

    }

}
