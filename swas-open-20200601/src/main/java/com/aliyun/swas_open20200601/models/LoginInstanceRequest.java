// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class LoginInstanceRequest extends TeaModel {
    /**
     * <p>The ID of the simple application server.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The password that corresponds to the username.</p>
     * <br>
     * <p>*   For a Linux server, you do not need to enter a password.</p>
     * <p>*   For a Windows server, enter the password that you set. If you have not set a password for the simple application server, set a password. For more information, see [Reset the password](~~60055~~).</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The region ID of the simple application server. You can call the [ListRegions](~~189315~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The username of the simple application server.</p>
     * <br>
     * <p>*   For a Linux server, you do not need to enter a username.</p>
     * <p>*   For a Windows server, the default username is `administrator`.</p>
     */
    @NameInMap("Username")
    public String username;

    public static LoginInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        LoginInstanceRequest self = new LoginInstanceRequest();
        return TeaModel.build(map, self);
    }

    public LoginInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public LoginInstanceRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public LoginInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public LoginInstanceRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

}
