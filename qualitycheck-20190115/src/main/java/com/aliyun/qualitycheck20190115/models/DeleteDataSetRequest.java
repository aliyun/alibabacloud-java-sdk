// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class DeleteDataSetRequest extends TeaModel {
    @NameInMap("JsonStr")
    public String jsonStr;

    public static DeleteDataSetRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataSetRequest self = new DeleteDataSetRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDataSetRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
