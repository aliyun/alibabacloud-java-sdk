// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tag20180828.models;

import com.aliyun.tea.*;

public class ListPoliciesForTargetResponseBody extends TeaModel {
    /**
     * <p>The tag policies that are attached to the object.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListPoliciesForTargetResponseBodyData> data;

    /**
     * <p>Indicates whether the next query is required.</p>
     * <ul>
     * <li>If the value of this parameter is empty (<code>&quot;NextToken&quot;: &quot;&quot;</code>), all results are returned, and the next query is not required.</li>
     * <li>If the value of this parameter is not empty, the next query is required, and the value is the token used to start the next query.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>8C962146-AB38-516C-818C-695D4E9F2EA2</p>
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
         * <p>The document of the tag policy.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;tags\&quot;:{\&quot;CostCenter\&quot;:{\&quot;tag_value\&quot;:{\&quot;@@assign\&quot;:[\&quot;Beijing\&quot;,\&quot;Shanghai\&quot;]},\&quot;tag_key\&quot;:{\&quot;@@assign\&quot;:\&quot;CostCenter\&quot;}}}}</p>
         */
        @NameInMap("PolicyContent")
        public String policyContent;

        /**
         * <p>The description of the tag policy.</p>
         * 
         * <strong>example:</strong>
         * <p>This is a tag policy example.</p>
         */
        @NameInMap("PolicyDesc")
        public String policyDesc;

        /**
         * <p>The ID of the tag policy.</p>
         * 
         * <strong>example:</strong>
         * <p>p-de62a0bf400e4b69****</p>
         */
        @NameInMap("PolicyId")
        public String policyId;

        /**
         * <p>The name of the tag policy.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("PolicyName")
        public String policyName;

        /**
         * <p>The mode of the Tag Policy feature. Valid values:</p>
         * <ul>
         * <li>USER: single-account mode</li>
         * <li>RD: multi-account mode</li>
         * </ul>
         * <p>For more information about the modes of the Tag Policy feature, see <a href="https://help.aliyun.com/document_detail/417434.html">Modes of the Tag Policy feature</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>USER</p>
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
