// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class UploadDataRequest extends TeaModel {
    @NameInMap("JsonStr")
    public String jsonStr;

    public static UploadDataRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadDataRequest self = new UploadDataRequest();
        return TeaModel.build(map, self);
    }

    public UploadDataRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
