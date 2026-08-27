// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GenerateTemplatePolicyResponseBody extends TeaModel {
    /**
     * <p>The access policy information.</p>
     */
    @NameInMap("Policy")
    public GenerateTemplatePolicyResponseBodyPolicy policy;

    /**
     * <p>The policy function configurations.</p>
     */
    @NameInMap("PolicyFunctions")
    public java.util.List<GenerateTemplatePolicyResponseBodyPolicyFunctions> policyFunctions;

    /**
     * <p>The request ID.</p>
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
         * <p>The operation on the specific resource.</p>
         */
        @NameInMap("Action")
        public java.util.List<String> action;

        /**
         * <p>The condition for the authorization to take effect.</p>
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
         * <p>The authorization effect. Valid values:  </p>
         * <ul>
         * <li><p>Allow: Allowed.  </p>
         * </li>
         * <li><p>Deny: Denied.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Allow</p>
         */
        @NameInMap("Effect")
        public String effect;

        /**
         * <p>The specific resource that is authorized. An asterisk (*) indicates all resources.</p>
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
         * <p>The access policy statement details.</p>
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
        /**
         * <p>The function in the policy function.</p>
         * 
         * <strong>example:</strong>
         * <p>notContains</p>
         */
        @NameInMap("Function")
        public String function;

        /**
         * <p>The operation type.</p>
         * 
         * <strong>example:</strong>
         * <p>CreateStack</p>
         */
        @NameInMap("OperationType")
        public String operationType;

        /**
         * <p>The list of related properties.</p>
         */
        @NameInMap("RelatedProperties")
        public java.util.List<String> relatedProperties;

        /**
         * <p>The requirement level of the function.</p>
         */
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
        /**
         * <p>The policy function list.</p>
         */
        @NameInMap("Functions")
        public java.util.List<GenerateTemplatePolicyResponseBodyPolicyFunctionsActionPolicyFunctionsFunctions> functions;

        /**
         * <p>The logical resource ID of the policy function.</p>
         * 
         * <strong>example:</strong>
         * <p>SLBLoadBalancer_00001</p>
         */
        @NameInMap("LogicalResourceId")
        public String logicalResourceId;

        /**
         * <p>The resource type associated with the policy function.</p>
         * 
         * <strong>example:</strong>
         * <p>stack</p>
         */
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
        /**
         * <p>The action in the policy function.</p>
         * 
         * <strong>example:</strong>
         * <p>accept</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The policy function list.</p>
         */
        @NameInMap("ActionPolicyFunctions")
        public java.util.List<GenerateTemplatePolicyResponseBodyPolicyFunctionsActionPolicyFunctions> actionPolicyFunctions;

        /**
         * <p>The requirement level of the policy function.</p>
         */
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
