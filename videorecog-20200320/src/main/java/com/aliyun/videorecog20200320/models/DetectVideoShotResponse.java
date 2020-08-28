// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videorecog20200320.models;

import com.aliyun.tea.*;

public class DetectVideoShotResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public DetectVideoShotResponseData data;

    public static DetectVideoShotResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectVideoShotResponse self = new DetectVideoShotResponse();
        return TeaModel.build(map, self);
    }

    public static class DetectVideoShotResponseData extends TeaModel {
        @NameInMap("ShotFrameIds")
        @Validation(required = true)
        public java.util.List<Integer> shotFrameIds;

        public static DetectVideoShotResponseData build(java.util.Map<String, ?> map) throws Exception {
            DetectVideoShotResponseData self = new DetectVideoShotResponseData();
            return TeaModel.build(map, self);
        }

    }

}
