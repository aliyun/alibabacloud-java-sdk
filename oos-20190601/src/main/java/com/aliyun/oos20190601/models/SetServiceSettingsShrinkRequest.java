// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class SetServiceSettingsShrinkRequest extends TeaModel {
    /**
     * <p>The name of OSS bucket to deliver.</p>
     * 
     * <strong>example:</strong>
     * <p>OssBucketName</p>
     */
    @NameInMap("DeliveryOssBucketName")
    public String deliveryOssBucketName;

    /**
     * <p>Whether to enable OSS delivery.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DeliveryOssEnabled")
    public Boolean deliveryOssEnabled;

    /**
     * <p>The key prefix of OSS to deliver.</p>
     * 
     * <strong>example:</strong>
     * <p>oos/execution</p>
     */
    @NameInMap("DeliveryOssKeyPrefix")
    public String deliveryOssKeyPrefix;

    /**
     * <p>Whether to enable SLS delivery.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DeliverySlsEnabled")
    public Boolean deliverySlsEnabled;

    /**
     * <p>The name of SLS project to deliver.</p>
     * 
     * <strong>example:</strong>
     * <p>SlsProjectName</p>
     */
    @NameInMap("DeliverySlsProjectName")
    public String deliverySlsProjectName;

    @NameInMap("RdFolderIds")
    public String rdFolderIdsShrink;

    /**
     * <p>The id of RDC Enterprise.</p>
     * 
     * <strong>example:</strong>
     * <p>RdcEnterpriseId</p>
     */
    @NameInMap("RdcEnterpriseId")
    public String rdcEnterpriseId;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("ServiceAccessRdEnabled")
    public Boolean serviceAccessRdEnabled;

    public static SetServiceSettingsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SetServiceSettingsShrinkRequest self = new SetServiceSettingsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SetServiceSettingsShrinkRequest setDeliveryOssBucketName(String deliveryOssBucketName) {
        this.deliveryOssBucketName = deliveryOssBucketName;
        return this;
    }
    public String getDeliveryOssBucketName() {
        return this.deliveryOssBucketName;
    }

    public SetServiceSettingsShrinkRequest setDeliveryOssEnabled(Boolean deliveryOssEnabled) {
        this.deliveryOssEnabled = deliveryOssEnabled;
        return this;
    }
    public Boolean getDeliveryOssEnabled() {
        return this.deliveryOssEnabled;
    }

    public SetServiceSettingsShrinkRequest setDeliveryOssKeyPrefix(String deliveryOssKeyPrefix) {
        this.deliveryOssKeyPrefix = deliveryOssKeyPrefix;
        return this;
    }
    public String getDeliveryOssKeyPrefix() {
        return this.deliveryOssKeyPrefix;
    }

    public SetServiceSettingsShrinkRequest setDeliverySlsEnabled(Boolean deliverySlsEnabled) {
        this.deliverySlsEnabled = deliverySlsEnabled;
        return this;
    }
    public Boolean getDeliverySlsEnabled() {
        return this.deliverySlsEnabled;
    }

    public SetServiceSettingsShrinkRequest setDeliverySlsProjectName(String deliverySlsProjectName) {
        this.deliverySlsProjectName = deliverySlsProjectName;
        return this;
    }
    public String getDeliverySlsProjectName() {
        return this.deliverySlsProjectName;
    }

    public SetServiceSettingsShrinkRequest setRdFolderIdsShrink(String rdFolderIdsShrink) {
        this.rdFolderIdsShrink = rdFolderIdsShrink;
        return this;
    }
    public String getRdFolderIdsShrink() {
        return this.rdFolderIdsShrink;
    }

    public SetServiceSettingsShrinkRequest setRdcEnterpriseId(String rdcEnterpriseId) {
        this.rdcEnterpriseId = rdcEnterpriseId;
        return this;
    }
    public String getRdcEnterpriseId() {
        return this.rdcEnterpriseId;
    }

    public SetServiceSettingsShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SetServiceSettingsShrinkRequest setServiceAccessRdEnabled(Boolean serviceAccessRdEnabled) {
        this.serviceAccessRdEnabled = serviceAccessRdEnabled;
        return this;
    }
    public Boolean getServiceAccessRdEnabled() {
        return this.serviceAccessRdEnabled;
    }

}
