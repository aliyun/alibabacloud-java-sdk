// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeantcodeAntcodeUserkeysResponseBody extends TeaModel {
    @NameInMap("Context")
    public String context;

    @NameInMap("Fingerprint")
    public String fingerprint;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CreatedAt")
    public String createdAt;

    @NameInMap("Title")
    public String title;

    @NameInMap("Public")
    public Boolean _public;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("UpdatedAt")
    public String updatedAt;

    @NameInMap("Type")
    public String type;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("UserId")
    public Long userId;

    @NameInMap("Id")
    public Long id;

    @NameInMap("ShaContext")
    public String shaContext;

    @NameInMap("Key")
    public String key;

    @NameInMap("ResultCode")
    public String resultCode;

    public static CreateLinkeantcodeAntcodeUserkeysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeantcodeAntcodeUserkeysResponseBody self = new CreateLinkeantcodeAntcodeUserkeysResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLinkeantcodeAntcodeUserkeysResponseBody setContext(String context) {
        this.context = context;
        return this;
    }
    public String getContext() {
        return this.context;
    }

    public CreateLinkeantcodeAntcodeUserkeysResponseBody setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
        return this;
    }
    public String getFingerprint() {
        return this.fingerprint;
    }

    public CreateLinkeantcodeAntcodeUserkeysResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateLinkeantcodeAntcodeUserkeysResponseBody setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public CreateLinkeantcodeAntcodeUserkeysResponseBody setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public CreateLinkeantcodeAntcodeUserkeysResponseBody set_public(Boolean _public) {
        this._public = _public;
        return this;
    }
    public Boolean get_public() {
        return this._public;
    }

    public CreateLinkeantcodeAntcodeUserkeysResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CreateLinkeantcodeAntcodeUserkeysResponseBody setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public CreateLinkeantcodeAntcodeUserkeysResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateLinkeantcodeAntcodeUserkeysResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public CreateLinkeantcodeAntcodeUserkeysResponseBody setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

    public CreateLinkeantcodeAntcodeUserkeysResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public CreateLinkeantcodeAntcodeUserkeysResponseBody setShaContext(String shaContext) {
        this.shaContext = shaContext;
        return this;
    }
    public String getShaContext() {
        return this.shaContext;
    }

    public CreateLinkeantcodeAntcodeUserkeysResponseBody setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public CreateLinkeantcodeAntcodeUserkeysResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

}
