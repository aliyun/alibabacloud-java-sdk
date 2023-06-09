// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class UpdateSearchStrategyRequest extends TeaModel {
    @NameInMap("body")
    public SearchStrategy body;

    public static UpdateSearchStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSearchStrategyRequest self = new UpdateSearchStrategyRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSearchStrategyRequest setBody(SearchStrategy body) {
        this.body = body;
        return this;
    }
    public SearchStrategy getBody() {
        return this.body;
    }

}
