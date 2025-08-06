// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateCustomTemplateAndGroupConsoleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public Boolean result;

    public static UpdateCustomTemplateAndGroupConsoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateCustomTemplateAndGroupConsoleResponseBody self = new UpdateCustomTemplateAndGroupConsoleResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateCustomTemplateAndGroupConsoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateCustomTemplateAndGroupConsoleResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
