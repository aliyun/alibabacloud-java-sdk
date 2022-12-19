// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyLoginBaseConfigRequest extends TeaModel {
    // The details about the configuration that is used to detect unusual logons to your servers. The value of this parameter is in the JSON format and contains the following fields:
    // 
    // - **totalCount**: the total number of assets. 
    // - **uuidCount**: the number of servers to which the configuration is applied. 
    // - **id**: the ID of the configuration. 
    // - **location**: the name of the common logon location. 
    // 
    // > You must specify the location parameter only if the Type parameter is set to login_common_location. 
    // 
    // - **ip**: the common logon IP address. 
    // 
    // > You must specify the ip parameter only if the Type parameter is set to login_common_ip. 
    // 
    // - **endTime**: the end time of the common logon time range. 
    // 
    // > You must specify the endTime parameter only if the Type parameter is set to login_common_time. 
    // 
    // - **startTime**: the start time of the common logon time range. 
    // 
    // > You must specify the startTime parameter only if the Type parameter is set to login_common_time. 
    // 
    // - **account**: the common logon account. 
    // 
    // > You must specify the account parameter only if the Type parameter is set to login_common_account.
    @NameInMap("Config")
    public String config;

    // The configuration of the server to which the configuration used to detect unusual logons is applied. The value of this parameter is in the JSON format and contains the following fields:
    // 
    // - **Target**: the UUID of the server that you want to add or remove. 
    // - **targetType*: the type based on which you add servers. Valid values:
    //     - **uuid**: servers 
    //     - **groupId**: server groups 
    // - **flag**: the operation that you want to perform on the server. Valid values:
    //     - **del**: removes the server from the configuration. 
    //     - **add**: adds the server to the configuration.
    @NameInMap("Target")
    public String target;

    // The type of logon configuration that you want to modify. Valid values:
    // - **login_common_location**: common logon location 
    // - **login_common_ip**: common logon IP address 
    // - **login_common_time**: common logon time range 
    // - **login_common_account**: common logon account
    @NameInMap("Type")
    public String type;

    public static ModifyLoginBaseConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyLoginBaseConfigRequest self = new ModifyLoginBaseConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyLoginBaseConfigRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public ModifyLoginBaseConfigRequest setTarget(String target) {
        this.target = target;
        return this;
    }
    public String getTarget() {
        return this.target;
    }

    public ModifyLoginBaseConfigRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
