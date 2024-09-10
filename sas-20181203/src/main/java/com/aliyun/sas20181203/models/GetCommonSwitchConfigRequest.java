// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetCommonSwitchConfigRequest extends TeaModel {
    /**
     * <p>The type of the common switch.</p>
     * <blockquote>
     * <p> You can call the <a href="~~ListClientUserDefineRules~~">ListClientUserDefineRules</a> or <a href="~~ListSystemClientRules~~">ListSystemClientRules</a> operation to obtain the switch type from the response parameter SwitchId.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>USER-DEFINE-RULE-SWITCH-TYPE_180****</p>
     */
    @NameInMap("Type")
    public String type;

    public static GetCommonSwitchConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCommonSwitchConfigRequest self = new GetCommonSwitchConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetCommonSwitchConfigRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
