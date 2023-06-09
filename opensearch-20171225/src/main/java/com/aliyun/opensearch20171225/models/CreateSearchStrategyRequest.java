// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class CreateSearchStrategyRequest extends TeaModel {
    @NameInMap("body")
    public SearchStrategy body;

    public static CreateSearchStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSearchStrategyRequest self = new CreateSearchStrategyRequest();
        return TeaModel.build(map, self);
    }

    public CreateSearchStrategyRequest setBody(SearchStrategy body) {
        this.body = body;
        return this;
    }
    public SearchStrategy getBody() {
        return this.body;
    }

}
