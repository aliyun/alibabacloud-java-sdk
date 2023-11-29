// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetMLServiceResultsRequest extends TeaModel {
    @NameInMap("allowBuiltin")
    public Boolean allowBuiltin;

    @NameInMap("body")
    public MLServiceAnalysisParam body;

    public static GetMLServiceResultsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMLServiceResultsRequest self = new GetMLServiceResultsRequest();
        return TeaModel.build(map, self);
    }

    public GetMLServiceResultsRequest setAllowBuiltin(Boolean allowBuiltin) {
        this.allowBuiltin = allowBuiltin;
        return this;
    }
    public Boolean getAllowBuiltin() {
        return this.allowBuiltin;
    }

    public GetMLServiceResultsRequest setBody(MLServiceAnalysisParam body) {
        this.body = body;
        return this;
    }
    public MLServiceAnalysisParam getBody() {
        return this.body;
    }

}
