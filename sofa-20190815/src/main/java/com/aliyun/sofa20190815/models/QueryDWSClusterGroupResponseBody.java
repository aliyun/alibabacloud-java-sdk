// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryDWSClusterGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public QueryDWSClusterGroupResponseBodyData data;

    public static QueryDWSClusterGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDWSClusterGroupResponseBody self = new QueryDWSClusterGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDWSClusterGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDWSClusterGroupResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDWSClusterGroupResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryDWSClusterGroupResponseBody setData(QueryDWSClusterGroupResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryDWSClusterGroupResponseBodyData getData() {
        return this.data;
    }

    public static class QueryDWSClusterGroupResponseBodyData extends TeaModel {
        @NameInMap("DefaultClusterName")
        public String defaultClusterName;

        @NameInMap("ClusterNameGroup")
        public java.util.List<String> clusterNameGroup;

        public static QueryDWSClusterGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryDWSClusterGroupResponseBodyData self = new QueryDWSClusterGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryDWSClusterGroupResponseBodyData setDefaultClusterName(String defaultClusterName) {
            this.defaultClusterName = defaultClusterName;
            return this;
        }
        public String getDefaultClusterName() {
            return this.defaultClusterName;
        }

        public QueryDWSClusterGroupResponseBodyData setClusterNameGroup(java.util.List<String> clusterNameGroup) {
            this.clusterNameGroup = clusterNameGroup;
            return this;
        }
        public java.util.List<String> getClusterNameGroup() {
            return this.clusterNameGroup;
        }

    }

}
