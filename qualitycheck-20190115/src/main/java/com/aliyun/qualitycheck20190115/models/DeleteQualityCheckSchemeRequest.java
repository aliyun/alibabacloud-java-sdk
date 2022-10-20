// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class DeleteQualityCheckSchemeRequest extends TeaModel {
    @NameInMap("jsonStr")
    public String jsonStr;

    public static DeleteQualityCheckSchemeRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteQualityCheckSchemeRequest self = new DeleteQualityCheckSchemeRequest();
        return TeaModel.build(map, self);
    }

    public DeleteQualityCheckSchemeRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
