// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class RevertAssignedSessionGroupRequest extends TeaModel {
    @NameInMap("jsonStr")
    public String jsonStr;

    public static RevertAssignedSessionGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        RevertAssignedSessionGroupRequest self = new RevertAssignedSessionGroupRequest();
        return TeaModel.build(map, self);
    }

    public RevertAssignedSessionGroupRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
