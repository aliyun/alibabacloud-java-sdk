// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class UpdateStackTemplateByResourcesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("OldTemplateBody")
    @Validation(required = true)
    public String oldTemplateBody;

    @NameInMap("NewTemplateBody")
    @Validation(required = true)
    public String newTemplateBody;

    public static UpdateStackTemplateByResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateStackTemplateByResourcesResponse self = new UpdateStackTemplateByResourcesResponse();
        return TeaModel.build(map, self);
    }

    public UpdateStackTemplateByResourcesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateStackTemplateByResourcesResponse setOldTemplateBody(String oldTemplateBody) {
        this.oldTemplateBody = oldTemplateBody;
        return this;
    }
    public String getOldTemplateBody() {
        return this.oldTemplateBody;
    }

    public UpdateStackTemplateByResourcesResponse setNewTemplateBody(String newTemplateBody) {
        this.newTemplateBody = newTemplateBody;
        return this;
    }
    public String getNewTemplateBody() {
        return this.newTemplateBody;
    }

}
