// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class GetServiceQpsResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetServiceQpsResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetServiceQpsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetServiceQpsResponseBody self = new GetServiceQpsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetServiceQpsResponseBody setData(GetServiceQpsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetServiceQpsResponseBodyData getData() {
        return this.data;
    }

    public GetServiceQpsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetServiceQpsResponseBodyData extends TeaModel {
        @NameInMap("UserQps")
        public java.util.Map<String, ?> userQps;

        public static GetServiceQpsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetServiceQpsResponseBodyData self = new GetServiceQpsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetServiceQpsResponseBodyData setUserQps(java.util.Map<String, ?> userQps) {
            this.userQps = userQps;
            return this;
        }
        public java.util.Map<String, ?> getUserQps() {
            return this.userQps;
        }

    }

}
