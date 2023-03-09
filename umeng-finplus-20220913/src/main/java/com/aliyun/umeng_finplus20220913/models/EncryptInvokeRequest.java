// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20220913.models;

import com.aliyun.tea.*;

public class EncryptInvokeRequest extends TeaModel {
    @NameInMap("clientId")
    public Long clientId;

    @NameInMap("data")
    public String data;

    @NameInMap("encryptKey")
    public String encryptKey;

    @NameInMap("methodName")
    public String methodName;

    @NameInMap("sign")
    public String sign;

    public static EncryptInvokeRequest build(java.util.Map<String, ?> map) throws Exception {
        EncryptInvokeRequest self = new EncryptInvokeRequest();
        return TeaModel.build(map, self);
    }

    public EncryptInvokeRequest setClientId(Long clientId) {
        this.clientId = clientId;
        return this;
    }
    public Long getClientId() {
        return this.clientId;
    }

    public EncryptInvokeRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public EncryptInvokeRequest setEncryptKey(String encryptKey) {
        this.encryptKey = encryptKey;
        return this;
    }
    public String getEncryptKey() {
        return this.encryptKey;
    }

    public EncryptInvokeRequest setMethodName(String methodName) {
        this.methodName = methodName;
        return this;
    }
    public String getMethodName() {
        return this.methodName;
    }

    public EncryptInvokeRequest setSign(String sign) {
        this.sign = sign;
        return this;
    }
    public String getSign() {
        return this.sign;
    }

}
