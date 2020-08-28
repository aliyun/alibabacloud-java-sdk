// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class CreatePolicyResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Policy")
    @Validation(required = true)
    public CreatePolicyResponsePolicy policy;

    public static CreatePolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePolicyResponse self = new CreatePolicyResponse();
        return TeaModel.build(map, self);
    }

    public static class CreatePolicyResponsePolicy extends TeaModel {
        @NameInMap("PolicyName")
        @Validation(required = true)
        public String policyName;

        @NameInMap("PolicyType")
        @Validation(required = true)
        public String policyType;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("DefaultVersion")
        @Validation(required = true)
        public String defaultVersion;

        @NameInMap("CreateDate")
        @Validation(required = true)
        public String createDate;

        public static CreatePolicyResponsePolicy build(java.util.Map<String, ?> map) throws Exception {
            CreatePolicyResponsePolicy self = new CreatePolicyResponsePolicy();
            return TeaModel.build(map, self);
        }

    }

}
