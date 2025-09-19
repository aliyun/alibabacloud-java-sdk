// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteAttackPathSensitiveAssetConfigRequest extends TeaModel {
    /**
     * <p>ID of the attack path sensitive asset configuration.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>apsac-123</p>
     */
    @NameInMap("AttackPathSensitiveAssetConfigId")
    public String attackPathSensitiveAssetConfigId;

    public static DeleteAttackPathSensitiveAssetConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAttackPathSensitiveAssetConfigRequest self = new DeleteAttackPathSensitiveAssetConfigRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAttackPathSensitiveAssetConfigRequest setAttackPathSensitiveAssetConfigId(String attackPathSensitiveAssetConfigId) {
        this.attackPathSensitiveAssetConfigId = attackPathSensitiveAssetConfigId;
        return this;
    }
    public String getAttackPathSensitiveAssetConfigId() {
        return this.attackPathSensitiveAssetConfigId;
    }

}
