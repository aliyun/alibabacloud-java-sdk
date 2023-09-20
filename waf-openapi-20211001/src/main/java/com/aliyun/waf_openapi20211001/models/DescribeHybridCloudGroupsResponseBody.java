// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeHybridCloudGroupsResponseBody extends TeaModel {
    /**
     * <p>The hybrid cloud node groups.</p>
     */
    @NameInMap("Groups")
    public java.util.List<DescribeHybridCloudGroupsResponseBodyGroups> groups;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeHybridCloudGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHybridCloudGroupsResponseBody self = new DescribeHybridCloudGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHybridCloudGroupsResponseBody setGroups(java.util.List<DescribeHybridCloudGroupsResponseBodyGroups> groups) {
        this.groups = groups;
        return this;
    }
    public java.util.List<DescribeHybridCloudGroupsResponseBodyGroups> getGroups() {
        return this.groups;
    }

    public DescribeHybridCloudGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeHybridCloudGroupsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeHybridCloudGroupsResponseBodyGroups extends TeaModel {
        @NameInMap("BackSourceMark")
        public String backSourceMark;

        @NameInMap("ContinentsValue")
        public Integer continentsValue;

        /**
         * <p>The ID of the hybrid cloud node group.</p>
         */
        @NameInMap("GroupId")
        public Integer groupId;

        /**
         * <p>The name of the hybrid cloud node group.</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The type of the hybrid cloud node group. Valid values:</p>
         * <br>
         * <p>*   **protect**</p>
         * <p>*   **control**</p>
         * <p>*   **storage**</p>
         * <p>*   **controlStorage**</p>
         */
        @NameInMap("GroupType")
        public String groupType;

        /**
         * <p>The IP address of the server for load balancing.</p>
         */
        @NameInMap("LoadBalanceIp")
        public String loadBalanceIp;

        /**
         * <p>The ID of the protection node.</p>
         */
        @NameInMap("LocationId")
        public Long locationId;

        @NameInMap("OperatorValue")
        public Integer operatorValue;

        /**
         * <p>The port that is used by the hybrid cloud cluster. The value of this parameter is a string. If multiple ports are returned, the value is in the **port1,port2,port3** format.</p>
         */
        @NameInMap("Ports")
        public String ports;

        @NameInMap("RegionCodeValue")
        public Integer regionCodeValue;

        /**
         * <p>The description of the hybrid cloud node group.</p>
         */
        @NameInMap("Remark")
        public String remark;

        public static DescribeHybridCloudGroupsResponseBodyGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeHybridCloudGroupsResponseBodyGroups self = new DescribeHybridCloudGroupsResponseBodyGroups();
            return TeaModel.build(map, self);
        }

        public DescribeHybridCloudGroupsResponseBodyGroups setBackSourceMark(String backSourceMark) {
            this.backSourceMark = backSourceMark;
            return this;
        }
        public String getBackSourceMark() {
            return this.backSourceMark;
        }

        public DescribeHybridCloudGroupsResponseBodyGroups setContinentsValue(Integer continentsValue) {
            this.continentsValue = continentsValue;
            return this;
        }
        public Integer getContinentsValue() {
            return this.continentsValue;
        }

        public DescribeHybridCloudGroupsResponseBodyGroups setGroupId(Integer groupId) {
            this.groupId = groupId;
            return this;
        }
        public Integer getGroupId() {
            return this.groupId;
        }

        public DescribeHybridCloudGroupsResponseBodyGroups setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeHybridCloudGroupsResponseBodyGroups setGroupType(String groupType) {
            this.groupType = groupType;
            return this;
        }
        public String getGroupType() {
            return this.groupType;
        }

        public DescribeHybridCloudGroupsResponseBodyGroups setLoadBalanceIp(String loadBalanceIp) {
            this.loadBalanceIp = loadBalanceIp;
            return this;
        }
        public String getLoadBalanceIp() {
            return this.loadBalanceIp;
        }

        public DescribeHybridCloudGroupsResponseBodyGroups setLocationId(Long locationId) {
            this.locationId = locationId;
            return this;
        }
        public Long getLocationId() {
            return this.locationId;
        }

        public DescribeHybridCloudGroupsResponseBodyGroups setOperatorValue(Integer operatorValue) {
            this.operatorValue = operatorValue;
            return this;
        }
        public Integer getOperatorValue() {
            return this.operatorValue;
        }

        public DescribeHybridCloudGroupsResponseBodyGroups setPorts(String ports) {
            this.ports = ports;
            return this;
        }
        public String getPorts() {
            return this.ports;
        }

        public DescribeHybridCloudGroupsResponseBodyGroups setRegionCodeValue(Integer regionCodeValue) {
            this.regionCodeValue = regionCodeValue;
            return this;
        }
        public Integer getRegionCodeValue() {
            return this.regionCodeValue;
        }

        public DescribeHybridCloudGroupsResponseBodyGroups setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

    }

}
