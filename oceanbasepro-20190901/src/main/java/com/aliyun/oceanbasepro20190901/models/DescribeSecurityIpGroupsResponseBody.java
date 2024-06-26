// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeSecurityIpGroupsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EE205C00-30E4-XXXX-XXXX-87E3A8A2AA0C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SecurityIpGroups")
    public java.util.List<DescribeSecurityIpGroupsResponseBodySecurityIpGroups> securityIpGroups;

    /**
     * <p>Example 1</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
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
         * <strong>example:</strong>
         * <p>online_paycore</p>
         */
        @NameInMap("SecurityIpGroupName")
        public String securityIpGroupName;

        /**
         * <strong>example:</strong>
         * <p>121.41.106.33,100.104.7.0/26</p>
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
