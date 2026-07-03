// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeSupabaseInstancesResponseBody extends TeaModel {
    /**
     * <p>The details of the access denial.</p>
     */
    @NameInMap("AccessDeniedDetail")
    public DescribeSupabaseInstancesResponseBodyAccessDeniedDetail accessDeniedDetail;

    /**
     * <p>The paginated result of the instance list.</p>
     */
    @NameInMap("Data")
    public DescribeSupabaseInstancesResponseBodyData data;

    /**
     * <p>The maximum number of entries per page for a paged query. Maximum value: 100. Default value: If you do not specify this parameter or specify a value less than 10, the default value is 10. If you specify a value greater than 100, the default value is 100.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token for the next query.</p>
     * 
     * <strong>example:</strong>
     * <p>xxdds</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C457B28E-9CAB-4B77-B5C6-5D71B7870B6E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeSupabaseInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSupabaseInstancesResponseBody self = new DescribeSupabaseInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSupabaseInstancesResponseBody setAccessDeniedDetail(DescribeSupabaseInstancesResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public DescribeSupabaseInstancesResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public DescribeSupabaseInstancesResponseBody setData(DescribeSupabaseInstancesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeSupabaseInstancesResponseBodyData getData() {
        return this.data;
    }

    public DescribeSupabaseInstancesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeSupabaseInstancesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeSupabaseInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeSupabaseInstancesResponseBodyAccessDeniedDetail extends TeaModel {
        /**
         * <p>The authentication action.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("AuthAction")
        public String authAction;

        /**
         * <p>The display name of the authentication principal.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("AuthPrincipalDisplayName")
        public String authPrincipalDisplayName;

        /**
         * <p>The owner ID of the authentication principal.</p>
         * 
         * <strong>example:</strong>
         * <p>111</p>
         */
        @NameInMap("AuthPrincipalOwnerId")
        public String authPrincipalOwnerId;

        /**
         * <p>The authentication principal type.</p>
         * 
         * <strong>example:</strong>
         * <p>222</p>
         */
        @NameInMap("AuthPrincipalType")
        public String authPrincipalType;

        /**
         * <p>The encoded diagnostic message.</p>
         * 
         * <strong>example:</strong>
         * <p>AQEAAAAAacnceTlBNjlFODgyLTlBMDUtNUUyRC04MzE5LUQwMzZDRjJFQTM3NA==</p>
         */
        @NameInMap("EncodedDiagnosticMessage")
        public String encodedDiagnosticMessage;

        /**
         * <p>The type of the permission denial.</p>
         * 
         * <strong>example:</strong>
         * <p>ImplicitDeny</p>
         */
        @NameInMap("NoPermissionType")
        public String noPermissionType;

        /**
         * <p>The policy type.</p>
         * 
         * <strong>example:</strong>
         * <p>System</p>
         */
        @NameInMap("PolicyType")
        public String policyType;

        public static DescribeSupabaseInstancesResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeSupabaseInstancesResponseBodyAccessDeniedDetail self = new DescribeSupabaseInstancesResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public DescribeSupabaseInstancesResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public DescribeSupabaseInstancesResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public DescribeSupabaseInstancesResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public DescribeSupabaseInstancesResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public DescribeSupabaseInstancesResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public DescribeSupabaseInstancesResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public DescribeSupabaseInstancesResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class DescribeSupabaseInstancesResponseBodyDataInstances extends TeaModel {
        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-06-08T07:19:05.000+0000</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>pxsp-jinwusp30</p>
         */
        @NameInMap("DBInstanceName")
        public String DBInstanceName;

        /**
         * <p>The instance description.</p>
         * 
         * <strong>example:</strong>
         * <p>我的 Supabase 项目</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The instance status.</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The Supabase specification code.</p>
         * 
         * <strong>example:</strong>
         * <p>polarx.supabase.x4.2xlarge</p>
         */
        @NameInMap("SupabaseClassCode")
        public String supabaseClassCode;

        /**
         * <p>The multi-tenant mode.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        @NameInMap("TenantMode")
        public Boolean tenantMode;

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing-i</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeSupabaseInstancesResponseBodyDataInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeSupabaseInstancesResponseBodyDataInstances self = new DescribeSupabaseInstancesResponseBodyDataInstances();
            return TeaModel.build(map, self);
        }

        public DescribeSupabaseInstancesResponseBodyDataInstances setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeSupabaseInstancesResponseBodyDataInstances setDBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

        public DescribeSupabaseInstancesResponseBodyDataInstances setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeSupabaseInstancesResponseBodyDataInstances setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeSupabaseInstancesResponseBodyDataInstances setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeSupabaseInstancesResponseBodyDataInstances setSupabaseClassCode(String supabaseClassCode) {
            this.supabaseClassCode = supabaseClassCode;
            return this;
        }
        public String getSupabaseClassCode() {
            return this.supabaseClassCode;
        }

        public DescribeSupabaseInstancesResponseBodyDataInstances setTenantMode(Boolean tenantMode) {
            this.tenantMode = tenantMode;
            return this;
        }
        public Boolean getTenantMode() {
            return this.tenantMode;
        }

        public DescribeSupabaseInstancesResponseBodyDataInstances setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeSupabaseInstancesResponseBodyData extends TeaModel {
        /**
         * <p>The list of instances.</p>
         */
        @NameInMap("Instances")
        public java.util.List<DescribeSupabaseInstancesResponseBodyDataInstances> instances;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalNumber")
        public Integer totalNumber;

        public static DescribeSupabaseInstancesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeSupabaseInstancesResponseBodyData self = new DescribeSupabaseInstancesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeSupabaseInstancesResponseBodyData setInstances(java.util.List<DescribeSupabaseInstancesResponseBodyDataInstances> instances) {
            this.instances = instances;
            return this;
        }
        public java.util.List<DescribeSupabaseInstancesResponseBodyDataInstances> getInstances() {
            return this.instances;
        }

        public DescribeSupabaseInstancesResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public DescribeSupabaseInstancesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeSupabaseInstancesResponseBodyData setTotalNumber(Integer totalNumber) {
            this.totalNumber = totalNumber;
            return this;
        }
        public Integer getTotalNumber() {
            return this.totalNumber;
        }

    }

}
