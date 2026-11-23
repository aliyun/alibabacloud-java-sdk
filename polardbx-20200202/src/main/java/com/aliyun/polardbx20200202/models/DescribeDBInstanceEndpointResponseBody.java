// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceEndpointResponseBody extends TeaModel {
    /**
     * <p>The monitoring data.</p>
     */
    @NameInMap("Data")
    public DescribeDBInstanceEndpointResponseBodyData data;

    /**
     * <p>The number of entries to return on each page in a paged query. Maximum value: 100. Default value: 10. If you do not specify a value in Settings or the specified value is less than 10, the default value 10 is used for paging. If the specified value is greater than 100, the default value 100 is used.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token used to start the next query.</p>
     * 
     * <strong>example:</strong>
     * <p>xxdds</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>A501A191-BD70-5E50-98A9-C2A486A82****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDBInstanceEndpointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceEndpointResponseBody self = new DescribeDBInstanceEndpointResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceEndpointResponseBody setData(DescribeDBInstanceEndpointResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeDBInstanceEndpointResponseBodyData getData() {
        return this.data;
    }

    public DescribeDBInstanceEndpointResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeDBInstanceEndpointResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeDBInstanceEndpointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDBInstanceEndpointResponseBodyDataItemsEndpoint extends TeaModel {
        /**
         * <p>The address.</p>
         * 
         * <strong>example:</strong>
         * <p>10.21.1.82</p>
         */
        @NameInMap("Address")
        public String address;

        /**
         * <p>The instance type (instance type code).</p>
         * 
         * <strong>example:</strong>
         * <p>mdb.shard.4x.large.d</p>
         */
        @NameInMap("Class")
        public String _class;

        /**
         * <p>The ID of the endpoint group to which the endpoint belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("EndpointGroupId")
        public Long endpointGroupId;

        /**
         * <p>The ID of the logical node.</p>
         * 
         * <strong>example:</strong>
         * <p>2899</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>Indicates whether the vSwitch is the default vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("IsDefault")
        public Boolean isDefault;

        /**
         * <p>The payload type. Valid values: <code>agentTurn</code> (agent conversation) and <code>systemEvent</code> (system event).</p>
         * 
         * <strong>example:</strong>
         * <p>instance</p>
         */
        @NameInMap("Kind")
        public String kind;

        /**
         * <p>The network type of the connection string. Valid values:</p>
         * <ul>
         * <li><strong>Public</strong>: public network address.</li>
         * <li><strong>Private</strong>: private network address.</li>
         * <li><strong>Inner</strong>: private network address (classic network).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        @NameInMap("NetType")
        public String netType;

        /**
         * <p>The read/write type. Valid values: ReadWrite (row store read/write) and ColumnarRead (column store read-only).</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ReadType")
        public String readType;

        /**
         * <p>The object name.</p>
         * 
         * <strong>example:</strong>
         * <p>sas-app</p>
         */
        @NameInMap("TargetName")
        public String targetName;

        /**
         * <p>The tunnel ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3522367</p>
         */
        @NameInMap("TunnelId")
        public Long tunnelId;

        /**
         * <p>The instance type. Valid values:</p>
         * <ul>
         * <li><strong>ReadWrite</strong>: primary instance.</li>
         * <li><strong>ReadOnly</strong>: read-only instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TXT</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>Indicates whether the endpoint is visible to users.</p>
         */
        @NameInMap("UserVisible")
        public Boolean userVisible;

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-2ze51hh6s8tsjgy19g5eu</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The IP address of the Anti-DDoS instance protected by the policy.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://100.100.100.200/latest/meta-data">http://100.100.100.200/latest/meta-data</a></p>
         */
        @NameInMap("Vip")
        public String vip;

        /**
         * <p>The ID of the VPC where the endpoint resides.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1s9j8s4h4uqejp9k2z3</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The VIP port, such as 80, 8080, or 443.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Vport")
        public Long vport;

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p><code>curl uUys2ThR.popscan.xaliyun.com</code></p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeDBInstanceEndpointResponseBodyDataItemsEndpoint build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceEndpointResponseBodyDataItemsEndpoint self = new DescribeDBInstanceEndpointResponseBodyDataItemsEndpoint();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceEndpointResponseBodyDataItemsEndpoint setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public DescribeDBInstanceEndpointResponseBodyDataItemsEndpoint set_class(String _class) {
            this._class = _class;
            return this;
        }
        public String get_class() {
            return this._class;
        }

        public DescribeDBInstanceEndpointResponseBodyDataItemsEndpoint setEndpointGroupId(Long endpointGroupId) {
            this.endpointGroupId = endpointGroupId;
            return this;
        }
        public Long getEndpointGroupId() {
            return this.endpointGroupId;
        }

        public DescribeDBInstanceEndpointResponseBodyDataItemsEndpoint setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeDBInstanceEndpointResponseBodyDataItemsEndpoint setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public DescribeDBInstanceEndpointResponseBodyDataItemsEndpoint setKind(String kind) {
            this.kind = kind;
            return this;
        }
        public String getKind() {
            return this.kind;
        }

        public DescribeDBInstanceEndpointResponseBodyDataItemsEndpoint setNetType(String netType) {
            this.netType = netType;
            return this;
        }
        public String getNetType() {
            return this.netType;
        }

        public DescribeDBInstanceEndpointResponseBodyDataItemsEndpoint setReadType(String readType) {
            this.readType = readType;
            return this;
        }
        public String getReadType() {
            return this.readType;
        }

        public DescribeDBInstanceEndpointResponseBodyDataItemsEndpoint setTargetName(String targetName) {
            this.targetName = targetName;
            return this;
        }
        public String getTargetName() {
            return this.targetName;
        }

        public DescribeDBInstanceEndpointResponseBodyDataItemsEndpoint setTunnelId(Long tunnelId) {
            this.tunnelId = tunnelId;
            return this;
        }
        public Long getTunnelId() {
            return this.tunnelId;
        }

        public DescribeDBInstanceEndpointResponseBodyDataItemsEndpoint setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeDBInstanceEndpointResponseBodyDataItemsEndpoint setUserVisible(Boolean userVisible) {
            this.userVisible = userVisible;
            return this;
        }
        public Boolean getUserVisible() {
            return this.userVisible;
        }

        public DescribeDBInstanceEndpointResponseBodyDataItemsEndpoint setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeDBInstanceEndpointResponseBodyDataItemsEndpoint setVip(String vip) {
            this.vip = vip;
            return this;
        }
        public String getVip() {
            return this.vip;
        }

        public DescribeDBInstanceEndpointResponseBodyDataItemsEndpoint setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeDBInstanceEndpointResponseBodyDataItemsEndpoint setVport(Long vport) {
            this.vport = vport;
            return this;
        }
        public Long getVport() {
            return this.vport;
        }

        public DescribeDBInstanceEndpointResponseBodyDataItemsEndpoint setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeDBInstanceEndpointResponseBodyDataItemsRealServer extends TeaModel {
        /**
         * <p>Indicates whether the node is enabled. In the compute layer, only nodes in the primary zone are enabled. After a primary/secondary switchover is performed on the instance, the secondary node in the compute layer is switched to the primary node. All nodes in the storage layer are enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        @NameInMap("Activated")
        public Boolean activated;

        /**
         * <p>The instance type (instance type code).</p>
         * 
         * <strong>example:</strong>
         * <p>dds.cs.mid</p>
         */
        @NameInMap("Class")
        public String _class;

        /**
         * <p>The IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>172.29.32.166</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The connection port number.</p>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The replica ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("ReplicaId")
        public Long replicaId;

        /**
         * <p>The weight of the destination route.</p>
         * <ul>
         * <li>For VPN gateway instances that support the dual-tunnel mode for IPsec-VPN connections, the default weight of the destination route is <strong>100</strong>, which has no actual significance.</li>
         * <li>For VPN gateway instances that support the single-tunnel mode for IPsec-VPN connections, the weight of the destination route indicates the priority of the destination route:<ul>
         * <li><strong>100</strong>: high priority. If multiple destination routes have the same destination CIDR block, the IPsec-VPN connection associated with this destination route serves as the primary link.</li>
         * <li><strong>0</strong>: low priority. If multiple destination routes have the same destination CIDR block, the IPsec-VPN connection associated with this destination route serves as the secondary link.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("Weight")
        public Long weight;

        public static DescribeDBInstanceEndpointResponseBodyDataItemsRealServer build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceEndpointResponseBodyDataItemsRealServer self = new DescribeDBInstanceEndpointResponseBodyDataItemsRealServer();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceEndpointResponseBodyDataItemsRealServer setActivated(Boolean activated) {
            this.activated = activated;
            return this;
        }
        public Boolean getActivated() {
            return this.activated;
        }

        public DescribeDBInstanceEndpointResponseBodyDataItemsRealServer set_class(String _class) {
            this._class = _class;
            return this;
        }
        public String get_class() {
            return this._class;
        }

        public DescribeDBInstanceEndpointResponseBodyDataItemsRealServer setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeDBInstanceEndpointResponseBodyDataItemsRealServer setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeDBInstanceEndpointResponseBodyDataItemsRealServer setReplicaId(Long replicaId) {
            this.replicaId = replicaId;
            return this;
        }
        public Long getReplicaId() {
            return this.replicaId;
        }

        public DescribeDBInstanceEndpointResponseBodyDataItemsRealServer setWeight(Long weight) {
            this.weight = weight;
            return this;
        }
        public Long getWeight() {
            return this.weight;
        }

    }

    public static class DescribeDBInstanceEndpointResponseBodyDataItems extends TeaModel {
        /**
         * <p>The endpoint of the instance.</p>
         */
        @NameInMap("Endpoint")
        public DescribeDBInstanceEndpointResponseBodyDataItemsEndpoint endpoint;

        /**
         * <p>The addresses of the origin server.</p>
         */
        @NameInMap("RealServer")
        public java.util.List<DescribeDBInstanceEndpointResponseBodyDataItemsRealServer> realServer;

        public static DescribeDBInstanceEndpointResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceEndpointResponseBodyDataItems self = new DescribeDBInstanceEndpointResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceEndpointResponseBodyDataItems setEndpoint(DescribeDBInstanceEndpointResponseBodyDataItemsEndpoint endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public DescribeDBInstanceEndpointResponseBodyDataItemsEndpoint getEndpoint() {
            return this.endpoint;
        }

        public DescribeDBInstanceEndpointResponseBodyDataItems setRealServer(java.util.List<DescribeDBInstanceEndpointResponseBodyDataItemsRealServer> realServer) {
            this.realServer = realServer;
            return this;
        }
        public java.util.List<DescribeDBInstanceEndpointResponseBodyDataItemsRealServer> getRealServer() {
            return this.realServer;
        }

    }

    public static class DescribeDBInstanceEndpointResponseBodyData extends TeaModel {
        /**
         * <p>The internal connection method. Fixed value: 1, which indicates the classic network.</p>
         */
        @NameInMap("Items")
        public java.util.List<DescribeDBInstanceEndpointResponseBodyDataItems> items;

        public static DescribeDBInstanceEndpointResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceEndpointResponseBodyData self = new DescribeDBInstanceEndpointResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceEndpointResponseBodyData setItems(java.util.List<DescribeDBInstanceEndpointResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<DescribeDBInstanceEndpointResponseBodyDataItems> getItems() {
            return this.items;
        }

    }

}
