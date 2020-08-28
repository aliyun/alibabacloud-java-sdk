// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20190810.models;

import com.aliyun.tea.*;

public class DescribeJMeterChainDetailRequest extends TeaModel {
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
    public Long thread;

    @NameInMap("Kw")
    public String kw;

    @NameInMap("SamplerId")
    public Integer samplerId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeJMeterChainDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeJMeterChainDetailRequest self = new DescribeJMeterChainDetailRequest();
        return TeaModel.build(map, self);
    }

}
