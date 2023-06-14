// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tag20180828.models;

import com.aliyun.tea.*;

public class ListPoliciesForTargetResponseBody extends TeaModel {
    /**
     * <p>The ID of the tag policy.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListPoliciesForTargetResponseBodyData> data;

    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Indicates whether the next query is required.</p>
     * <br>
     * <p>*   If the value of this parameter is empty (`"NextToken": ""`), all results are returned, and the next query is not required.</p>
     * <p>*   If the value of this parameter is not empty, the next query is required, and the value is the token used to start the next query.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListPoliciesForTargetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPoliciesForTargetResponseBody self = new ListPoliciesForTargetResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPoliciesForTargetResponseBody setData(java.util.List<ListPoliciesForTargetResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListPoliciesForTargetResponseBodyData> getData() {
        return this.data;
    }

    public ListPoliciesForTargetResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListPoliciesForTargetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListPoliciesForTargetResponseBodyData extends TeaModel {
        /**
         * <p>The mode of the Tag Policy feature. Valid values:</p>
         * <br>
         * <p>*   USER: single-account mode</p>
         * <p>*   RD: multi-account mode</p>
         * <br>
         * <p>For more information about the modes of the Tag Policy feature, see [Modes of the Tag Policy feature](~~417434~~).</p>
         */
        @NameInMap("PolicyContent")
        public String policyContent;

        /**
         * <p>The document of the tag policy.</p>
         */
        @NameInMap("PolicyDesc")
        public String policyDesc;

        /**
         * <p>The name of the tag policy.</p>
         */
        @NameInMap("PolicyId")
        public String policyId;

        /**
         * <p>The description of the tag policy.</p>
         */
        @NameInMap("PolicyName")
        public String policyName;

        /**
         * <p>The ID of the request.</p>
         */
        @NameInMap("UserType")
        public String userType;

        public static ListPoliciesForTargetResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListPoliciesForTargetResponseBodyData self = new ListPoliciesForTargetResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListPoliciesForTargetResponseBodyData setPolicyContent(String policyContent) {
            this.policyContent = policyContent;
            return this;
        }
        public String getPolicyContent() {
            return this.policyContent;
        }

        public ListPoliciesForTargetResponseBodyData setPolicyDesc(String policyDesc) {
            this.policyDesc = policyDesc;
            return this;
        }
        public String getPolicyDesc() {
            return this.policyDesc;
        }

        public ListPoliciesForTargetResponseBodyData setPolicyId(String policyId) {
            this.policyId = policyId;
            return this;
        }
        public String getPolicyId() {
            return this.policyId;
        }

        public ListPoliciesForTargetResponseBodyData setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

        public ListPoliciesForTargetResponseBodyData setUserType(String userType) {
            this.userType = userType;
            return this;
        }
        public String getUserType() {
            return this.userType;
        }

    }

}
