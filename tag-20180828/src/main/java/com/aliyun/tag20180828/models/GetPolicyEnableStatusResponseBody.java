// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tag20180828.models;

import com.aliyun.tea.*;

public class GetPolicyEnableStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StatusModels")
    public java.util.List<GetPolicyEnableStatusResponseBodyStatusModels> statusModels;

    public static GetPolicyEnableStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPolicyEnableStatusResponseBody self = new GetPolicyEnableStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPolicyEnableStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPolicyEnableStatusResponseBody setStatusModels(java.util.List<GetPolicyEnableStatusResponseBodyStatusModels> statusModels) {
        this.statusModels = statusModels;
        return this;
    }
    public java.util.List<GetPolicyEnableStatusResponseBodyStatusModels> getStatusModels() {
        return this.statusModels;
    }

    public static class GetPolicyEnableStatusResponseBodyStatusModels extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("UserType")
        public String userType;

        public static GetPolicyEnableStatusResponseBodyStatusModels build(java.util.Map<String, ?> map) throws Exception {
            GetPolicyEnableStatusResponseBodyStatusModels self = new GetPolicyEnableStatusResponseBodyStatusModels();
            return TeaModel.build(map, self);
        }

        public GetPolicyEnableStatusResponseBodyStatusModels setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetPolicyEnableStatusResponseBodyStatusModels setUserType(String userType) {
            this.userType = userType;
            return this;
        }
        public String getUserType() {
            return this.userType;
        }

    }

}
