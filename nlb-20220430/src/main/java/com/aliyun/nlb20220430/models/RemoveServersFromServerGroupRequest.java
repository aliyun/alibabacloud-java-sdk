// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class RemoveServersFromServerGroupRequest extends TeaModel {
    /**
     * <p>The client token used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token. Ensure that the token is unique among different requests. Only ASCII characters are allowed.</p>
     * <blockquote>
     * <p> If you do not set this parameter, the value of <strong>RequestId</strong> is used.**** The value of <strong>RequestId</strong> is different for each request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: validates the request without performing the operation. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the validation, the corresponding error message is returned. If the request passes the validation, the <code>DryRunOperation</code> error code is returned.</li>
     * <li><strong>false</strong> (default): validates the request and performs the operation. If the request passes the validation, a 2xx HTTP status code is returned and the operation is performed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The ID of the region where the NLB instance is deployed.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/443657.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The server group ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sgp-atstuj3rtoptyui****</p>
     */
    @NameInMap("ServerGroupId")
    public String serverGroupId;

    /**
     * <p>The backend servers. You can specify up to 200 backend servers in each call.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Servers")
    public java.util.List<RemoveServersFromServerGroupRequestServers> servers;

    public static RemoveServersFromServerGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveServersFromServerGroupRequest self = new RemoveServersFromServerGroupRequest();
        return TeaModel.build(map, self);
    }

    public RemoveServersFromServerGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RemoveServersFromServerGroupRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public RemoveServersFromServerGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RemoveServersFromServerGroupRequest setServerGroupId(String serverGroupId) {
        this.serverGroupId = serverGroupId;
        return this;
    }
    public String getServerGroupId() {
        return this.serverGroupId;
    }

    public RemoveServersFromServerGroupRequest setServers(java.util.List<RemoveServersFromServerGroupRequestServers> servers) {
        this.servers = servers;
        return this;
    }
    public java.util.List<RemoveServersFromServerGroupRequestServers> getServers() {
        return this.servers;
    }

    public static class RemoveServersFromServerGroupRequestServers extends TeaModel {
        /**
         * <p>The port that is used by the backend server. Valid values: <strong>0</strong> to <strong>65535</strong>. If you do not set this parameter, the default value <strong>0</strong> is used.</p>
         * 
         * <strong>example:</strong>
         * <p>443</p>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The backend server ID.</p>
         * <ul>
         * <li>If the server group is of the <strong>Instance</strong> type, set this parameter to the IDs of servers of the <strong>Ecs</strong>, <strong>Eni</strong>, or <strong>Eci</strong> type.</li>
         * <li>If the server group is of the <strong>Ip</strong> type, set ServerId to IP addresses.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs-bp67acfmxazb4p****</p>
         */
        @NameInMap("ServerId")
        public String serverId;

        /**
         * <p>The IP addresses of the server. If the server group type is <strong>Ip</strong>, set the ServerId parameter to IP addresses.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.6.6</p>
         */
        @NameInMap("ServerIp")
        public String serverIp;

        /**
         * <p>The type of the backend server. Valid values:</p>
         * <ul>
         * <li><strong>Ecs</strong>: the Elastic Compute Service (ECS) instance</li>
         * <li><strong>Eni</strong>: the elastic network interface (ENI)</li>
         * <li><strong>Eci</strong>: the elastic container instance</li>
         * <li><strong>Ip</strong>: the IP address</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Ecs</p>
         */
        @NameInMap("ServerType")
        public String serverType;

        public static RemoveServersFromServerGroupRequestServers build(java.util.Map<String, ?> map) throws Exception {
            RemoveServersFromServerGroupRequestServers self = new RemoveServersFromServerGroupRequestServers();
            return TeaModel.build(map, self);
        }

        public RemoveServersFromServerGroupRequestServers setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public RemoveServersFromServerGroupRequestServers setServerId(String serverId) {
            this.serverId = serverId;
            return this;
        }
        public String getServerId() {
            return this.serverId;
        }

        public RemoveServersFromServerGroupRequestServers setServerIp(String serverIp) {
            this.serverIp = serverIp;
            return this;
        }
        public String getServerIp() {
            return this.serverIp;
        }

        public RemoveServersFromServerGroupRequestServers setServerType(String serverType) {
            this.serverType = serverType;
            return this;
        }
        public String getServerType() {
            return this.serverType;
        }

    }

}
