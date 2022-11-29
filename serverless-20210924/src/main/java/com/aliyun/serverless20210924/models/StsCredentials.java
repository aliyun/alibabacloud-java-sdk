// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.serverless20210924.models;

import com.aliyun.tea.*;

public class StsCredentials extends TeaModel {
    @NameInMap("accessKeyId")
    public String accessKeyId;

    @NameInMap("expirationTime")
    public String expirationTime;

    @NameInMap("kind")
    public String kind;

    @NameInMap("secretAccessKey")
    public String secretAccessKey;

    @NameInMap("token")
    public String token;

    public static StsCredentials build(java.util.Map<String, ?> map) throws Exception {
        StsCredentials self = new StsCredentials();
        return TeaModel.build(map, self);
    }

    public StsCredentials setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
        return this;
    }
    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    public StsCredentials setExpirationTime(String expirationTime) {
        this.expirationTime = expirationTime;
        return this;
    }
    public String getExpirationTime() {
        return this.expirationTime;
    }

    public StsCredentials setKind(String kind) {
        this.kind = kind;
        return this;
    }
    public String getKind() {
        return this.kind;
    }

    public StsCredentials setSecretAccessKey(String secretAccessKey) {
        this.secretAccessKey = secretAccessKey;
        return this;
    }
    public String getSecretAccessKey() {
        return this.secretAccessKey;
    }

    public StsCredentials setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
