// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetAKSClusterNamespaceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Namespace")
    public GetAKSClusterNamespaceResponseBodyNamespace namespace;

    public static GetAKSClusterNamespaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAKSClusterNamespaceResponseBody self = new GetAKSClusterNamespaceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAKSClusterNamespaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAKSClusterNamespaceResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetAKSClusterNamespaceResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetAKSClusterNamespaceResponseBody setNamespace(GetAKSClusterNamespaceResponseBodyNamespace namespace) {
        this.namespace = namespace;
        return this;
    }
    public GetAKSClusterNamespaceResponseBodyNamespace getNamespace() {
        return this.namespace;
    }

    public static class GetAKSClusterNamespaceResponseBodyNamespaceAnnotations extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static GetAKSClusterNamespaceResponseBodyNamespaceAnnotations build(java.util.Map<String, ?> map) throws Exception {
            GetAKSClusterNamespaceResponseBodyNamespaceAnnotations self = new GetAKSClusterNamespaceResponseBodyNamespaceAnnotations();
            return TeaModel.build(map, self);
        }

        public GetAKSClusterNamespaceResponseBodyNamespaceAnnotations setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetAKSClusterNamespaceResponseBodyNamespaceAnnotations setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetAKSClusterNamespaceResponseBodyNamespaceLabels extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static GetAKSClusterNamespaceResponseBodyNamespaceLabels build(java.util.Map<String, ?> map) throws Exception {
            GetAKSClusterNamespaceResponseBodyNamespaceLabels self = new GetAKSClusterNamespaceResponseBodyNamespaceLabels();
            return TeaModel.build(map, self);
        }

        public GetAKSClusterNamespaceResponseBodyNamespaceLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetAKSClusterNamespaceResponseBodyNamespaceLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetAKSClusterNamespaceResponseBodyNamespace extends TeaModel {
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
        public java.util.List<GetAKSClusterNamespaceResponseBodyNamespaceAnnotations> annotations;

        @NameInMap("Labels")
        public java.util.List<GetAKSClusterNamespaceResponseBodyNamespaceLabels> labels;

        public static GetAKSClusterNamespaceResponseBodyNamespace build(java.util.Map<String, ?> map) throws Exception {
            GetAKSClusterNamespaceResponseBodyNamespace self = new GetAKSClusterNamespaceResponseBodyNamespace();
            return TeaModel.build(map, self);
        }

        public GetAKSClusterNamespaceResponseBodyNamespace setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public GetAKSClusterNamespaceResponseBodyNamespace setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetAKSClusterNamespaceResponseBodyNamespace setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetAKSClusterNamespaceResponseBodyNamespace setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetAKSClusterNamespaceResponseBodyNamespace setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public GetAKSClusterNamespaceResponseBodyNamespace setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public GetAKSClusterNamespaceResponseBodyNamespace setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public GetAKSClusterNamespaceResponseBodyNamespace setAnnotations(java.util.List<GetAKSClusterNamespaceResponseBodyNamespaceAnnotations> annotations) {
            this.annotations = annotations;
            return this;
        }
        public java.util.List<GetAKSClusterNamespaceResponseBodyNamespaceAnnotations> getAnnotations() {
            return this.annotations;
        }

        public GetAKSClusterNamespaceResponseBodyNamespace setLabels(java.util.List<GetAKSClusterNamespaceResponseBodyNamespaceLabels> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<GetAKSClusterNamespaceResponseBodyNamespaceLabels> getLabels() {
            return this.labels;
        }

    }

}
