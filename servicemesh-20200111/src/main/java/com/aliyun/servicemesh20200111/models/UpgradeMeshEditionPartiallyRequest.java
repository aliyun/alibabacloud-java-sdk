// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class UpgradeMeshEditionPartiallyRequest extends TeaModel {
    /**
     * <p>Specifies whether to upgrade the ASM gateways for the ASM instance. Valid values:</p>
     * <br>
     * <p>*   `true`</p>
     * <p>*   `false`</p>
     */
    @NameInMap("ASMGatewayContinue")
    public Boolean ASMGatewayContinue;

    @NameInMap("ExpectedVersion")
    public String expectedVersion;

    /**
     * <p>Specifies whether to perform an upgrade check. If the value of this parameter is set to true, only the upgrade check is performed and the ASM instance is not upgraded.</p>
     */
    @NameInMap("PreCheck")
    public Boolean preCheck;

    /**
     * <p>The ASM instance ID.</p>
     */
    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    /**
     * <p>Specifies whether to upgrade the ASM instance to Professional Edition. Valid values:</p>
     * <br>
     * <p>*   `true`</p>
     * <p>*   `false`</p>
     */
    @NameInMap("SwitchToPro")
    @Deprecated
    public Boolean switchToPro;

    /**
     * <p>Specifies the ASM gateways to be upgraded. Separate multiple ASM gateways with commas (,).</p>
     */
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

    public UpgradeMeshEditionPartiallyRequest setPreCheck(Boolean preCheck) {
        this.preCheck = preCheck;
        return this;
    }
    public Boolean getPreCheck() {
        return this.preCheck;
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
