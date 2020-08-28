// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteAITemplateResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TemplateId")
    @Validation(required = true)
    public String templateId;

    public static DeleteAITemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAITemplateResponse self = new DeleteAITemplateResponse();
        return TeaModel.build(map, self);
    }

}
