// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateInstanceRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable automatic renewal.<br>This parameter is valid only when the ChargeType parameter is set to PrePaid. Valid values: </p>
     * <ul>
     * <li>true: enables automatic renewal for the instance.   </li>
     * <li>false: disables automatic renewal for the instance. This is the default value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The automatic renewal period of the instance. This parameter is required when the AutoRenew parameter is set to true. Valid values:  </p>
     * <ul>
     * <li>If the PeriodUnit parameter is set to Year: &quot;1&quot;, &quot;2&quot;, and &quot;3&quot;.   </li>
     * <li>If the PeriodUnit parameter is set to Month: &quot;1&quot;, &quot;2&quot;, &quot;3&quot;, &quot;6&quot;, and &quot;12&quot;.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("AutoRenewPeriod")
    public Long autoRenewPeriod;

    /**
     * <p>The billing method of the instance. Valid values:  </p>
     * <ul>
     * <li>PrePay: the subscription billing method. You must ensure that the remaining balance or credit balance of your account can cover the cost of the subscription. Otherwise, you will receive an InvalidPayMethod error. </li>
     * <li>PostPay: the pay-as-you-go billing method. This is the default value. By default, fees are charged on an hourly basis.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PrePay</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <strong>example:</strong>
     * <p>x86</p>
     */
    @NameInMap("CpuArch")
    public String cpuArch;

    /**
     * <p>The size of the storage space,in GB.<br>The limits on the storage space vary with the cluster specifications:   </p>
     * <ul>
     * <li>8C32GB: 100 GB to 10000 GB   </li>
     * <li>14C70GB: 200 GB to 10000 GB   </li>
     * <li>30C180GB: 400 GB to 10000 GB   </li>
     * <li>62C400GB: 800 GB to 10000 GB<br>The preceding minimum storage space sizes are the default storage space sizes of the corresponding cluster specification plans.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("DiskSize")
    public Long diskSize;

    /**
     * <p>The type of the storage disk where the cluster is deployed. This parameter takes effect only for Standard Cluster Edition (Cloud Disk).
     * Valid values:</p>
     * <ul>
     * <li>cloud_essd_pl1: ESSD PL1.</li>
     * <li>cloud_essd_pl0: ESSD PL0. Default value: cloud_essd_pl1.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cloud_essd_pl1</p>
     */
    @NameInMap("DiskType")
    public String diskType;

    /**
     * <p>Specifies whether to perform only a dry run for the request. Default value: false. Valid values:</p>
     * <ul>
     * <li>true: Only a dry-run request is sent and the instance is not created. If the dry run succeeds, DryRunResult=true is returned. If the dry run fails, an error code is returned.</li>
     * <li>false: The actual request is sent and no dry run is performed. The instance is created if the requirements are met. By default, the DryRunResult parameter returns false if you set DryRun to false.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The specifications of the cluster.<br>You can specify one of the following four plans:   </p>
     * <ul>
     * <li>8C32GB: indicates 8 CPU cores and 32 GB of memory.    </li>
     * <li>14C70GB: indicates 14 CPU cores and 70 GB of memory. This is the default value.</li>
     * <li>30C180GB: indicates 30 CPU cores and 180 GB of memory.     </li>
     * <li>62C400GB: indicates 62 CPU cores and 400 GB of memory.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>14C70GB</p>
     */
    @NameInMap("InstanceClass")
    public String instanceClass;

    /**
     * <p>The name of the OceanBase cluster.<br>It must be 1 to 20 characters in length.<br>If this parameter is not specified, the value is the instance ID of the cluster by default.</p>
     * 
     * <strong>example:</strong>
     * <p>amap_aos_tx_ob</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>Specifies whether to enable the control group feature.
     * Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsolationOptimization")
    public String isolationOptimization;

    /**
     * <p>OceanBase Server version number.</p>
     * 
     * <strong>example:</strong>
     * <p>2.2.77</p>
     */
    @NameInMap("ObVersion")
    public String obVersion;

    /**
     * <p>The valid duration of the purchased resources. The unit is specified by the PeriodUnit parameter.<br>This parameter is valid and required only when the InstanceChargeType parameter is set to PrePaid.<br>Valid values:     </p>
     * <ul>
     * <li>When the PeriodUnit parameter is set to Month: &quot;1&quot;, &quot;2&quot;, &quot;3&quot;, &quot;4&quot;, &quot;5&quot;, &quot;6&quot;, &quot;7&quot;, &quot;8&quot;, &quot;9&quot;. </li>
     * <li>When the PeriodUnit parameter is set to Year: &quot;1&quot;, &quot;2&quot;, &quot;3&quot;.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Long period;

    /**
     * <p>The unit of the valid duration of the purchased resources.<br>Valid value for subscription: Month or Year.
     * Default value: Month for subscription, and Hour for pay-as-you-go.</p>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>Primary instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ob3h8ytroxxxxx</p>
     */
    @NameInMap("PrimaryInstance")
    public String primaryInstance;

    /**
     * <p>Primary instance region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("PrimaryRegion")
    public String primaryRegion;

    /**
     * <p>The number of full-featured replicas.</p>
     * <ul>
     * <li>3F: three full-featured replicas.</li>
     * <li>2F1L: two full-featured replicas and one log replica.</li>
     * <li>2F1A: two full-featured replicas and one arbitration service.</li>
     * <li>ApsaraDB for OceanBase earlier than V4.1 supports 3F and 2F1L.</li>
     * <li>ApsaraDB for OceanBase V4.1 or later supports 3F and 2F1A.</li>
     * <li>An ApsaraDB for OceanBase instance deployed across three zones supports only 3F.</li>
     * <li>An ApsaraDB for OceanBase instance deployed across two zones supports 2F1A or 2F1L, depending on the version.</li>
     * <li>An ApsaraDB for OceanBase instance deployed in a single zone supports 3F, 2F1A, or 2F1L, depending on the version.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>3F</p>
     */
    @NameInMap("ReplicaMode")
    public String replicaMode;

    /**
     * <p>The ID of the resource group to which the instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-bp67acfmxazb4p****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The series of the OceanBase cluster. Valid values:    </p>
     * <ul>
     * <li>normal: Standard Cluster Edition (Cloud Disk). This is the default value.</li>
     * <li>normal_ssd: Standard Cluster Edition (Local Disk).</li>
     * <li>history: History Database Cluster Edition.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("Series")
    public String series;

    /**
     * <p>The ID of the zone to which the instance belongs.<br>For more information about how to obtain the list of zones, see <a href="https://help.aliyun.com/document_detail/25610.html">DescribeZones</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-h,cn-hangzhou-i,cn-hangzhou-j</p>
     */
    @NameInMap("Zones")
    public String zones;

    public static CreateInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceRequest self = new CreateInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateInstanceRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public CreateInstanceRequest setAutoRenewPeriod(Long autoRenewPeriod) {
        this.autoRenewPeriod = autoRenewPeriod;
        return this;
    }
    public Long getAutoRenewPeriod() {
        return this.autoRenewPeriod;
    }

    public CreateInstanceRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public CreateInstanceRequest setCpuArch(String cpuArch) {
        this.cpuArch = cpuArch;
        return this;
    }
    public String getCpuArch() {
        return this.cpuArch;
    }

    public CreateInstanceRequest setDiskSize(Long diskSize) {
        this.diskSize = diskSize;
        return this;
    }
    public Long getDiskSize() {
        return this.diskSize;
    }

    public CreateInstanceRequest setDiskType(String diskType) {
        this.diskType = diskType;
        return this;
    }
    public String getDiskType() {
        return this.diskType;
    }

    public CreateInstanceRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateInstanceRequest setInstanceClass(String instanceClass) {
        this.instanceClass = instanceClass;
        return this;
    }
    public String getInstanceClass() {
        return this.instanceClass;
    }

    public CreateInstanceRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public CreateInstanceRequest setIsolationOptimization(String isolationOptimization) {
        this.isolationOptimization = isolationOptimization;
        return this;
    }
    public String getIsolationOptimization() {
        return this.isolationOptimization;
    }

    public CreateInstanceRequest setObVersion(String obVersion) {
        this.obVersion = obVersion;
        return this;
    }
    public String getObVersion() {
        return this.obVersion;
    }

    public CreateInstanceRequest setPeriod(Long period) {
        this.period = period;
        return this;
    }
    public Long getPeriod() {
        return this.period;
    }

    public CreateInstanceRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public CreateInstanceRequest setPrimaryInstance(String primaryInstance) {
        this.primaryInstance = primaryInstance;
        return this;
    }
    public String getPrimaryInstance() {
        return this.primaryInstance;
    }

    public CreateInstanceRequest setPrimaryRegion(String primaryRegion) {
        this.primaryRegion = primaryRegion;
        return this;
    }
    public String getPrimaryRegion() {
        return this.primaryRegion;
    }

    public CreateInstanceRequest setReplicaMode(String replicaMode) {
        this.replicaMode = replicaMode;
        return this;
    }
    public String getReplicaMode() {
        return this.replicaMode;
    }

    public CreateInstanceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateInstanceRequest setSeries(String series) {
        this.series = series;
        return this;
    }
    public String getSeries() {
        return this.series;
    }

    public CreateInstanceRequest setZones(String zones) {
        this.zones = zones;
        return this;
    }
    public String getZones() {
        return this.zones;
    }

}
