// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class DelThesaurusForApiRequest extends TeaModel {
    @NameInMap("JsonStr")
    public String jsonStr;

    public static DelThesaurusForApiRequest build(java.util.Map<String, ?> map) throws Exception {
        DelThesaurusForApiRequest self = new DelThesaurusForApiRequest();
        return TeaModel.build(map, self);
    }

    public DelThesaurusForApiRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
