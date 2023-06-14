// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tag20180828.models;

import com.aliyun.tea.*;

public class GetPolicyEnableStatusResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information of the Tag Policy feature.</p>
     */
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
        /**
         * <p>The status of the Tag Policy feature. Valid values:</p>
         * <br>
         * <p>*   PendingEnable: The feature is being enabled.</p>
         * <p>*   Enabled: The feature is enabled.</p>
         * <p>*   Closing: The feature is being disabled.</p>
         * <p>*   Disabled: The feature is disabled.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The mode of the Tag Policy feature. Valid values:</p>
         * <br>
         * <p>*   USER: single-account mode</p>
         * <p>*   RD: multi-account mode</p>
         * <br>
         * <p>For more information about the modes of the Tag Policy feature, see [Modes of the Tag Policy feature](~~417434~~).</p>
         */
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
