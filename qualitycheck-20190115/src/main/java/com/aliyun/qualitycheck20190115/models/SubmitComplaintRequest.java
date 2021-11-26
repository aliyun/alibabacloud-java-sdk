// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class SubmitComplaintRequest extends TeaModel {
    @NameInMap("JsonStr")
    public String jsonStr;

    public static SubmitComplaintRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitComplaintRequest self = new SubmitComplaintRequest();
        return TeaModel.build(map, self);
    }

    public SubmitComplaintRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
