// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20190810.models;

import com.aliyun.tea.*;

public class DescribeReportChainDetailRequest extends TeaModel {
    @NameInMap("ReportId")
    @Validation(required = true)
    public String reportId;

    @NameInMap("ChainId")
    public Long chainId;

    @NameInMap("BeginTime")
    public Long beginTime;

    @NameInMap("EndTime")
    public Long endTime;

    public static DescribeReportChainDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeReportChainDetailRequest self = new DescribeReportChainDetailRequest();
        return TeaModel.build(map, self);
    }

}
