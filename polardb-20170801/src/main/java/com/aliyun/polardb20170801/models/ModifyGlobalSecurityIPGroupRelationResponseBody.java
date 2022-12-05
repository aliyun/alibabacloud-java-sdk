// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyGlobalSecurityIPGroupRelationResponseBody extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("GlobalSecurityIPGroupRel")
    public java.util.List<ModifyGlobalSecurityIPGroupRelationResponseBodyGlobalSecurityIPGroupRel> globalSecurityIPGroupRel;

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
        @NameInMap("GIpList")
        public String GIpList;

        @NameInMap("GlobalIgName")
        public String globalIgName;

        @NameInMap("GlobalSecurityGroupId")
        public String globalSecurityGroupId;

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
