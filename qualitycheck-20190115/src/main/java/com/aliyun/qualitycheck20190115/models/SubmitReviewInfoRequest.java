// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class SubmitReviewInfoRequest extends TeaModel {
    @NameInMap("JsonStr")
    public String jsonStr;

    public static SubmitReviewInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitReviewInfoRequest self = new SubmitReviewInfoRequest();
        return TeaModel.build(map, self);
    }

    public SubmitReviewInfoRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
