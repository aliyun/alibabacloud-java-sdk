// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20220913.models;

import com.aliyun.tea.*;

public class EncryptInvokeResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public EncryptInvokeResponseBodyData data;

    @NameInMap("Msg")
    public String msg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static EncryptInvokeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EncryptInvokeResponseBody self = new EncryptInvokeResponseBody();
        return TeaModel.build(map, self);
    }

    public EncryptInvokeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public EncryptInvokeResponseBody setData(EncryptInvokeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public EncryptInvokeResponseBodyData getData() {
        return this.data;
    }

    public EncryptInvokeResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public EncryptInvokeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EncryptInvokeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class EncryptInvokeResponseBodyData extends TeaModel {
        @NameInMap("encryptData")
        public String encryptData;

        @NameInMap("encryptKey")
        public String encryptKey;

        @NameInMap("sign")
        public String sign;

        public static EncryptInvokeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            EncryptInvokeResponseBodyData self = new EncryptInvokeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public EncryptInvokeResponseBodyData setEncryptData(String encryptData) {
            this.encryptData = encryptData;
            return this;
        }
        public String getEncryptData() {
            return this.encryptData;
        }

        public EncryptInvokeResponseBodyData setEncryptKey(String encryptKey) {
            this.encryptKey = encryptKey;
            return this;
        }
        public String getEncryptKey() {
            return this.encryptKey;
        }

        public EncryptInvokeResponseBodyData setSign(String sign) {
            this.sign = sign;
            return this;
        }
        public String getSign() {
            return this.sign;
        }

    }

}
