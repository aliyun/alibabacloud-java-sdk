// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class AddUploadDataSetRequest extends TeaModel {
    @NameInMap("JsonStr")
    public String jsonStr;

    public static AddUploadDataSetRequest build(java.util.Map<String, ?> map) throws Exception {
        AddUploadDataSetRequest self = new AddUploadDataSetRequest();
        return TeaModel.build(map, self);
    }

    public AddUploadDataSetRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
