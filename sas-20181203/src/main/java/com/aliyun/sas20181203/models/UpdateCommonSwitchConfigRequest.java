// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateCommonSwitchConfigRequest extends TeaModel {
    /**
     * <p>Specifies whether the switch takes effect by default. Valid values:</p>
     * <ul>
     * <li><strong>add</strong>: Takes effect by default for newly added servers.</li>
     * <li><strong>del</strong>: Does not take effect by default for newly added servers.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>add</p>
     */
    @NameInMap("TargetDefault")
    public String targetDefault;

    /**
     * <p>The general switch type.</p>
     * <blockquote>
     * <p>You can obtain this parameter from the SwitchId response parameter of the <a href="~~ListClientUserDefineRules~~">ListClientUserDefineRules</a> and <a href="~~ListSystemClientRules~~">ListSystemClientRules</a> operations.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>USER-DEFINE-RULE-SWITCH-TYPE_190****</p>
     */
    @NameInMap("Type")
    public String type;

    public static UpdateCommonSwitchConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCommonSwitchConfigRequest self = new UpdateCommonSwitchConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCommonSwitchConfigRequest setTargetDefault(String targetDefault) {
        this.targetDefault = targetDefault;
        return this;
    }
    public String getTargetDefault() {
        return this.targetDefault;
    }

    public UpdateCommonSwitchConfigRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
