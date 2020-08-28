// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openplatform20191219.models;

import com.aliyun.tea.*;

public class AuthorizeFileUploadResponse extends TeaModel {
    @NameInMap("AccessKeyId")
    @Validation(required = true)
    public String accessKeyId;

    @NameInMap("Bucket")
    @Validation(required = true)
    public String bucket;

    @NameInMap("EncodedPolicy")
    @Validation(required = true)
    public String encodedPolicy;

    @NameInMap("Endpoint")
    @Validation(required = true)
    public String endpoint;

    @NameInMap("ObjectKey")
    @Validation(required = true)
    public String objectKey;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Signature")
    @Validation(required = true)
    public String signature;

    @NameInMap("UseAccelerate")
    @Validation(required = true)
    public Boolean useAccelerate;

    public static AuthorizeFileUploadResponse build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeFileUploadResponse self = new AuthorizeFileUploadResponse();
        return TeaModel.build(map, self);
    }

}
