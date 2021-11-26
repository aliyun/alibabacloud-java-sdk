// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class UploadDataSyncRequest extends TeaModel {
    @NameInMap("JsonStr")
    public String jsonStr;

    public static UploadDataSyncRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadDataSyncRequest self = new UploadDataSyncRequest();
        return TeaModel.build(map, self);
    }

    public UploadDataSyncRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
