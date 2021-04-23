// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.threedvision20210131.models;

import com.aliyun.tea.*;

public class EstimateStereoVideoDepthResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public EstimateStereoVideoDepthResponseBodyData data;

    public static EstimateStereoVideoDepthResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EstimateStereoVideoDepthResponseBody self = new EstimateStereoVideoDepthResponseBody();
        return TeaModel.build(map, self);
    }

    public EstimateStereoVideoDepthResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EstimateStereoVideoDepthResponseBody setData(EstimateStereoVideoDepthResponseBodyData data) {
        this.data = data;
        return this;
    }
    public EstimateStereoVideoDepthResponseBodyData getData() {
        return this.data;
    }

    public static class EstimateStereoVideoDepthResponseBodyData extends TeaModel {
        @NameInMap("DepthUrl")
        public String depthUrl;

        @NameInMap("DepthVisUrl")
        public String depthVisUrl;

        public static EstimateStereoVideoDepthResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            EstimateStereoVideoDepthResponseBodyData self = new EstimateStereoVideoDepthResponseBodyData();
            return TeaModel.build(map, self);
        }

        public EstimateStereoVideoDepthResponseBodyData setDepthUrl(String depthUrl) {
            this.depthUrl = depthUrl;
            return this;
        }
        public String getDepthUrl() {
            return this.depthUrl;
        }

        public EstimateStereoVideoDepthResponseBodyData setDepthVisUrl(String depthVisUrl) {
            this.depthVisUrl = depthVisUrl;
            return this;
        }
        public String getDepthVisUrl() {
            return this.depthVisUrl;
        }

    }

}
