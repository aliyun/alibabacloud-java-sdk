// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetServiceAccessResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ServiceAccessInfo")
    public GetServiceAccessResponseBodyServiceAccessInfo serviceAccessInfo;

    public static GetServiceAccessResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetServiceAccessResponseBody self = new GetServiceAccessResponseBody();
        return TeaModel.build(map, self);
    }

    public GetServiceAccessResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetServiceAccessResponseBody setServiceAccessInfo(GetServiceAccessResponseBodyServiceAccessInfo serviceAccessInfo) {
        this.serviceAccessInfo = serviceAccessInfo;
        return this;
    }
    public GetServiceAccessResponseBodyServiceAccessInfo getServiceAccessInfo() {
        return this.serviceAccessInfo;
    }

    public static class GetServiceAccessResponseBodyServiceAccessInfo extends TeaModel {
        @NameInMap("Status")
        public String status;

        public static GetServiceAccessResponseBodyServiceAccessInfo build(java.util.Map<String, ?> map) throws Exception {
            GetServiceAccessResponseBodyServiceAccessInfo self = new GetServiceAccessResponseBodyServiceAccessInfo();
            return TeaModel.build(map, self);
        }

        public GetServiceAccessResponseBodyServiceAccessInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
