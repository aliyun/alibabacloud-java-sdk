// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeOssObjectDetailV2Request extends TeaModel {
    /**
     * <p>Bucket name.</p>
     * 
     * <strong>example:</strong>
     * <p>sddp-api-scan-demo</p>
     */
    @NameInMap("BucketName")
    public String bucketName;

    /**
     * <p>The unique identifier ID of the OSS storage object.</p>
     * <blockquote>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/410152.html">DescribeOssObjects</a> interface to get the ID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>12300</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>Sets the language type for request and response messages. The default value is <strong>zh_cn</strong>. Values:</p>
     * <ul>
     * <li><strong>zh_cn</strong>: Simplified Chinese</li>
     * <li><strong>en_us</strong>: English (US)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh_cn</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The full file name of the file stored on OSS.</p>
     * 
     * <strong>example:</strong>
     * <p>dir1/test.png</p>
     */
    @NameInMap("ObjectKey")
    public String objectKey;

    /**
     * <p>Service region ID, i.e., the region ID where the Bucket is located.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("ServiceRegionId")
    public String serviceRegionId;

    /**
     * <p>Industry template ID.</p>
     * <blockquote>
     * <p>You can obtain the industry template ID by calling the <a href="https://help.aliyun.com/document_detail/2399296.html">DescribeCategoryTemplateList</a> interface.</p>
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
