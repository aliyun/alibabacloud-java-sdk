// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20190810.models;

import com.aliyun.tea.*;

public class DescribeJMeterSampleSummaryRequest extends TeaModel {
    @NameInMap("ReportId")
    @Validation(required = true)
    public String reportId;

    @NameInMap("SamplerId")
    @Validation(required = true)
    public Integer samplerId;

    public static DescribeJMeterSampleSummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeJMeterSampleSummaryRequest self = new DescribeJMeterSampleSummaryRequest();
        return TeaModel.build(map, self);
    }

}
