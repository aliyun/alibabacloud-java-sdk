// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class UpdateStackTemplateByResourcesResponseBody extends TeaModel {
    @NameInMap("NewTemplateBody")
    public String newTemplateBody;

    @NameInMap("OldTemplateBody")
    public String oldTemplateBody;

    @NameInMap("RequestId")
    public String requestId;

    public static UpdateStackTemplateByResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateStackTemplateByResourcesResponseBody self = new UpdateStackTemplateByResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateStackTemplateByResourcesResponseBody setNewTemplateBody(String newTemplateBody) {
        this.newTemplateBody = newTemplateBody;
        return this;
    }
    public String getNewTemplateBody() {
        return this.newTemplateBody;
    }

    public UpdateStackTemplateByResourcesResponseBody setOldTemplateBody(String oldTemplateBody) {
        this.oldTemplateBody = oldTemplateBody;
        return this;
    }
    public String getOldTemplateBody() {
        return this.oldTemplateBody;
    }

    public UpdateStackTemplateByResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
