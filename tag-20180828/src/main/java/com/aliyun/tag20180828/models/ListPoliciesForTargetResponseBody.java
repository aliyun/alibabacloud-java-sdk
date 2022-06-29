// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tag20180828.models;

import com.aliyun.tea.*;

public class ListPoliciesForTargetResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListPoliciesForTargetResponseBodyData> data;

    @NameInMap("NextToken")
    public String nextToken;

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
        @NameInMap("PolicyContent")
        public String policyContent;

        @NameInMap("PolicyDesc")
        public String policyDesc;

        @NameInMap("PolicyId")
        public String policyId;

        @NameInMap("PolicyName")
        public String policyName;

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
