// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class AssignReviewerRequest extends TeaModel {
    @NameInMap("JsonStr")
    public String jsonStr;

    public static AssignReviewerRequest build(java.util.Map<String, ?> map) throws Exception {
        AssignReviewerRequest self = new AssignReviewerRequest();
        return TeaModel.build(map, self);
    }

    public AssignReviewerRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
