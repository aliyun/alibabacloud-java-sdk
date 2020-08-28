// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class CreateTemplateResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TemplateId")
    @Validation(required = true)
    public String templateId;

    public static CreateTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTemplateResponse self = new CreateTemplateResponse();
        return TeaModel.build(map, self);
    }

}
