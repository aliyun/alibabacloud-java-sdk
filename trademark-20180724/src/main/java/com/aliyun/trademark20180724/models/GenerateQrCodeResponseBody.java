// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class GenerateQrCodeResponseBody extends TeaModel {
    @NameInMap("ExpireTime")
    public Long expireTime;

    @NameInMap("FieldKey")
    public String fieldKey;

    @NameInMap("QrcodeUrl")
    public String qrcodeUrl;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Uuid")
    public String uuid;

    public static GenerateQrCodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateQrCodeResponseBody self = new GenerateQrCodeResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateQrCodeResponseBody setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public Long getExpireTime() {
        return this.expireTime;
    }

    public GenerateQrCodeResponseBody setFieldKey(String fieldKey) {
        this.fieldKey = fieldKey;
        return this;
    }
    public String getFieldKey() {
        return this.fieldKey;
    }

    public GenerateQrCodeResponseBody setQrcodeUrl(String qrcodeUrl) {
        this.qrcodeUrl = qrcodeUrl;
        return this;
    }
    public String getQrcodeUrl() {
        return this.qrcodeUrl;
    }

    public GenerateQrCodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GenerateQrCodeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GenerateQrCodeResponseBody setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
