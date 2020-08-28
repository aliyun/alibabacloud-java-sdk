// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class GetPolicyVersionResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PolicyVersion")
    @Validation(required = true)
    public GetPolicyVersionResponsePolicyVersion policyVersion;

    public static GetPolicyVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPolicyVersionResponse self = new GetPolicyVersionResponse();
        return TeaModel.build(map, self);
    }

    public static class GetPolicyVersionResponsePolicyVersion extends TeaModel {
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

        public static GetPolicyVersionResponsePolicyVersion build(java.util.Map<String, ?> map) throws Exception {
            GetPolicyVersionResponsePolicyVersion self = new GetPolicyVersionResponsePolicyVersion();
            return TeaModel.build(map, self);
        }

    }

}
