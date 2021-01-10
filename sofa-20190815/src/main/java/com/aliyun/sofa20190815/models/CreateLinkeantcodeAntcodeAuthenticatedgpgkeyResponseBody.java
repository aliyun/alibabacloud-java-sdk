// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeantcodeAntcodeAuthenticatedgpgkeyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("CreatedAt")
    public String createdAt;

    @NameInMap("PrimaryKeyid")
    public String primaryKeyid;

    @NameInMap("Id")
    public Long id;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Key")
    public String key;

    @NameInMap("ResultCode")
    public String resultCode;

    public static CreateLinkeantcodeAntcodeAuthenticatedgpgkeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeantcodeAntcodeAuthenticatedgpgkeyResponseBody self = new CreateLinkeantcodeAntcodeAuthenticatedgpgkeyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLinkeantcodeAntcodeAuthenticatedgpgkeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateLinkeantcodeAntcodeAuthenticatedgpgkeyResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public CreateLinkeantcodeAntcodeAuthenticatedgpgkeyResponseBody setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public CreateLinkeantcodeAntcodeAuthenticatedgpgkeyResponseBody setPrimaryKeyid(String primaryKeyid) {
        this.primaryKeyid = primaryKeyid;
        return this;
    }
    public String getPrimaryKeyid() {
        return this.primaryKeyid;
    }

    public CreateLinkeantcodeAntcodeAuthenticatedgpgkeyResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public CreateLinkeantcodeAntcodeAuthenticatedgpgkeyResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CreateLinkeantcodeAntcodeAuthenticatedgpgkeyResponseBody setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public CreateLinkeantcodeAntcodeAuthenticatedgpgkeyResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

}
