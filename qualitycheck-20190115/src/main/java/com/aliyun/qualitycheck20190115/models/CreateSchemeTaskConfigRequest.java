// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class CreateSchemeTaskConfigRequest extends TeaModel {
    @NameInMap("jsonStr")
    public String jsonStr;

    public static CreateSchemeTaskConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSchemeTaskConfigRequest self = new CreateSchemeTaskConfigRequest();
        return TeaModel.build(map, self);
    }

    public CreateSchemeTaskConfigRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
