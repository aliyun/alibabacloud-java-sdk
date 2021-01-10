// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMsSgAppRelationsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("GraphData")
    public String graphData;

    public static QueryMsSgAppRelationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMsSgAppRelationsResponseBody self = new QueryMsSgAppRelationsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMsSgAppRelationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMsSgAppRelationsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMsSgAppRelationsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryMsSgAppRelationsResponseBody setGraphData(String graphData) {
        this.graphData = graphData;
        return this;
    }
    public String getGraphData() {
        return this.graphData;
    }

}
