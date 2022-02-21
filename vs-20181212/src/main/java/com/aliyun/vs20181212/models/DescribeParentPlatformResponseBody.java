// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeParentPlatformResponseBody extends TeaModel {
    @NameInMap("AutoStart")
    public Boolean autoStart;

    @NameInMap("ClientAuth")
    public Boolean clientAuth;

    @NameInMap("ClientGbId")
    public String clientGbId;

    @NameInMap("ClientIp")
    public String clientIp;

    @NameInMap("ClientPassword")
    public String clientPassword;

    @NameInMap("ClientPort")
    public Long clientPort;

    @NameInMap("ClientUsername")
    public String clientUsername;

    @NameInMap("CreatedTime")
    public String createdTime;

    @NameInMap("Description")
    public String description;

    @NameInMap("GbId")
    public String gbId;

    @NameInMap("Id")
    public String id;

    @NameInMap("Ip")
    public String ip;

    @NameInMap("Name")
    public String name;

    @NameInMap("Port")
    public Long port;

    @NameInMap("Protocol")
    public String protocol;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    public static DescribeParentPlatformResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeParentPlatformResponseBody self = new DescribeParentPlatformResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeParentPlatformResponseBody setAutoStart(Boolean autoStart) {
        this.autoStart = autoStart;
        return this;
    }
    public Boolean getAutoStart() {
        return this.autoStart;
    }

    public DescribeParentPlatformResponseBody setClientAuth(Boolean clientAuth) {
        this.clientAuth = clientAuth;
        return this;
    }
    public Boolean getClientAuth() {
        return this.clientAuth;
    }

    public DescribeParentPlatformResponseBody setClientGbId(String clientGbId) {
        this.clientGbId = clientGbId;
        return this;
    }
    public String getClientGbId() {
        return this.clientGbId;
    }

    public DescribeParentPlatformResponseBody setClientIp(String clientIp) {
        this.clientIp = clientIp;
        return this;
    }
    public String getClientIp() {
        return this.clientIp;
    }

    public DescribeParentPlatformResponseBody setClientPassword(String clientPassword) {
        this.clientPassword = clientPassword;
        return this;
    }
    public String getClientPassword() {
        return this.clientPassword;
    }

    public DescribeParentPlatformResponseBody setClientPort(Long clientPort) {
        this.clientPort = clientPort;
        return this;
    }
    public Long getClientPort() {
        return this.clientPort;
    }

    public DescribeParentPlatformResponseBody setClientUsername(String clientUsername) {
        this.clientUsername = clientUsername;
        return this;
    }
    public String getClientUsername() {
        return this.clientUsername;
    }

    public DescribeParentPlatformResponseBody setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public DescribeParentPlatformResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeParentPlatformResponseBody setGbId(String gbId) {
        this.gbId = gbId;
        return this;
    }
    public String getGbId() {
        return this.gbId;
    }

    public DescribeParentPlatformResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DescribeParentPlatformResponseBody setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public DescribeParentPlatformResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeParentPlatformResponseBody setPort(Long port) {
        this.port = port;
        return this;
    }
    public Long getPort() {
        return this.port;
    }

    public DescribeParentPlatformResponseBody setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public DescribeParentPlatformResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeParentPlatformResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
