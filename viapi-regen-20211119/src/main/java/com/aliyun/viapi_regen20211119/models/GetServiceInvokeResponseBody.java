// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class GetServiceInvokeResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetServiceInvokeResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetServiceInvokeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetServiceInvokeResponseBody self = new GetServiceInvokeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetServiceInvokeResponseBody setData(GetServiceInvokeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetServiceInvokeResponseBodyData getData() {
        return this.data;
    }

    public GetServiceInvokeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetServiceInvokeResponseBodyData extends TeaModel {
        @NameInMap("UserInvoke")
        public java.util.Map<String, ?> userInvoke;

        public static GetServiceInvokeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetServiceInvokeResponseBodyData self = new GetServiceInvokeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetServiceInvokeResponseBodyData setUserInvoke(java.util.Map<String, ?> userInvoke) {
            this.userInvoke = userInvoke;
            return this;
        }
        public java.util.Map<String, ?> getUserInvoke() {
            return this.userInvoke;
        }

    }

}
