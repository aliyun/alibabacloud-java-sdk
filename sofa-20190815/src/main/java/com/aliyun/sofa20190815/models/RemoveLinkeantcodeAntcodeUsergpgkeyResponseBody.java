// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RemoveLinkeantcodeAntcodeUsergpgkeyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("CreatedAt")
    public String createdAt;

    @NameInMap("Id")
    public Long id;

    @NameInMap("Key")
    public String key;

    @NameInMap("PrimaryKeyid")
    public String primaryKeyid;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    public static RemoveLinkeantcodeAntcodeUsergpgkeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveLinkeantcodeAntcodeUsergpgkeyResponseBody self = new RemoveLinkeantcodeAntcodeUsergpgkeyResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveLinkeantcodeAntcodeUsergpgkeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RemoveLinkeantcodeAntcodeUsergpgkeyResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public RemoveLinkeantcodeAntcodeUsergpgkeyResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public RemoveLinkeantcodeAntcodeUsergpgkeyResponseBody setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public RemoveLinkeantcodeAntcodeUsergpgkeyResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public RemoveLinkeantcodeAntcodeUsergpgkeyResponseBody setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public RemoveLinkeantcodeAntcodeUsergpgkeyResponseBody setPrimaryKeyid(String primaryKeyid) {
        this.primaryKeyid = primaryKeyid;
        return this;
    }
    public String getPrimaryKeyid() {
        return this.primaryKeyid;
    }

    public RemoveLinkeantcodeAntcodeUsergpgkeyResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

}
