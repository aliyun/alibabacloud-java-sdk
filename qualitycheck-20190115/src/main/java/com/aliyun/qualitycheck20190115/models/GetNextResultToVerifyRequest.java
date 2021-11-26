// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetNextResultToVerifyRequest extends TeaModel {
    @NameInMap("JsonStr")
    public String jsonStr;

    public static GetNextResultToVerifyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetNextResultToVerifyRequest self = new GetNextResultToVerifyRequest();
        return TeaModel.build(map, self);
    }

    public GetNextResultToVerifyRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
