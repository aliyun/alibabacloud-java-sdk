// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteAttackPathWhitelistRequest extends TeaModel {
    /**
     * <p>Attack path whitelist ID.</p>
     * <blockquote>
     * <p>You can call <a href="~~ListAttackPathWhitelist~~">ListAttackPathWhitelist</a> to query the attack path whitelist ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>apwl-b33dec0acf9b42aabde032d656c0****</p>
     */
    @NameInMap("AttackPathWhitelistId")
    public String attackPathWhitelistId;

    public static DeleteAttackPathWhitelistRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAttackPathWhitelistRequest self = new DeleteAttackPathWhitelistRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAttackPathWhitelistRequest setAttackPathWhitelistId(String attackPathWhitelistId) {
        this.attackPathWhitelistId = attackPathWhitelistId;
        return this;
    }
    public String getAttackPathWhitelistId() {
        return this.attackPathWhitelistId;
    }

}
