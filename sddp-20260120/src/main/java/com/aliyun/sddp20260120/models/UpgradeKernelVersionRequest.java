// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20260120.models;

import com.aliyun.tea.*;

public class UpgradeKernelVersionRequest extends TeaModel {
    /**
     * <p>The database instance identity. You can obtain this value from the Items[].InstanceId field in the ListDataMaskingInstances response.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-2ze1abcdefgh****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The target Milvus version. You can obtain this value from the KernelVersions[].KernelVersion field in the ListMiniEngineVersions response.</p>
     * 
     * <strong>example:</strong>
     * <p>rds_20220731</p>
     */
    @NameInMap("KernelVersion")
    public String kernelVersion;

    /**
     * <p>The language of the response description. Valid values: zh: Chinese. en: English.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The product code. Column encryption supports RDS, POLARDB, and PolarDBX2. If you specify both ProductCode and ProductId, they must match.</p>
     * 
     * <strong>example:</strong>
     * <p>RDS</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The product type identifier. Valid values: 5: RDS. 8: POLARDB. 27: PolarDBX2. If you specify both ProductId and ProductCode, they must match.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("ProductId")
    public Long productId;

    /**
     * <p>The specified upgrade time. The value is a UNIX timestamp in milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC. Specify this parameter only when UpgradeTime is set to SpecifyTime. The time must be later than the current time.</p>
     * 
     * <strong>example:</strong>
     * <p>1893456000000</p>
     */
    @NameInMap("SwitchTime")
    public Long switchTime;

    /**
     * <p>The execution time for the kernel upgrade. Valid values: Immediate: Executes the upgrade immediately. MaintainTime: Executes the upgrade during the maintenance window. SpecifyTime: Executes the upgrade at a specified time. PolarDB-X 2.0 does not support SpecifyTime.</p>
     * 
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
