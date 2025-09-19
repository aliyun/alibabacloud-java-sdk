// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetAttackPathSensitiveAssetConfigRequest extends TeaModel {
    /**
     * <p>ID of the created attack path sensitive asset setting.</p>
     * 
     * <strong>example:</strong>
     * <p>apsac-123</p>
     */
    @NameInMap("AttackPathSensitiveAssetConfigId")
    public String attackPathSensitiveAssetConfigId;

    /**
     * <p>Configuration type. Possible values:</p>
     * <ul>
     * <li>asset_instance: Asset.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>asset_instance</p>
     */
    @NameInMap("ConfigType")
    public String configType;

    public static GetAttackPathSensitiveAssetConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAttackPathSensitiveAssetConfigRequest self = new GetAttackPathSensitiveAssetConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetAttackPathSensitiveAssetConfigRequest setAttackPathSensitiveAssetConfigId(String attackPathSensitiveAssetConfigId) {
        this.attackPathSensitiveAssetConfigId = attackPathSensitiveAssetConfigId;
        return this;
    }
    public String getAttackPathSensitiveAssetConfigId() {
        return this.attackPathSensitiveAssetConfigId;
    }

    public GetAttackPathSensitiveAssetConfigRequest setConfigType(String configType) {
        this.configType = configType;
        return this;
    }
    public String getConfigType() {
        return this.configType;
    }

}
