// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class GetPolicyResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Policy")
    @Validation(required = true)
    public GetPolicyResponsePolicy policy;

    @NameInMap("DefaultPolicyVersion")
    @Validation(required = true)
    public GetPolicyResponseDefaultPolicyVersion defaultPolicyVersion;

    public static GetPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPolicyResponse self = new GetPolicyResponse();
        return TeaModel.build(map, self);
    }

    public static class GetPolicyResponsePolicy extends TeaModel {
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

        @NameInMap("PolicyDocument")
        @Validation(required = true)
        public String policyDocument;

        @NameInMap("CreateDate")
        @Validation(required = true)
        public String createDate;

        @NameInMap("UpdateDate")
        @Validation(required = true)
        public String updateDate;

        @NameInMap("AttachmentCount")
        @Validation(required = true)
        public Integer attachmentCount;

        public static GetPolicyResponsePolicy build(java.util.Map<String, ?> map) throws Exception {
            GetPolicyResponsePolicy self = new GetPolicyResponsePolicy();
            return TeaModel.build(map, self);
        }

    }

    public static class GetPolicyResponseDefaultPolicyVersion extends TeaModel {
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

        public static GetPolicyResponseDefaultPolicyVersion build(java.util.Map<String, ?> map) throws Exception {
            GetPolicyResponseDefaultPolicyVersion self = new GetPolicyResponseDefaultPolicyVersion();
            return TeaModel.build(map, self);
        }

    }

}
