// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class UpdateTemplateResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TemplateId")
    @Validation(required = true)
    public String templateId;

    public static UpdateTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTemplateResponse self = new UpdateTemplateResponse();
        return TeaModel.build(map, self);
    }

}
