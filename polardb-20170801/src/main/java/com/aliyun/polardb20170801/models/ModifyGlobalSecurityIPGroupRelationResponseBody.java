// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyGlobalSecurityIPGroupRelationResponseBody extends TeaModel {
    /**
     * <p>The ID of the cluster.</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The details of the global IP whitelist template.</p>
     */
    @NameInMap("GlobalSecurityIPGroupRel")
    public java.util.List<ModifyGlobalSecurityIPGroupRelationResponseBodyGlobalSecurityIPGroupRel> globalSecurityIPGroupRel;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyGlobalSecurityIPGroupRelationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyGlobalSecurityIPGroupRelationResponseBody self = new ModifyGlobalSecurityIPGroupRelationResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyGlobalSecurityIPGroupRelationResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyGlobalSecurityIPGroupRelationResponseBody setGlobalSecurityIPGroupRel(java.util.List<ModifyGlobalSecurityIPGroupRelationResponseBodyGlobalSecurityIPGroupRel> globalSecurityIPGroupRel) {
        this.globalSecurityIPGroupRel = globalSecurityIPGroupRel;
        return this;
    }
    public java.util.List<ModifyGlobalSecurityIPGroupRelationResponseBodyGlobalSecurityIPGroupRel> getGlobalSecurityIPGroupRel() {
        return this.globalSecurityIPGroupRel;
    }

    public ModifyGlobalSecurityIPGroupRelationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ModifyGlobalSecurityIPGroupRelationResponseBodyGlobalSecurityIPGroupRel extends TeaModel {
        /**
         * <p>The IP address in the whitelist template.</p>
         * <br>
         * <p>>  Separate multiple IP addresses with commas (,). You can add up to 1,000 IP addresses or CIDR blocks to all IP whitelists.</p>
         */
        @NameInMap("GIpList")
        public String GIpList;

        /**
         * <p>The name of the IP whitelist template. The name must meet the following requirements:</p>
         * <br>
         * <p>*   The name can contain lowercase letters, digits, and underscores (_).</p>
         * <p>*   The name must start with a letter and end with a letter or a digit.</p>
         * <p>*   The name must be 2 to 120 characters in length.</p>
         */
        @NameInMap("GlobalIgName")
        public String globalIgName;

        /**
         * <p>The ID of the IP whitelist template.</p>
         */
        @NameInMap("GlobalSecurityGroupId")
        public String globalSecurityGroupId;

        /**
         * <p>The ID of the region.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        public static ModifyGlobalSecurityIPGroupRelationResponseBodyGlobalSecurityIPGroupRel build(java.util.Map<String, ?> map) throws Exception {
            ModifyGlobalSecurityIPGroupRelationResponseBodyGlobalSecurityIPGroupRel self = new ModifyGlobalSecurityIPGroupRelationResponseBodyGlobalSecurityIPGroupRel();
            return TeaModel.build(map, self);
        }

        public ModifyGlobalSecurityIPGroupRelationResponseBodyGlobalSecurityIPGroupRel setGIpList(String GIpList) {
            this.GIpList = GIpList;
            return this;
        }
        public String getGIpList() {
            return this.GIpList;
        }

        public ModifyGlobalSecurityIPGroupRelationResponseBodyGlobalSecurityIPGroupRel setGlobalIgName(String globalIgName) {
            this.globalIgName = globalIgName;
            return this;
        }
        public String getGlobalIgName() {
            return this.globalIgName;
        }

        public ModifyGlobalSecurityIPGroupRelationResponseBodyGlobalSecurityIPGroupRel setGlobalSecurityGroupId(String globalSecurityGroupId) {
            this.globalSecurityGroupId = globalSecurityGroupId;
            return this;
        }
        public String getGlobalSecurityGroupId() {
            return this.globalSecurityGroupId;
        }

        public ModifyGlobalSecurityIPGroupRelationResponseBodyGlobalSecurityIPGroupRel setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
