// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class SaveConfigDataSetRequest extends TeaModel {
    @NameInMap("JsonStr")
    public String jsonStr;

    public static SaveConfigDataSetRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveConfigDataSetRequest self = new SaveConfigDataSetRequest();
        return TeaModel.build(map, self);
    }

    public SaveConfigDataSetRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
