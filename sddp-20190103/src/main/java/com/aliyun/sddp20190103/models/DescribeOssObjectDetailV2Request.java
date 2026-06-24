// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeOssObjectDetailV2Request extends TeaModel {
    /**
     * <p>The name of the bucket.</p>
     * 
     * <strong>example:</strong>
     * <p>sddp-api-scan-demo</p>
     */
    @NameInMap("BucketName")
    public String bucketName;

    /**
     * <p>The unique ID of the OSS object.</p>
     * <blockquote>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/410152.html">DescribeOssObjects</a> operation to obtain the ID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>12300</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The language of the content within the request and response. Default value: <strong>en_us</strong>. Valid values:</p>
     * <ul>
     * <li><p><strong>en_us</strong>: Simplified Chinese</p>
     * </li>
     * <li><p><strong>en_us</strong>: English (US)</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh_cn</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The full name of the object stored in OSS.</p>
     * 
     * <strong>example:</strong>
     * <p>dir1/test.png</p>
     */
    @NameInMap("ObjectKey")
    public String objectKey;

    /**
     * <p>The ID of the region where the service is enabled. This is also the region where the bucket is located.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("ServiceRegionId")
    public String serviceRegionId;

    /**
     * <p>The ID of the industry-specific template.</p>
     * <blockquote>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/2399296.html">DescribeCategoryTemplateList</a> operation to obtain the ID of the industry-specific template.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TemplateId")
    public Long templateId;

    public static DescribeOssObjectDetailV2Request build(java.util.Map<String, ?> map) throws Exception {
        DescribeOssObjectDetailV2Request self = new DescribeOssObjectDetailV2Request();
        return TeaModel.build(map, self);
    }

    public DescribeOssObjectDetailV2Request setBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }
    public String getBucketName() {
        return this.bucketName;
    }

    public DescribeOssObjectDetailV2Request setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DescribeOssObjectDetailV2Request setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeOssObjectDetailV2Request setObjectKey(String objectKey) {
        this.objectKey = objectKey;
        return this;
    }
    public String getObjectKey() {
        return this.objectKey;
    }

    public DescribeOssObjectDetailV2Request setServiceRegionId(String serviceRegionId) {
        this.serviceRegionId = serviceRegionId;
        return this;
    }
    public String getServiceRegionId() {
        return this.serviceRegionId;
    }

    public DescribeOssObjectDetailV2Request setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

}
