// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20150801.models;

import com.aliyun.tea.*;

public class GetKeySecretResponseBody extends TeaModel {
    @NameInMap("Key")
    public String key;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Secret")
    public String secret;

    public static GetKeySecretResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetKeySecretResponseBody self = new GetKeySecretResponseBody();
        return TeaModel.build(map, self);
    }

    public GetKeySecretResponseBody setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public GetKeySecretResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetKeySecretResponseBody setSecret(String secret) {
        this.secret = secret;
        return this;
    }
    public String getSecret() {
        return this.secret;
    }

}
