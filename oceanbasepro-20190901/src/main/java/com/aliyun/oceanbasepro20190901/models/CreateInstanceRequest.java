// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateInstanceRequest extends TeaModel {
    // 是否要自动续费。当参数ChargeType取值PrePaid时生效。取值范围：  true：自动续费。 false（默认）：不自动续费。
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    // 每次自动续费的时长，当参数AutoRenew取值True时，该参数为必填参数。  PeriodUnit为Week时，AutoRenewPeriod取值范围为{"1", "2", "3"}。  PeriodUnit为Month时，AutoRenewPeriod取值范围为{"1", "2", "3", "6", "12"}。
    @NameInMap("AutoRenewPeriod")
    public Long autoRenewPeriod;

    // 实例的付费方式。取值范围：  PrePay：包年包月。选择该类付费方式时，您必须确认自己的账号支持余额支付/信用支付，否则将返回 InvalidPayMethod的错误提示。 PostPay（默认）：按量付费。其默认按小时来计费
    @NameInMap("ChargeType")
    public String chargeType;

    // 存储空间大小，单位GB。  存储空间的限制根据集群规格不同而不同，具体如下：  - 8C32GB：100GB~10000GB  - 14C70GB：200GB~10000GB  - 30C180GB：400GB~10000GB  - 62C400G：800GB-10000GB。  各套餐的存储空间默认值为其最小值。
    @NameInMap("DiskSize")
    public Long diskSize;

    // 集群规格信息。  当前支持四种套餐：  - 8C32GB：8核 32GB  - 14C70GB（默认）：14核 70GB  - 30C180GB：30核 180GB  - 62C400GB：62核 400GB
    @NameInMap("InstanceClass")
    public String instanceClass;

    // 集群名称。
    @NameInMap("InstanceName")
    public String instanceName;

    // 购买资源的时长，单位由PeriodUnit指定。当参数InstanceChargeType取值为PrePaid时才生效且为必选值。一旦指定了DedicatedHostId，则取值范围不能超过专有宿主机的订阅时长。取值范围：  PeriodUnit=Week时，Period取值：{“1”, “2”, “3”, “4”}。 PeriodUnit=Month时，Period取值：{“1”, “2”, “3”, “4”, “5”, “6”, “7”, “8”, “9”, “12”, “24”, “36”, ”48”, ”60”}。
    @NameInMap("Period")
    public Long period;

    // 购买资源的时长。  包年包月取值范围： Month。 默认值：包年包月为Month，按量计费，默认周期为Hour。
    @NameInMap("PeriodUnit")
    public String periodUnit;

    // 实例所在的企业资源组ID
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    // Oceanbase集群的系列  - normal（默认）：高可用版本  - basic：基础版本（API暂不支持，请页面购买）
    @NameInMap("Series")
    public String series;

    // 实例所属的可用区ID。更多详情，请参见DescribeZones获取可用区列表。
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
