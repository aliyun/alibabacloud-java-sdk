// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeantcodeAntcodeUsergpgkeyResponseBody extends TeaModel {
    @NameInMap("Fingerprint")
    public String fingerprint;

    @NameInMap("Verified")
    public Boolean verified;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("UserId")
    public AddLinkeantcodeAntcodeUsergpgkeyResponseBodyUserId userId;

    @NameInMap("CreatedAt")
    public String createdAt;

    @NameInMap("Subkeys")
    public java.util.List<AddLinkeantcodeAntcodeUsergpgkeyResponseBodySubkeys> subkeys;

    @NameInMap("Id")
    public Long id;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    public static AddLinkeantcodeAntcodeUsergpgkeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeantcodeAntcodeUsergpgkeyResponseBody self = new AddLinkeantcodeAntcodeUsergpgkeyResponseBody();
        return TeaModel.build(map, self);
    }

    public AddLinkeantcodeAntcodeUsergpgkeyResponseBody setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
        return this;
    }
    public String getFingerprint() {
        return this.fingerprint;
    }

    public AddLinkeantcodeAntcodeUsergpgkeyResponseBody setVerified(Boolean verified) {
        this.verified = verified;
        return this;
    }
    public Boolean getVerified() {
        return this.verified;
    }

    public AddLinkeantcodeAntcodeUsergpgkeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddLinkeantcodeAntcodeUsergpgkeyResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public AddLinkeantcodeAntcodeUsergpgkeyResponseBody setUserId(AddLinkeantcodeAntcodeUsergpgkeyResponseBodyUserId userId) {
        this.userId = userId;
        return this;
    }
    public AddLinkeantcodeAntcodeUsergpgkeyResponseBodyUserId getUserId() {
        return this.userId;
    }

    public AddLinkeantcodeAntcodeUsergpgkeyResponseBody setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public AddLinkeantcodeAntcodeUsergpgkeyResponseBody setSubkeys(java.util.List<AddLinkeantcodeAntcodeUsergpgkeyResponseBodySubkeys> subkeys) {
        this.subkeys = subkeys;
        return this;
    }
    public java.util.List<AddLinkeantcodeAntcodeUsergpgkeyResponseBodySubkeys> getSubkeys() {
        return this.subkeys;
    }

    public AddLinkeantcodeAntcodeUsergpgkeyResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public AddLinkeantcodeAntcodeUsergpgkeyResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public AddLinkeantcodeAntcodeUsergpgkeyResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class AddLinkeantcodeAntcodeUsergpgkeyResponseBodyUserId extends TeaModel {
        @NameInMap("Email")
        public String email;

        @NameInMap("Name")
        public String name;

        public static AddLinkeantcodeAntcodeUsergpgkeyResponseBodyUserId build(java.util.Map<String, ?> map) throws Exception {
            AddLinkeantcodeAntcodeUsergpgkeyResponseBodyUserId self = new AddLinkeantcodeAntcodeUsergpgkeyResponseBodyUserId();
            return TeaModel.build(map, self);
        }

        public AddLinkeantcodeAntcodeUsergpgkeyResponseBodyUserId setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public AddLinkeantcodeAntcodeUsergpgkeyResponseBodyUserId setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class AddLinkeantcodeAntcodeUsergpgkeyResponseBodySubkeys extends TeaModel {
        @NameInMap("Fingerprint")
        public String fingerprint;

        public static AddLinkeantcodeAntcodeUsergpgkeyResponseBodySubkeys build(java.util.Map<String, ?> map) throws Exception {
            AddLinkeantcodeAntcodeUsergpgkeyResponseBodySubkeys self = new AddLinkeantcodeAntcodeUsergpgkeyResponseBodySubkeys();
            return TeaModel.build(map, self);
        }

        public AddLinkeantcodeAntcodeUsergpgkeyResponseBodySubkeys setFingerprint(String fingerprint) {
            this.fingerprint = fingerprint;
            return this;
        }
        public String getFingerprint() {
            return this.fingerprint;
        }

    }

}
