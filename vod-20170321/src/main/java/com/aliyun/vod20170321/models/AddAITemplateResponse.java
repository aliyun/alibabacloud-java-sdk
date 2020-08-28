// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AddAITemplateResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TemplateId")
    @Validation(required = true)
    public String templateId;

    public static AddAITemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        AddAITemplateResponse self = new AddAITemplateResponse();
        return TeaModel.build(map, self);
    }

}
