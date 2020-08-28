// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetTemplateEstimateCostResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Resources")
    @Validation(required = true)
    public java.util.Map<String, ?> resources;

    public static GetTemplateEstimateCostResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTemplateEstimateCostResponse self = new GetTemplateEstimateCostResponse();
        return TeaModel.build(map, self);
    }

}
