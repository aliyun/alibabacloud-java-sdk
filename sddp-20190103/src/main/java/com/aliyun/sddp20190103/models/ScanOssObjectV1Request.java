// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class ScanOssObjectV1Request extends TeaModel {
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
    public java.util.List<String> objectKeyList;

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

    public static ScanOssObjectV1Request build(java.util.Map<String, ?> map) throws Exception {
        ScanOssObjectV1Request self = new ScanOssObjectV1Request();
        return TeaModel.build(map, self);
    }

    public ScanOssObjectV1Request setBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }
    public String getBucketName() {
        return this.bucketName;
    }

    public ScanOssObjectV1Request setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ScanOssObjectV1Request setObjectKeyList(java.util.List<String> objectKeyList) {
        this.objectKeyList = objectKeyList;
        return this;
    }
    public java.util.List<String> getObjectKeyList() {
        return this.objectKeyList;
    }

    public ScanOssObjectV1Request setServiceRegionId(String serviceRegionId) {
        this.serviceRegionId = serviceRegionId;
        return this;
    }
    public String getServiceRegionId() {
        return this.serviceRegionId;
    }

    public ScanOssObjectV1Request setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

}
