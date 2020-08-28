// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class RecognizeVehiclePartsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public RecognizeVehiclePartsResponseData data;

    public static RecognizeVehiclePartsResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeVehiclePartsResponse self = new RecognizeVehiclePartsResponse();
        return TeaModel.build(map, self);
    }

    public static class RecognizeVehiclePartsResponseDataElements extends TeaModel {
        @NameInMap("Score")
        @Validation(required = true)
        public Double score;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("Boxes")
        @Validation(required = true)
        public java.util.List<Integer> boxes;

        public static RecognizeVehiclePartsResponseDataElements build(java.util.Map<String, ?> map) throws Exception {
            RecognizeVehiclePartsResponseDataElements self = new RecognizeVehiclePartsResponseDataElements();
            return TeaModel.build(map, self);
        }

    }

    public static class RecognizeVehiclePartsResponseData extends TeaModel {
        @NameInMap("Elements")
        @Validation(required = true)
        public java.util.List<RecognizeVehiclePartsResponseDataElements> elements;

        @NameInMap("OriginShapes")
        @Validation(required = true)
        public java.util.List<Integer> originShapes;

        public static RecognizeVehiclePartsResponseData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeVehiclePartsResponseData self = new RecognizeVehiclePartsResponseData();
            return TeaModel.build(map, self);
        }

    }

}
