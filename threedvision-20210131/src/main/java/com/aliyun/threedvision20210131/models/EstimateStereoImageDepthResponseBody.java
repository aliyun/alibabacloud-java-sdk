// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.threedvision20210131.models;

import com.aliyun.tea.*;

public class EstimateStereoImageDepthResponseBody extends TeaModel {
    @NameInMap("Data")
    public EstimateStereoImageDepthResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static EstimateStereoImageDepthResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EstimateStereoImageDepthResponseBody self = new EstimateStereoImageDepthResponseBody();
        return TeaModel.build(map, self);
    }

    public EstimateStereoImageDepthResponseBody setData(EstimateStereoImageDepthResponseBodyData data) {
        this.data = data;
        return this;
    }
    public EstimateStereoImageDepthResponseBodyData getData() {
        return this.data;
    }

    public EstimateStereoImageDepthResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class EstimateStereoImageDepthResponseBodyData extends TeaModel {
        @NameInMap("DisparityMapURL")
        public String disparityMapURL;

        @NameInMap("DisparityVisURL")
        public String disparityVisURL;

        public static EstimateStereoImageDepthResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            EstimateStereoImageDepthResponseBodyData self = new EstimateStereoImageDepthResponseBodyData();
            return TeaModel.build(map, self);
        }

        public EstimateStereoImageDepthResponseBodyData setDisparityMapURL(String disparityMapURL) {
            this.disparityMapURL = disparityMapURL;
            return this;
        }
        public String getDisparityMapURL() {
            return this.disparityMapURL;
        }

        public EstimateStereoImageDepthResponseBodyData setDisparityVisURL(String disparityVisURL) {
            this.disparityVisURL = disparityVisURL;
            return this;
        }
        public String getDisparityVisURL() {
            return this.disparityVisURL;
        }

    }

}
