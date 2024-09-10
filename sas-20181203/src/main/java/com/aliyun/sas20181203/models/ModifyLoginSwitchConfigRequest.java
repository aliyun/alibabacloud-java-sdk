// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyLoginSwitchConfigRequest extends TeaModel {
    /**
     * <p>The type of the logon security settings that you want to enable or disable. Valid values:</p>
     * <ul>
     * <li><strong>login_common_ip</strong>: unapproved logon IP addresses</li>
     * <li><strong>login_common_time</strong>: unapproved logon time ranges</li>
     * <li><strong>login_common_account</strong>: unapproved logon accounts</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>login_common_account</p>
     */
    @NameInMap("Item")
    public String item;

    /**
     * <p>Specifies whether to enable the logon security settings. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: no</li>
     * <li><strong>1</strong>: yes</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
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
