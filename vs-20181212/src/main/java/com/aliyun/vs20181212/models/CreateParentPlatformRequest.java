// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class CreateParentPlatformRequest extends TeaModel {
    @NameInMap("AutoStart")
    public Boolean autoStart;

    @NameInMap("ClientAuth")
    public Boolean clientAuth;

    @NameInMap("ClientPassword")
    public String clientPassword;

    @NameInMap("ClientUsername")
    public String clientUsername;

    @NameInMap("Description")
    public String description;

    @NameInMap("GbId")
    public String gbId;

    @NameInMap("Ip")
    public String ip;

    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("Port")
    public Long port;

    @NameInMap("Protocol")
    public String protocol;

    public static CreateParentPlatformRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateParentPlatformRequest self = new CreateParentPlatformRequest();
        return TeaModel.build(map, self);
    }

    public CreateParentPlatformRequest setAutoStart(Boolean autoStart) {
        this.autoStart = autoStart;
        return this;
    }
    public Boolean getAutoStart() {
        return this.autoStart;
    }

    public CreateParentPlatformRequest setClientAuth(Boolean clientAuth) {
        this.clientAuth = clientAuth;
        return this;
    }
    public Boolean getClientAuth() {
        return this.clientAuth;
    }

    public CreateParentPlatformRequest setClientPassword(String clientPassword) {
        this.clientPassword = clientPassword;
        return this;
    }
    public String getClientPassword() {
        return this.clientPassword;
    }

    public CreateParentPlatformRequest setClientUsername(String clientUsername) {
        this.clientUsername = clientUsername;
        return this;
    }
    public String getClientUsername() {
        return this.clientUsername;
    }

    public CreateParentPlatformRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateParentPlatformRequest setGbId(String gbId) {
        this.gbId = gbId;
        return this;
    }
    public String getGbId() {
        return this.gbId;
    }

    public CreateParentPlatformRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public CreateParentPlatformRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateParentPlatformRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateParentPlatformRequest setPort(Long port) {
        this.port = port;
        return this;
    }
    public Long getPort() {
        return this.port;
    }

    public CreateParentPlatformRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

}
