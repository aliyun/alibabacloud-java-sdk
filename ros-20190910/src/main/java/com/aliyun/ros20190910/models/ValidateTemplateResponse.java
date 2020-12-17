// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ValidateTemplateResponse extends TeaModel {
    @NameInMap("Description")
    @Validation(required = true)
    public String description;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Parameters")
    @Validation(required = true)
    public java.util.List<java.util.Map<String, ?>> parameters;

    public static ValidateTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        ValidateTemplateResponse self = new ValidateTemplateResponse();
        return TeaModel.build(map, self);
    }

    public ValidateTemplateResponse setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ValidateTemplateResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ValidateTemplateResponse setParameters(java.util.List<java.util.Map<String, ?>> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getParameters() {
        return this.parameters;
    }

}
