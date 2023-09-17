// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class QueryMLServiceResultsRequest extends TeaModel {
    @NameInMap("allowBuiltin")
    public Boolean allowBuiltin;

    @NameInMap("body")
    public MLServiceAnalysisParam body;

    public static QueryMLServiceResultsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMLServiceResultsRequest self = new QueryMLServiceResultsRequest();
        return TeaModel.build(map, self);
    }

    public QueryMLServiceResultsRequest setAllowBuiltin(Boolean allowBuiltin) {
        this.allowBuiltin = allowBuiltin;
        return this;
    }
    public Boolean getAllowBuiltin() {
        return this.allowBuiltin;
    }

    public QueryMLServiceResultsRequest setBody(MLServiceAnalysisParam body) {
        this.body = body;
        return this;
    }
    public MLServiceAnalysisParam getBody() {
        return this.body;
    }

}
