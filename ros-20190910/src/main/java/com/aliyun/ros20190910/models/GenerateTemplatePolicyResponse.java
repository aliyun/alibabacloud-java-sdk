// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GenerateTemplatePolicyResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Policy")
    @Validation(required = true)
    public GenerateTemplatePolicyResponsePolicy policy;

    public static GenerateTemplatePolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateTemplatePolicyResponse self = new GenerateTemplatePolicyResponse();
        return TeaModel.build(map, self);
    }

    public GenerateTemplatePolicyResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GenerateTemplatePolicyResponse setPolicy(GenerateTemplatePolicyResponsePolicy policy) {
        this.policy = policy;
        return this;
    }
    public GenerateTemplatePolicyResponsePolicy getPolicy() {
        return this.policy;
    }

    public static class GenerateTemplatePolicyResponsePolicyStatement extends TeaModel {
        @NameInMap("Resource")
        @Validation(required = true)
        public String resource;

        @NameInMap("Effect")
        @Validation(required = true)
        public String effect;

        @NameInMap("Action")
        @Validation(required = true)
        public java.util.List<String> action;

        public static GenerateTemplatePolicyResponsePolicyStatement build(java.util.Map<String, ?> map) throws Exception {
            GenerateTemplatePolicyResponsePolicyStatement self = new GenerateTemplatePolicyResponsePolicyStatement();
            return TeaModel.build(map, self);
        }

        public GenerateTemplatePolicyResponsePolicyStatement setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public GenerateTemplatePolicyResponsePolicyStatement setEffect(String effect) {
            this.effect = effect;
            return this;
        }
        public String getEffect() {
            return this.effect;
        }

        public GenerateTemplatePolicyResponsePolicyStatement setAction(java.util.List<String> action) {
            this.action = action;
            return this;
        }
        public java.util.List<String> getAction() {
            return this.action;
        }

    }

    public static class GenerateTemplatePolicyResponsePolicy extends TeaModel {
        @NameInMap("Version")
        @Validation(required = true)
        public String version;

        @NameInMap("Statement")
        @Validation(required = true)
        public java.util.List<GenerateTemplatePolicyResponsePolicyStatement> statement;

        public static GenerateTemplatePolicyResponsePolicy build(java.util.Map<String, ?> map) throws Exception {
            GenerateTemplatePolicyResponsePolicy self = new GenerateTemplatePolicyResponsePolicy();
            return TeaModel.build(map, self);
        }

        public GenerateTemplatePolicyResponsePolicy setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public GenerateTemplatePolicyResponsePolicy setStatement(java.util.List<GenerateTemplatePolicyResponsePolicyStatement> statement) {
            this.statement = statement;
            return this;
        }
        public java.util.List<GenerateTemplatePolicyResponsePolicyStatement> getStatement() {
            return this.statement;
        }

    }

}
