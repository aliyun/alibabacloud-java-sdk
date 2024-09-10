// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateCommonSwitchConfigRequest extends TeaModel {
    /**
     * <p>Specifies whether to turn on the switch for newly added servers. Valid values:</p>
     * <ul>
     * <li><strong>add</strong>: yes</li>
     * <li><strong>del</strong>: no</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>add</p>
     */
    @NameInMap("TargetDefault")
    public String targetDefault;

    /**
     * <p>The type of the switch.</p>
     * <blockquote>
     * <p> You can call the <a href="~~ListClientUserDefineRules~~">ListClientUserDefineRules</a> or <a href="~~ListSystemClientRules~~">ListSystemClientRules</a> operation to obtain the type from the response parameter SwitchId.</p>
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
