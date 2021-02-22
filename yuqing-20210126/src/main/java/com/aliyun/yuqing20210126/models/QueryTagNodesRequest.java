// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20210126.models;

import com.aliyun.tea.*;

public class QueryTagNodesRequest extends TeaModel {
    // 舆情团队HashId
    @NameInMap("teamHashId")
    public String teamHashId;

    // 请求id
    @NameInMap("requestId")
    public String requestId;

    public static QueryTagNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTagNodesRequest self = new QueryTagNodesRequest();
        return TeaModel.build(map, self);
    }

    public QueryTagNodesRequest setTeamHashId(String teamHashId) {
        this.teamHashId = teamHashId;
        return this;
    }
    public String getTeamHashId() {
        return this.teamHashId;
    }

    public QueryTagNodesRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
