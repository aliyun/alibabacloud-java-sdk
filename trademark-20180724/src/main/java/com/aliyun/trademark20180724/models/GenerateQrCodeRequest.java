// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class GenerateQrCodeRequest extends TeaModel {
    @NameInMap("Uuid")
    public String uuid;

    @NameInMap("OssKey")
    public String ossKey;

    @NameInMap("FieldKey")
    public String fieldKey;

    public static GenerateQrCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateQrCodeRequest self = new GenerateQrCodeRequest();
        return TeaModel.build(map, self);
    }

    public GenerateQrCodeRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public GenerateQrCodeRequest setOssKey(String ossKey) {
        this.ossKey = ossKey;
        return this;
    }
    public String getOssKey() {
        return this.ossKey;
    }

    public GenerateQrCodeRequest setFieldKey(String fieldKey) {
        this.fieldKey = fieldKey;
        return this;
    }
    public String getFieldKey() {
        return this.fieldKey;
    }

}
