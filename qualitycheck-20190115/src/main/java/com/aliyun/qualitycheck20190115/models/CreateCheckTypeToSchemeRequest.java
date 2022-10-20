// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class CreateCheckTypeToSchemeRequest extends TeaModel {
    @NameInMap("jsonStr")
    public String jsonStr;

    public static CreateCheckTypeToSchemeRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCheckTypeToSchemeRequest self = new CreateCheckTypeToSchemeRequest();
        return TeaModel.build(map, self);
    }

    public CreateCheckTypeToSchemeRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
