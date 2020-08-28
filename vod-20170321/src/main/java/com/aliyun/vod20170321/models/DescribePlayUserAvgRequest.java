// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribePlayUserAvgRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("StartTime")
    @Validation(required = true)
    public String startTime;

    @NameInMap("EndTime")
    @Validation(required = true)
    public String endTime;

    public static DescribePlayUserAvgRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePlayUserAvgRequest self = new DescribePlayUserAvgRequest();
        return TeaModel.build(map, self);
    }

}
