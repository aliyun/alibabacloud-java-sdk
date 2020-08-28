// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class RecognizeVehicleDamageResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public RecognizeVehicleDamageResponseData data;

    public static RecognizeVehicleDamageResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeVehicleDamageResponse self = new RecognizeVehicleDamageResponse();
        return TeaModel.build(map, self);
    }

    public static class RecognizeVehicleDamageResponseDataElements extends TeaModel {
        @NameInMap("Score")
        @Validation(required = true)
        public Double score;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("Scores")
        @Validation(required = true)
        public java.util.List<Double> scores;

        @NameInMap("Boxes")
        @Validation(required = true)
        public java.util.List<Integer> boxes;

        public static RecognizeVehicleDamageResponseDataElements build(java.util.Map<String, ?> map) throws Exception {
            RecognizeVehicleDamageResponseDataElements self = new RecognizeVehicleDamageResponseDataElements();
            return TeaModel.build(map, self);
        }

    }

    public static class RecognizeVehicleDamageResponseData extends TeaModel {
        @NameInMap("Elements")
        @Validation(required = true)
        public java.util.List<RecognizeVehicleDamageResponseDataElements> elements;

        public static RecognizeVehicleDamageResponseData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeVehicleDamageResponseData self = new RecognizeVehicleDamageResponseData();
            return TeaModel.build(map, self);
        }

    }

}
