// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetResourceTypeTemplateRequest extends TeaModel {
    @NameInMap("ResourceType")
    @Validation(required = true)
    public String resourceType;

    public static GetResourceTypeTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetResourceTypeTemplateRequest self = new GetResourceTypeTemplateRequest();
        return TeaModel.build(map, self);
    }

}
