// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.threedvision20210131.models;

import com.aliyun.tea.*;

public class EstimateMonocularVideoDepthResponseBody extends TeaModel {
    @NameInMap("Data")
    public EstimateMonocularVideoDepthResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static EstimateMonocularVideoDepthResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EstimateMonocularVideoDepthResponseBody self = new EstimateMonocularVideoDepthResponseBody();
        return TeaModel.build(map, self);
    }

    public EstimateMonocularVideoDepthResponseBody setData(EstimateMonocularVideoDepthResponseBodyData data) {
        this.data = data;
        return this;
    }
    public EstimateMonocularVideoDepthResponseBodyData getData() {
        return this.data;
    }

    public EstimateMonocularVideoDepthResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public EstimateMonocularVideoDepthResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class EstimateMonocularVideoDepthResponseBodyData extends TeaModel {
        @NameInMap("DepthUrl")
        public String depthUrl;

        @NameInMap("DepthVisUrl")
        public String depthVisUrl;

        public static EstimateMonocularVideoDepthResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            EstimateMonocularVideoDepthResponseBodyData self = new EstimateMonocularVideoDepthResponseBodyData();
            return TeaModel.build(map, self);
        }

        public EstimateMonocularVideoDepthResponseBodyData setDepthUrl(String depthUrl) {
            this.depthUrl = depthUrl;
            return this;
        }
        public String getDepthUrl() {
            return this.depthUrl;
        }

        public EstimateMonocularVideoDepthResponseBodyData setDepthVisUrl(String depthVisUrl) {
            this.depthVisUrl = depthVisUrl;
            return this;
        }
        public String getDepthVisUrl() {
            return this.depthVisUrl;
        }

    }

}
