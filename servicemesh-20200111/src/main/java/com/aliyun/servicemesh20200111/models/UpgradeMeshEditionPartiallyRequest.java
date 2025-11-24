// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class UpgradeMeshEditionPartiallyRequest extends TeaModel {
    /**
     * <p>Specifies whether to upgrade the ASM gateways for the ASM instance. Valid values:</p>
     * <ul>
     * <li><code>true</code></li>
     * <li><code>false</code></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ASMGatewayContinue")
    public Boolean ASMGatewayContinue;

    /**
     * <p>The expected version that desired to be upgraded to.</p>
     * 
     * <strong>example:</strong>
     * <p>v1.15.3.118-g4712daf0-aliyun</p>
     */
    @NameInMap("ExpectedVersion")
    public String expectedVersion;

    /**
     * <p>Specifies whether to perform an upgrade check. If the value of this parameter is set to true, only the upgrade check is performed and the ASM instance is not upgraded.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("PreCheck")
    public Boolean preCheck;

    /**
     * <p>The ASM instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ca04bc38979214bf2882be79d39b4****</p>
     */
    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    /**
     * <p>Specifies whether to upgrade the ASM instance to Professional Edition. Valid values:</p>
     * <ul>
     * <li><code>true</code></li>
     * <li><code>false</code></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SwitchToPro")
    @Deprecated
    public Boolean switchToPro;

    /**
     * <p>Specifies the ASM gateways to be upgraded. Separate multiple ASM gateways with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>ingressgateway1,ingressgateway2</p>
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

    @Deprecated
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
