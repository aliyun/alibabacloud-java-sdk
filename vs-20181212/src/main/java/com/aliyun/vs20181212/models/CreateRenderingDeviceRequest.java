// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class CreateRenderingDeviceRequest extends TeaModel {
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    @NameInMap("AutoRenewPeriod")
    public Integer autoRenewPeriod;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("Count")
    public Integer count;

    @NameInMap("Description")
    public String description;

    @NameInMap("EdgeNodeName")
    public String edgeNodeName;

    @NameInMap("ISP")
    public String ISP;

    @NameInMap("ImageId")
    public String imageId;

    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("Password")
    public String password;

    @NameInMap("Period")
    public Integer period;

    @NameInMap("PeriodUnit")
    public String periodUnit;

    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    @NameInMap("Specification")
    public String specification;

    public static CreateRenderingDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRenderingDeviceRequest self = new CreateRenderingDeviceRequest();
        return TeaModel.build(map, self);
    }

    public CreateRenderingDeviceRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public CreateRenderingDeviceRequest setAutoRenewPeriod(Integer autoRenewPeriod) {
        this.autoRenewPeriod = autoRenewPeriod;
        return this;
    }
    public Integer getAutoRenewPeriod() {
        return this.autoRenewPeriod;
    }

    public CreateRenderingDeviceRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateRenderingDeviceRequest setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public CreateRenderingDeviceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateRenderingDeviceRequest setEdgeNodeName(String edgeNodeName) {
        this.edgeNodeName = edgeNodeName;
        return this;
    }
    public String getEdgeNodeName() {
        return this.edgeNodeName;
    }

    public CreateRenderingDeviceRequest setISP(String ISP) {
        this.ISP = ISP;
        return this;
    }
    public String getISP() {
        return this.ISP;
    }

    public CreateRenderingDeviceRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public CreateRenderingDeviceRequest setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public CreateRenderingDeviceRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public CreateRenderingDeviceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateRenderingDeviceRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateRenderingDeviceRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public CreateRenderingDeviceRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public CreateRenderingDeviceRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public CreateRenderingDeviceRequest setSpecification(String specification) {
        this.specification = specification;
        return this;
    }
    public String getSpecification() {
        return this.specification;
    }

}
