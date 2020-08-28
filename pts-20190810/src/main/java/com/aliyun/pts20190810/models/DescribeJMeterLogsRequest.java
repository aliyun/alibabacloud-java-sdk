// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20190810.models;

import com.aliyun.tea.*;

public class DescribeJMeterLogsRequest extends TeaModel {
    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("ReportId")
    public String reportId;

    @NameInMap("BeginTime")
    public Long beginTime;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("TaskId")
    public Long taskId;

    @NameInMap("Thread")
    public String thread;

    @NameInMap("Level")
    public String level;

    @NameInMap("LoggerName")
    public String loggerName;

    @NameInMap("Keyword")
    public String keyword;

    public static DescribeJMeterLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeJMeterLogsRequest self = new DescribeJMeterLogsRequest();
        return TeaModel.build(map, self);
    }

}
