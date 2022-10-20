// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class CreateQualityCheckSchemeRequest extends TeaModel {
    @NameInMap("jsonStr")
    public String jsonStr;

    public static CreateQualityCheckSchemeRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateQualityCheckSchemeRequest self = new CreateQualityCheckSchemeRequest();
        return TeaModel.build(map, self);
    }

    public CreateQualityCheckSchemeRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
