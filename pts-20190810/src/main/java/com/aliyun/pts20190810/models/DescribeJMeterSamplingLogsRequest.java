// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20190810.models;

import com.aliyun.tea.*;

public class DescribeJMeterSamplingLogsRequest extends TeaModel {
    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("BeginTime")
    public Long beginTime;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("ReportId")
    @Validation(required = true)
    public String reportId;

    @NameInMap("TaskId")
    public Long taskId;

    @NameInMap("SamplerId")
    public Integer samplerId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Thread")
    public String thread;

    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("RtRange")
    public String rtRange;

    public static DescribeJMeterSamplingLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeJMeterSamplingLogsRequest self = new DescribeJMeterSamplingLogsRequest();
        return TeaModel.build(map, self);
    }

}
