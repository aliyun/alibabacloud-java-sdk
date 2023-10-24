// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class SetSensitiveDefineRuleConfigRequest extends TeaModel {
    @NameInMap("Config")
    public String config;

    public static SetSensitiveDefineRuleConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SetSensitiveDefineRuleConfigRequest self = new SetSensitiveDefineRuleConfigRequest();
        return TeaModel.build(map, self);
    }

    public SetSensitiveDefineRuleConfigRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

}
