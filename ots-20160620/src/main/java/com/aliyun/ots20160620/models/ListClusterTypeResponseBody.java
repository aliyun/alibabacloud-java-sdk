// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ots20160620.models;

import com.aliyun.tea.*;

public class ListClusterTypeResponseBody extends TeaModel {
    @NameInMap("ClusterTypeDetailList")
    public ListClusterTypeResponseBodyClusterTypeDetailList clusterTypeDetailList;

    @NameInMap("ClusterTypeInfos")
    public ListClusterTypeResponseBodyClusterTypeInfos clusterTypeInfos;

    @NameInMap("RequestId")
    public String requestId;

    public static ListClusterTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClusterTypeResponseBody self = new ListClusterTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClusterTypeResponseBody setClusterTypeDetailList(ListClusterTypeResponseBodyClusterTypeDetailList clusterTypeDetailList) {
        this.clusterTypeDetailList = clusterTypeDetailList;
        return this;
    }
    public ListClusterTypeResponseBodyClusterTypeDetailList getClusterTypeDetailList() {
        return this.clusterTypeDetailList;
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

    public static class ListClusterTypeResponseBodyClusterTypeDetailListClusterTypeDetail extends TeaModel {
        @NameInMap("ClusterType")
        public String clusterType;

        @NameInMap("IsMultiAZ")
        public Boolean isMultiAZ;

        public static ListClusterTypeResponseBodyClusterTypeDetailListClusterTypeDetail build(java.util.Map<String, ?> map) throws Exception {
            ListClusterTypeResponseBodyClusterTypeDetailListClusterTypeDetail self = new ListClusterTypeResponseBodyClusterTypeDetailListClusterTypeDetail();
            return TeaModel.build(map, self);
        }

        public ListClusterTypeResponseBodyClusterTypeDetailListClusterTypeDetail setClusterType(String clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public String getClusterType() {
            return this.clusterType;
        }

        public ListClusterTypeResponseBodyClusterTypeDetailListClusterTypeDetail setIsMultiAZ(Boolean isMultiAZ) {
            this.isMultiAZ = isMultiAZ;
            return this;
        }
        public Boolean getIsMultiAZ() {
            return this.isMultiAZ;
        }

    }

    public static class ListClusterTypeResponseBodyClusterTypeDetailList extends TeaModel {
        @NameInMap("ClusterTypeDetail")
        public java.util.List<ListClusterTypeResponseBodyClusterTypeDetailListClusterTypeDetail> clusterTypeDetail;

        public static ListClusterTypeResponseBodyClusterTypeDetailList build(java.util.Map<String, ?> map) throws Exception {
            ListClusterTypeResponseBodyClusterTypeDetailList self = new ListClusterTypeResponseBodyClusterTypeDetailList();
            return TeaModel.build(map, self);
        }

        public ListClusterTypeResponseBodyClusterTypeDetailList setClusterTypeDetail(java.util.List<ListClusterTypeResponseBodyClusterTypeDetailListClusterTypeDetail> clusterTypeDetail) {
            this.clusterTypeDetail = clusterTypeDetail;
            return this;
        }
        public java.util.List<ListClusterTypeResponseBodyClusterTypeDetailListClusterTypeDetail> getClusterTypeDetail() {
            return this.clusterTypeDetail;
        }

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
