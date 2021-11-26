// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetReviewInfoRequest extends TeaModel {
    @NameInMap("JsonStr")
    public String jsonStr;

    public static GetReviewInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetReviewInfoRequest self = new GetReviewInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetReviewInfoRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
