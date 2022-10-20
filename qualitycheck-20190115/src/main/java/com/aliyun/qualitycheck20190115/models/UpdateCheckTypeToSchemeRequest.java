// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class UpdateCheckTypeToSchemeRequest extends TeaModel {
    @NameInMap("jsonStr")
    public String jsonStr;

    public static UpdateCheckTypeToSchemeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCheckTypeToSchemeRequest self = new UpdateCheckTypeToSchemeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCheckTypeToSchemeRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
