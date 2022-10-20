// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetQualityCheckSchemeRequest extends TeaModel {
    @NameInMap("jsonStr")
    public String jsonStr;

    public static GetQualityCheckSchemeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetQualityCheckSchemeRequest self = new GetQualityCheckSchemeRequest();
        return TeaModel.build(map, self);
    }

    public GetQualityCheckSchemeRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
