// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ModifyParentPlatformRequest extends TeaModel {
    /**
     * <p>Specifies whether to automatically enable the platform. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false (default)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoStart")
    public Boolean autoStart;

    /**
     * <p>Specifies whether to enable local authentication. Valid values:</p>
     * <ul>
     * <li>true (default)</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ClientAuth")
    public Boolean clientAuth;

    /**
     * <p>The local password.</p>
     * 
     * <strong>example:</strong>
     * <p>admin123</p>
     */
    @NameInMap("ClientPassword")
    public String clientPassword;

    /**
     * <p>The local username.</p>
     * 
     * <strong>example:</strong>
     * <p>user01</p>
     */
    @NameInMap("ClientUsername")
    public String clientUsername;

    /**
     * <p>The description of the parent platform.</p>
     * 
     * <strong>example:</strong>
     * <p>国标级联修改测试</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The GB ID of the parent platform.</p>
     * 
     * <strong>example:</strong>
     * <p>31000*****2170123451</p>
     */
    @NameInMap("GbId")
    public String gbId;

    /**
     * <p>The ID of the parent platform.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>359*****374-cn-qingdao</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The SIP service IP of the parent platform.</p>
     * 
     * <strong>example:</strong>
     * <p>10.10.10.10</p>
     */
    @NameInMap("Ip")
    public String ip;

    /**
     * <p>The name of the parent platform.</p>
     * 
     * <strong>example:</strong>
     * <p>国标级联修改测试</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The SIP service port of the parent platform.</p>
     * 
     * <strong>example:</strong>
     * <p>5060</p>
     */
    @NameInMap("Port")
    public Long port;

    public static ModifyParentPlatformRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyParentPlatformRequest self = new ModifyParentPlatformRequest();
        return TeaModel.build(map, self);
    }

    public ModifyParentPlatformRequest setAutoStart(Boolean autoStart) {
        this.autoStart = autoStart;
        return this;
    }
    public Boolean getAutoStart() {
        return this.autoStart;
    }

    public ModifyParentPlatformRequest setClientAuth(Boolean clientAuth) {
        this.clientAuth = clientAuth;
        return this;
    }
    public Boolean getClientAuth() {
        return this.clientAuth;
    }

    public ModifyParentPlatformRequest setClientPassword(String clientPassword) {
        this.clientPassword = clientPassword;
        return this;
    }
    public String getClientPassword() {
        return this.clientPassword;
    }

    public ModifyParentPlatformRequest setClientUsername(String clientUsername) {
        this.clientUsername = clientUsername;
        return this;
    }
    public String getClientUsername() {
        return this.clientUsername;
    }

    public ModifyParentPlatformRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyParentPlatformRequest setGbId(String gbId) {
        this.gbId = gbId;
        return this;
    }
    public String getGbId() {
        return this.gbId;
    }

    public ModifyParentPlatformRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ModifyParentPlatformRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public ModifyParentPlatformRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyParentPlatformRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyParentPlatformRequest setPort(Long port) {
        this.port = port;
        return this;
    }
    public Long getPort() {
        return this.port;
    }

}
