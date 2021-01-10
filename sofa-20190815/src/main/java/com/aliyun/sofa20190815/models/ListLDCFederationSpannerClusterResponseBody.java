// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLDCFederationSpannerClusterResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public java.util.List<ListLDCFederationSpannerClusterResponseBodyData> data;

    public static ListLDCFederationSpannerClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLDCFederationSpannerClusterResponseBody self = new ListLDCFederationSpannerClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLDCFederationSpannerClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLDCFederationSpannerClusterResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListLDCFederationSpannerClusterResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListLDCFederationSpannerClusterResponseBody setData(java.util.List<ListLDCFederationSpannerClusterResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListLDCFederationSpannerClusterResponseBodyData> getData() {
        return this.data;
    }

    public static class ListLDCFederationSpannerClusterResponseBodyData extends TeaModel {
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

        public static ListLDCFederationSpannerClusterResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListLDCFederationSpannerClusterResponseBodyData self = new ListLDCFederationSpannerClusterResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListLDCFederationSpannerClusterResponseBodyData setAddressType(String addressType) {
            this.addressType = addressType;
            return this;
        }
        public String getAddressType() {
            return this.addressType;
        }

        public ListLDCFederationSpannerClusterResponseBodyData setCpu(Long cpu) {
            this.cpu = cpu;
            return this;
        }
        public Long getCpu() {
            return this.cpu;
        }

        public ListLDCFederationSpannerClusterResponseBodyData setCreateTimestamp(String createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public String getCreateTimestamp() {
            return this.createTimestamp;
        }

        public ListLDCFederationSpannerClusterResponseBodyData setDisk(Long disk) {
            this.disk = disk;
            return this;
        }
        public Long getDisk() {
            return this.disk;
        }

        public ListLDCFederationSpannerClusterResponseBodyData setExpectClusterState(String expectClusterState) {
            this.expectClusterState = expectClusterState;
            return this;
        }
        public String getExpectClusterState() {
            return this.expectClusterState;
        }

        public ListLDCFederationSpannerClusterResponseBodyData setFlavor(String flavor) {
            this.flavor = flavor;
            return this;
        }
        public String getFlavor() {
            return this.flavor;
        }

        public ListLDCFederationSpannerClusterResponseBodyData setHostNetwork(Boolean hostNetwork) {
            this.hostNetwork = hostNetwork;
            return this;
        }
        public Boolean getHostNetwork() {
            return this.hostNetwork;
        }

        public ListLDCFederationSpannerClusterResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListLDCFederationSpannerClusterResponseBodyData setInstances(Long instances) {
            this.instances = instances;
            return this;
        }
        public Long getInstances() {
            return this.instances;
        }

        public ListLDCFederationSpannerClusterResponseBodyData setMem(Long mem) {
            this.mem = mem;
            return this;
        }
        public Long getMem() {
            return this.mem;
        }

        public ListLDCFederationSpannerClusterResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListLDCFederationSpannerClusterResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListLDCFederationSpannerClusterResponseBodyData setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListLDCFederationSpannerClusterResponseBodyData setTenant(String tenant) {
            this.tenant = tenant;
            return this;
        }
        public String getTenant() {
            return this.tenant;
        }

        public ListLDCFederationSpannerClusterResponseBodyData setUpdateTimestamp(String updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }
        public String getUpdateTimestamp() {
            return this.updateTimestamp;
        }

        public ListLDCFederationSpannerClusterResponseBodyData setWorkspaceGroup(String workspaceGroup) {
            this.workspaceGroup = workspaceGroup;
            return this;
        }
        public String getWorkspaceGroup() {
            return this.workspaceGroup;
        }

    }

}
