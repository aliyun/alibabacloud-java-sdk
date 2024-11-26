// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qianzhou20211111.models;

import com.aliyun.tea.*;

public class QueryNodeInfoResponseBody extends TeaModel {
    @NameInMap("code")
    public Integer code;

    @NameInMap("data")
    public java.util.List<QueryNodeInfoResponseBodyData> data;

    @NameInMap("msg")
    public String msg;

    @NameInMap("requestId")
    public String requestId;

    public static QueryNodeInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryNodeInfoResponseBody self = new QueryNodeInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryNodeInfoResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public QueryNodeInfoResponseBody setData(java.util.List<QueryNodeInfoResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryNodeInfoResponseBodyData> getData() {
        return this.data;
    }

    public QueryNodeInfoResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public QueryNodeInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryNodeInfoResponseBodyData extends TeaModel {
        @NameInMap("cluserName")
        public String cluserName;

        @NameInMap("clusterId")
        public String clusterId;

        @NameInMap("instanceId")
        public String instanceId;

        @NameInMap("region")
        public String region;

        @NameInMap("uid")
        public String uid;

        public static QueryNodeInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryNodeInfoResponseBodyData self = new QueryNodeInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryNodeInfoResponseBodyData setCluserName(String cluserName) {
            this.cluserName = cluserName;
            return this;
        }
        public String getCluserName() {
            return this.cluserName;
        }

        public QueryNodeInfoResponseBodyData setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public QueryNodeInfoResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryNodeInfoResponseBodyData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public QueryNodeInfoResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

}
