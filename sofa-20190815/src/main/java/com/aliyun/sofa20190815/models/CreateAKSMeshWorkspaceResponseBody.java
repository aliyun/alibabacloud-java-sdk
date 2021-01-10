// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateAKSMeshWorkspaceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("Workspace")
    public CreateAKSMeshWorkspaceResponseBodyWorkspace workspace;

    public static CreateAKSMeshWorkspaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAKSMeshWorkspaceResponseBody self = new CreateAKSMeshWorkspaceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAKSMeshWorkspaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAKSMeshWorkspaceResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CreateAKSMeshWorkspaceResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateAKSMeshWorkspaceResponseBody setWorkspace(CreateAKSMeshWorkspaceResponseBodyWorkspace workspace) {
        this.workspace = workspace;
        return this;
    }
    public CreateAKSMeshWorkspaceResponseBodyWorkspace getWorkspace() {
        return this.workspace;
    }

    public static class CreateAKSMeshWorkspaceResponseBodyWorkspace extends TeaModel {
        @NameInMap("Tenant")
        public String tenant;

        @NameInMap("NetworkType")
        public String networkType;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public String id;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ZoneIds")
        public String zoneIds;

        public static CreateAKSMeshWorkspaceResponseBodyWorkspace build(java.util.Map<String, ?> map) throws Exception {
            CreateAKSMeshWorkspaceResponseBodyWorkspace self = new CreateAKSMeshWorkspaceResponseBodyWorkspace();
            return TeaModel.build(map, self);
        }

        public CreateAKSMeshWorkspaceResponseBodyWorkspace setTenant(String tenant) {
            this.tenant = tenant;
            return this;
        }
        public String getTenant() {
            return this.tenant;
        }

        public CreateAKSMeshWorkspaceResponseBodyWorkspace setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public CreateAKSMeshWorkspaceResponseBodyWorkspace setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateAKSMeshWorkspaceResponseBodyWorkspace setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateAKSMeshWorkspaceResponseBodyWorkspace setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public CreateAKSMeshWorkspaceResponseBodyWorkspace setZoneIds(String zoneIds) {
            this.zoneIds = zoneIds;
            return this;
        }
        public String getZoneIds() {
            return this.zoneIds;
        }

    }

}
