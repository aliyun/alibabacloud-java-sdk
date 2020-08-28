// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20190810.models;

import com.aliyun.tea.*;

public class DescribeJMeterPlanRequest extends TeaModel {
    @NameInMap("ReportId")
    @Validation(required = true)
    public String reportId;

    public static DescribeJMeterPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeJMeterPlanRequest self = new DescribeJMeterPlanRequest();
        return TeaModel.build(map, self);
    }

}
