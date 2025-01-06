// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240529.models;

import com.aliyun.tea.*;

public class GetPredictionRequest extends TeaModel {
    @NameInMap("body")
    public String body;

    public static GetPredictionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPredictionRequest self = new GetPredictionRequest();
        return TeaModel.build(map, self);
    }

    public GetPredictionRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
