// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetResultToReviewRequest extends TeaModel {
    @NameInMap("JsonStr")
    public String jsonStr;

    public static GetResultToReviewRequest build(java.util.Map<String, ?> map) throws Exception {
        GetResultToReviewRequest self = new GetResultToReviewRequest();
        return TeaModel.build(map, self);
    }

    public GetResultToReviewRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
