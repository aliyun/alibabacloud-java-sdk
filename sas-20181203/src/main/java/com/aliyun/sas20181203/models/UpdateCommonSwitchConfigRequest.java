// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateCommonSwitchConfigRequest extends TeaModel {
    /**
     * <p>Specifies whether to turn on the switch for newly added servers. Valid values:</p>
     * <br>
     * <p>*   **add**: yes</p>
     * <p>*   **del**: no</p>
     */
    @NameInMap("TargetDefault")
    public String targetDefault;

    /**
     * <p>The type of the switch.</p>
     * <br>
     * <p>>  You can call the [ListClientUserDefineRules](~~ListClientUserDefineRules~~) or [ListSystemClientRules](~~ListSystemClientRules~~) operation to obtain the type from the response parameter SwitchId.</p>
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
