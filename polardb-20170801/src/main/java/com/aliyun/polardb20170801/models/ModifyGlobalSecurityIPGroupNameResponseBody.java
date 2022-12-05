// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyGlobalSecurityIPGroupNameResponseBody extends TeaModel {
    @NameInMap("GlobalSecurityIPGroup")
    public java.util.List<ModifyGlobalSecurityIPGroupNameResponseBodyGlobalSecurityIPGroup> globalSecurityIPGroup;

    @NameInMap("RequestId")
    public String requestId;

    public static ModifyGlobalSecurityIPGroupNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyGlobalSecurityIPGroupNameResponseBody self = new ModifyGlobalSecurityIPGroupNameResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyGlobalSecurityIPGroupNameResponseBody setGlobalSecurityIPGroup(java.util.List<ModifyGlobalSecurityIPGroupNameResponseBodyGlobalSecurityIPGroup> globalSecurityIPGroup) {
        this.globalSecurityIPGroup = globalSecurityIPGroup;
        return this;
    }
    public java.util.List<ModifyGlobalSecurityIPGroupNameResponseBodyGlobalSecurityIPGroup> getGlobalSecurityIPGroup() {
        return this.globalSecurityIPGroup;
    }

    public ModifyGlobalSecurityIPGroupNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ModifyGlobalSecurityIPGroupNameResponseBodyGlobalSecurityIPGroup extends TeaModel {
        @NameInMap("GIpList")
        public String GIpList;

        @NameInMap("GlobalIgName")
        public String globalIgName;

        @NameInMap("GlobalSecurityGroupId")
        public String globalSecurityGroupId;

        @NameInMap("RegionId")
        public String regionId;

        public static ModifyGlobalSecurityIPGroupNameResponseBodyGlobalSecurityIPGroup build(java.util.Map<String, ?> map) throws Exception {
            ModifyGlobalSecurityIPGroupNameResponseBodyGlobalSecurityIPGroup self = new ModifyGlobalSecurityIPGroupNameResponseBodyGlobalSecurityIPGroup();
            return TeaModel.build(map, self);
        }

        public ModifyGlobalSecurityIPGroupNameResponseBodyGlobalSecurityIPGroup setGIpList(String GIpList) {
            this.GIpList = GIpList;
            return this;
        }
        public String getGIpList() {
            return this.GIpList;
        }

        public ModifyGlobalSecurityIPGroupNameResponseBodyGlobalSecurityIPGroup setGlobalIgName(String globalIgName) {
            this.globalIgName = globalIgName;
            return this;
        }
        public String getGlobalIgName() {
            return this.globalIgName;
        }

        public ModifyGlobalSecurityIPGroupNameResponseBodyGlobalSecurityIPGroup setGlobalSecurityGroupId(String globalSecurityGroupId) {
            this.globalSecurityGroupId = globalSecurityGroupId;
            return this;
        }
        public String getGlobalSecurityGroupId() {
            return this.globalSecurityGroupId;
        }

        public ModifyGlobalSecurityIPGroupNameResponseBodyGlobalSecurityIPGroup setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
