// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20190810.models;

import com.aliyun.tea.*;

public class DescribeReportChainSummaryRequest extends TeaModel {
    @NameInMap("ReportId")
    @Validation(required = true)
    public String reportId;

    public static DescribeReportChainSummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeReportChainSummaryRequest self = new DescribeReportChainSummaryRequest();
        return TeaModel.build(map, self);
    }

}
