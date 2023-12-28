// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateInstanceRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable automatic renewal.   </p>
     * <p>This parameter is valid only when the ChargeType parameter is set to PrePaid. Valid values: </p>
     * <p>- true: enables automatic renewal for the instance.   </p>
     * <p>- false: disables automatic renewal for the instance. This is the default value.</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The automatic renewal period of the instance. This parameter is required when the AutoRenew parameter is set to true. Valid values:  </p>
     * <p>- If the PeriodUnit parameter is set to Year: "1", "2", and "3".   </p>
     * <p>- If the PeriodUnit parameter is set to Month: "1", "2", "3", "6", and "12".</p>
     */
    @NameInMap("AutoRenewPeriod")
    public Long autoRenewPeriod;

    /**
     * <p>The billing method of the instance. Valid values:  </p>
     * <p>- PrePay: the subscription billing method. You must ensure that the remaining balance or credit balance of your account can cover the cost of the subscription. Otherwise, you will receive an InvalidPayMethod error. </p>
     * <p>- PostPay: the pay-as-you-go billing method. This is the default value. By default, fees are charged on an hourly basis.</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The size of the storage space,in GB.    </p>
     * <p>The limits on the storage space vary with the cluster specifications:   </p>
     * <p>- 8C32GB: 100 GB to 10000 GB   </p>
     * <p>- 14C70GB: 200 GB to 10000 GB   </p>
     * <p>- 30C180GB: 400 GB to 10000 GB   </p>
     * <p>- 62C400GB: 800 GB to 10000 GB    </p>
     * <p>The preceding minimum storage space sizes are the default storage space sizes of the corresponding cluster specification plans.</p>
     */
    @NameInMap("DiskSize")
    public Long diskSize;

    /**
     * <p>The return result of the request.</p>
     */
    @NameInMap("DiskType")
    public String diskType;

    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The specifications of the cluster.     </p>
     * <p>You can specify one of the following four plans:   </p>
     * <p> - 8C32GB: indicates 8 CPU cores and 32 GB of memory.    </p>
     * <p> - 14C70GB: indicates 14 CPU cores and 70 GB of memory. This is the default value.</p>
     * <p>- 30C180GB: indicates 30 CPU cores and 180 GB of memory.     </p>
     * <p>- 62C400GB: indicates 62 CPU cores and 400 GB of memory.</p>
     */
    @NameInMap("InstanceClass")
    public String instanceClass;

    /**
     * <p>The name of the OceanBase cluster.    </p>
     * <p>It must be 1 to 20 characters in length.   </p>
     * <p>If this parameter is not specified, the value is the instance ID of the cluster by default.</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("IsolationOptimization")
    public String isolationOptimization;

    /**
     * <p>OceanBase Server version number.</p>
     */
    @NameInMap("ObVersion")
    public String obVersion;

    /**
     * <p>The valid duration of the purchased resources. The unit is specified by the PeriodUnit parameter.   </p>
     * <p>This parameter is valid and required only when the InstanceChargeType parameter is set to PrePaid.      </p>
     * <p>Valid values:     </p>
     * <p>- When the PeriodUnit parameter is set to Month: "1", "2", "3", "4", "5", "6", "7", "8", "9". </p>
     * <p>- When the PeriodUnit parameter is set to Year: "1", "2", "3".</p>
     */
    @NameInMap("Period")
    public Long period;

    /**
     * <p>The unit of the valid duration of the purchased resources.     </p>
     * <p>Valid value for subscription: Month or Year.</p>
     * <p>Default value: Month for subscription, and Hour for pay-as-you-go.</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    @NameInMap("PrimaryInstance")
    public String primaryInstance;

    @NameInMap("PrimaryRegion")
    public String primaryRegion;

    @NameInMap("ReplicaMode")
    public String replicaMode;

    /**
     * <p>The ID of the resource group to which the instance belongs.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The series of the OceanBase cluster. Valid values:    </p>
     * <p>- normal: Standard Cluster Edition (Cloud Disk). This is the default value.</p>
     * <p>- normal_ssd: Standard Cluster Edition (Local Disk).</p>
     * <p>- history: History Database Cluster Edition.</p>
     */
    @NameInMap("Series")
    public String series;

    /**
     * <p>The ID of the zone to which the instance belongs.   </p>
     * <p>For more information about how to obtain the list of zones, see [DescribeZones](~~25610~~).</p>
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
