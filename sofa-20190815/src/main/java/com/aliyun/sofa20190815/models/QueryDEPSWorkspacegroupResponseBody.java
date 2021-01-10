// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryDEPSWorkspacegroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("WorkspaceGroups")
    public java.util.List<QueryDEPSWorkspacegroupResponseBodyWorkspaceGroups> workspaceGroups;

    public static QueryDEPSWorkspacegroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDEPSWorkspacegroupResponseBody self = new QueryDEPSWorkspacegroupResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDEPSWorkspacegroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDEPSWorkspacegroupResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDEPSWorkspacegroupResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryDEPSWorkspacegroupResponseBody setWorkspaceGroups(java.util.List<QueryDEPSWorkspacegroupResponseBodyWorkspaceGroups> workspaceGroups) {
        this.workspaceGroups = workspaceGroups;
        return this;
    }
    public java.util.List<QueryDEPSWorkspacegroupResponseBodyWorkspaceGroups> getWorkspaceGroups() {
        return this.workspaceGroups;
    }

    public static class QueryDEPSWorkspacegroupResponseBodyWorkspaceGroupsWorkspaces extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Id")
        public String id;

        @NameInMap("Identity")
        public String identity;

        @NameInMap("Name")
        public String name;

        @NameInMap("NetworkType")
        public String networkType;

        @NameInMap("Region")
        public String region;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Tenant")
        public String tenant;

        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("Zones")
        public java.util.List<String> zones;

        public static QueryDEPSWorkspacegroupResponseBodyWorkspaceGroupsWorkspaces build(java.util.Map<String, ?> map) throws Exception {
            QueryDEPSWorkspacegroupResponseBodyWorkspaceGroupsWorkspaces self = new QueryDEPSWorkspacegroupResponseBodyWorkspaceGroupsWorkspaces();
            return TeaModel.build(map, self);
        }

        public QueryDEPSWorkspacegroupResponseBodyWorkspaceGroupsWorkspaces setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryDEPSWorkspacegroupResponseBodyWorkspaceGroupsWorkspaces setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryDEPSWorkspacegroupResponseBodyWorkspaceGroupsWorkspaces setIdentity(String identity) {
            this.identity = identity;
            return this;
        }
        public String getIdentity() {
            return this.identity;
        }

        public QueryDEPSWorkspacegroupResponseBodyWorkspaceGroupsWorkspaces setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryDEPSWorkspacegroupResponseBodyWorkspaceGroupsWorkspaces setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public QueryDEPSWorkspacegroupResponseBodyWorkspaceGroupsWorkspaces setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public QueryDEPSWorkspacegroupResponseBodyWorkspaceGroupsWorkspaces setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public QueryDEPSWorkspacegroupResponseBodyWorkspaceGroupsWorkspaces setTenant(String tenant) {
            this.tenant = tenant;
            return this;
        }
        public String getTenant() {
            return this.tenant;
        }

        public QueryDEPSWorkspacegroupResponseBodyWorkspaceGroupsWorkspaces setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public QueryDEPSWorkspacegroupResponseBodyWorkspaceGroupsWorkspaces setZones(java.util.List<String> zones) {
            this.zones = zones;
            return this;
        }
        public java.util.List<String> getZones() {
            return this.zones;
        }

    }

    public static class QueryDEPSWorkspacegroupResponseBodyWorkspaceGroups extends TeaModel {
        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("DeployMode")
        public String deployMode;

        @NameInMap("DomainSuffix")
        public String domainSuffix;

        @NameInMap("Id")
        public String id;

        @NameInMap("Identity")
        public String identity;

        @NameInMap("MasterWorkspaceId")
        public String masterWorkspaceId;

        @NameInMap("MasterWorkspaceIdentity")
        public String masterWorkspaceIdentity;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("Name")
        public String name;

        @NameInMap("Workspaces")
        public java.util.List<QueryDEPSWorkspacegroupResponseBodyWorkspaceGroupsWorkspaces> workspaces;

        public static QueryDEPSWorkspacegroupResponseBodyWorkspaceGroups build(java.util.Map<String, ?> map) throws Exception {
            QueryDEPSWorkspacegroupResponseBodyWorkspaceGroups self = new QueryDEPSWorkspacegroupResponseBodyWorkspaceGroups();
            return TeaModel.build(map, self);
        }

        public QueryDEPSWorkspacegroupResponseBodyWorkspaceGroups setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public QueryDEPSWorkspacegroupResponseBodyWorkspaceGroups setDeployMode(String deployMode) {
            this.deployMode = deployMode;
            return this;
        }
        public String getDeployMode() {
            return this.deployMode;
        }

        public QueryDEPSWorkspacegroupResponseBodyWorkspaceGroups setDomainSuffix(String domainSuffix) {
            this.domainSuffix = domainSuffix;
            return this;
        }
        public String getDomainSuffix() {
            return this.domainSuffix;
        }

        public QueryDEPSWorkspacegroupResponseBodyWorkspaceGroups setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryDEPSWorkspacegroupResponseBodyWorkspaceGroups setIdentity(String identity) {
            this.identity = identity;
            return this;
        }
        public String getIdentity() {
            return this.identity;
        }

        public QueryDEPSWorkspacegroupResponseBodyWorkspaceGroups setMasterWorkspaceId(String masterWorkspaceId) {
            this.masterWorkspaceId = masterWorkspaceId;
            return this;
        }
        public String getMasterWorkspaceId() {
            return this.masterWorkspaceId;
        }

        public QueryDEPSWorkspacegroupResponseBodyWorkspaceGroups setMasterWorkspaceIdentity(String masterWorkspaceIdentity) {
            this.masterWorkspaceIdentity = masterWorkspaceIdentity;
            return this;
        }
        public String getMasterWorkspaceIdentity() {
            return this.masterWorkspaceIdentity;
        }

        public QueryDEPSWorkspacegroupResponseBodyWorkspaceGroups setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public QueryDEPSWorkspacegroupResponseBodyWorkspaceGroups setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryDEPSWorkspacegroupResponseBodyWorkspaceGroups setWorkspaces(java.util.List<QueryDEPSWorkspacegroupResponseBodyWorkspaceGroupsWorkspaces> workspaces) {
            this.workspaces = workspaces;
            return this;
        }
        public java.util.List<QueryDEPSWorkspacegroupResponseBodyWorkspaceGroupsWorkspaces> getWorkspaces() {
            return this.workspaces;
        }

    }

}
