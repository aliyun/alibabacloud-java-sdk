// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetSyncResultRequest extends TeaModel {
    @NameInMap("JsonStr")
    public String jsonStr;

    public static GetSyncResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSyncResultRequest self = new GetSyncResultRequest();
        return TeaModel.build(map, self);
    }

    public GetSyncResultRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
