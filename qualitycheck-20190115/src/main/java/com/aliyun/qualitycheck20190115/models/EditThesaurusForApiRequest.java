// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class EditThesaurusForApiRequest extends TeaModel {
    @NameInMap("JsonStr")
    public String jsonStr;

    public static EditThesaurusForApiRequest build(java.util.Map<String, ?> map) throws Exception {
        EditThesaurusForApiRequest self = new EditThesaurusForApiRequest();
        return TeaModel.build(map, self);
    }

    public EditThesaurusForApiRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
