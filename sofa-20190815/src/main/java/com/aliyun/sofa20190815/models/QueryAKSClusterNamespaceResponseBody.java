// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryAKSClusterNamespaceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Namespaces")
    public java.util.List<QueryAKSClusterNamespaceResponseBodyNamespaces> namespaces;

    public static QueryAKSClusterNamespaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAKSClusterNamespaceResponseBody self = new QueryAKSClusterNamespaceResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAKSClusterNamespaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAKSClusterNamespaceResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAKSClusterNamespaceResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryAKSClusterNamespaceResponseBody setNamespaces(java.util.List<QueryAKSClusterNamespaceResponseBodyNamespaces> namespaces) {
        this.namespaces = namespaces;
        return this;
    }
    public java.util.List<QueryAKSClusterNamespaceResponseBodyNamespaces> getNamespaces() {
        return this.namespaces;
    }

    public static class QueryAKSClusterNamespaceResponseBodyNamespacesAnnotations extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static QueryAKSClusterNamespaceResponseBodyNamespacesAnnotations build(java.util.Map<String, ?> map) throws Exception {
            QueryAKSClusterNamespaceResponseBodyNamespacesAnnotations self = new QueryAKSClusterNamespaceResponseBodyNamespacesAnnotations();
            return TeaModel.build(map, self);
        }

        public QueryAKSClusterNamespaceResponseBodyNamespacesAnnotations setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public QueryAKSClusterNamespaceResponseBodyNamespacesAnnotations setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryAKSClusterNamespaceResponseBodyNamespacesLabels extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static QueryAKSClusterNamespaceResponseBodyNamespacesLabels build(java.util.Map<String, ?> map) throws Exception {
            QueryAKSClusterNamespaceResponseBodyNamespacesLabels self = new QueryAKSClusterNamespaceResponseBodyNamespacesLabels();
            return TeaModel.build(map, self);
        }

        public QueryAKSClusterNamespaceResponseBodyNamespacesLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public QueryAKSClusterNamespaceResponseBodyNamespacesLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryAKSClusterNamespaceResponseBodyNamespaces extends TeaModel {
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
        public java.util.List<QueryAKSClusterNamespaceResponseBodyNamespacesAnnotations> annotations;

        @NameInMap("Labels")
        public java.util.List<QueryAKSClusterNamespaceResponseBodyNamespacesLabels> labels;

        public static QueryAKSClusterNamespaceResponseBodyNamespaces build(java.util.Map<String, ?> map) throws Exception {
            QueryAKSClusterNamespaceResponseBodyNamespaces self = new QueryAKSClusterNamespaceResponseBodyNamespaces();
            return TeaModel.build(map, self);
        }

        public QueryAKSClusterNamespaceResponseBodyNamespaces setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public QueryAKSClusterNamespaceResponseBodyNamespaces setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryAKSClusterNamespaceResponseBodyNamespaces setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryAKSClusterNamespaceResponseBodyNamespaces setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public QueryAKSClusterNamespaceResponseBodyNamespaces setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QueryAKSClusterNamespaceResponseBodyNamespaces setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public QueryAKSClusterNamespaceResponseBodyNamespaces setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public QueryAKSClusterNamespaceResponseBodyNamespaces setAnnotations(java.util.List<QueryAKSClusterNamespaceResponseBodyNamespacesAnnotations> annotations) {
            this.annotations = annotations;
            return this;
        }
        public java.util.List<QueryAKSClusterNamespaceResponseBodyNamespacesAnnotations> getAnnotations() {
            return this.annotations;
        }

        public QueryAKSClusterNamespaceResponseBodyNamespaces setLabels(java.util.List<QueryAKSClusterNamespaceResponseBodyNamespacesLabels> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<QueryAKSClusterNamespaceResponseBodyNamespacesLabels> getLabels() {
            return this.labels;
        }

    }

}
