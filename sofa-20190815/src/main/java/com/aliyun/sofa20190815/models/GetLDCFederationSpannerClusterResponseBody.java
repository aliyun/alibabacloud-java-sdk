// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLDCFederationSpannerClusterResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public GetLDCFederationSpannerClusterResponseBodyData data;

    public static GetLDCFederationSpannerClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLDCFederationSpannerClusterResponseBody self = new GetLDCFederationSpannerClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLDCFederationSpannerClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLDCFederationSpannerClusterResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLDCFederationSpannerClusterResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLDCFederationSpannerClusterResponseBody setData(GetLDCFederationSpannerClusterResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetLDCFederationSpannerClusterResponseBodyData getData() {
        return this.data;
    }

    public static class GetLDCFederationSpannerClusterResponseBodyDataLocalClustersSubClustersDetailsLabels extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static GetLDCFederationSpannerClusterResponseBodyDataLocalClustersSubClustersDetailsLabels build(java.util.Map<String, ?> map) throws Exception {
            GetLDCFederationSpannerClusterResponseBodyDataLocalClustersSubClustersDetailsLabels self = new GetLDCFederationSpannerClusterResponseBodyDataLocalClustersSubClustersDetailsLabels();
            return TeaModel.build(map, self);
        }

        public GetLDCFederationSpannerClusterResponseBodyDataLocalClustersSubClustersDetailsLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetLDCFederationSpannerClusterResponseBodyDataLocalClustersSubClustersDetailsLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetLDCFederationSpannerClusterResponseBodyDataLocalClustersSubClustersDetails extends TeaModel {
        @NameInMap("Available")
        public Long available;

        @NameInMap("Desired")
        public Long desired;

        @NameInMap("Image")
        public String image;

        @NameInMap("Message")
        public String message;

        @NameInMap("Ready")
        public Long ready;

        @NameInMap("State")
        public String state;

        @NameInMap("Updated")
        public Long updated;

        @NameInMap("Version")
        public String version;

        @NameInMap("Labels")
        public java.util.List<GetLDCFederationSpannerClusterResponseBodyDataLocalClustersSubClustersDetailsLabels> labels;

        public static GetLDCFederationSpannerClusterResponseBodyDataLocalClustersSubClustersDetails build(java.util.Map<String, ?> map) throws Exception {
            GetLDCFederationSpannerClusterResponseBodyDataLocalClustersSubClustersDetails self = new GetLDCFederationSpannerClusterResponseBodyDataLocalClustersSubClustersDetails();
            return TeaModel.build(map, self);
        }

        public GetLDCFederationSpannerClusterResponseBodyDataLocalClustersSubClustersDetails setAvailable(Long available) {
            this.available = available;
            return this;
        }
        public Long getAvailable() {
            return this.available;
        }

        public GetLDCFederationSpannerClusterResponseBodyDataLocalClustersSubClustersDetails setDesired(Long desired) {
            this.desired = desired;
            return this;
        }
        public Long getDesired() {
            return this.desired;
        }

        public GetLDCFederationSpannerClusterResponseBodyDataLocalClustersSubClustersDetails setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public GetLDCFederationSpannerClusterResponseBodyDataLocalClustersSubClustersDetails setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetLDCFederationSpannerClusterResponseBodyDataLocalClustersSubClustersDetails setReady(Long ready) {
            this.ready = ready;
            return this;
        }
        public Long getReady() {
            return this.ready;
        }

        public GetLDCFederationSpannerClusterResponseBodyDataLocalClustersSubClustersDetails setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public GetLDCFederationSpannerClusterResponseBodyDataLocalClustersSubClustersDetails setUpdated(Long updated) {
            this.updated = updated;
            return this;
        }
        public Long getUpdated() {
            return this.updated;
        }

        public GetLDCFederationSpannerClusterResponseBodyDataLocalClustersSubClustersDetails setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public GetLDCFederationSpannerClusterResponseBodyDataLocalClustersSubClustersDetails setLabels(java.util.List<GetLDCFederationSpannerClusterResponseBodyDataLocalClustersSubClustersDetailsLabels> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<GetLDCFederationSpannerClusterResponseBodyDataLocalClustersSubClustersDetailsLabels> getLabels() {
            return this.labels;
        }

    }

    public static class GetLDCFederationSpannerClusterResponseBodyDataLocalClusters extends TeaModel {
        @NameInMap("Az")
        public String az;

        @NameInMap("ClusterName")
        public String clusterName;

        @NameInMap("Message")
        public String message;

        @NameInMap("Phase")
        public String phase;

        @NameInMap("SpannerClusterId")
        public String spannerClusterId;

        @NameInMap("State")
        public String state;

        @NameInMap("SubClustersDetails")
        public java.util.List<GetLDCFederationSpannerClusterResponseBodyDataLocalClustersSubClustersDetails> subClustersDetails;

        public static GetLDCFederationSpannerClusterResponseBodyDataLocalClusters build(java.util.Map<String, ?> map) throws Exception {
            GetLDCFederationSpannerClusterResponseBodyDataLocalClusters self = new GetLDCFederationSpannerClusterResponseBodyDataLocalClusters();
            return TeaModel.build(map, self);
        }

        public GetLDCFederationSpannerClusterResponseBodyDataLocalClusters setAz(String az) {
            this.az = az;
            return this;
        }
        public String getAz() {
            return this.az;
        }

        public GetLDCFederationSpannerClusterResponseBodyDataLocalClusters setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public GetLDCFederationSpannerClusterResponseBodyDataLocalClusters setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetLDCFederationSpannerClusterResponseBodyDataLocalClusters setPhase(String phase) {
            this.phase = phase;
            return this;
        }
        public String getPhase() {
            return this.phase;
        }

        public GetLDCFederationSpannerClusterResponseBodyDataLocalClusters setSpannerClusterId(String spannerClusterId) {
            this.spannerClusterId = spannerClusterId;
            return this;
        }
        public String getSpannerClusterId() {
            return this.spannerClusterId;
        }

        public GetLDCFederationSpannerClusterResponseBodyDataLocalClusters setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public GetLDCFederationSpannerClusterResponseBodyDataLocalClusters setSubClustersDetails(java.util.List<GetLDCFederationSpannerClusterResponseBodyDataLocalClustersSubClustersDetails> subClustersDetails) {
            this.subClustersDetails = subClustersDetails;
            return this;
        }
        public java.util.List<GetLDCFederationSpannerClusterResponseBodyDataLocalClustersSubClustersDetails> getSubClustersDetails() {
            return this.subClustersDetails;
        }

    }

    public static class GetLDCFederationSpannerClusterResponseBodyDataClusterDetail extends TeaModel {
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

        public static GetLDCFederationSpannerClusterResponseBodyDataClusterDetail build(java.util.Map<String, ?> map) throws Exception {
            GetLDCFederationSpannerClusterResponseBodyDataClusterDetail self = new GetLDCFederationSpannerClusterResponseBodyDataClusterDetail();
            return TeaModel.build(map, self);
        }

        public GetLDCFederationSpannerClusterResponseBodyDataClusterDetail setAddressType(String addressType) {
            this.addressType = addressType;
            return this;
        }
        public String getAddressType() {
            return this.addressType;
        }

        public GetLDCFederationSpannerClusterResponseBodyDataClusterDetail setCpu(Long cpu) {
            this.cpu = cpu;
            return this;
        }
        public Long getCpu() {
            return this.cpu;
        }

        public GetLDCFederationSpannerClusterResponseBodyDataClusterDetail setCreateTimestamp(String createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public String getCreateTimestamp() {
            return this.createTimestamp;
        }

        public GetLDCFederationSpannerClusterResponseBodyDataClusterDetail setDisk(Long disk) {
            this.disk = disk;
            return this;
        }
        public Long getDisk() {
            return this.disk;
        }

        public GetLDCFederationSpannerClusterResponseBodyDataClusterDetail setExpectClusterState(String expectClusterState) {
            this.expectClusterState = expectClusterState;
            return this;
        }
        public String getExpectClusterState() {
            return this.expectClusterState;
        }

        public GetLDCFederationSpannerClusterResponseBodyDataClusterDetail setFlavor(String flavor) {
            this.flavor = flavor;
            return this;
        }
        public String getFlavor() {
            return this.flavor;
        }

        public GetLDCFederationSpannerClusterResponseBodyDataClusterDetail setHostNetwork(Boolean hostNetwork) {
            this.hostNetwork = hostNetwork;
            return this;
        }
        public Boolean getHostNetwork() {
            return this.hostNetwork;
        }

        public GetLDCFederationSpannerClusterResponseBodyDataClusterDetail setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetLDCFederationSpannerClusterResponseBodyDataClusterDetail setInstances(Long instances) {
            this.instances = instances;
            return this;
        }
        public Long getInstances() {
            return this.instances;
        }

        public GetLDCFederationSpannerClusterResponseBodyDataClusterDetail setMem(Long mem) {
            this.mem = mem;
            return this;
        }
        public Long getMem() {
            return this.mem;
        }

        public GetLDCFederationSpannerClusterResponseBodyDataClusterDetail setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetLDCFederationSpannerClusterResponseBodyDataClusterDetail setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetLDCFederationSpannerClusterResponseBodyDataClusterDetail setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public GetLDCFederationSpannerClusterResponseBodyDataClusterDetail setTenant(String tenant) {
            this.tenant = tenant;
            return this;
        }
        public String getTenant() {
            return this.tenant;
        }

        public GetLDCFederationSpannerClusterResponseBodyDataClusterDetail setUpdateTimestamp(String updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }
        public String getUpdateTimestamp() {
            return this.updateTimestamp;
        }

        public GetLDCFederationSpannerClusterResponseBodyDataClusterDetail setWorkspaceGroup(String workspaceGroup) {
            this.workspaceGroup = workspaceGroup;
            return this;
        }
        public String getWorkspaceGroup() {
            return this.workspaceGroup;
        }

    }

    public static class GetLDCFederationSpannerClusterResponseBodyData extends TeaModel {
        @NameInMap("LocalClusters")
        public java.util.List<GetLDCFederationSpannerClusterResponseBodyDataLocalClusters> localClusters;

        @NameInMap("ClusterDetail")
        public GetLDCFederationSpannerClusterResponseBodyDataClusterDetail clusterDetail;

        public static GetLDCFederationSpannerClusterResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetLDCFederationSpannerClusterResponseBodyData self = new GetLDCFederationSpannerClusterResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetLDCFederationSpannerClusterResponseBodyData setLocalClusters(java.util.List<GetLDCFederationSpannerClusterResponseBodyDataLocalClusters> localClusters) {
            this.localClusters = localClusters;
            return this;
        }
        public java.util.List<GetLDCFederationSpannerClusterResponseBodyDataLocalClusters> getLocalClusters() {
            return this.localClusters;
        }

        public GetLDCFederationSpannerClusterResponseBodyData setClusterDetail(GetLDCFederationSpannerClusterResponseBodyDataClusterDetail clusterDetail) {
            this.clusterDetail = clusterDetail;
            return this;
        }
        public GetLDCFederationSpannerClusterResponseBodyDataClusterDetail getClusterDetail() {
            return this.clusterDetail;
        }

    }

}
