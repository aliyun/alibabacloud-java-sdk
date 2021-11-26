// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class ReviewSingleResultByIdRequest extends TeaModel {
    @NameInMap("JsonStr")
    public String jsonStr;

    public static ReviewSingleResultByIdRequest build(java.util.Map<String, ?> map) throws Exception {
        ReviewSingleResultByIdRequest self = new ReviewSingleResultByIdRequest();
        return TeaModel.build(map, self);
    }

    public ReviewSingleResultByIdRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
