// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class DetectVideoFrameResponseBody extends TeaModel {
    @NameInMap("Data")
    public DetectVideoFrameResponseBodyData data;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static DetectVideoFrameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetectVideoFrameResponseBody self = new DetectVideoFrameResponseBody();
        return TeaModel.build(map, self);
    }

    public DetectVideoFrameResponseBody setData(DetectVideoFrameResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DetectVideoFrameResponseBodyData getData() {
        return this.data;
    }

    public DetectVideoFrameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DetectVideoFrameResponseBodyData extends TeaModel {
        // Id of the request
        @NameInMap("RequestId")
        public String requestId;

        public static DetectVideoFrameResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DetectVideoFrameResponseBodyData self = new DetectVideoFrameResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DetectVideoFrameResponseBodyData setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

    }

}
