// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class MaskOssImageRequest extends TeaModel {
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
     * <p>true</p>
     */
    @NameInMap("IsAlwaysUpload")
    public Boolean isAlwaysUpload;

    @NameInMap("IsSupportRestore")
    public Boolean isSupportRestore;

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
     * <p>3000,3002</p>
     */
    @NameInMap("MaskRuleIdList")
    public String maskRuleIdList;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dir1/test.png</p>
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

    public static MaskOssImageRequest build(java.util.Map<String, ?> map) throws Exception {
        MaskOssImageRequest self = new MaskOssImageRequest();
        return TeaModel.build(map, self);
    }

    public MaskOssImageRequest setBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }
    public String getBucketName() {
        return this.bucketName;
    }

    public MaskOssImageRequest setIsAlwaysUpload(Boolean isAlwaysUpload) {
        this.isAlwaysUpload = isAlwaysUpload;
        return this;
    }
    public Boolean getIsAlwaysUpload() {
        return this.isAlwaysUpload;
    }

    public MaskOssImageRequest setIsSupportRestore(Boolean isSupportRestore) {
        this.isSupportRestore = isSupportRestore;
        return this;
    }
    public Boolean getIsSupportRestore() {
        return this.isSupportRestore;
    }

    public MaskOssImageRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public MaskOssImageRequest setMaskRuleIdList(String maskRuleIdList) {
        this.maskRuleIdList = maskRuleIdList;
        return this;
    }
    public String getMaskRuleIdList() {
        return this.maskRuleIdList;
    }

    public MaskOssImageRequest setObjectKey(String objectKey) {
        this.objectKey = objectKey;
        return this;
    }
    public String getObjectKey() {
        return this.objectKey;
    }

    public MaskOssImageRequest setServiceRegionId(String serviceRegionId) {
        this.serviceRegionId = serviceRegionId;
        return this;
    }
    public String getServiceRegionId() {
        return this.serviceRegionId;
    }

}
