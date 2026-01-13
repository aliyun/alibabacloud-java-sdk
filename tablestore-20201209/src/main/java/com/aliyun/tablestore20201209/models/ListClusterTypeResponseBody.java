// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tablestore20201209.models;

import com.aliyun.tea.*;

public class ListClusterTypeResponseBody extends TeaModel {
    @NameInMap("ClusterTypeDetailList")
    public java.util.List<ListClusterTypeResponseBodyClusterTypeDetailList> clusterTypeDetailList;

    @NameInMap("ClusterTypeList")
    public java.util.List<String> clusterTypeList;

    /**
     * <strong>example:</strong>
     * <p>88BA193C-4918-08C4-9870-E1FE6BBECF34</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListClusterTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClusterTypeResponseBody self = new ListClusterTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClusterTypeResponseBody setClusterTypeDetailList(java.util.List<ListClusterTypeResponseBodyClusterTypeDetailList> clusterTypeDetailList) {
        this.clusterTypeDetailList = clusterTypeDetailList;
        return this;
    }
    public java.util.List<ListClusterTypeResponseBodyClusterTypeDetailList> getClusterTypeDetailList() {
        return this.clusterTypeDetailList;
    }

    public ListClusterTypeResponseBody setClusterTypeList(java.util.List<String> clusterTypeList) {
        this.clusterTypeList = clusterTypeList;
        return this;
    }
    public java.util.List<String> getClusterTypeList() {
        return this.clusterTypeList;
    }

    public ListClusterTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListClusterTypeResponseBodyClusterTypeDetailList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>SSD</p>
         */
        @NameInMap("ClusterType")
        public String clusterType;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsMultiAZ")
        public Boolean isMultiAZ;

        public static ListClusterTypeResponseBodyClusterTypeDetailList build(java.util.Map<String, ?> map) throws Exception {
            ListClusterTypeResponseBodyClusterTypeDetailList self = new ListClusterTypeResponseBodyClusterTypeDetailList();
            return TeaModel.build(map, self);
        }

        public ListClusterTypeResponseBodyClusterTypeDetailList setClusterType(String clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public String getClusterType() {
            return this.clusterType;
        }

        public ListClusterTypeResponseBodyClusterTypeDetailList setIsMultiAZ(Boolean isMultiAZ) {
            this.isMultiAZ = isMultiAZ;
            return this;
        }
        public Boolean getIsMultiAZ() {
            return this.isMultiAZ;
        }

    }

}
