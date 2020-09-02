// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreatePhysicalConnectionSetupOrderRequest extends TeaModel {
    // description: The ID of the region where the leased line is deployed. You can get the region ID by calling the DescribeRegions API.; 
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    // description: The ID of the access point.; 
    @NameInMap("AccessPointId")
    @Validation(required = true)
    public String accessPointId;

    // description: The service provider that provides the leased line. Valid values:* CT: China Telecom* CU: China Unicom* CM: China Mobile* CO: Other Chinese service providers* Equinix: Equinix* Other: Other service providers outside Mainland China; 
    @NameInMap("LineOperator")
    @Validation(required = true)
    public String lineOperator;

    // description: Optional. The type of the leased line connection port. Valid values:* **100Base-T**: 100M electrical ports* **1000Base-T **(default value): Gigabit electrical ports* **1000Base-LX**: 1000M single-mode optical ports (10 km)* **10GBase-T**: 10GE electrical ports* **10GBase-LR**: 10GE single-mode optical ports (10km) ; 
    @NameInMap("PortType")
    public String portType;

    // description: The ID of the redundant physical connection. Its status must be **Allocated**,**Confirmed**or** Enabled**. ; 
    @NameInMap("RedundantPhysicalConnectionId")
    public String redundantPhysicalConnectionId;

    // description: Optional. Indicates whether to pay the fee automatically.Valid values: **true | false**; 
    @NameInMap("AutoPay")
    public Boolean autoPay;

    // description: Optional. The token used for client authentication.; 
    @NameInMap("ClientToken")
    public String clientToken;

    public static CreatePhysicalConnectionSetupOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePhysicalConnectionSetupOrderRequest self = new CreatePhysicalConnectionSetupOrderRequest();
        return TeaModel.build(map, self);
    }

    public CreatePhysicalConnectionSetupOrderRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreatePhysicalConnectionSetupOrderRequest setAccessPointId(String accessPointId) {
        this.accessPointId = accessPointId;
        return this;
    }
    public String getAccessPointId() {
        return this.accessPointId;
    }

    public CreatePhysicalConnectionSetupOrderRequest setLineOperator(String lineOperator) {
        this.lineOperator = lineOperator;
        return this;
    }
    public String getLineOperator() {
        return this.lineOperator;
    }

    public CreatePhysicalConnectionSetupOrderRequest setPortType(String portType) {
        this.portType = portType;
        return this;
    }
    public String getPortType() {
        return this.portType;
    }

    public CreatePhysicalConnectionSetupOrderRequest setRedundantPhysicalConnectionId(String redundantPhysicalConnectionId) {
        this.redundantPhysicalConnectionId = redundantPhysicalConnectionId;
        return this;
    }
    public String getRedundantPhysicalConnectionId() {
        return this.redundantPhysicalConnectionId;
    }

    public CreatePhysicalConnectionSetupOrderRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public CreatePhysicalConnectionSetupOrderRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
