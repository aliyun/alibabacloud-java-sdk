// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20190810.models;

import com.aliyun.tea.*;

public class DescribeJMeterPlanResponse extends TeaModel {
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

    @NameInMap("Report")
    @Validation(required = true)
    public String report;

    public static DescribeJMeterPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeJMeterPlanResponse self = new DescribeJMeterPlanResponse();
        return TeaModel.build(map, self);
    }

}
