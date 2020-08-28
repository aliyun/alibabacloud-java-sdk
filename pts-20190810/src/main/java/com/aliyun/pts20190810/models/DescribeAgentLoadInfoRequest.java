// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20190810.models;

import com.aliyun.tea.*;

public class DescribeAgentLoadInfoRequest extends TeaModel {
    @NameInMap("ReportId")
    @Validation(required = true)
    public String reportId;

    @NameInMap("TaskId")
    @Validation(required = true)
    public Long taskId;

    @NameInMap("BeginTime")
    public Long beginTime;

    @NameInMap("EndTime")
    public Long endTime;

    public static DescribeAgentLoadInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAgentLoadInfoRequest self = new DescribeAgentLoadInfoRequest();
        return TeaModel.build(map, self);
    }

}
