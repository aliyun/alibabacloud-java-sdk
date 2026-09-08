// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20260120.models;

import com.aliyun.tea.*;

public class UpgradeKernelVersionRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>rm-2ze1abcdefgh****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>rds_20220731</p>
     */
    @NameInMap("KernelVersion")
    public String kernelVersion;

    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>RDS</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("ProductId")
    public Long productId;

    /**
     * <strong>example:</strong>
     * <p>1893456000000</p>
     */
    @NameInMap("SwitchTime")
    public Long switchTime;

    /**
     * <strong>example:</strong>
     * <p>MaintainTime</p>
     */
    @NameInMap("UpgradeTime")
    public String upgradeTime;

    public static UpgradeKernelVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradeKernelVersionRequest self = new UpgradeKernelVersionRequest();
        return TeaModel.build(map, self);
    }

    public UpgradeKernelVersionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpgradeKernelVersionRequest setKernelVersion(String kernelVersion) {
        this.kernelVersion = kernelVersion;
        return this;
    }
    public String getKernelVersion() {
        return this.kernelVersion;
    }

    public UpgradeKernelVersionRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpgradeKernelVersionRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public UpgradeKernelVersionRequest setProductId(Long productId) {
        this.productId = productId;
        return this;
    }
    public Long getProductId() {
        return this.productId;
    }

    public UpgradeKernelVersionRequest setSwitchTime(Long switchTime) {
        this.switchTime = switchTime;
        return this;
    }
    public Long getSwitchTime() {
        return this.switchTime;
    }

    public UpgradeKernelVersionRequest setUpgradeTime(String upgradeTime) {
        this.upgradeTime = upgradeTime;
        return this;
    }
    public String getUpgradeTime() {
        return this.upgradeTime;
    }

}
