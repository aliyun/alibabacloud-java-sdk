// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qianzhou20211111.models;

import com.aliyun.tea.*;

public class QueryByInstanceInfoResponseBody extends TeaModel {
    @NameInMap("code")
    public Integer code;

    @NameInMap("data")
    public java.util.List<QueryByInstanceInfoResponseBodyData> data;

    @NameInMap("msg")
    public String msg;

    @NameInMap("requestId")
    public String requestId;

    public static QueryByInstanceInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryByInstanceInfoResponseBody self = new QueryByInstanceInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryByInstanceInfoResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public QueryByInstanceInfoResponseBody setData(java.util.List<QueryByInstanceInfoResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryByInstanceInfoResponseBodyData> getData() {
        return this.data;
    }

    public QueryByInstanceInfoResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public QueryByInstanceInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryByInstanceInfoResponseBodyData extends TeaModel {
        @NameInMap("clusterId")
        public String clusterId;

        @NameInMap("clusterName")
        public String clusterName;

        @NameInMap("instanceId")
        public String instanceId;

        @NameInMap("regionId")
        public String regionId;

        @NameInMap("uid")
        public String uid;

        public static QueryByInstanceInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryByInstanceInfoResponseBodyData self = new QueryByInstanceInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryByInstanceInfoResponseBodyData setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public QueryByInstanceInfoResponseBodyData setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public QueryByInstanceInfoResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryByInstanceInfoResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public QueryByInstanceInfoResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

}
