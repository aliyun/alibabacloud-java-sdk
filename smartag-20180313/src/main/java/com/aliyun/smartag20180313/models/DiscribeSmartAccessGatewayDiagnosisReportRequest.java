// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DiscribeSmartAccessGatewayDiagnosisReportRequest extends TeaModel {
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SmartAGId")
    public String smartAGId;

    @NameInMap("SmartAGSn")
    public String smartAGSn;

    public static DiscribeSmartAccessGatewayDiagnosisReportRequest build(java.util.Map<String, ?> map) throws Exception {
        DiscribeSmartAccessGatewayDiagnosisReportRequest self = new DiscribeSmartAccessGatewayDiagnosisReportRequest();
        return TeaModel.build(map, self);
    }

    public DiscribeSmartAccessGatewayDiagnosisReportRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DiscribeSmartAccessGatewayDiagnosisReportRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DiscribeSmartAccessGatewayDiagnosisReportRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DiscribeSmartAccessGatewayDiagnosisReportRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DiscribeSmartAccessGatewayDiagnosisReportRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DiscribeSmartAccessGatewayDiagnosisReportRequest setSmartAGId(String smartAGId) {
        this.smartAGId = smartAGId;
        return this;
    }
    public String getSmartAGId() {
        return this.smartAGId;
    }

    public DiscribeSmartAccessGatewayDiagnosisReportRequest setSmartAGSn(String smartAGSn) {
        this.smartAGSn = smartAGSn;
        return this;
    }
    public String getSmartAGSn() {
        return this.smartAGSn;
    }

}
