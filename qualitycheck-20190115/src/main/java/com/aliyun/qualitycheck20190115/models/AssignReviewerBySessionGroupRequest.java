// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class AssignReviewerBySessionGroupRequest extends TeaModel {
    @NameInMap("jsonStr")
    public String jsonStr;

    public static AssignReviewerBySessionGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        AssignReviewerBySessionGroupRequest self = new AssignReviewerBySessionGroupRequest();
        return TeaModel.build(map, self);
    }

    public AssignReviewerBySessionGroupRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
