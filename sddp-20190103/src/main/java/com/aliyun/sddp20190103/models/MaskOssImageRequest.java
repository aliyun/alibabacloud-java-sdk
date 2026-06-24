// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class MaskOssImageRequest extends TeaModel {
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
     * <p>Specifies whether to always upload the processed image.</p>
     * <p>If you set this to false, the image is uploaded only if it matches a masking rule.</p>
     * <p>If you set this to true, the processed image is always uploaded.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsAlwaysUpload")
    public Boolean isAlwaysUpload;

    @NameInMap("IsCoverObject")
    public Boolean isCoverObject;

    /**
     * <p>Specifies whether you can restore the original image from the masked version.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsSupportRestore")
    public Boolean isSupportRestore;

    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>A comma-separated list of masking rule IDs.</p>
     * <p>The following rule IDs correspond to the listed sensitive data types:</p>
     * <p>3000: Images that contain ID card information (Chinese mainland)</p>
     * <p>3009: Images that contain license plate information (Chinese mainland)</p>
     * <p>3002: Images that contain faces</p>
     * <p>1002: Names (Simplified Chinese)</p>
     * <p>1003: Addresses (Chinese mainland)</p>
     * <p>4003: Unified Social Credit Code</p>
     * <p>63009: Images that contain eyes</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3000,3002</p>
     */
    @NameInMap("MaskRuleIdList")
    public String maskRuleIdList;

    /**
     * <p>The full key of the object stored in OSS.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dir1/test.png</p>
     */
    @NameInMap("ObjectKey")
    public String objectKey;

    /**
     * <p>The region where the bucket is located.</p>
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

    public MaskOssImageRequest setIsCoverObject(Boolean isCoverObject) {
        this.isCoverObject = isCoverObject;
        return this;
    }
    public Boolean getIsCoverObject() {
        return this.isCoverObject;
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
