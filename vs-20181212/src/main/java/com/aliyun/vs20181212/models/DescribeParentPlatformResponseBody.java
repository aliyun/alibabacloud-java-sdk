// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeParentPlatformResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoStart")
    public Boolean autoStart;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ClientAuth")
    public Boolean clientAuth;

    /**
     * <strong>example:</strong>
     * <p>31010*****317542006</p>
     */
    @NameInMap("ClientGbId")
    public String clientGbId;

    /**
     * <strong>example:</strong>
     * <p>192.168.0.1</p>
     */
    @NameInMap("ClientIp")
    public String clientIp;

    /**
     * <strong>example:</strong>
     * <p>admin123</p>
     */
    @NameInMap("ClientPassword")
    public String clientPassword;

    /**
     * <strong>example:</strong>
     * <p>5160</p>
     */
    @NameInMap("ClientPort")
    public Long clientPort;

    /**
     * <strong>example:</strong>
     * <p>user01</p>
     */
    @NameInMap("ClientUsername")
    public String clientUsername;

    /**
     * <strong>example:</strong>
     * <p>2018-12-10T21:00:00Z</p>
     */
    @NameInMap("CreatedTime")
    public String createdTime;

    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>31000*****2170123451</p>
     */
    @NameInMap("GbId")
    public String gbId;

    /**
     * <strong>example:</strong>
     * <p>359*****374-cn-qingdao</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <strong>example:</strong>
     * <p>10.10.10.10</p>
     */
    @NameInMap("Ip")
    public String ip;

    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>5060</p>
     */
    @NameInMap("Port")
    public Long port;

    /**
     * <strong>example:</strong>
     * <p>gb28181</p>
     */
    @NameInMap("Protocol")
    public String protocol;

    /**
     * <strong>example:</strong>
     * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>on</p>
     */
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
