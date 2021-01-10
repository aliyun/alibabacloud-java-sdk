// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DescribeWorkspaceGroupsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("WorkspaceGroups")
    public java.util.List<DescribeWorkspaceGroupsResponseBodyWorkspaceGroups> workspaceGroups;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    public static DescribeWorkspaceGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWorkspaceGroupsResponseBody self = new DescribeWorkspaceGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWorkspaceGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeWorkspaceGroupsResponseBody setWorkspaceGroups(java.util.List<DescribeWorkspaceGroupsResponseBodyWorkspaceGroups> workspaceGroups) {
        this.workspaceGroups = workspaceGroups;
        return this;
    }
    public java.util.List<DescribeWorkspaceGroupsResponseBodyWorkspaceGroups> getWorkspaceGroups() {
        return this.workspaceGroups;
    }

    public DescribeWorkspaceGroupsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public DescribeWorkspaceGroupsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class DescribeWorkspaceGroupsResponseBodyWorkspaceGroupsWorkspaces extends TeaModel {
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

        public static DescribeWorkspaceGroupsResponseBodyWorkspaceGroupsWorkspaces build(java.util.Map<String, ?> map) throws Exception {
            DescribeWorkspaceGroupsResponseBodyWorkspaceGroupsWorkspaces self = new DescribeWorkspaceGroupsResponseBodyWorkspaceGroupsWorkspaces();
            return TeaModel.build(map, self);
        }

        public DescribeWorkspaceGroupsResponseBodyWorkspaceGroupsWorkspaces setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeWorkspaceGroupsResponseBodyWorkspaceGroupsWorkspaces setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public DescribeWorkspaceGroupsResponseBodyWorkspaceGroupsWorkspaces setZones(java.util.List<String> zones) {
            this.zones = zones;
            return this;
        }
        public java.util.List<String> getZones() {
            return this.zones;
        }

        public DescribeWorkspaceGroupsResponseBodyWorkspaceGroupsWorkspaces setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public DescribeWorkspaceGroupsResponseBodyWorkspaceGroupsWorkspaces setIdentity(String identity) {
            this.identity = identity;
            return this;
        }
        public String getIdentity() {
            return this.identity;
        }

        public DescribeWorkspaceGroupsResponseBodyWorkspaceGroupsWorkspaces setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeWorkspaceGroupsResponseBodyWorkspaceGroupsWorkspaces setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribeWorkspaceGroupsResponseBodyWorkspaceGroupsWorkspaces setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeWorkspaceGroupsResponseBodyWorkspaceGroupsWorkspaces setTenant(String tenant) {
            this.tenant = tenant;
            return this;
        }
        public String getTenant() {
            return this.tenant;
        }

        public DescribeWorkspaceGroupsResponseBodyWorkspaceGroupsWorkspaces setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeWorkspaceGroupsResponseBodyWorkspaceGroupsWorkspaces setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeWorkspaceGroupsResponseBodyWorkspaceGroupsWorkspaces setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class DescribeWorkspaceGroupsResponseBodyWorkspaceGroups extends TeaModel {
        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("Workspaces")
        public java.util.List<DescribeWorkspaceGroupsResponseBodyWorkspaceGroupsWorkspaces> workspaces;

        @NameInMap("MasterWorkspaceId")
        public String masterWorkspaceId;

        @NameInMap("Identity")
        public String identity;

        @NameInMap("TenantName")
        public String tenantName;

        @NameInMap("DomainSuffix")
        public String domainSuffix;

        @NameInMap("MasterWorkspaceIdentity")
        public String masterWorkspaceIdentity;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("ReleaseMode")
        public String releaseMode;

        @NameInMap("Name")
        public String name;

        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("Id")
        public String id;

        public static DescribeWorkspaceGroupsResponseBodyWorkspaceGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeWorkspaceGroupsResponseBodyWorkspaceGroups self = new DescribeWorkspaceGroupsResponseBodyWorkspaceGroups();
            return TeaModel.build(map, self);
        }

        public DescribeWorkspaceGroupsResponseBodyWorkspaceGroups setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public DescribeWorkspaceGroupsResponseBodyWorkspaceGroups setWorkspaces(java.util.List<DescribeWorkspaceGroupsResponseBodyWorkspaceGroupsWorkspaces> workspaces) {
            this.workspaces = workspaces;
            return this;
        }
        public java.util.List<DescribeWorkspaceGroupsResponseBodyWorkspaceGroupsWorkspaces> getWorkspaces() {
            return this.workspaces;
        }

        public DescribeWorkspaceGroupsResponseBodyWorkspaceGroups setMasterWorkspaceId(String masterWorkspaceId) {
            this.masterWorkspaceId = masterWorkspaceId;
            return this;
        }
        public String getMasterWorkspaceId() {
            return this.masterWorkspaceId;
        }

        public DescribeWorkspaceGroupsResponseBodyWorkspaceGroups setIdentity(String identity) {
            this.identity = identity;
            return this;
        }
        public String getIdentity() {
            return this.identity;
        }

        public DescribeWorkspaceGroupsResponseBodyWorkspaceGroups setTenantName(String tenantName) {
            this.tenantName = tenantName;
            return this;
        }
        public String getTenantName() {
            return this.tenantName;
        }

        public DescribeWorkspaceGroupsResponseBodyWorkspaceGroups setDomainSuffix(String domainSuffix) {
            this.domainSuffix = domainSuffix;
            return this;
        }
        public String getDomainSuffix() {
            return this.domainSuffix;
        }

        public DescribeWorkspaceGroupsResponseBodyWorkspaceGroups setMasterWorkspaceIdentity(String masterWorkspaceIdentity) {
            this.masterWorkspaceIdentity = masterWorkspaceIdentity;
            return this;
        }
        public String getMasterWorkspaceIdentity() {
            return this.masterWorkspaceIdentity;
        }

        public DescribeWorkspaceGroupsResponseBodyWorkspaceGroups setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public DescribeWorkspaceGroupsResponseBodyWorkspaceGroups setReleaseMode(String releaseMode) {
            this.releaseMode = releaseMode;
            return this;
        }
        public String getReleaseMode() {
            return this.releaseMode;
        }

        public DescribeWorkspaceGroupsResponseBodyWorkspaceGroups setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeWorkspaceGroupsResponseBodyWorkspaceGroups setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public DescribeWorkspaceGroupsResponseBodyWorkspaceGroups setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
