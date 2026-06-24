// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class ScanOssObjectV1ShrinkRequest extends TeaModel {
    /**
     * <p>The name of the OSS bucket.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sddp-api-demo-bucket</p>
     */
    @NameInMap("BucketName")
    public String bucketName;

    /**
     * <p>The language of the request and response. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong>: Chinese.</p>
     * </li>
     * <li><p><strong>en</strong>: English.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>A list of objects to scan in the OSS bucket. You can specify up to 50 ObjectKeys.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ObjectKeyList")
    public String objectKeyListShrink;

    /**
     * <p>The ID of the region where the OSS bucket is located.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("ServiceRegionId")
    public String serviceRegionId;

    /**
     * <p>The ID of the industry-specific template.</p>
     * <blockquote>
     * <p>Call <strong>DescribeCategoryTemplateList</strong> to get a list of templates. If you do not specify this parameter, the default active template is used for the scan.</p>
     * </blockquote>
     * 
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
