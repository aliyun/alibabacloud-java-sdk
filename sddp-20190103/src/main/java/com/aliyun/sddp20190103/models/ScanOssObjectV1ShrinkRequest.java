// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class ScanOssObjectV1ShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sddp-api-demo-bucket</p>
     */
    @NameInMap("BucketName")
    public String bucketName;

    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ObjectKeyList")
    public String objectKeyListShrink;

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
     * <p>1</p>
     */
    @NameInMap("TemplateId")
    public Long templateId;

    public static ScanOssObjectV1ShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ScanOssObjectV1ShrinkRequest self = new ScanOssObjectV1ShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ScanOssObjectV1ShrinkRequest setBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }
    public String getBucketName() {
        return this.bucketName;
    }

    public ScanOssObjectV1ShrinkRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ScanOssObjectV1ShrinkRequest setObjectKeyListShrink(String objectKeyListShrink) {
        this.objectKeyListShrink = objectKeyListShrink;
        return this;
    }
    public String getObjectKeyListShrink() {
        return this.objectKeyListShrink;
    }

    public ScanOssObjectV1ShrinkRequest setServiceRegionId(String serviceRegionId) {
        this.serviceRegionId = serviceRegionId;
        return this;
    }
    public String getServiceRegionId() {
        return this.serviceRegionId;
    }

    public ScanOssObjectV1ShrinkRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

}
