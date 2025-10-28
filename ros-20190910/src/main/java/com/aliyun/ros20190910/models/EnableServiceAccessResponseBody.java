// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class EnableServiceAccessResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>23045A5D-720E-5D11-A752-E1568F725C93</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ServiceAccessInfo")
    public EnableServiceAccessResponseBodyServiceAccessInfo serviceAccessInfo;

    public static EnableServiceAccessResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableServiceAccessResponseBody self = new EnableServiceAccessResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableServiceAccessResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EnableServiceAccessResponseBody setServiceAccessInfo(EnableServiceAccessResponseBodyServiceAccessInfo serviceAccessInfo) {
        this.serviceAccessInfo = serviceAccessInfo;
        return this;
    }
    public EnableServiceAccessResponseBodyServiceAccessInfo getServiceAccessInfo() {
        return this.serviceAccessInfo;
    }

    public static class EnableServiceAccessResponseBodyServiceAccessInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ENABLED</p>
         */
        @NameInMap("Status")
        public String status;

        public static EnableServiceAccessResponseBodyServiceAccessInfo build(java.util.Map<String, ?> map) throws Exception {
            EnableServiceAccessResponseBodyServiceAccessInfo self = new EnableServiceAccessResponseBodyServiceAccessInfo();
            return TeaModel.build(map, self);
        }

        public EnableServiceAccessResponseBodyServiceAccessInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
