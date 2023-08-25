// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeTenantSecurityIpGroupsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of the whitelist groups.</p>
     */
    @NameInMap("SecurityIpGroups")
    public java.util.List<DescribeTenantSecurityIpGroupsResponseBodySecurityIpGroups> securityIpGroups;

    /**
     * <p>The total number of the whitelist groups.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeTenantSecurityIpGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTenantSecurityIpGroupsResponseBody self = new DescribeTenantSecurityIpGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTenantSecurityIpGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTenantSecurityIpGroupsResponseBody setSecurityIpGroups(java.util.List<DescribeTenantSecurityIpGroupsResponseBodySecurityIpGroups> securityIpGroups) {
        this.securityIpGroups = securityIpGroups;
        return this;
    }
    public java.util.List<DescribeTenantSecurityIpGroupsResponseBodySecurityIpGroups> getSecurityIpGroups() {
        return this.securityIpGroups;
    }

    public DescribeTenantSecurityIpGroupsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeTenantSecurityIpGroupsResponseBodySecurityIpGroups extends TeaModel {
        /**
         * <p>The group name.</p>
         */
        @NameInMap("SecurityIpGroupName")
        public String securityIpGroupName;

        /**
         * <p>The whitelist group type.</p>
         * <p>- instance: the whitelist group from the cluster.</p>
         * <p>- tenant: the whitelist group of the current tenant.</p>
         */
        @NameInMap("SecurityIpGroupType")
        public String securityIpGroupType;

        /**
         * <p>The whitelist of IP addresses. It is a string separated by commas, and each object is an IP string or a CIDR block.</p>
         */
        @NameInMap("SecurityIps")
        public String securityIps;

        /**
         * <p>The ID of the tenant.</p>
         */
        @NameInMap("TenantId")
        public String tenantId;

        public static DescribeTenantSecurityIpGroupsResponseBodySecurityIpGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeTenantSecurityIpGroupsResponseBodySecurityIpGroups self = new DescribeTenantSecurityIpGroupsResponseBodySecurityIpGroups();
            return TeaModel.build(map, self);
        }

        public DescribeTenantSecurityIpGroupsResponseBodySecurityIpGroups setSecurityIpGroupName(String securityIpGroupName) {
            this.securityIpGroupName = securityIpGroupName;
            return this;
        }
        public String getSecurityIpGroupName() {
            return this.securityIpGroupName;
        }

        public DescribeTenantSecurityIpGroupsResponseBodySecurityIpGroups setSecurityIpGroupType(String securityIpGroupType) {
            this.securityIpGroupType = securityIpGroupType;
            return this;
        }
        public String getSecurityIpGroupType() {
            return this.securityIpGroupType;
        }

        public DescribeTenantSecurityIpGroupsResponseBodySecurityIpGroups setSecurityIps(String securityIps) {
            this.securityIps = securityIps;
            return this;
        }
        public String getSecurityIps() {
            return this.securityIps;
        }

        public DescribeTenantSecurityIpGroupsResponseBodySecurityIpGroups setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
