// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsTraceGetResultRequest extends TeaModel {
    @NameInMap("QueryId")
    public String queryId;

    public static OnsTraceGetResultRequest build(java.util.Map<String, ?> map) throws Exception {
        OnsTraceGetResultRequest self = new OnsTraceGetResultRequest();
        return TeaModel.build(map, self);
    }

    public OnsTraceGetResultRequest setQueryId(String queryId) {
        this.queryId = queryId;
        return this;
    }
    public String getQueryId() {
        return this.queryId;
    }

}
