// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateAKSClusterNamespaceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Namespace")
    public UpdateAKSClusterNamespaceResponseBodyNamespace namespace;

    public static UpdateAKSClusterNamespaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAKSClusterNamespaceResponseBody self = new UpdateAKSClusterNamespaceResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAKSClusterNamespaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateAKSClusterNamespaceResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateAKSClusterNamespaceResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public UpdateAKSClusterNamespaceResponseBody setNamespace(UpdateAKSClusterNamespaceResponseBodyNamespace namespace) {
        this.namespace = namespace;
        return this;
    }
    public UpdateAKSClusterNamespaceResponseBodyNamespace getNamespace() {
        return this.namespace;
    }

    public static class UpdateAKSClusterNamespaceResponseBodyNamespaceAnnotations extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static UpdateAKSClusterNamespaceResponseBodyNamespaceAnnotations build(java.util.Map<String, ?> map) throws Exception {
            UpdateAKSClusterNamespaceResponseBodyNamespaceAnnotations self = new UpdateAKSClusterNamespaceResponseBodyNamespaceAnnotations();
            return TeaModel.build(map, self);
        }

        public UpdateAKSClusterNamespaceResponseBodyNamespaceAnnotations setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateAKSClusterNamespaceResponseBodyNamespaceAnnotations setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateAKSClusterNamespaceResponseBodyNamespaceLabels extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static UpdateAKSClusterNamespaceResponseBodyNamespaceLabels build(java.util.Map<String, ?> map) throws Exception {
            UpdateAKSClusterNamespaceResponseBodyNamespaceLabels self = new UpdateAKSClusterNamespaceResponseBodyNamespaceLabels();
            return TeaModel.build(map, self);
        }

        public UpdateAKSClusterNamespaceResponseBodyNamespaceLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateAKSClusterNamespaceResponseBodyNamespaceLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateAKSClusterNamespaceResponseBodyNamespace extends TeaModel {
        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Name")
        public String name;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("State")
        public String state;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        @NameInMap("Annotations")
        public java.util.List<UpdateAKSClusterNamespaceResponseBodyNamespaceAnnotations> annotations;

        @NameInMap("Labels")
        public java.util.List<UpdateAKSClusterNamespaceResponseBodyNamespaceLabels> labels;

        public static UpdateAKSClusterNamespaceResponseBodyNamespace build(java.util.Map<String, ?> map) throws Exception {
            UpdateAKSClusterNamespaceResponseBodyNamespace self = new UpdateAKSClusterNamespaceResponseBodyNamespace();
            return TeaModel.build(map, self);
        }

        public UpdateAKSClusterNamespaceResponseBodyNamespace setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public UpdateAKSClusterNamespaceResponseBodyNamespace setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public UpdateAKSClusterNamespaceResponseBodyNamespace setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateAKSClusterNamespaceResponseBodyNamespace setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public UpdateAKSClusterNamespaceResponseBodyNamespace setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public UpdateAKSClusterNamespaceResponseBodyNamespace setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public UpdateAKSClusterNamespaceResponseBodyNamespace setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public UpdateAKSClusterNamespaceResponseBodyNamespace setAnnotations(java.util.List<UpdateAKSClusterNamespaceResponseBodyNamespaceAnnotations> annotations) {
            this.annotations = annotations;
            return this;
        }
        public java.util.List<UpdateAKSClusterNamespaceResponseBodyNamespaceAnnotations> getAnnotations() {
            return this.annotations;
        }

        public UpdateAKSClusterNamespaceResponseBodyNamespace setLabels(java.util.List<UpdateAKSClusterNamespaceResponseBodyNamespaceLabels> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<UpdateAKSClusterNamespaceResponseBodyNamespaceLabels> getLabels() {
            return this.labels;
        }

    }

}
