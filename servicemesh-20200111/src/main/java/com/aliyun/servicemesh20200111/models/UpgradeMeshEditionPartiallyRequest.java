// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class UpgradeMeshEditionPartiallyRequest extends TeaModel {
    @NameInMap("ASMGatewayContinue")
    public Boolean ASMGatewayContinue;

    @NameInMap("ExpectedVersion")
    public String expectedVersion;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    @NameInMap("SwitchToPro")
    public Boolean switchToPro;

    @NameInMap("UpgradeGatewayRecords")
    public String upgradeGatewayRecords;

    public static UpgradeMeshEditionPartiallyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradeMeshEditionPartiallyRequest self = new UpgradeMeshEditionPartiallyRequest();
        return TeaModel.build(map, self);
    }

    public UpgradeMeshEditionPartiallyRequest setASMGatewayContinue(Boolean ASMGatewayContinue) {
        this.ASMGatewayContinue = ASMGatewayContinue;
        return this;
    }
    public Boolean getASMGatewayContinue() {
        return this.ASMGatewayContinue;
    }

    public UpgradeMeshEditionPartiallyRequest setExpectedVersion(String expectedVersion) {
        this.expectedVersion = expectedVersion;
        return this;
    }
    public String getExpectedVersion() {
        return this.expectedVersion;
    }

    public UpgradeMeshEditionPartiallyRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    public UpgradeMeshEditionPartiallyRequest setSwitchToPro(Boolean switchToPro) {
        this.switchToPro = switchToPro;
        return this;
    }
    public Boolean getSwitchToPro() {
        return this.switchToPro;
    }

    public UpgradeMeshEditionPartiallyRequest setUpgradeGatewayRecords(String upgradeGatewayRecords) {
        this.upgradeGatewayRecords = upgradeGatewayRecords;
        return this;
    }
    public String getUpgradeGatewayRecords() {
        return this.upgradeGatewayRecords;
    }

}
