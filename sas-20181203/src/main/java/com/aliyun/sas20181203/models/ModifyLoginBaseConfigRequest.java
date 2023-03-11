// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyLoginBaseConfigRequest extends TeaModel {
    /**
     * <p>The details of the configuration that is used to detect unusual logons to your servers. The value of this parameter is in the JSON format and contains the following fields:</p>
     * <br>
     * <p>*   **totalCount**: the total number of servers.</p>
     * <p>*   **uuidCount**: the number of servers to which the configuration is applied.</p>
     * <p>*   **id**: the ID of the configuration.</p>
     * <p>*   **location**: the common logon location.</p>
     * <br>
     * <p>> You must specify this field if the Type parameter is set to login_common_location.</p>
     * <br>
     * <p>*   **ip**: the common logon IP address.</p>
     * <br>
     * <p>> You must specify this field if the Type parameter is set to login_common_ip.</p>
     * <br>
     * <p>*   **endTime**: the end time of the common logon time range.</p>
     * <br>
     * <p>> You must specify this field if the Type parameter is set to login_common_time.</p>
     * <br>
     * <p>*   **startTime**: the start time of the common logon time range.</p>
     * <br>
     * <p>> You must specify this field if the Type parameter is set to login_common_time.</p>
     * <br>
     * <p>*   **account**: the common logon account.</p>
     * <br>
     * <p>> You must specify this field if the Type parameter is set to login_common_account.</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The details of the server to which the configuration is applied. The value of this parameter is in the JSON format and contains the following fields:</p>
     * <br>
     * <p>*   **Target**: the UUID of the server.</p>
     * <br>
     * <p>*   **targetType**: the type of the server to which the configuration is applied. Valid values:</p>
     * <br>
     * <p>    *   **uuid**: a server</p>
     * <p>    *   **groupId**: a server group</p>
     * <br>
     * <p>*   **flag**: the operation that you want to perform on the server. Valid values:</p>
     * <br>
     * <p>    *   **del**: removes the server from the configuration.</p>
     * <p>    *   **add**: adds the server to the configuration.</p>
     */
    @NameInMap("Target")
    public String target;

    /**
     * <p>The logon type of the configuration to modify. Valid values:</p>
     * <br>
     * <p>*   **login\_common_location**: common logon location</p>
     * <p>*   **login\_common_ip**: common logon IP address</p>
     * <p>*   **login\_common_time**: common logon time range</p>
     * <p>*   **login\_common_account**: common logon account</p>
     */
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
