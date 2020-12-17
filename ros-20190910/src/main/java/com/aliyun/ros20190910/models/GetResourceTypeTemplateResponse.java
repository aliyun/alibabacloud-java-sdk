// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetResourceTypeTemplateResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TemplateBody")
    @Validation(required = true)
    public java.util.Map<String, ?> templateBody;

    public static GetResourceTypeTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetResourceTypeTemplateResponse self = new GetResourceTypeTemplateResponse();
        return TeaModel.build(map, self);
    }

    public GetResourceTypeTemplateResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetResourceTypeTemplateResponse setTemplateBody(java.util.Map<String, ?> templateBody) {
        this.templateBody = templateBody;
        return this;
    }
    public java.util.Map<String, ?> getTemplateBody() {
        return this.templateBody;
    }

}
