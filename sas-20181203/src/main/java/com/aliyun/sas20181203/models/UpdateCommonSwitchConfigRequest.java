// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateCommonSwitchConfigRequest extends TeaModel {
    @NameInMap("TargetDefault")
    public String targetDefault;

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
