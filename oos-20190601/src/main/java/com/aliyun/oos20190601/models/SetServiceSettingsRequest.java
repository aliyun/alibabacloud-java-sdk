// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class SetServiceSettingsRequest extends TeaModel {
    @NameInMap("DeliveryOssBucketName")
    public String deliveryOssBucketName;

    @NameInMap("DeliveryOssEnabled")
    public Boolean deliveryOssEnabled;

    @NameInMap("DeliveryOssKeyPrefix")
    public String deliveryOssKeyPrefix;

    @NameInMap("DeliverySlsEnabled")
    public Boolean deliverySlsEnabled;

    @NameInMap("DeliverySlsProjectName")
    public String deliverySlsProjectName;

    @NameInMap("RdcEnterpriseId")
    public String rdcEnterpriseId;

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
