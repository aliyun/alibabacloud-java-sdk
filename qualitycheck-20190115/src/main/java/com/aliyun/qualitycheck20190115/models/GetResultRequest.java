// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetResultRequest extends TeaModel {
    @NameInMap("JsonStr")
    public String jsonStr;

    public static GetResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetResultRequest self = new GetResultRequest();
        return TeaModel.build(map, self);
    }

    public GetResultRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
