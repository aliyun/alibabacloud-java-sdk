// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class UpdateQualityCheckSchemeRequest extends TeaModel {
    @NameInMap("jsonStr")
    public String jsonStr;

    public static UpdateQualityCheckSchemeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateQualityCheckSchemeRequest self = new UpdateQualityCheckSchemeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateQualityCheckSchemeRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
