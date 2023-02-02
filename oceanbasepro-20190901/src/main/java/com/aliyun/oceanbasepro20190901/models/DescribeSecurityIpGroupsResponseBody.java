// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeSecurityIpGroupsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information of the IP address whitelist group.</p>
     */
    @NameInMap("SecurityIpGroups")
    public java.util.List<DescribeSecurityIpGroupsResponseBodySecurityIpGroups> securityIpGroups;

    /**
     * <p>The number of whitelist groups returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeSecurityIpGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecurityIpGroupsResponseBody self = new DescribeSecurityIpGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSecurityIpGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSecurityIpGroupsResponseBody setSecurityIpGroups(java.util.List<DescribeSecurityIpGroupsResponseBodySecurityIpGroups> securityIpGroups) {
        this.securityIpGroups = securityIpGroups;
        return this;
    }
    public java.util.List<DescribeSecurityIpGroupsResponseBodySecurityIpGroups> getSecurityIpGroups() {
        return this.securityIpGroups;
    }

    public DescribeSecurityIpGroupsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeSecurityIpGroupsResponseBodySecurityIpGroups extends TeaModel {
        /**
         * <p>The name of the security group.</p>
         */
        @NameInMap("SecurityIpGroupName")
        public String securityIpGroupName;

        /**
         * <p>The list of IP addresses and CIDR blocks in the whitelist.   </p>
         * <p>It is a JSON array. Each object in the array is an IP address or CIDR block.</p>
         */
        @NameInMap("SecurityIps")
        public String securityIps;

        public static DescribeSecurityIpGroupsResponseBodySecurityIpGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityIpGroupsResponseBodySecurityIpGroups self = new DescribeSecurityIpGroupsResponseBodySecurityIpGroups();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityIpGroupsResponseBodySecurityIpGroups setSecurityIpGroupName(String securityIpGroupName) {
            this.securityIpGroupName = securityIpGroupName;
            return this;
        }
        public String getSecurityIpGroupName() {
            return this.securityIpGroupName;
        }

        public DescribeSecurityIpGroupsResponseBodySecurityIpGroups setSecurityIps(String securityIps) {
            this.securityIps = securityIps;
            return this;
        }
        public String getSecurityIps() {
            return this.securityIps;
        }

    }

}
