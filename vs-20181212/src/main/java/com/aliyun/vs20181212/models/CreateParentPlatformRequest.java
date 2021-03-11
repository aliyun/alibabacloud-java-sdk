// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class CreateParentPlatformRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ShowLog")
    public String showLog;

    @NameInMap("Name")
    public String name;

    @NameInMap("Description")
    public String description;

    @NameInMap("Protocol")
    public String protocol;

    @NameInMap("GbId")
    public String gbId;

    @NameInMap("Ip")
    public String ip;

    @NameInMap("Port")
    public Long port;

    @NameInMap("ClientAuth")
    public Boolean clientAuth;

    @NameInMap("ClientUsername")
    public String clientUsername;

    @NameInMap("ClientPassword")
    public String clientPassword;

    @NameInMap("AutoStart")
    public Boolean autoStart;

    public static CreateParentPlatformRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateParentPlatformRequest self = new CreateParentPlatformRequest();
        return TeaModel.build(map, self);
    }

    public CreateParentPlatformRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateParentPlatformRequest setShowLog(String showLog) {
        this.showLog = showLog;
        return this;
    }
    public String getShowLog() {
        return this.showLog;
    }

    public CreateParentPlatformRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateParentPlatformRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateParentPlatformRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
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

    public CreateParentPlatformRequest setPort(Long port) {
        this.port = port;
        return this;
    }
    public Long getPort() {
        return this.port;
    }

    public CreateParentPlatformRequest setClientAuth(Boolean clientAuth) {
        this.clientAuth = clientAuth;
        return this;
    }
    public Boolean getClientAuth() {
        return this.clientAuth;
    }

    public CreateParentPlatformRequest setClientUsername(String clientUsername) {
        this.clientUsername = clientUsername;
        return this;
    }
    public String getClientUsername() {
        return this.clientUsername;
    }

    public CreateParentPlatformRequest setClientPassword(String clientPassword) {
        this.clientPassword = clientPassword;
        return this;
    }
    public String getClientPassword() {
        return this.clientPassword;
    }

    public CreateParentPlatformRequest setAutoStart(Boolean autoStart) {
        this.autoStart = autoStart;
        return this;
    }
    public Boolean getAutoStart() {
        return this.autoStart;
    }

}
