// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class GetExampleQueryRequest extends TeaModel {
    @NameInMap("QueryId")
    public String queryId;

    public static GetExampleQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetExampleQueryRequest self = new GetExampleQueryRequest();
        return TeaModel.build(map, self);
    }

    public GetExampleQueryRequest setQueryId(String queryId) {
        this.queryId = queryId;
        return this;
    }
    public String getQueryId() {
        return this.queryId;
    }

}
