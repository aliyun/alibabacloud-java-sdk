// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20260120.models;

import com.aliyun.tea.*;

public class UpgradeKernelVersionRequest extends TeaModel {
    /**
     * <p>The database instance identity. You can obtain the value from Items[].InstanceId in the response of the ListDataMaskingInstances operation.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-2ze1abcdefgh****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The target Milvus version. You can obtain the value from KernelVersions[].KernelVersion in the response of the ListMiniEngineVersions operation.</p>
     * 
     * <strong>example:</strong>
     * <p>rds_20220731</p>
     */
    @NameInMap("KernelVersion")
    public String kernelVersion;

    /**
     * <p>The language of the response description. Valid values:</p>
     * <ul>
     * <li>zh: Chinese.</li>
     * <li>en: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The cloud service code. Column encryption supports RDS, POLARDB, and PolarDBX2. If ProductId is also specified, the two values must match.</p>
     * 
     * <strong>example:</strong>
     * <p>RDS</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The identifier of the cloud service type. Valid values:</p>
     * <ul>
     * <li>5: RDS.</li>
     * <li>8: POLARDB.</li>
     * <li>27: PolarDBX2.
     * If this parameter is specified together with ProductCode, the values must match.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("ProductId")
    public Long productId;

    /**
     * <p>The specified upgrade time. The value is a UNIX timestamp in milliseconds that have elapsed since 1970-01-01 00:00:00 UTC. Specify this parameter only when UpgradeTime is set to SpecifyTime, and the time must be later than the current time.</p>
     * 
     * <strong>example:</strong>
     * <p>1893456000000</p>
     */
    @NameInMap("SwitchTime")
    public Long switchTime;

    /**
     * <p>The execution time of the kernel upgrade. Valid values:</p>
     * <ul>
     * <li>Immediate: Executes the upgrade immediately.</li>
     * <li>MaintainTime: Executes the upgrade during the maintenance window.</li>
     * <li>SpecifyTime: Executes the upgrade at a specified time.
     * PolarDB-X 2.0 does not support SpecifyTime.</li>
     * </ul>
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
