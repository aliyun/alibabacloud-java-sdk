// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetTempDownloadUrlRequest extends TeaModel {
    /**
     * <p>The business ID.</p>
     * 
     * <strong>example:</strong>
     * <p>WD20250703155602000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>The OSS object key.</p>
     * 
     * <strong>example:</strong>
     * <p>backend/detection/objects/r-0008ujvfksltf5j45n81/task-000hckiuwyau0gwn17vq.jpg</p>
     */
    @NameInMap("OssKey")
    public String ossKey;

    public static GetTempDownloadUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTempDownloadUrlRequest self = new GetTempDownloadUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetTempDownloadUrlRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public GetTempDownloadUrlRequest setOssKey(String ossKey) {
        this.ossKey = ossKey;
        return this;
    }
    public String getOssKey() {
        return this.ossKey;
    }

}
