// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20190810.models;

import com.aliyun.tea.*;

public class DescribeReportRequest extends TeaModel {
    @NameInMap("ReportId")
    @Validation(required = true)
    public String reportId;

    public static DescribeReportRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeReportRequest self = new DescribeReportRequest();
        return TeaModel.build(map, self);
    }

}
