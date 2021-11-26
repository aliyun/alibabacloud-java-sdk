// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class AddThesaurusForApiRequest extends TeaModel {
    @NameInMap("JsonStr")
    public String jsonStr;

    public static AddThesaurusForApiRequest build(java.util.Map<String, ?> map) throws Exception {
        AddThesaurusForApiRequest self = new AddThesaurusForApiRequest();
        return TeaModel.build(map, self);
    }

    public AddThesaurusForApiRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
