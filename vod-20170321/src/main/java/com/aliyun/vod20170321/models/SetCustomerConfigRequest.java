// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SetCustomerConfigRequest extends TeaModel {
    @NameInMap("AIConfig")
    public String AIConfig;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("AuditConfig")
    public String auditConfig;

    @NameInMap("DownloadSwitch")
    public String downloadSwitch;

    @NameInMap("MetricConfig")
    public String metricConfig;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static SetCustomerConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SetCustomerConfigRequest self = new SetCustomerConfigRequest();
        return TeaModel.build(map, self);
    }

    public SetCustomerConfigRequest setAIConfig(String AIConfig) {
        this.AIConfig = AIConfig;
        return this;
    }
    public String getAIConfig() {
        return this.AIConfig;
    }

    public SetCustomerConfigRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public SetCustomerConfigRequest setAuditConfig(String auditConfig) {
        this.auditConfig = auditConfig;
        return this;
    }
    public String getAuditConfig() {
        return this.auditConfig;
    }

    public SetCustomerConfigRequest setDownloadSwitch(String downloadSwitch) {
        this.downloadSwitch = downloadSwitch;
        return this;
    }
    public String getDownloadSwitch() {
        return this.downloadSwitch;
    }

    public SetCustomerConfigRequest setMetricConfig(String metricConfig) {
        this.metricConfig = metricConfig;
        return this;
    }
    public String getMetricConfig() {
        return this.metricConfig;
    }

    public SetCustomerConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SetCustomerConfigRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SetCustomerConfigRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
