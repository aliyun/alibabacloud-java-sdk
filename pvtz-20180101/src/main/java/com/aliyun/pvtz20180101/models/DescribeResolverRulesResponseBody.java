// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribeResolverRulesResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The unique request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A10E03D7-808C-422D-9144-F8586C2E2297</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of forwarding rules.</p>
     */
    @NameInMap("Rules")
    public java.util.List<DescribeResolverRulesResponseBodyRules> rules;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalItems")
    public Integer totalItems;

    /**
     * <p>The total number of pages.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalPages")
    public Integer totalPages;

    public static DescribeResolverRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeResolverRulesResponseBody self = new DescribeResolverRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeResolverRulesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeResolverRulesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeResolverRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeResolverRulesResponseBody setRules(java.util.List<DescribeResolverRulesResponseBodyRules> rules) {
        this.rules = rules;
        return this;
    }
    public java.util.List<DescribeResolverRulesResponseBodyRules> getRules() {
        return this.rules;
    }

    public DescribeResolverRulesResponseBody setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
        return this;
    }
    public Integer getTotalItems() {
        return this.totalItems;
    }

    public DescribeResolverRulesResponseBody setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public static class DescribeResolverRulesResponseBodyRulesBindEdgeDnsClusters extends TeaModel {
        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("ClusterName")
        public String clusterName;

        @NameInMap("ClusterUserId")
        public Long clusterUserId;

        public static DescribeResolverRulesResponseBodyRulesBindEdgeDnsClusters build(java.util.Map<String, ?> map) throws Exception {
            DescribeResolverRulesResponseBodyRulesBindEdgeDnsClusters self = new DescribeResolverRulesResponseBodyRulesBindEdgeDnsClusters();
            return TeaModel.build(map, self);
        }

        public DescribeResolverRulesResponseBodyRulesBindEdgeDnsClusters setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribeResolverRulesResponseBodyRulesBindEdgeDnsClusters setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public DescribeResolverRulesResponseBodyRulesBindEdgeDnsClusters setClusterUserId(Long clusterUserId) {
            this.clusterUserId = clusterUserId;
            return this;
        }
        public Long getClusterUserId() {
            return this.clusterUserId;
        }

    }

    public static class DescribeResolverRulesResponseBodyRulesBindVpcs extends TeaModel {
        /**
         * <p>The ID of the region where the VPC resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-wulanchabu</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The name of the region where the VPC resides.</p>
         * 
         * <strong>example:</strong>
         * <p>China (Ulanqab)</p>
         */
        @NameInMap("RegionName")
        public String regionName;

        /**
         * <p>The unique ID of the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-0jl96awrjt75ezglc****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The name of the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-name-test</p>
         */
        @NameInMap("VpcName")
        public String vpcName;

        /**
         * <p>The type of the VPC. Valid values:</p>
         * <ul>
         * <li><p>STANDARD: a standard VPC.</p>
         * </li>
         * <li><p>EDS: a workspace VPC of Elastic Desktop Service (EDS).</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>STANDARD</p>
         */
        @NameInMap("VpcType")
        public String vpcType;

        /**
         * <p>The user ID (UID) of the account to which the VPC belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>141339776561****</p>
         */
        @NameInMap("VpcUserId")
        public String vpcUserId;

        public static DescribeResolverRulesResponseBodyRulesBindVpcs build(java.util.Map<String, ?> map) throws Exception {
            DescribeResolverRulesResponseBodyRulesBindVpcs self = new DescribeResolverRulesResponseBodyRulesBindVpcs();
            return TeaModel.build(map, self);
        }

        public DescribeResolverRulesResponseBodyRulesBindVpcs setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeResolverRulesResponseBodyRulesBindVpcs setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

        public DescribeResolverRulesResponseBodyRulesBindVpcs setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeResolverRulesResponseBodyRulesBindVpcs setVpcName(String vpcName) {
            this.vpcName = vpcName;
            return this;
        }
        public String getVpcName() {
            return this.vpcName;
        }

        public DescribeResolverRulesResponseBodyRulesBindVpcs setVpcType(String vpcType) {
            this.vpcType = vpcType;
            return this;
        }
        public String getVpcType() {
            return this.vpcType;
        }

        public DescribeResolverRulesResponseBodyRulesBindVpcs setVpcUserId(String vpcUserId) {
            this.vpcUserId = vpcUserId;
            return this;
        }
        public String getVpcUserId() {
            return this.vpcUserId;
        }

    }

    public static class DescribeResolverRulesResponseBodyRulesForwardIps extends TeaModel {
        /**
         * <p>The destination IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.XX.XX</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The port of the destination IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Port")
        public Integer port;

        public static DescribeResolverRulesResponseBodyRulesForwardIps build(java.util.Map<String, ?> map) throws Exception {
            DescribeResolverRulesResponseBodyRulesForwardIps self = new DescribeResolverRulesResponseBodyRulesForwardIps();
            return TeaModel.build(map, self);
        }

        public DescribeResolverRulesResponseBodyRulesForwardIps setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeResolverRulesResponseBodyRulesForwardIps setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

    }

    public static class DescribeResolverRulesResponseBodyRulesPriorityForwardConfigs extends TeaModel {
        @NameInMap("AlidnsServiceAddresses")
        public java.util.List<String> alidnsServiceAddresses;

        @NameInMap("CustomAddresses")
        public java.util.List<String> customAddresses;

        @NameInMap("EnableStatus")
        public String enableStatus;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("Protocol")
        public String protocol;

        public static DescribeResolverRulesResponseBodyRulesPriorityForwardConfigs build(java.util.Map<String, ?> map) throws Exception {
            DescribeResolverRulesResponseBodyRulesPriorityForwardConfigs self = new DescribeResolverRulesResponseBodyRulesPriorityForwardConfigs();
            return TeaModel.build(map, self);
        }

        public DescribeResolverRulesResponseBodyRulesPriorityForwardConfigs setAlidnsServiceAddresses(java.util.List<String> alidnsServiceAddresses) {
            this.alidnsServiceAddresses = alidnsServiceAddresses;
            return this;
        }
        public java.util.List<String> getAlidnsServiceAddresses() {
            return this.alidnsServiceAddresses;
        }

        public DescribeResolverRulesResponseBodyRulesPriorityForwardConfigs setCustomAddresses(java.util.List<String> customAddresses) {
            this.customAddresses = customAddresses;
            return this;
        }
        public java.util.List<String> getCustomAddresses() {
            return this.customAddresses;
        }

        public DescribeResolverRulesResponseBodyRulesPriorityForwardConfigs setEnableStatus(String enableStatus) {
            this.enableStatus = enableStatus;
            return this;
        }
        public String getEnableStatus() {
            return this.enableStatus;
        }

        public DescribeResolverRulesResponseBodyRulesPriorityForwardConfigs setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public DescribeResolverRulesResponseBodyRulesPriorityForwardConfigs setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

    }

    public static class DescribeResolverRulesResponseBodyRules extends TeaModel {
        @NameInMap("BindEdgeDnsClusters")
        public java.util.List<DescribeResolverRulesResponseBodyRulesBindEdgeDnsClusters> bindEdgeDnsClusters;

        /**
         * <p>The list of associated VPCs.</p>
         */
        @NameInMap("BindVpcs")
        public java.util.List<DescribeResolverRulesResponseBodyRulesBindVpcs> bindVpcs;

        /**
         * <p>The time when the rule was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-07-13 10:51:44</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The UNIX timestamp when the rule was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1594608704000</p>
         */
        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        /**
         * <p>The ID of the endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>hr****</p>
         */
        @NameInMap("EndpointId")
        public String endpointId;

        /**
         * <p>The name of the endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>Endpoint-test</p>
         */
        @NameInMap("EndpointName")
        public String endpointName;

        /**
         * <p>The IP addresses and ports of the destination servers in an external DNS system. DNS query traffic is forwarded to these servers.</p>
         */
        @NameInMap("ForwardIps")
        public java.util.List<DescribeResolverRulesResponseBodyRulesForwardIps> forwardIps;

        /**
         * <p>The ID of the forwarding rule.</p>
         * 
         * <strong>example:</strong>
         * <p>hr****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The name of the forwarding rule.</p>
         * 
         * <strong>example:</strong>
         * <p>Forwarding rule-test</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("PriorityForwardConfigs")
        public java.util.List<DescribeResolverRulesResponseBodyRulesPriorityForwardConfigs> priorityForwardConfigs;

        /**
         * <p>The type of the forwarding rule. Currently, only forwarding to an external IP address is supported. Valid value:</p>
         * <p>OUTBOUND: Forwards DNS requests to an external IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>OUTBOUND</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The time when the rule was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-07-13 10:51:44</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <p>The UNIX timestamp when the rule was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>1594608704000</p>
         */
        @NameInMap("UpdateTimestamp")
        public Long updateTimestamp;

        /**
         * <p>The domain name (zone) for which DNS requests are forwarded.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("ZoneName")
        public String zoneName;

        public static DescribeResolverRulesResponseBodyRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeResolverRulesResponseBodyRules self = new DescribeResolverRulesResponseBodyRules();
            return TeaModel.build(map, self);
        }

        public DescribeResolverRulesResponseBodyRules setBindEdgeDnsClusters(java.util.List<DescribeResolverRulesResponseBodyRulesBindEdgeDnsClusters> bindEdgeDnsClusters) {
            this.bindEdgeDnsClusters = bindEdgeDnsClusters;
            return this;
        }
        public java.util.List<DescribeResolverRulesResponseBodyRulesBindEdgeDnsClusters> getBindEdgeDnsClusters() {
            return this.bindEdgeDnsClusters;
        }

        public DescribeResolverRulesResponseBodyRules setBindVpcs(java.util.List<DescribeResolverRulesResponseBodyRulesBindVpcs> bindVpcs) {
            this.bindVpcs = bindVpcs;
            return this;
        }
        public java.util.List<DescribeResolverRulesResponseBodyRulesBindVpcs> getBindVpcs() {
            return this.bindVpcs;
        }

        public DescribeResolverRulesResponseBodyRules setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeResolverRulesResponseBodyRules setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public DescribeResolverRulesResponseBodyRules setEndpointId(String endpointId) {
            this.endpointId = endpointId;
            return this;
        }
        public String getEndpointId() {
            return this.endpointId;
        }

        public DescribeResolverRulesResponseBodyRules setEndpointName(String endpointName) {
            this.endpointName = endpointName;
            return this;
        }
        public String getEndpointName() {
            return this.endpointName;
        }

        public DescribeResolverRulesResponseBodyRules setForwardIps(java.util.List<DescribeResolverRulesResponseBodyRulesForwardIps> forwardIps) {
            this.forwardIps = forwardIps;
            return this;
        }
        public java.util.List<DescribeResolverRulesResponseBodyRulesForwardIps> getForwardIps() {
            return this.forwardIps;
        }

        public DescribeResolverRulesResponseBodyRules setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeResolverRulesResponseBodyRules setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeResolverRulesResponseBodyRules setPriorityForwardConfigs(java.util.List<DescribeResolverRulesResponseBodyRulesPriorityForwardConfigs> priorityForwardConfigs) {
            this.priorityForwardConfigs = priorityForwardConfigs;
            return this;
        }
        public java.util.List<DescribeResolverRulesResponseBodyRulesPriorityForwardConfigs> getPriorityForwardConfigs() {
            return this.priorityForwardConfigs;
        }

        public DescribeResolverRulesResponseBodyRules setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeResolverRulesResponseBodyRules setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public DescribeResolverRulesResponseBodyRules setUpdateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }
        public Long getUpdateTimestamp() {
            return this.updateTimestamp;
        }

        public DescribeResolverRulesResponseBodyRules setZoneName(String zoneName) {
            this.zoneName = zoneName;
            return this;
        }
        public String getZoneName() {
            return this.zoneName;
        }

    }

}
