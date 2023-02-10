// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyLoginSwitchConfigRequest extends TeaModel {
    @NameInMap("Item")
    public String item;

    @NameInMap("Status")
    public Integer status;

    public static ModifyLoginSwitchConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyLoginSwitchConfigRequest self = new ModifyLoginSwitchConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyLoginSwitchConfigRequest setItem(String item) {
        this.item = item;
        return this;
    }
    public String getItem() {
        return this.item;
    }

    public ModifyLoginSwitchConfigRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
