// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GenerateTemplatePolicyResponseBody extends TeaModel {
    /**
     * <p>The information about the policy.</p>
     */
    @NameInMap("Policy")
    public GenerateTemplatePolicyResponseBodyPolicy policy;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>B288A0BE-D927-4888-B0F7-B35EF84B6E6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GenerateTemplatePolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateTemplatePolicyResponseBody self = new GenerateTemplatePolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateTemplatePolicyResponseBody setPolicy(GenerateTemplatePolicyResponseBodyPolicy policy) {
        this.policy = policy;
        return this;
    }
    public GenerateTemplatePolicyResponseBodyPolicy getPolicy() {
        return this.policy;
    }

    public GenerateTemplatePolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GenerateTemplatePolicyResponseBodyPolicyStatement extends TeaModel {
        /**
         * <p>The operations that are performed on the specified resource.</p>
         */
        @NameInMap("Action")
        public java.util.List<String> action;

        /**
         * <p>The condition that is required for the policy to take effect.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;StringEquals&quot;: {
         *         &quot;acs:Service&quot;: &quot;fc.aliyuncs.com&quot;
         *     }
         * }</p>
         */
        @NameInMap("Condition")
        public java.util.Map<String, ?> condition;

        /**
         * <p>The effect of the statement. Valid values:</p>
         * <ul>
         * <li>Allow</li>
         * <li>Deny</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Allow</p>
         */
        @NameInMap("Effect")
        public String effect;

        /**
         * <p>The objects that the statement covers. An asterisk (\*) indicates all resources.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("Resource")
        public String resource;

        public static GenerateTemplatePolicyResponseBodyPolicyStatement build(java.util.Map<String, ?> map) throws Exception {
            GenerateTemplatePolicyResponseBodyPolicyStatement self = new GenerateTemplatePolicyResponseBodyPolicyStatement();
            return TeaModel.build(map, self);
        }

        public GenerateTemplatePolicyResponseBodyPolicyStatement setAction(java.util.List<String> action) {
            this.action = action;
            return this;
        }
        public java.util.List<String> getAction() {
            return this.action;
        }

        public GenerateTemplatePolicyResponseBodyPolicyStatement setCondition(java.util.Map<String, ?> condition) {
            this.condition = condition;
            return this;
        }
        public java.util.Map<String, ?> getCondition() {
            return this.condition;
        }

        public GenerateTemplatePolicyResponseBodyPolicyStatement setEffect(String effect) {
            this.effect = effect;
            return this;
        }
        public String getEffect() {
            return this.effect;
        }

        public GenerateTemplatePolicyResponseBodyPolicyStatement setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

    }

    public static class GenerateTemplatePolicyResponseBodyPolicy extends TeaModel {
        /**
         * <p>The statements that are contained in the policy.</p>
         */
        @NameInMap("Statement")
        public java.util.List<GenerateTemplatePolicyResponseBodyPolicyStatement> statement;

        /**
         * <p>The version number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Version")
        public String version;

        public static GenerateTemplatePolicyResponseBodyPolicy build(java.util.Map<String, ?> map) throws Exception {
            GenerateTemplatePolicyResponseBodyPolicy self = new GenerateTemplatePolicyResponseBodyPolicy();
            return TeaModel.build(map, self);
        }

        public GenerateTemplatePolicyResponseBodyPolicy setStatement(java.util.List<GenerateTemplatePolicyResponseBodyPolicyStatement> statement) {
            this.statement = statement;
            return this;
        }
        public java.util.List<GenerateTemplatePolicyResponseBodyPolicyStatement> getStatement() {
            return this.statement;
        }

        public GenerateTemplatePolicyResponseBodyPolicy setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
