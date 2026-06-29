// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tablestore20201209.models;

import com.aliyun.tea.*;

public class ListClusterTypeResponseBody extends TeaModel {
    /**
     * <p>A list of the detailed information about the cluster types.</p>
     */
    @NameInMap("ClusterTypeInfos")
    public java.util.List<ListClusterTypeResponseBodyClusterTypeInfos> clusterTypeInfos;

    /**
     * <p>A list of cluster types.</p>
     */
    @NameInMap("ClusterTypes")
    public java.util.List<String> clusterTypes;

    /**
     * <p>The request ID. Use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>88BA193C-4918-08C4-9870-E1FE6BBECF34</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListClusterTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClusterTypeResponseBody self = new ListClusterTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClusterTypeResponseBody setClusterTypeInfos(java.util.List<ListClusterTypeResponseBodyClusterTypeInfos> clusterTypeInfos) {
        this.clusterTypeInfos = clusterTypeInfos;
        return this;
    }
    public java.util.List<ListClusterTypeResponseBodyClusterTypeInfos> getClusterTypeInfos() {
        return this.clusterTypeInfos;
    }

    public ListClusterTypeResponseBody setClusterTypes(java.util.List<String> clusterTypes) {
        this.clusterTypes = clusterTypes;
        return this;
    }
    public java.util.List<String> getClusterTypes() {
        return this.clusterTypes;
    }

    public ListClusterTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListClusterTypeResponseBodyClusterTypeInfos extends TeaModel {
        /**
         * <p>The cluster type.</p>
         * <ul>
         * <li><p>HYBRID: Capacity.</p>
         * </li>
         * <li><p>SSD: Performance.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SSD</p>
         */
        @NameInMap("ClusterType")
        public String clusterType;

        /**
         * <p>Indicates whether the cluster supports deployment in multiple availability zones (AZs).</p>
         * <ul>
         * <li><p>true: The cluster supports multi-zone deployment and provides zone-redundant storage.</p>
         * </li>
         * <li><p>false: The cluster does not support multi-zone deployment and provides locally redundant storage.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsMultiAZ")
        public Boolean isMultiAZ;

        public static ListClusterTypeResponseBodyClusterTypeInfos build(java.util.Map<String, ?> map) throws Exception {
            ListClusterTypeResponseBodyClusterTypeInfos self = new ListClusterTypeResponseBodyClusterTypeInfos();
            return TeaModel.build(map, self);
        }

        public ListClusterTypeResponseBodyClusterTypeInfos setClusterType(String clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public String getClusterType() {
            return this.clusterType;
        }

        public ListClusterTypeResponseBodyClusterTypeInfos setIsMultiAZ(Boolean isMultiAZ) {
            this.isMultiAZ = isMultiAZ;
            return this;
        }
        public Boolean getIsMultiAZ() {
            return this.isMultiAZ;
        }

    }

}
