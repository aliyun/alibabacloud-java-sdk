// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryQrCodeUploadStatusRequest extends TeaModel {
    @NameInMap("OssKey")
    public String ossKey;

    @NameInMap("FieldKey")
    public String fieldKey;

    @NameInMap("Uuid")
    public String uuid;

    public static QueryQrCodeUploadStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryQrCodeUploadStatusRequest self = new QueryQrCodeUploadStatusRequest();
        return TeaModel.build(map, self);
    }

    public QueryQrCodeUploadStatusRequest setOssKey(String ossKey) {
        this.ossKey = ossKey;
        return this;
    }
    public String getOssKey() {
        return this.ossKey;
    }

    public QueryQrCodeUploadStatusRequest setFieldKey(String fieldKey) {
        this.fieldKey = fieldKey;
        return this;
    }
    public String getFieldKey() {
        return this.fieldKey;
    }

    public QueryQrCodeUploadStatusRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
