// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20190810.models;

import com.aliyun.tea.*;

public class DescribeJMeterSampleSummaryResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("HttpStatusCode")
    @Validation(required = true)
    public Integer httpStatusCode;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("ConcurrencyRtStat")
    @Validation(required = true)
    public java.util.Map<String, ?> concurrencyRtStat;

    @NameInMap("ConcurrencyTpsStat")
    @Validation(required = true)
    public java.util.Map<String, ?> concurrencyTpsStat;

    @NameInMap("RtDistribution")
    @Validation(required = true)
    public java.util.Map<String, ?> rtDistribution;

    public static DescribeJMeterSampleSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeJMeterSampleSummaryResponse self = new DescribeJMeterSampleSummaryResponse();
        return TeaModel.build(map, self);
    }

}
