// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class SetServiceSettingsRequest extends TeaModel {
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

    public static SetServiceSettingsRequest build(java.util.Map<String, ?> map) throws Exception {
        SetServiceSettingsRequest self = new SetServiceSettingsRequest();
        return TeaModel.build(map, self);
    }

    public SetServiceSettingsRequest setDeliveryOssBucketName(String deliveryOssBucketName) {
        this.deliveryOssBucketName = deliveryOssBucketName;
        return this;
    }
    public String getDeliveryOssBucketName() {
        return this.deliveryOssBucketName;
    }

    public SetServiceSettingsRequest setDeliveryOssEnabled(Boolean deliveryOssEnabled) {
        this.deliveryOssEnabled = deliveryOssEnabled;
        return this;
    }
    public Boolean getDeliveryOssEnabled() {
        return this.deliveryOssEnabled;
    }

    public SetServiceSettingsRequest setDeliveryOssKeyPrefix(String deliveryOssKeyPrefix) {
        this.deliveryOssKeyPrefix = deliveryOssKeyPrefix;
        return this;
    }
    public String getDeliveryOssKeyPrefix() {
        return this.deliveryOssKeyPrefix;
    }

    public SetServiceSettingsRequest setDeliverySlsEnabled(Boolean deliverySlsEnabled) {
        this.deliverySlsEnabled = deliverySlsEnabled;
        return this;
    }
    public Boolean getDeliverySlsEnabled() {
        return this.deliverySlsEnabled;
    }

    public SetServiceSettingsRequest setDeliverySlsProjectName(String deliverySlsProjectName) {
        this.deliverySlsProjectName = deliverySlsProjectName;
        return this;
    }
    public String getDeliverySlsProjectName() {
        return this.deliverySlsProjectName;
    }

    public SetServiceSettingsRequest setRdcEnterpriseId(String rdcEnterpriseId) {
        this.rdcEnterpriseId = rdcEnterpriseId;
        return this;
    }
    public String getRdcEnterpriseId() {
        return this.rdcEnterpriseId;
    }

    public SetServiceSettingsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
