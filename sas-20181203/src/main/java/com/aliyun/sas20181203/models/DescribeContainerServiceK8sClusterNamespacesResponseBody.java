// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeContainerServiceK8sClusterNamespacesResponseBody extends TeaModel {
    /**
     * <p>The namespaces.</p>
     */
    @NameInMap("K8sClusterNamespaces")
    public java.util.List<DescribeContainerServiceK8sClusterNamespacesResponseBodyK8sClusterNamespaces> k8sClusterNamespaces;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0C8487EF-50C2-54BB-8634-10F8C35D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeContainerServiceK8sClusterNamespacesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeContainerServiceK8sClusterNamespacesResponseBody self = new DescribeContainerServiceK8sClusterNamespacesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeContainerServiceK8sClusterNamespacesResponseBody setK8sClusterNamespaces(java.util.List<DescribeContainerServiceK8sClusterNamespacesResponseBodyK8sClusterNamespaces> k8sClusterNamespaces) {
        this.k8sClusterNamespaces = k8sClusterNamespaces;
        return this;
    }
    public java.util.List<DescribeContainerServiceK8sClusterNamespacesResponseBodyK8sClusterNamespaces> getK8sClusterNamespaces() {
        return this.k8sClusterNamespaces;
    }

    public DescribeContainerServiceK8sClusterNamespacesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeContainerServiceK8sClusterNamespacesResponseBodyK8sClusterNamespaces extends TeaModel {
        /**
         * <p>The namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        public static DescribeContainerServiceK8sClusterNamespacesResponseBodyK8sClusterNamespaces build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerServiceK8sClusterNamespacesResponseBodyK8sClusterNamespaces self = new DescribeContainerServiceK8sClusterNamespacesResponseBodyK8sClusterNamespaces();
            return TeaModel.build(map, self);
        }

        public DescribeContainerServiceK8sClusterNamespacesResponseBodyK8sClusterNamespaces setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

    }

}
