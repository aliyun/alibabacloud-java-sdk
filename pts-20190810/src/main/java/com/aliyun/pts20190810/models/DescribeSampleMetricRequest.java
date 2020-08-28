// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20190810.models;

import com.aliyun.tea.*;

public class DescribeSampleMetricRequest extends TeaModel {
    @NameInMap("ReportId")
    public String reportId;

    @NameInMap("SamplerId")
    public Integer samplerId;

    @NameInMap("BeginTime")
    public Long beginTime;

    @NameInMap("EndTime")
    public Long endTime;

    public static DescribeSampleMetricRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSampleMetricRequest self = new DescribeSampleMetricRequest();
        return TeaModel.build(map, self);
    }

}
