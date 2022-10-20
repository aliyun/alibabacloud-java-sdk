// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class BatchSubmitReviewInfoRequest extends TeaModel {
    @NameInMap("jsonStr")
    public String jsonStr;

    public static BatchSubmitReviewInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchSubmitReviewInfoRequest self = new BatchSubmitReviewInfoRequest();
        return TeaModel.build(map, self);
    }

    public BatchSubmitReviewInfoRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
