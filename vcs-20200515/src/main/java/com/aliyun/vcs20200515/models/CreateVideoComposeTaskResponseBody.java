// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class CreateVideoComposeTaskResponseBody extends TeaModel {
    @NameInMap("BucketName")
    public String bucketName;

    @NameInMap("Code")
    public String code;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateVideoComposeTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateVideoComposeTaskResponseBody self = new CreateVideoComposeTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateVideoComposeTaskResponseBody setBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }
    public String getBucketName() {
        return this.bucketName;
    }

    public CreateVideoComposeTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateVideoComposeTaskResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public CreateVideoComposeTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateVideoComposeTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
