// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class UpdatePolicyDescriptionResponseBody extends TeaModel {
    /**
     * <p>The information about the policy.</p>
     */
    @NameInMap("Policy")
    public UpdatePolicyDescriptionResponseBodyPolicy policy;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7572DEBD-0ECE-518E-8682-D8CB82F8FE8E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdatePolicyDescriptionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdatePolicyDescriptionResponseBody self = new UpdatePolicyDescriptionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdatePolicyDescriptionResponseBody setPolicy(UpdatePolicyDescriptionResponseBodyPolicy policy) {
        this.policy = policy;
        return this;
    }
    public UpdatePolicyDescriptionResponseBodyPolicy getPolicy() {
        return this.policy;
    }

    public UpdatePolicyDescriptionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdatePolicyDescriptionResponseBodyPolicy extends TeaModel {
        /**
         * <p>The time when the policy was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-02-28T07:04:15Z</p>
         */
        @NameInMap("CreateDate")
        public String createDate;

        /**
         * <p>The version of the policy. Default value: v1.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("DefaultVersion")
        public String defaultVersion;

        /**
         * <p>The description of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>This is a test policy.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>TestPolicy</p>
         */
        @NameInMap("PolicyName")
        public String policyName;

        /**
         * <p>The type of the policy. Valid values:</p>
         * <ul>
         * <li>Custom</li>
         * <li>System</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Custom</p>
         */
        @NameInMap("PolicyType")
        public String policyType;

        /**
         * <p>The time when the policy was modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-02-28T07:05:37Z</p>
         */
        @NameInMap("UpdateDate")
        public String updateDate;

        public static UpdatePolicyDescriptionResponseBodyPolicy build(java.util.Map<String, ?> map) throws Exception {
            UpdatePolicyDescriptionResponseBodyPolicy self = new UpdatePolicyDescriptionResponseBodyPolicy();
            return TeaModel.build(map, self);
        }

        public UpdatePolicyDescriptionResponseBodyPolicy setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public UpdatePolicyDescriptionResponseBodyPolicy setDefaultVersion(String defaultVersion) {
            this.defaultVersion = defaultVersion;
            return this;
        }
        public String getDefaultVersion() {
            return this.defaultVersion;
        }

        public UpdatePolicyDescriptionResponseBodyPolicy setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdatePolicyDescriptionResponseBodyPolicy setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

        public UpdatePolicyDescriptionResponseBodyPolicy setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

        public UpdatePolicyDescriptionResponseBodyPolicy setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

    }

}
