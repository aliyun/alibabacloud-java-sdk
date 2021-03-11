// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeParentPlatformResponseBody extends TeaModel {
    @NameInMap("Status")
    public String status;

    @NameInMap("ClientGbId")
    public String clientGbId;

    @NameInMap("Description")
    public String description;

    @NameInMap("CreatedTime")
    public String createdTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Ip")
    public String ip;

    @NameInMap("Port")
    public Long port;

    @NameInMap("ClientPort")
    public Long clientPort;

    @NameInMap("ClientAuth")
    public Boolean clientAuth;

    @NameInMap("ClientIp")
    public String clientIp;

    @NameInMap("Name")
    public String name;

    @NameInMap("GbId")
    public String gbId;

    @NameInMap("ClientPassword")
    public String clientPassword;

    @NameInMap("Id")
    public String id;

    @NameInMap("Protocol")
    public String protocol;

    @NameInMap("AutoStart")
    public Boolean autoStart;

    @NameInMap("ClientUsername")
    public String clientUsername;

    public static DescribeParentPlatformResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeParentPlatformResponseBody self = new DescribeParentPlatformResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeParentPlatformResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeParentPlatformResponseBody setClientGbId(String clientGbId) {
        this.clientGbId = clientGbId;
        return this;
    }
    public String getClientGbId() {
        return this.clientGbId;
    }

    public DescribeParentPlatformResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeParentPlatformResponseBody setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public DescribeParentPlatformResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeParentPlatformResponseBody setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public DescribeParentPlatformResponseBody setPort(Long port) {
        this.port = port;
        return this;
    }
    public Long getPort() {
        return this.port;
    }

    public DescribeParentPlatformResponseBody setClientPort(Long clientPort) {
        this.clientPort = clientPort;
        return this;
    }
    public Long getClientPort() {
        return this.clientPort;
    }

    public DescribeParentPlatformResponseBody setClientAuth(Boolean clientAuth) {
        this.clientAuth = clientAuth;
        return this;
    }
    public Boolean getClientAuth() {
        return this.clientAuth;
    }

    public DescribeParentPlatformResponseBody setClientIp(String clientIp) {
        this.clientIp = clientIp;
        return this;
    }
    public String getClientIp() {
        return this.clientIp;
    }

    public DescribeParentPlatformResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeParentPlatformResponseBody setGbId(String gbId) {
        this.gbId = gbId;
        return this;
    }
    public String getGbId() {
        return this.gbId;
    }

    public DescribeParentPlatformResponseBody setClientPassword(String clientPassword) {
        this.clientPassword = clientPassword;
        return this;
    }
    public String getClientPassword() {
        return this.clientPassword;
    }

    public DescribeParentPlatformResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DescribeParentPlatformResponseBody setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public DescribeParentPlatformResponseBody setAutoStart(Boolean autoStart) {
        this.autoStart = autoStart;
        return this;
    }
    public Boolean getAutoStart() {
        return this.autoStart;
    }

    public DescribeParentPlatformResponseBody setClientUsername(String clientUsername) {
        this.clientUsername = clientUsername;
        return this;
    }
    public String getClientUsername() {
        return this.clientUsername;
    }

}
