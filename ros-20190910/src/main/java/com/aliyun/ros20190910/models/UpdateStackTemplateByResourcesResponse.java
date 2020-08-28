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

}
