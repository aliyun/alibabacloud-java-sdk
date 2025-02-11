// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class LoginInstanceRequest extends TeaModel {
    /**
     * <p>The ID of the simple application server.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>9ae7106e68eb4402b0dcbd48a9de****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The password that corresponds to the username.</p>
     * <ul>
     * <li>For a Linux server, you do not need to enter a password.</li>
     * <li>For a Windows server, enter the password that you set. If you have not set a password for the simple application server, set a password. For more information, see <a href="https://help.aliyun.com/document_detail/60055.html">Reset the password</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Test****</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The port number that is used to log on to the simple application server by using Workbench.</p>
     * <ul>
     * <li>Linux servers: The default value is 22.</li>
     * <li>Windows servers: The default value is 3389.</li>
     * </ul>
     * <blockquote>
     * <p> If you want to connect to a server by using a custom port, you must modify the default remote connection port. For more information, see <a href="https://help.aliyun.com/document_detail/2807402.html">Configure a custom remote connection port</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3389</p>
     */
    @NameInMap("Port")
    public Integer port;

    /**
     * <p>The region ID of the simple application server. You can call the <a href="https://help.aliyun.com/document_detail/189315.html">ListRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The username of the simple application server.</p>
     * <ul>
     * <li>For a Linux server, you do not need to enter a username.</li>
     * <li>For a Windows server, the default username <code>administrator</code> is used.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>administrator</p>
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

    public LoginInstanceRequest setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
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
