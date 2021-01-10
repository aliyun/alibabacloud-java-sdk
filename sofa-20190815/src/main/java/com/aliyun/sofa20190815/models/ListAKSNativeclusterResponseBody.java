// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListAKSNativeclusterResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public java.util.List<ListAKSNativeclusterResponseBodyData> data;

    public static ListAKSNativeclusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAKSNativeclusterResponseBody self = new ListAKSNativeclusterResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAKSNativeclusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAKSNativeclusterResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListAKSNativeclusterResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListAKSNativeclusterResponseBody setData(java.util.List<ListAKSNativeclusterResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAKSNativeclusterResponseBodyData> getData() {
        return this.data;
    }

    public static class ListAKSNativeclusterResponseBodyData extends TeaModel {
        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("MasterClusterId")
        public String masterClusterId;

        @NameInMap("MinionClusterId")
        public String minionClusterId;

        @NameInMap("MinionClusterName")
        public String minionClusterName;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RegionName")
        public String regionName;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        @NameInMap("WorkspaceName")
        public String workspaceName;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("ZoneName")
        public String zoneName;

        public static ListAKSNativeclusterResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAKSNativeclusterResponseBodyData self = new ListAKSNativeclusterResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAKSNativeclusterResponseBodyData setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListAKSNativeclusterResponseBodyData setMasterClusterId(String masterClusterId) {
            this.masterClusterId = masterClusterId;
            return this;
        }
        public String getMasterClusterId() {
            return this.masterClusterId;
        }

        public ListAKSNativeclusterResponseBodyData setMinionClusterId(String minionClusterId) {
            this.minionClusterId = minionClusterId;
            return this;
        }
        public String getMinionClusterId() {
            return this.minionClusterId;
        }

        public ListAKSNativeclusterResponseBodyData setMinionClusterName(String minionClusterName) {
            this.minionClusterName = minionClusterName;
            return this;
        }
        public String getMinionClusterName() {
            return this.minionClusterName;
        }

        public ListAKSNativeclusterResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListAKSNativeclusterResponseBodyData setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

        public ListAKSNativeclusterResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public ListAKSNativeclusterResponseBodyData setWorkspaceName(String workspaceName) {
            this.workspaceName = workspaceName;
            return this;
        }
        public String getWorkspaceName() {
            return this.workspaceName;
        }

        public ListAKSNativeclusterResponseBodyData setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public ListAKSNativeclusterResponseBodyData setZoneName(String zoneName) {
            this.zoneName = zoneName;
            return this;
        }
        public String getZoneName() {
            return this.zoneName;
        }

    }

}
