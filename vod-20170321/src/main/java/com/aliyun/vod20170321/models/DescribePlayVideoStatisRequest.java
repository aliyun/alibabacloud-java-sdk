// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribePlayVideoStatisRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("StartTime")
    @Validation(required = true)
    public String startTime;

    @NameInMap("EndTime")
    @Validation(required = true)
    public String endTime;

    @NameInMap("VideoId")
    @Validation(required = true)
    public String videoId;

    public static DescribePlayVideoStatisRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePlayVideoStatisRequest self = new DescribePlayVideoStatisRequest();
        return TeaModel.build(map, self);
    }

}
