// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class ClassifyVehicleInsuranceResponseBody extends TeaModel {
    @NameInMap("Data")
    public ClassifyVehicleInsuranceResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static ClassifyVehicleInsuranceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ClassifyVehicleInsuranceResponseBody self = new ClassifyVehicleInsuranceResponseBody();
        return TeaModel.build(map, self);
    }

    public ClassifyVehicleInsuranceResponseBody setData(ClassifyVehicleInsuranceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ClassifyVehicleInsuranceResponseBodyData getData() {
        return this.data;
    }

    public ClassifyVehicleInsuranceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ClassifyVehicleInsuranceResponseBodyDataLabels extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Score")
        public Float score;

        public static ClassifyVehicleInsuranceResponseBodyDataLabels build(java.util.Map<String, ?> map) throws Exception {
            ClassifyVehicleInsuranceResponseBodyDataLabels self = new ClassifyVehicleInsuranceResponseBodyDataLabels();
            return TeaModel.build(map, self);
        }

        public ClassifyVehicleInsuranceResponseBodyDataLabels setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ClassifyVehicleInsuranceResponseBodyDataLabels setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

    }

    public static class ClassifyVehicleInsuranceResponseBodyData extends TeaModel {
        @NameInMap("Labels")
        public java.util.List<ClassifyVehicleInsuranceResponseBodyDataLabels> labels;

        @NameInMap("Threshold")
        public Float threshold;

        public static ClassifyVehicleInsuranceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ClassifyVehicleInsuranceResponseBodyData self = new ClassifyVehicleInsuranceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ClassifyVehicleInsuranceResponseBodyData setLabels(java.util.List<ClassifyVehicleInsuranceResponseBodyDataLabels> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<ClassifyVehicleInsuranceResponseBodyDataLabels> getLabels() {
            return this.labels;
        }

        public ClassifyVehicleInsuranceResponseBodyData setThreshold(Float threshold) {
            this.threshold = threshold;
            return this;
        }
        public Float getThreshold() {
            return this.threshold;
        }

    }

}
