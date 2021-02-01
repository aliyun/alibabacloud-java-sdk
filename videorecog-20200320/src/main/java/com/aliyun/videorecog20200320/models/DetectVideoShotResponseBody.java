// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videorecog20200320.models;

import com.aliyun.tea.*;

public class DetectVideoShotResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public DetectVideoShotResponseBodyData data;

    public static DetectVideoShotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetectVideoShotResponseBody self = new DetectVideoShotResponseBody();
        return TeaModel.build(map, self);
    }

    public DetectVideoShotResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DetectVideoShotResponseBody setData(DetectVideoShotResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DetectVideoShotResponseBodyData getData() {
        return this.data;
    }

    public static class DetectVideoShotResponseBodyData extends TeaModel {
        @NameInMap("ShotFrameIds")
        public java.util.List<Integer> shotFrameIds;

        public static DetectVideoShotResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DetectVideoShotResponseBodyData self = new DetectVideoShotResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DetectVideoShotResponseBodyData setShotFrameIds(java.util.List<Integer> shotFrameIds) {
            this.shotFrameIds = shotFrameIds;
            return this;
        }
        public java.util.List<Integer> getShotFrameIds() {
            return this.shotFrameIds;
        }

    }

}
