// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class DetectVehicleResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public DetectVehicleResponseData data;

    public static DetectVehicleResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectVehicleResponse self = new DetectVehicleResponse();
        return TeaModel.build(map, self);
    }

    public static class DetectVehicleResponseDataDetectObjectInfoList extends TeaModel {
        @NameInMap("Score")
        @Validation(required = true)
        public Double score;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("Id")
        @Validation(required = true)
        public Integer id;

        @NameInMap("Boxes")
        @Validation(required = true)
        public java.util.List<Integer> boxes;

        public static DetectVehicleResponseDataDetectObjectInfoList build(java.util.Map<String, ?> map) throws Exception {
            DetectVehicleResponseDataDetectObjectInfoList self = new DetectVehicleResponseDataDetectObjectInfoList();
            return TeaModel.build(map, self);
        }

    }

    public static class DetectVehicleResponseData extends TeaModel {
        @NameInMap("Width")
        @Validation(required = true)
        public Integer width;

        @NameInMap("Height")
        @Validation(required = true)
        public Integer height;

        @NameInMap("DetectObjectInfoList")
        @Validation(required = true)
        public java.util.List<DetectVehicleResponseDataDetectObjectInfoList> detectObjectInfoList;

        public static DetectVehicleResponseData build(java.util.Map<String, ?> map) throws Exception {
            DetectVehicleResponseData self = new DetectVehicleResponseData();
            return TeaModel.build(map, self);
        }

    }

}
