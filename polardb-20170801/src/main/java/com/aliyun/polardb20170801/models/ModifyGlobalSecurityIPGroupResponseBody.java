// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyGlobalSecurityIPGroupResponseBody extends TeaModel {
    /**
     * <p>The details of the global IP whitelist template.</p>
     */
    @NameInMap("GlobalSecurityIPGroup")
    public java.util.List<ModifyGlobalSecurityIPGroupResponseBodyGlobalSecurityIPGroup> globalSecurityIPGroup;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyGlobalSecurityIPGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyGlobalSecurityIPGroupResponseBody self = new ModifyGlobalSecurityIPGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyGlobalSecurityIPGroupResponseBody setGlobalSecurityIPGroup(java.util.List<ModifyGlobalSecurityIPGroupResponseBodyGlobalSecurityIPGroup> globalSecurityIPGroup) {
        this.globalSecurityIPGroup = globalSecurityIPGroup;
        return this;
    }
    public java.util.List<ModifyGlobalSecurityIPGroupResponseBodyGlobalSecurityIPGroup> getGlobalSecurityIPGroup() {
        return this.globalSecurityIPGroup;
    }

    public ModifyGlobalSecurityIPGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ModifyGlobalSecurityIPGroupResponseBodyGlobalSecurityIPGroup extends TeaModel {
        /**
         * <p>The clusters that are associated with the IP address whitelist template.</p>
         */
        @NameInMap("DBInstances")
        public java.util.List<String> DBInstances;

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
         * <p>*   The name can contain lowercase letters, digits, and underscores (\_).</p>
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

        public static ModifyGlobalSecurityIPGroupResponseBodyGlobalSecurityIPGroup build(java.util.Map<String, ?> map) throws Exception {
            ModifyGlobalSecurityIPGroupResponseBodyGlobalSecurityIPGroup self = new ModifyGlobalSecurityIPGroupResponseBodyGlobalSecurityIPGroup();
            return TeaModel.build(map, self);
        }

        public ModifyGlobalSecurityIPGroupResponseBodyGlobalSecurityIPGroup setDBInstances(java.util.List<String> DBInstances) {
            this.DBInstances = DBInstances;
            return this;
        }
        public java.util.List<String> getDBInstances() {
            return this.DBInstances;
        }

        public ModifyGlobalSecurityIPGroupResponseBodyGlobalSecurityIPGroup setGIpList(String GIpList) {
            this.GIpList = GIpList;
            return this;
        }
        public String getGIpList() {
            return this.GIpList;
        }

        public ModifyGlobalSecurityIPGroupResponseBodyGlobalSecurityIPGroup setGlobalIgName(String globalIgName) {
            this.globalIgName = globalIgName;
            return this;
        }
        public String getGlobalIgName() {
            return this.globalIgName;
        }

        public ModifyGlobalSecurityIPGroupResponseBodyGlobalSecurityIPGroup setGlobalSecurityGroupId(String globalSecurityGroupId) {
            this.globalSecurityGroupId = globalSecurityGroupId;
            return this;
        }
        public String getGlobalSecurityGroupId() {
            return this.globalSecurityGroupId;
        }

        public ModifyGlobalSecurityIPGroupResponseBodyGlobalSecurityIPGroup setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
