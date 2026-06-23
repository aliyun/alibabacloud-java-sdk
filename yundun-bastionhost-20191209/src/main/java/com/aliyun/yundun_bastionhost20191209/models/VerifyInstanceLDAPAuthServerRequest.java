// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class VerifyInstanceLDAPAuthServerRequest extends TeaModel {
    /**
     * <p>The account of the server.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn=Manager,dc=test,dc=com</p>
     */
    @NameInMap("Account")
    public String account;

    /**
     * <p>The Base DN.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dc=test,dc=com</p>
     */
    @NameInMap("BaseDN")
    public String baseDN;

    /**
     * <p>The filter condition for users.</p>
     * 
     * <strong>example:</strong>
     * <p>(objectClass=top)</p>
     */
    @NameInMap("Filter")
    public String filter;

    /**
     * <p>The ID of the Bastionhost instance. You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to obtain this parameter.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-st220aw****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Specifies whether SSL is supported. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: supported</p>
     * </li>
     * <li><p><strong>false</strong>: not supported</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsSSL")
    public String isSSL;

    /**
     * <p>The password of the server account.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The port used to access the server.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>389</p>
     */
    @NameInMap("Port")
    public String port;

    /**
     * <p>The region ID of the Bastionhost instance. For the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The address of the server.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.XX.XX</p>
     */
    @NameInMap("Server")
    public String server;

    /**
     * <p>The address of the standby server.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.XX.XX</p>
     */
    @NameInMap("StandbyServer")
    public String standbyServer;

    public static VerifyInstanceLDAPAuthServerRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyInstanceLDAPAuthServerRequest self = new VerifyInstanceLDAPAuthServerRequest();
        return TeaModel.build(map, self);
    }

    public VerifyInstanceLDAPAuthServerRequest setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

    public VerifyInstanceLDAPAuthServerRequest setBaseDN(String baseDN) {
        this.baseDN = baseDN;
        return this;
    }
    public String getBaseDN() {
        return this.baseDN;
    }

    public VerifyInstanceLDAPAuthServerRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public VerifyInstanceLDAPAuthServerRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public VerifyInstanceLDAPAuthServerRequest setIsSSL(String isSSL) {
        this.isSSL = isSSL;
        return this;
    }
    public String getIsSSL() {
        return this.isSSL;
    }

    public VerifyInstanceLDAPAuthServerRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public VerifyInstanceLDAPAuthServerRequest setPort(String port) {
        this.port = port;
        return this;
    }
    public String getPort() {
        return this.port;
    }

    public VerifyInstanceLDAPAuthServerRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public VerifyInstanceLDAPAuthServerRequest setServer(String server) {
        this.server = server;
        return this;
    }
    public String getServer() {
        return this.server;
    }

    public VerifyInstanceLDAPAuthServerRequest setStandbyServer(String standbyServer) {
        this.standbyServer = standbyServer;
        return this;
    }
    public String getStandbyServer() {
        return this.standbyServer;
    }

}
