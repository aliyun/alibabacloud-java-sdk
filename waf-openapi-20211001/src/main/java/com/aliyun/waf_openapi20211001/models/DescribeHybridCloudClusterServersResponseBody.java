// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeHybridCloudClusterServersResponseBody extends TeaModel {
    /**
     * <p>The servers in the hybrid cloud cluster.</p>
     */
    @NameInMap("ClusterServers")
    public java.util.List<DescribeHybridCloudClusterServersResponseBodyClusterServers> clusterServers;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C3B0FDD2-11CE-59A5-BEB5-*****1A969</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeHybridCloudClusterServersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHybridCloudClusterServersResponseBody self = new DescribeHybridCloudClusterServersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHybridCloudClusterServersResponseBody setClusterServers(java.util.List<DescribeHybridCloudClusterServersResponseBodyClusterServers> clusterServers) {
        this.clusterServers = clusterServers;
        return this;
    }
    public java.util.List<DescribeHybridCloudClusterServersResponseBodyClusterServers> getClusterServers() {
        return this.clusterServers;
    }

    public DescribeHybridCloudClusterServersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeHybridCloudClusterServersResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeHybridCloudClusterServersResponseBodyClusterServers extends TeaModel {
        /**
         * <p>The continent identifier of the server, such as <code>asiapacific</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>asiapacific</p>
         */
        @NameInMap("Continents")
        public String continents;

        /**
         * <p>The continent code of the protection cluster.</p>
         * <blockquote>
         * <p>For a list of valid codes, see the supplementary description of response parameters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>410</p>
         */
        @NameInMap("ContinentsValue")
        public Integer continentsValue;

        /**
         * <p>The number of CPU cores of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Cpu")
        public Integer cpu;

        /**
         * <p>The time when the server was created. This value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1665987186000</p>
         */
        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        /**
         * <p>The custom name of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>测试组</p>
         */
        @NameInMap("CustomName")
        public String customName;

        /**
         * <p>The ID of the node group.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("GroupId")
        public Long groupId;

        /**
         * <p>The name of the node group.</p>
         * 
         * <strong>example:</strong>
         * <p>测试组。</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The type of the hybrid cloud node group. Valid values:</p>
         * <ul>
         * <li><p><strong>protect</strong>: protection.</p>
         * </li>
         * <li><p><strong>control</strong>: control.</p>
         * </li>
         * <li><p><strong>storage</strong>: storage.</p>
         * </li>
         * <li><p><strong>controlStorage</strong>: control and storage.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>protect</p>
         */
        @NameInMap("GroupType")
        public String groupType;

        /**
         * <p>The hostname of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>qsh5-sec-waf-*****-6</p>
         */
        @NameInMap("HostName")
        public String hostName;

        /**
         * <p>The IP address of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>1.*.*1。</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The running status of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("JobStatus")
        public String jobStatus;

        /**
         * <p>The MAC address of the server.</p>
         * 
         * <strong>example:</strong>
         * <p><strong>:</strong>:00:02:eb:c7</p>
         */
        @NameInMap("Mac")
        public String mac;

        /**
         * <p>The memory size of the server. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>33547386880</p>
         */
        @NameInMap("Memory")
        public Long memory;

        /**
         * <p>The machine ID (MID) of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>28ab688cd403563e8e173*****79600</p>
         */
        @NameInMap("Mid")
        public String mid;

        /**
         * <p>The cloud service provider where the server resides.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun。</p>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <p>The carrier code of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("OperatorValue")
        public Integer operatorValue;

        /**
         * <p>The region identifier of the server, such as <code>beijing</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>beijing</p>
         */
        @NameInMap("RegionCode")
        public String regionCode;

        /**
         * <p>The numeric code of the region where the server resides.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RegionCodeValue")
        public Integer regionCodeValue;

        /**
         * <p>The health status of the server in the hybrid cloud cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The time when the server was last updated. This value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1711953897000</p>
         */
        @NameInMap("UpdateTimestamp")
        public Long updateTimestamp;

        public static DescribeHybridCloudClusterServersResponseBodyClusterServers build(java.util.Map<String, ?> map) throws Exception {
            DescribeHybridCloudClusterServersResponseBodyClusterServers self = new DescribeHybridCloudClusterServersResponseBodyClusterServers();
            return TeaModel.build(map, self);
        }

        public DescribeHybridCloudClusterServersResponseBodyClusterServers setContinents(String continents) {
            this.continents = continents;
            return this;
        }
        public String getContinents() {
            return this.continents;
        }

        public DescribeHybridCloudClusterServersResponseBodyClusterServers setContinentsValue(Integer continentsValue) {
            this.continentsValue = continentsValue;
            return this;
        }
        public Integer getContinentsValue() {
            return this.continentsValue;
        }

        public DescribeHybridCloudClusterServersResponseBodyClusterServers setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public DescribeHybridCloudClusterServersResponseBodyClusterServers setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public DescribeHybridCloudClusterServersResponseBodyClusterServers setCustomName(String customName) {
            this.customName = customName;
            return this;
        }
        public String getCustomName() {
            return this.customName;
        }

        public DescribeHybridCloudClusterServersResponseBodyClusterServers setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

        public DescribeHybridCloudClusterServersResponseBodyClusterServers setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeHybridCloudClusterServersResponseBodyClusterServers setGroupType(String groupType) {
            this.groupType = groupType;
            return this;
        }
        public String getGroupType() {
            return this.groupType;
        }

        public DescribeHybridCloudClusterServersResponseBodyClusterServers setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public DescribeHybridCloudClusterServersResponseBodyClusterServers setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeHybridCloudClusterServersResponseBodyClusterServers setJobStatus(String jobStatus) {
            this.jobStatus = jobStatus;
            return this;
        }
        public String getJobStatus() {
            return this.jobStatus;
        }

        public DescribeHybridCloudClusterServersResponseBodyClusterServers setMac(String mac) {
            this.mac = mac;
            return this;
        }
        public String getMac() {
            return this.mac;
        }

        public DescribeHybridCloudClusterServersResponseBodyClusterServers setMemory(Long memory) {
            this.memory = memory;
            return this;
        }
        public Long getMemory() {
            return this.memory;
        }

        public DescribeHybridCloudClusterServersResponseBodyClusterServers setMid(String mid) {
            this.mid = mid;
            return this;
        }
        public String getMid() {
            return this.mid;
        }

        public DescribeHybridCloudClusterServersResponseBodyClusterServers setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public DescribeHybridCloudClusterServersResponseBodyClusterServers setOperatorValue(Integer operatorValue) {
            this.operatorValue = operatorValue;
            return this;
        }
        public Integer getOperatorValue() {
            return this.operatorValue;
        }

        public DescribeHybridCloudClusterServersResponseBodyClusterServers setRegionCode(String regionCode) {
            this.regionCode = regionCode;
            return this;
        }
        public String getRegionCode() {
            return this.regionCode;
        }

        public DescribeHybridCloudClusterServersResponseBodyClusterServers setRegionCodeValue(Integer regionCodeValue) {
            this.regionCodeValue = regionCodeValue;
            return this;
        }
        public Integer getRegionCodeValue() {
            return this.regionCodeValue;
        }

        public DescribeHybridCloudClusterServersResponseBodyClusterServers setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeHybridCloudClusterServersResponseBodyClusterServers setUpdateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }
        public Long getUpdateTimestamp() {
            return this.updateTimestamp;
        }

    }

}
