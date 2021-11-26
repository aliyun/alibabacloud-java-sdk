// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class SyncQualityCheckRequest extends TeaModel {
    @NameInMap("JsonStr")
    public String jsonStr;

    public static SyncQualityCheckRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncQualityCheckRequest self = new SyncQualityCheckRequest();
        return TeaModel.build(map, self);
    }

    public SyncQualityCheckRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
