// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class RecognizeVehicleDashboardResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public RecognizeVehicleDashboardResponseData data;

    public static RecognizeVehicleDashboardResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeVehicleDashboardResponse self = new RecognizeVehicleDashboardResponse();
        return TeaModel.build(map, self);
    }

    public static class RecognizeVehicleDashboardResponseDataElements extends TeaModel {
        @NameInMap("Score")
        @Validation(required = true)
        public Double score;

        @NameInMap("ClassName")
        @Validation(required = true)
        public String className;

        @NameInMap("Label")
        @Validation(required = true)
        public String label;

        @NameInMap("Boxes")
        @Validation(required = true)
        public java.util.List<Double> boxes;

        public static RecognizeVehicleDashboardResponseDataElements build(java.util.Map<String, ?> map) throws Exception {
            RecognizeVehicleDashboardResponseDataElements self = new RecognizeVehicleDashboardResponseDataElements();
            return TeaModel.build(map, self);
        }

    }

    public static class RecognizeVehicleDashboardResponseData extends TeaModel {
        @NameInMap("Elements")
        @Validation(required = true)
        public java.util.List<RecognizeVehicleDashboardResponseDataElements> elements;

        public static RecognizeVehicleDashboardResponseData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeVehicleDashboardResponseData self = new RecognizeVehicleDashboardResponseData();
            return TeaModel.build(map, self);
        }

    }

}
