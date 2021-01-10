// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DescribeWorkspacesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Workspaces")
    public java.util.List<DescribeWorkspacesResponseBodyWorkspaces> workspaces;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    public static DescribeWorkspacesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWorkspacesResponseBody self = new DescribeWorkspacesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWorkspacesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeWorkspacesResponseBody setWorkspaces(java.util.List<DescribeWorkspacesResponseBodyWorkspaces> workspaces) {
        this.workspaces = workspaces;
        return this;
    }
    public java.util.List<DescribeWorkspacesResponseBodyWorkspaces> getWorkspaces() {
        return this.workspaces;
    }

    public DescribeWorkspacesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public DescribeWorkspacesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class DescribeWorkspacesResponseBodyWorkspaces extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("Zones")
        public java.util.List<String> zones;

        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("Identity")
        public String identity;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("NetworkType")
        public String networkType;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Tenant")
        public String tenant;

        @NameInMap("Region")
        public String region;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public String id;

        public static DescribeWorkspacesResponseBodyWorkspaces build(java.util.Map<String, ?> map) throws Exception {
            DescribeWorkspacesResponseBodyWorkspaces self = new DescribeWorkspacesResponseBodyWorkspaces();
            return TeaModel.build(map, self);
        }

        public DescribeWorkspacesResponseBodyWorkspaces setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeWorkspacesResponseBodyWorkspaces setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public DescribeWorkspacesResponseBodyWorkspaces setZones(java.util.List<String> zones) {
            this.zones = zones;
            return this;
        }
        public java.util.List<String> getZones() {
            return this.zones;
        }

        public DescribeWorkspacesResponseBodyWorkspaces setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public DescribeWorkspacesResponseBodyWorkspaces setIdentity(String identity) {
            this.identity = identity;
            return this;
        }
        public String getIdentity() {
            return this.identity;
        }

        public DescribeWorkspacesResponseBodyWorkspaces setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeWorkspacesResponseBodyWorkspaces setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribeWorkspacesResponseBodyWorkspaces setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeWorkspacesResponseBodyWorkspaces setTenant(String tenant) {
            this.tenant = tenant;
            return this;
        }
        public String getTenant() {
            return this.tenant;
        }

        public DescribeWorkspacesResponseBodyWorkspaces setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeWorkspacesResponseBodyWorkspaces setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeWorkspacesResponseBodyWorkspaces setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
