// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20190810.models;

import com.aliyun.tea.*;

public class DescribeJMeterTaskListRequest extends TeaModel {
    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("ReportId")
    public String reportId;

    public static DescribeJMeterTaskListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeJMeterTaskListRequest self = new DescribeJMeterTaskListRequest();
        return TeaModel.build(map, self);
    }

}
