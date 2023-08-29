// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trusted_server20200613.models;

import com.aliyun.tea.*;

public class GenerateNonceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("data")
    public GenerateNonceResponseBodyData data;

    public static GenerateNonceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateNonceResponseBody self = new GenerateNonceResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateNonceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GenerateNonceResponseBody setData(GenerateNonceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GenerateNonceResponseBodyData getData() {
        return this.data;
    }

    public static class GenerateNonceResponseBodyData extends TeaModel {
        @NameInMap("CredentialBlob")
        public String credentialBlob;

        public static GenerateNonceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GenerateNonceResponseBodyData self = new GenerateNonceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GenerateNonceResponseBodyData setCredentialBlob(String credentialBlob) {
            this.credentialBlob = credentialBlob;
            return this;
        }
        public String getCredentialBlob() {
            return this.credentialBlob;
        }

    }

}
