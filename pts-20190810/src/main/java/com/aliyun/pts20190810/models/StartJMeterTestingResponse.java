// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20190810.models;

import com.aliyun.tea.*;

public class StartJMeterTestingResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("HttpStatusCode")
    @Validation(required = true)
    public Integer httpStatusCode;

    @NameInMap("PlanId")
    @Validation(required = true)
    public String planId;

    public static StartJMeterTestingResponse build(java.util.Map<String, ?> map) throws Exception {
        StartJMeterTestingResponse self = new StartJMeterTestingResponse();
        return TeaModel.build(map, self);
    }

}
