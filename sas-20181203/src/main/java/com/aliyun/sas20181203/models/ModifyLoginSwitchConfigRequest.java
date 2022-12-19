// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyLoginSwitchConfigRequest extends TeaModel {
    // The type of the alert that you want to enable or disable. Valid values:
    // 
    // *   **login\_common_ip**: alerts for unapproved logon IP addresses
    // *   **login\_common_time**: alerts for unapproved logon time ranges
    // *   **login\_common_account**: alerts for unapproved logon accounts
    @NameInMap("Item")
    public String item;

    // Specifies whether to enable the logon security settings. Valid values:
    // 
    // *   **0**: disables the logon security settings
    // *   **1**: enables the logon security settings
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
