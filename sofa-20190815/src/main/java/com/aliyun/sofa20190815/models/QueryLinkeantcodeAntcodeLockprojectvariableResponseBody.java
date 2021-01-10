// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeantcodeAntcodeLockprojectvariableResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Id")
    public String id;

    @NameInMap("Key")
    public String key;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Secret")
    public Boolean secret;

    @NameInMap("Value")
    public String value;

    public static QueryLinkeantcodeAntcodeLockprojectvariableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeantcodeAntcodeLockprojectvariableResponseBody self = new QueryLinkeantcodeAntcodeLockprojectvariableResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkeantcodeAntcodeLockprojectvariableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkeantcodeAntcodeLockprojectvariableResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkeantcodeAntcodeLockprojectvariableResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkeantcodeAntcodeLockprojectvariableResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public QueryLinkeantcodeAntcodeLockprojectvariableResponseBody setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public QueryLinkeantcodeAntcodeLockprojectvariableResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkeantcodeAntcodeLockprojectvariableResponseBody setSecret(Boolean secret) {
        this.secret = secret;
        return this;
    }
    public Boolean getSecret() {
        return this.secret;
    }

    public QueryLinkeantcodeAntcodeLockprojectvariableResponseBody setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
