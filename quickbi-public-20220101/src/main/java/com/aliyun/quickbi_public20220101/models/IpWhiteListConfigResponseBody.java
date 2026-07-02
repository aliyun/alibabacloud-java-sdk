// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class IpWhiteListConfigResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D787E1A3-A93C-424A-B626-C2B05DF8D885</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The IP address whitelist.</p>
     */
    @NameInMap("Result")
    public IpWhiteListConfigResponseBodyResult result;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static IpWhiteListConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        IpWhiteListConfigResponseBody self = new IpWhiteListConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public IpWhiteListConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public IpWhiteListConfigResponseBody setResult(IpWhiteListConfigResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public IpWhiteListConfigResponseBodyResult getResult() {
        return this.result;
    }

    public IpWhiteListConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class IpWhiteListConfigResponseBodyResult extends TeaModel {
        /**
         * <p>The IP address whitelist array.</p>
         */
        @NameInMap("IpWhiteList")
        public java.util.List<String> ipWhiteList;

        public static IpWhiteListConfigResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            IpWhiteListConfigResponseBodyResult self = new IpWhiteListConfigResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public IpWhiteListConfigResponseBodyResult setIpWhiteList(java.util.List<String> ipWhiteList) {
            this.ipWhiteList = ipWhiteList;
            return this;
        }
        public java.util.List<String> getIpWhiteList() {
            return this.ipWhiteList;
        }

    }

}
