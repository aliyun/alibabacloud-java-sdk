// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLDCFederationSpannerClusterResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public java.util.List<QueryLDCFederationSpannerClusterResponseBodyData> data;

    public static QueryLDCFederationSpannerClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLDCFederationSpannerClusterResponseBody self = new QueryLDCFederationSpannerClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLDCFederationSpannerClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLDCFederationSpannerClusterResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLDCFederationSpannerClusterResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLDCFederationSpannerClusterResponseBody setData(java.util.List<QueryLDCFederationSpannerClusterResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryLDCFederationSpannerClusterResponseBodyData> getData() {
        return this.data;
    }

    public static class QueryLDCFederationSpannerClusterResponseBodyData extends TeaModel {
        @NameInMap("AddressType")
        public String addressType;

        @NameInMap("Cpu")
        public Long cpu;

        @NameInMap("CreateTimestamp")
        public String createTimestamp;

        @NameInMap("Disk")
        public Long disk;

        @NameInMap("ExpectClusterState")
        public String expectClusterState;

        @NameInMap("Flavor")
        public String flavor;

        @NameInMap("HostNetwork")
        public Boolean hostNetwork;

        @NameInMap("Id")
        public String id;

        @NameInMap("Instances")
        public Long instances;

        @NameInMap("Mem")
        public Long mem;

        @NameInMap("Message")
        public String message;

        @NameInMap("Name")
        public String name;

        @NameInMap("State")
        public String state;

        @NameInMap("Tenant")
        public String tenant;

        @NameInMap("UpdateTimestamp")
        public String updateTimestamp;

        @NameInMap("WorkspaceGroup")
        public String workspaceGroup;

        public static QueryLDCFederationSpannerClusterResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCFederationSpannerClusterResponseBodyData self = new QueryLDCFederationSpannerClusterResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryLDCFederationSpannerClusterResponseBodyData setAddressType(String addressType) {
            this.addressType = addressType;
            return this;
        }
        public String getAddressType() {
            return this.addressType;
        }

        public QueryLDCFederationSpannerClusterResponseBodyData setCpu(Long cpu) {
            this.cpu = cpu;
            return this;
        }
        public Long getCpu() {
            return this.cpu;
        }

        public QueryLDCFederationSpannerClusterResponseBodyData setCreateTimestamp(String createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public String getCreateTimestamp() {
            return this.createTimestamp;
        }

        public QueryLDCFederationSpannerClusterResponseBodyData setDisk(Long disk) {
            this.disk = disk;
            return this;
        }
        public Long getDisk() {
            return this.disk;
        }

        public QueryLDCFederationSpannerClusterResponseBodyData setExpectClusterState(String expectClusterState) {
            this.expectClusterState = expectClusterState;
            return this;
        }
        public String getExpectClusterState() {
            return this.expectClusterState;
        }

        public QueryLDCFederationSpannerClusterResponseBodyData setFlavor(String flavor) {
            this.flavor = flavor;
            return this;
        }
        public String getFlavor() {
            return this.flavor;
        }

        public QueryLDCFederationSpannerClusterResponseBodyData setHostNetwork(Boolean hostNetwork) {
            this.hostNetwork = hostNetwork;
            return this;
        }
        public Boolean getHostNetwork() {
            return this.hostNetwork;
        }

        public QueryLDCFederationSpannerClusterResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryLDCFederationSpannerClusterResponseBodyData setInstances(Long instances) {
            this.instances = instances;
            return this;
        }
        public Long getInstances() {
            return this.instances;
        }

        public QueryLDCFederationSpannerClusterResponseBodyData setMem(Long mem) {
            this.mem = mem;
            return this;
        }
        public Long getMem() {
            return this.mem;
        }

        public QueryLDCFederationSpannerClusterResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryLDCFederationSpannerClusterResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryLDCFederationSpannerClusterResponseBodyData setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QueryLDCFederationSpannerClusterResponseBodyData setTenant(String tenant) {
            this.tenant = tenant;
            return this;
        }
        public String getTenant() {
            return this.tenant;
        }

        public QueryLDCFederationSpannerClusterResponseBodyData setUpdateTimestamp(String updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }
        public String getUpdateTimestamp() {
            return this.updateTimestamp;
        }

        public QueryLDCFederationSpannerClusterResponseBodyData setWorkspaceGroup(String workspaceGroup) {
            this.workspaceGroup = workspaceGroup;
            return this;
        }
        public String getWorkspaceGroup() {
            return this.workspaceGroup;
        }

    }

}
