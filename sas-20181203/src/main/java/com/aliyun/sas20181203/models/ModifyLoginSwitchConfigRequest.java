// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyLoginSwitchConfigRequest extends TeaModel {
    /**
     * <p>The type of the logon security settings that you want to enable or disable. Valid values:</p>
     * <br>
     * <p>*   **login_common_ip**: unapproved logon IP addresses</p>
     * <p>*   **login_common_time**: unapproved logon time ranges</p>
     * <p>*   **login_common_account**: unapproved logon accounts</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Item")
    public String item;

    /**
     * <p>Specifies whether to enable the logon security settings. Valid values:</p>
     * <br>
     * <p>*   **0**: no</p>
     * <p>*   **1**: yes</p>
     * <br>
     * <p>This parameter is required.</p>
     */
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
