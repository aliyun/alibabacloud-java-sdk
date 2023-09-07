// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeGlobalSecurityIPGroupRelationResponseBody extends TeaModel {
    /**
     * <p>The ID of cluster.</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The details of the global IP whitelist template.</p>
     */
    @NameInMap("GlobalSecurityIPGroupRel")
    public java.util.List<DescribeGlobalSecurityIPGroupRelationResponseBodyGlobalSecurityIPGroupRel> globalSecurityIPGroupRel;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeGlobalSecurityIPGroupRelationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGlobalSecurityIPGroupRelationResponseBody self = new DescribeGlobalSecurityIPGroupRelationResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGlobalSecurityIPGroupRelationResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeGlobalSecurityIPGroupRelationResponseBody setGlobalSecurityIPGroupRel(java.util.List<DescribeGlobalSecurityIPGroupRelationResponseBodyGlobalSecurityIPGroupRel> globalSecurityIPGroupRel) {
        this.globalSecurityIPGroupRel = globalSecurityIPGroupRel;
        return this;
    }
    public java.util.List<DescribeGlobalSecurityIPGroupRelationResponseBodyGlobalSecurityIPGroupRel> getGlobalSecurityIPGroupRel() {
        return this.globalSecurityIPGroupRel;
    }

    public DescribeGlobalSecurityIPGroupRelationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeGlobalSecurityIPGroupRelationResponseBodyGlobalSecurityIPGroupRel extends TeaModel {
        /**
         * <p>The IP address in the global IP whitelist template.</p>
         * <br>
         * <p>>  Separate multiple IP addresses with commas (,). You can add up to 1,000 IP addresses or CIDR blocks to all IP whitelists.</p>
         */
        @NameInMap("GIpList")
        public String GIpList;

        /**
         * <p>The name of the global IP whitelist template. The name must meet the following requirements:</p>
         * <br>
         * <p>*   The name can contain lowercase letters, digits, and underscores (\_).</p>
         * <p>*   The name must start with a letter and end with a letter or a digit.</p>
         * <p>*   The name must be 2 to 120 characters in length.</p>
         */
        @NameInMap("GlobalIgName")
        public String globalIgName;

        /**
         * <p>The ID of the global IP whitelist template.</p>
         */
        @NameInMap("GlobalSecurityGroupId")
        public String globalSecurityGroupId;

        /**
         * <p>The ID of the region.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        public static DescribeGlobalSecurityIPGroupRelationResponseBodyGlobalSecurityIPGroupRel build(java.util.Map<String, ?> map) throws Exception {
            DescribeGlobalSecurityIPGroupRelationResponseBodyGlobalSecurityIPGroupRel self = new DescribeGlobalSecurityIPGroupRelationResponseBodyGlobalSecurityIPGroupRel();
            return TeaModel.build(map, self);
        }

        public DescribeGlobalSecurityIPGroupRelationResponseBodyGlobalSecurityIPGroupRel setGIpList(String GIpList) {
            this.GIpList = GIpList;
            return this;
        }
        public String getGIpList() {
            return this.GIpList;
        }

        public DescribeGlobalSecurityIPGroupRelationResponseBodyGlobalSecurityIPGroupRel setGlobalIgName(String globalIgName) {
            this.globalIgName = globalIgName;
            return this;
        }
        public String getGlobalIgName() {
            return this.globalIgName;
        }

        public DescribeGlobalSecurityIPGroupRelationResponseBodyGlobalSecurityIPGroupRel setGlobalSecurityGroupId(String globalSecurityGroupId) {
            this.globalSecurityGroupId = globalSecurityGroupId;
            return this;
        }
        public String getGlobalSecurityGroupId() {
            return this.globalSecurityGroupId;
        }

        public DescribeGlobalSecurityIPGroupRelationResponseBodyGlobalSecurityIPGroupRel setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
