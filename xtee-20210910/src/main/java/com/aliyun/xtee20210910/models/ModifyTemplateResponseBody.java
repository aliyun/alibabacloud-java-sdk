// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class ModifyTemplateResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("resultObject")
    public Boolean resultObject;

    public static ModifyTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyTemplateResponseBody self = new ModifyTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyTemplateResponseBody setResultObject(Boolean resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public Boolean getResultObject() {
        return this.resultObject;
    }

}
