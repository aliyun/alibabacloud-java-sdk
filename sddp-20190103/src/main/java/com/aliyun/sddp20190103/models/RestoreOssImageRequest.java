// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class RestoreOssImageRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-sddp</p>
     */
    @NameInMap("Bucket")
    public String bucket;

    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aliyun_dsc_desensitization/dir1/test.png</p>
     */
    @NameInMap("ObjectKey")
    public String objectKey;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("ServiceRegionId")
    public String serviceRegionId;

    /**
     * <strong>example:</strong>
     * <p>aliyun_dsc_original /dir1/test.png</p>
     */
    @NameInMap("TargetObjectKey")
    public String targetObjectKey;

    public static RestoreOssImageRequest build(java.util.Map<String, ?> map) throws Exception {
        RestoreOssImageRequest self = new RestoreOssImageRequest();
        return TeaModel.build(map, self);
    }

    public RestoreOssImageRequest setBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }
    public String getBucket() {
        return this.bucket;
    }

    public RestoreOssImageRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public RestoreOssImageRequest setObjectKey(String objectKey) {
        this.objectKey = objectKey;
        return this;
    }
    public String getObjectKey() {
        return this.objectKey;
    }

    public RestoreOssImageRequest setServiceRegionId(String serviceRegionId) {
        this.serviceRegionId = serviceRegionId;
        return this;
    }
    public String getServiceRegionId() {
        return this.serviceRegionId;
    }

    public RestoreOssImageRequest setTargetObjectKey(String targetObjectKey) {
        this.targetObjectKey = targetObjectKey;
        return this;
    }
    public String getTargetObjectKey() {
        return this.targetObjectKey;
    }

}
