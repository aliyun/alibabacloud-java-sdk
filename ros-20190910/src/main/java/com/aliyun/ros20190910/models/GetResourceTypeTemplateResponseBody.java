// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetResourceTypeTemplateResponseBody extends TeaModel {
    @NameInMap("TemplateBody")
    public java.util.Map<String, ?> templateBody;

    @NameInMap("RequestId")
    public String requestId;

    public static GetResourceTypeTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetResourceTypeTemplateResponseBody self = new GetResourceTypeTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetResourceTypeTemplateResponseBody setTemplateBody(java.util.Map<String, ?> templateBody) {
        this.templateBody = templateBody;
        return this;
    }
    public java.util.Map<String, ?> getTemplateBody() {
        return this.templateBody;
    }

    public GetResourceTypeTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
