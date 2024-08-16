// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeOssObjectDetailV2Request extends TeaModel {
    @NameInMap("BucketName")
    public String bucketName;

    /**
     * <strong>example:</strong>
     * <p>12300</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <strong>example:</strong>
     * <p>zh_cn</p>
     */
    @NameInMap("Lang")
    public String lang;

    @NameInMap("ObjectKey")
    public String objectKey;

    @NameInMap("ServiceRegionId")
    public String serviceRegionId;

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
