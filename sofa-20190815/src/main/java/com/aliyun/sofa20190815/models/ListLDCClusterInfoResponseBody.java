// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLDCClusterInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public java.util.List<ListLDCClusterInfoResponseBodyData> data;

    public static ListLDCClusterInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLDCClusterInfoResponseBody self = new ListLDCClusterInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLDCClusterInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLDCClusterInfoResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListLDCClusterInfoResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListLDCClusterInfoResponseBody setData(java.util.List<ListLDCClusterInfoResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListLDCClusterInfoResponseBodyData> getData() {
        return this.data;
    }

    public static class ListLDCClusterInfoResponseBodyData extends TeaModel {
        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("Env")
        public String env;

        @NameInMap("IsHealthy")
        public Boolean isHealthy;

        @NameInMap("Name")
        public String name;

        @NameInMap("RegionName")
        public String regionName;

        @NameInMap("Type")
        public String type;

        @NameInMap("Version")
        public String version;

        @NameInMap("Workspace")
        public String workspace;

        @NameInMap("ZoneName")
        public String zoneName;

        public static ListLDCClusterInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListLDCClusterInfoResponseBodyData self = new ListLDCClusterInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListLDCClusterInfoResponseBodyData setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public ListLDCClusterInfoResponseBodyData setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

        public ListLDCClusterInfoResponseBodyData setIsHealthy(Boolean isHealthy) {
            this.isHealthy = isHealthy;
            return this;
        }
        public Boolean getIsHealthy() {
            return this.isHealthy;
        }

        public ListLDCClusterInfoResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListLDCClusterInfoResponseBodyData setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

        public ListLDCClusterInfoResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListLDCClusterInfoResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public ListLDCClusterInfoResponseBodyData setWorkspace(String workspace) {
            this.workspace = workspace;
            return this;
        }
        public String getWorkspace() {
            return this.workspace;
        }

        public ListLDCClusterInfoResponseBodyData setZoneName(String zoneName) {
            this.zoneName = zoneName;
            return this;
        }
        public String getZoneName() {
            return this.zoneName;
        }

    }

}
