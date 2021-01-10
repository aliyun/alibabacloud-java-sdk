// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListMqSofamqClusterResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public java.util.List<ListMqSofamqClusterResponseBodyData> data;

    public static ListMqSofamqClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMqSofamqClusterResponseBody self = new ListMqSofamqClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMqSofamqClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMqSofamqClusterResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListMqSofamqClusterResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListMqSofamqClusterResponseBody setData(java.util.List<ListMqSofamqClusterResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListMqSofamqClusterResponseBodyData> getData() {
        return this.data;
    }

    public static class ListMqSofamqClusterResponseBodyData extends TeaModel {
        @NameInMap("Appkey")
        public String appkey;

        @NameInMap("Cluster")
        public String cluster;

        @NameInMap("ClusterType")
        public String clusterType;

        @NameInMap("DeployMode")
        public String deployMode;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("LdcMode")
        public String ldcMode;

        @NameInMap("Remark")
        public String remark;

        public static ListMqSofamqClusterResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListMqSofamqClusterResponseBodyData self = new ListMqSofamqClusterResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListMqSofamqClusterResponseBodyData setAppkey(String appkey) {
            this.appkey = appkey;
            return this;
        }
        public String getAppkey() {
            return this.appkey;
        }

        public ListMqSofamqClusterResponseBodyData setCluster(String cluster) {
            this.cluster = cluster;
            return this;
        }
        public String getCluster() {
            return this.cluster;
        }

        public ListMqSofamqClusterResponseBodyData setClusterType(String clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public String getClusterType() {
            return this.clusterType;
        }

        public ListMqSofamqClusterResponseBodyData setDeployMode(String deployMode) {
            this.deployMode = deployMode;
            return this;
        }
        public String getDeployMode() {
            return this.deployMode;
        }

        public ListMqSofamqClusterResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListMqSofamqClusterResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListMqSofamqClusterResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListMqSofamqClusterResponseBodyData setLdcMode(String ldcMode) {
            this.ldcMode = ldcMode;
            return this;
        }
        public String getLdcMode() {
            return this.ldcMode;
        }

        public ListMqSofamqClusterResponseBodyData setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

    }

}
