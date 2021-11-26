// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetResultCallbackRequest extends TeaModel {
    @NameInMap("JsonStr")
    public String jsonStr;

    public static GetResultCallbackRequest build(java.util.Map<String, ?> map) throws Exception {
        GetResultCallbackRequest self = new GetResultCallbackRequest();
        return TeaModel.build(map, self);
    }

    public GetResultCallbackRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
