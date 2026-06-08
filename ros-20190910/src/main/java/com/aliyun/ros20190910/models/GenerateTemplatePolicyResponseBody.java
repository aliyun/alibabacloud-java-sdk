// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GenerateTemplatePolicyResponseBody extends TeaModel {
    /**
     * <p>The information about the policy.</p>
     */
    @NameInMap("Policy")
    public GenerateTemplatePolicyResponseBodyPolicy policy;

    @NameInMap("PolicyFunctions")
    public java.util.List<GenerateTemplatePolicyResponseBodyPolicyFunctions> policyFunctions;

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

    public GenerateTemplatePolicyResponseBody setPolicyFunctions(java.util.List<GenerateTemplatePolicyResponseBodyPolicyFunctions> policyFunctions) {
        this.policyFunctions = policyFunctions;
        return this;
    }
    public java.util.List<GenerateTemplatePolicyResponseBodyPolicyFunctions> getPolicyFunctions() {
        return this.policyFunctions;
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

    public static class GenerateTemplatePolicyResponseBodyPolicyFunctionsActionPolicyFunctionsFunctions extends TeaModel {
        @NameInMap("Function")
        public String function;

        @NameInMap("OperationType")
        public String operationType;

        @NameInMap("RelatedProperties")
        public java.util.List<String> relatedProperties;

        @NameInMap("RequirementLevel")
        public String requirementLevel;

        public static GenerateTemplatePolicyResponseBodyPolicyFunctionsActionPolicyFunctionsFunctions build(java.util.Map<String, ?> map) throws Exception {
            GenerateTemplatePolicyResponseBodyPolicyFunctionsActionPolicyFunctionsFunctions self = new GenerateTemplatePolicyResponseBodyPolicyFunctionsActionPolicyFunctionsFunctions();
            return TeaModel.build(map, self);
        }

        public GenerateTemplatePolicyResponseBodyPolicyFunctionsActionPolicyFunctionsFunctions setFunction(String function) {
            this.function = function;
            return this;
        }
        public String getFunction() {
            return this.function;
        }

        public GenerateTemplatePolicyResponseBodyPolicyFunctionsActionPolicyFunctionsFunctions setOperationType(String operationType) {
            this.operationType = operationType;
            return this;
        }
        public String getOperationType() {
            return this.operationType;
        }

        public GenerateTemplatePolicyResponseBodyPolicyFunctionsActionPolicyFunctionsFunctions setRelatedProperties(java.util.List<String> relatedProperties) {
            this.relatedProperties = relatedProperties;
            return this;
        }
        public java.util.List<String> getRelatedProperties() {
            return this.relatedProperties;
        }

        public GenerateTemplatePolicyResponseBodyPolicyFunctionsActionPolicyFunctionsFunctions setRequirementLevel(String requirementLevel) {
            this.requirementLevel = requirementLevel;
            return this;
        }
        public String getRequirementLevel() {
            return this.requirementLevel;
        }

    }

    public static class GenerateTemplatePolicyResponseBodyPolicyFunctionsActionPolicyFunctions extends TeaModel {
        @NameInMap("Functions")
        public java.util.List<GenerateTemplatePolicyResponseBodyPolicyFunctionsActionPolicyFunctionsFunctions> functions;

        @NameInMap("LogicalResourceId")
        public String logicalResourceId;

        @NameInMap("ResourceType")
        public String resourceType;

        public static GenerateTemplatePolicyResponseBodyPolicyFunctionsActionPolicyFunctions build(java.util.Map<String, ?> map) throws Exception {
            GenerateTemplatePolicyResponseBodyPolicyFunctionsActionPolicyFunctions self = new GenerateTemplatePolicyResponseBodyPolicyFunctionsActionPolicyFunctions();
            return TeaModel.build(map, self);
        }

        public GenerateTemplatePolicyResponseBodyPolicyFunctionsActionPolicyFunctions setFunctions(java.util.List<GenerateTemplatePolicyResponseBodyPolicyFunctionsActionPolicyFunctionsFunctions> functions) {
            this.functions = functions;
            return this;
        }
        public java.util.List<GenerateTemplatePolicyResponseBodyPolicyFunctionsActionPolicyFunctionsFunctions> getFunctions() {
            return this.functions;
        }

        public GenerateTemplatePolicyResponseBodyPolicyFunctionsActionPolicyFunctions setLogicalResourceId(String logicalResourceId) {
            this.logicalResourceId = logicalResourceId;
            return this;
        }
        public String getLogicalResourceId() {
            return this.logicalResourceId;
        }

        public GenerateTemplatePolicyResponseBodyPolicyFunctionsActionPolicyFunctions setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

    public static class GenerateTemplatePolicyResponseBodyPolicyFunctions extends TeaModel {
        @NameInMap("Action")
        public String action;

        @NameInMap("ActionPolicyFunctions")
        public java.util.List<GenerateTemplatePolicyResponseBodyPolicyFunctionsActionPolicyFunctions> actionPolicyFunctions;

        @NameInMap("RequirementLevel")
        public String requirementLevel;

        public static GenerateTemplatePolicyResponseBodyPolicyFunctions build(java.util.Map<String, ?> map) throws Exception {
            GenerateTemplatePolicyResponseBodyPolicyFunctions self = new GenerateTemplatePolicyResponseBodyPolicyFunctions();
            return TeaModel.build(map, self);
        }

        public GenerateTemplatePolicyResponseBodyPolicyFunctions setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public GenerateTemplatePolicyResponseBodyPolicyFunctions setActionPolicyFunctions(java.util.List<GenerateTemplatePolicyResponseBodyPolicyFunctionsActionPolicyFunctions> actionPolicyFunctions) {
            this.actionPolicyFunctions = actionPolicyFunctions;
            return this;
        }
        public java.util.List<GenerateTemplatePolicyResponseBodyPolicyFunctionsActionPolicyFunctions> getActionPolicyFunctions() {
            return this.actionPolicyFunctions;
        }

        public GenerateTemplatePolicyResponseBodyPolicyFunctions setRequirementLevel(String requirementLevel) {
            this.requirementLevel = requirementLevel;
            return this;
        }
        public String getRequirementLevel() {
            return this.requirementLevel;
        }

    }

}
