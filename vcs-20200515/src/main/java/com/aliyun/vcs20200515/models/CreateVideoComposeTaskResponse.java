// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class CreateVideoComposeTaskResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DomainName")
    @Validation(required = true)
    public String domainName;

    @NameInMap("BucketName")
    @Validation(required = true)
    public String bucketName;

    public static CreateVideoComposeTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVideoComposeTaskResponse self = new CreateVideoComposeTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateVideoComposeTaskResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateVideoComposeTaskResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateVideoComposeTaskResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateVideoComposeTaskResponse setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public CreateVideoComposeTaskResponse setBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }
    public String getBucketName() {
        return this.bucketName;
    }

}
