// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetResourceTypeResponse extends TeaModel {
    @NameInMap("Attributes")
    @Validation(required = true)
    public java.util.Map<String, ?> attributes;

    @NameInMap("Properties")
    @Validation(required = true)
    public java.util.Map<String, ?> properties;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ResourceType")
    @Validation(required = true)
    public String resourceType;

    @NameInMap("SupportDriftDetection")
    @Validation(required = true)
    public Boolean supportDriftDetection;

    public static GetResourceTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetResourceTypeResponse self = new GetResourceTypeResponse();
        return TeaModel.build(map, self);
    }

}
