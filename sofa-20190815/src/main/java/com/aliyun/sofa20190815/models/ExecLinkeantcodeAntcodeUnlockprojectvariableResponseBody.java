// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeantcodeAntcodeUnlockprojectvariableResponseBody extends TeaModel {
    @NameInMap("Secret")
    public Boolean secret;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Value")
    public String value;

    @NameInMap("Id")
    public String id;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Key")
    public String key;

    @NameInMap("ResultCode")
    public String resultCode;

    public static ExecLinkeantcodeAntcodeUnlockprojectvariableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeantcodeAntcodeUnlockprojectvariableResponseBody self = new ExecLinkeantcodeAntcodeUnlockprojectvariableResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecLinkeantcodeAntcodeUnlockprojectvariableResponseBody setSecret(Boolean secret) {
        this.secret = secret;
        return this;
    }
    public Boolean getSecret() {
        return this.secret;
    }

    public ExecLinkeantcodeAntcodeUnlockprojectvariableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecLinkeantcodeAntcodeUnlockprojectvariableResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public ExecLinkeantcodeAntcodeUnlockprojectvariableResponseBody setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public ExecLinkeantcodeAntcodeUnlockprojectvariableResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ExecLinkeantcodeAntcodeUnlockprojectvariableResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ExecLinkeantcodeAntcodeUnlockprojectvariableResponseBody setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public ExecLinkeantcodeAntcodeUnlockprojectvariableResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

}
