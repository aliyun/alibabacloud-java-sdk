// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeHybridCloudGroupsResponseBody extends TeaModel {
    /**
     * <p>The node groups.</p>
     */
    @NameInMap("Groups")
    public java.util.List<DescribeHybridCloudGroupsResponseBodyGroups> groups;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>045660E7-C4C6-5CD7-8182-7B337D95****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>146</p>
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
        /**
         * <p>The back-to-origin mark of the protected cluster. The value is in the {ISP name}-{Continent name}-{City name}-{Back-to-origin identifier} format. The back-to-origin identifier is optional.</p>
         * <blockquote>
         * <p> For more information about ISP names, continent names, city names, and back-to-origin identifiers, see the following sections.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>aliyun-asiapacific-beijing-12345678</p>
         */
        @NameInMap("BackSourceMark")
        public String backSourceMark;

        /**
         * <p>The continent code of the protected cluster.</p>
         * <blockquote>
         * <p> For more information about continent codes, see Continent codes in this topic.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>410</p>
         */
        @NameInMap("ContinentsValue")
        public Integer continentsValue;

        /**
         * <p>The ID of the node group.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("GroupId")
        public Integer groupId;

        /**
         * <p>The name of the node group.</p>
         * 
         * <strong>example:</strong>
         * <p>StorageGroup</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The type of the node group. Valid values:</p>
         * <ul>
         * <li><strong>protect</strong></li>
         * <li><strong>control</strong></li>
         * <li><strong>storage</strong></li>
         * <li><strong>controlStorage</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>protect</p>
         */
        @NameInMap("GroupType")
        public String groupType;

        /**
         * <p>The IP address of the server used for load balancing.</p>
         * 
         * <strong>example:</strong>
         * <p>1.1.XX.XX</p>
         */
        @NameInMap("LoadBalanceIp")
        public String loadBalanceIp;

        /**
         * <p>The ID of the protection node.</p>
         * 
         * <strong>example:</strong>
         * <p>1312</p>
         */
        @NameInMap("LocationId")
        public Long locationId;

        /**
         * <p>The ISP code of the protected cluster.</p>
         * <blockquote>
         * <p> For more information about ISP codes, see ISP codes in this topic.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("OperatorValue")
        public Integer operatorValue;

        /**
         * <p>The port that is used by the hybrid cloud cluster. The value of this parameter is a string. If multiple ports are returned, the value is in the <strong>port1,port2,port3</strong> format.</p>
         * 
         * <strong>example:</strong>
         * <p>80,9200,20018</p>
         */
        @NameInMap("Ports")
        public String ports;

        /**
         * <p>The city code of the protected cluster.</p>
         * <blockquote>
         * <p> For more information about city codes, see City codes in this topic.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RegionCodeValue")
        public Integer regionCodeValue;

        /**
         * <p>The description of the node group.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
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
