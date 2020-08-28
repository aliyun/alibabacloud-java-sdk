// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class CreatePolicyVersionResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PolicyVersion")
    @Validation(required = true)
    public CreatePolicyVersionResponsePolicyVersion policyVersion;

    public static CreatePolicyVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePolicyVersionResponse self = new CreatePolicyVersionResponse();
        return TeaModel.build(map, self);
    }

    public static class CreatePolicyVersionResponsePolicyVersion extends TeaModel {
        @NameInMap("VersionId")
        @Validation(required = true)
        public String versionId;

        @NameInMap("IsDefaultVersion")
        @Validation(required = true)
        public Boolean isDefaultVersion;

        @NameInMap("PolicyDocument")
        @Validation(required = true)
        public String policyDocument;

        @NameInMap("CreateDate")
        @Validation(required = true)
        public String createDate;

        public static CreatePolicyVersionResponsePolicyVersion build(java.util.Map<String, ?> map) throws Exception {
            CreatePolicyVersionResponsePolicyVersion self = new CreatePolicyVersionResponsePolicyVersion();
            return TeaModel.build(map, self);
        }

    }

}
