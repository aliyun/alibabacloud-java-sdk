// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyGlobalSecurityIPGroupResponseBody extends TeaModel {
    @NameInMap("GlobalSecurityIPGroup")
    public java.util.List<ModifyGlobalSecurityIPGroupResponseBodyGlobalSecurityIPGroup> globalSecurityIPGroup;

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
        @NameInMap("DBInstances")
        public java.util.List<String> DBInstances;

        @NameInMap("GIpList")
        public String GIpList;

        @NameInMap("GlobalIgName")
        public String globalIgName;

        @NameInMap("GlobalSecurityGroupId")
        public String globalSecurityGroupId;

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
