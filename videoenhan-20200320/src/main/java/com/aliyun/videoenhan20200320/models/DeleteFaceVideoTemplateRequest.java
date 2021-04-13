// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class DeleteFaceVideoTemplateRequest extends TeaModel {
    // A short description of struct
    @NameInMap("UserId")
    public String userId;

    @NameInMap("TemplateId")
    public String templateId;

    public static DeleteFaceVideoTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteFaceVideoTemplateRequest self = new DeleteFaceVideoTemplateRequest();
        return TeaModel.build(map, self);
    }

    public DeleteFaceVideoTemplateRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public DeleteFaceVideoTemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
