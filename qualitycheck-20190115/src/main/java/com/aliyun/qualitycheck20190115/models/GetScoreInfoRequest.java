// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetScoreInfoRequest extends TeaModel {
    @NameInMap("JsonStr")
    public String jsonStr;

    public static GetScoreInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetScoreInfoRequest self = new GetScoreInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetScoreInfoRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
