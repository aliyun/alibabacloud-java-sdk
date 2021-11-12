// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ots20160620.models;

import com.aliyun.tea.*;

public class ListClusterTypeResponseBody extends TeaModel {
    @NameInMap("ClusterTypeInfos")
    public ListClusterTypeResponseBodyClusterTypeInfos clusterTypeInfos;

    @NameInMap("RequestId")
    public String requestId;

    public static ListClusterTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClusterTypeResponseBody self = new ListClusterTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClusterTypeResponseBody setClusterTypeInfos(ListClusterTypeResponseBodyClusterTypeInfos clusterTypeInfos) {
        this.clusterTypeInfos = clusterTypeInfos;
        return this;
    }
    public ListClusterTypeResponseBodyClusterTypeInfos getClusterTypeInfos() {
        return this.clusterTypeInfos;
    }

    public ListClusterTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListClusterTypeResponseBodyClusterTypeInfos extends TeaModel {
        @NameInMap("ClusterType")
        public java.util.List<String> clusterType;

        public static ListClusterTypeResponseBodyClusterTypeInfos build(java.util.Map<String, ?> map) throws Exception {
            ListClusterTypeResponseBodyClusterTypeInfos self = new ListClusterTypeResponseBodyClusterTypeInfos();
            return TeaModel.build(map, self);
        }

        public ListClusterTypeResponseBodyClusterTypeInfos setClusterType(java.util.List<String> clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public java.util.List<String> getClusterType() {
            return this.clusterType;
        }

    }

}
