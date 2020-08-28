// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class ClassifyVehicleInsuranceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public ClassifyVehicleInsuranceResponseData data;

    public static ClassifyVehicleInsuranceResponse build(java.util.Map<String, ?> map) throws Exception {
        ClassifyVehicleInsuranceResponse self = new ClassifyVehicleInsuranceResponse();
        return TeaModel.build(map, self);
    }

    public static class ClassifyVehicleInsuranceResponseDataLabels extends TeaModel {
        @NameInMap("Score")
        @Validation(required = true)
        public Double score;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        public static ClassifyVehicleInsuranceResponseDataLabels build(java.util.Map<String, ?> map) throws Exception {
            ClassifyVehicleInsuranceResponseDataLabels self = new ClassifyVehicleInsuranceResponseDataLabels();
            return TeaModel.build(map, self);
        }

    }

    public static class ClassifyVehicleInsuranceResponseData extends TeaModel {
        @NameInMap("Threshold")
        @Validation(required = true)
        public Double threshold;

        @NameInMap("Labels")
        @Validation(required = true)
        public java.util.List<ClassifyVehicleInsuranceResponseDataLabels> labels;

        public static ClassifyVehicleInsuranceResponseData build(java.util.Map<String, ?> map) throws Exception {
            ClassifyVehicleInsuranceResponseData self = new ClassifyVehicleInsuranceResponseData();
            return TeaModel.build(map, self);
        }

    }

}
