// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeSecurityIpGroupsResponseBody extends TeaModel {
    // 请求ID。
    @NameInMap("RequestId")
    public String requestId;

    // IP白名单分组信息。
    @NameInMap("SecurityIpGroups")
    public java.util.List<DescribeSecurityIpGroupsResponseBodySecurityIpGroups> securityIpGroups;

    // 查询到的白名单分组个数。
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
        // 安全组名称。
        @NameInMap("SecurityIpGroupName")
        public String securityIpGroupName;

        // IP安全白名单列表。其为一个Json格式的数组，数组中每个对象为一个IP字符串或者IP段。
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
