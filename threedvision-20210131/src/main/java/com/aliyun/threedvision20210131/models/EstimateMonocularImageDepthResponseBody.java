// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.threedvision20210131.models;

import com.aliyun.tea.*;

public class EstimateMonocularImageDepthResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public EstimateMonocularImageDepthResponseBodyData data;

    public static EstimateMonocularImageDepthResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EstimateMonocularImageDepthResponseBody self = new EstimateMonocularImageDepthResponseBody();
        return TeaModel.build(map, self);
    }

    public EstimateMonocularImageDepthResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EstimateMonocularImageDepthResponseBody setData(EstimateMonocularImageDepthResponseBodyData data) {
        this.data = data;
        return this;
    }
    public EstimateMonocularImageDepthResponseBodyData getData() {
        return this.data;
    }

    public static class EstimateMonocularImageDepthResponseBodyData extends TeaModel {
        @NameInMap("DepthMapUrl")
        public String depthMapUrl;

        @NameInMap("DepthToColorUrl")
        public String depthToColorUrl;

        public static EstimateMonocularImageDepthResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            EstimateMonocularImageDepthResponseBodyData self = new EstimateMonocularImageDepthResponseBodyData();
            return TeaModel.build(map, self);
        }

        public EstimateMonocularImageDepthResponseBodyData setDepthMapUrl(String depthMapUrl) {
            this.depthMapUrl = depthMapUrl;
            return this;
        }
        public String getDepthMapUrl() {
            return this.depthMapUrl;
        }

        public EstimateMonocularImageDepthResponseBodyData setDepthToColorUrl(String depthToColorUrl) {
            this.depthToColorUrl = depthToColorUrl;
            return this;
        }
        public String getDepthToColorUrl() {
            return this.depthToColorUrl;
        }

    }

}
