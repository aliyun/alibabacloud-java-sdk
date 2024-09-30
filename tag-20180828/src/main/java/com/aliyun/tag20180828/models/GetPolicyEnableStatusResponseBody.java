// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tag20180828.models;

import com.aliyun.tea.*;

public class GetPolicyEnableStatusResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>6C8DF1B1-C65F-5D3A-9FDA-26A4683BB36B</p>
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
         * <ul>
         * <li>PendingEnable: The feature is being enabled.</li>
         * <li>Enabled: The feature is enabled.</li>
         * <li>Closing: The feature is being disabled.</li>
         * <li>Disabled: The feature is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The mode of the Tag Policy feature. Valid values:</p>
         * <ul>
         * <li>USER: single-account mode</li>
         * <li>RD: multi-account mode</li>
         * </ul>
         * <p>For more information about the modes of the Tag Policy feature, see <a href="https://help.aliyun.com/document_detail/417434.html">Modes of the Tag Policy feature</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>RD</p>
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
