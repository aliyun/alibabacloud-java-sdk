// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class ListBusinessSpacesRequest extends TeaModel {
    @NameInMap("JsonStr")
    public String jsonStr;

    public static ListBusinessSpacesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBusinessSpacesRequest self = new ListBusinessSpacesRequest();
        return TeaModel.build(map, self);
    }

    public ListBusinessSpacesRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
