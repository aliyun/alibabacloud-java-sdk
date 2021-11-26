// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class CreateWarningConfigRequest extends TeaModel {
    @NameInMap("JsonStr")
    public String jsonStr;

    public static CreateWarningConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWarningConfigRequest self = new CreateWarningConfigRequest();
        return TeaModel.build(map, self);
    }

    public CreateWarningConfigRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
