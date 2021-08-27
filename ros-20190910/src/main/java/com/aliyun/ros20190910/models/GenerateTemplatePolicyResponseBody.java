// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GenerateTemplatePolicyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Policy")
    public GenerateTemplatePolicyResponseBodyPolicy policy;

    public static GenerateTemplatePolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateTemplatePolicyResponseBody self = new GenerateTemplatePolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateTemplatePolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GenerateTemplatePolicyResponseBody setPolicy(GenerateTemplatePolicyResponseBodyPolicy policy) {
        this.policy = policy;
        return this;
    }
    public GenerateTemplatePolicyResponseBodyPolicy getPolicy() {
        return this.policy;
    }

    public static class GenerateTemplatePolicyResponseBodyPolicyStatement extends TeaModel {
        @NameInMap("Effect")
        public String effect;

        @NameInMap("Resource")
        public String resource;

        @NameInMap("Action")
        public java.util.List<String> action;

        public static GenerateTemplatePolicyResponseBodyPolicyStatement build(java.util.Map<String, ?> map) throws Exception {
            GenerateTemplatePolicyResponseBodyPolicyStatement self = new GenerateTemplatePolicyResponseBodyPolicyStatement();
            return TeaModel.build(map, self);
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

        public GenerateTemplatePolicyResponseBodyPolicyStatement setAction(java.util.List<String> action) {
            this.action = action;
            return this;
        }
        public java.util.List<String> getAction() {
            return this.action;
        }

    }

    public static class GenerateTemplatePolicyResponseBodyPolicy extends TeaModel {
        @NameInMap("Version")
        public String version;

        @NameInMap("Statement")
        public java.util.List<GenerateTemplatePolicyResponseBodyPolicyStatement> statement;

        public static GenerateTemplatePolicyResponseBodyPolicy build(java.util.Map<String, ?> map) throws Exception {
            GenerateTemplatePolicyResponseBodyPolicy self = new GenerateTemplatePolicyResponseBodyPolicy();
            return TeaModel.build(map, self);
        }

        public GenerateTemplatePolicyResponseBodyPolicy setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public GenerateTemplatePolicyResponseBodyPolicy setStatement(java.util.List<GenerateTemplatePolicyResponseBodyPolicyStatement> statement) {
            this.statement = statement;
            return this;
        }
        public java.util.List<GenerateTemplatePolicyResponseBodyPolicyStatement> getStatement() {
            return this.statement;
        }

    }

}
