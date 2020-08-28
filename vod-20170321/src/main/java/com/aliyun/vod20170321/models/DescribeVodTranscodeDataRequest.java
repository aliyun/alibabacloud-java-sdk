// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodTranscodeDataRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("StartTime")
    @Validation(required = true)
    public String startTime;

    @NameInMap("EndTime")
    @Validation(required = true)
    public String endTime;

    @NameInMap("Region")
    public String region;

    @NameInMap("Interval")
    public String interval;

    @NameInMap("Storage")
    public String storage;

    @NameInMap("Specification")
    public String specification;

    public static DescribeVodTranscodeDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodTranscodeDataRequest self = new DescribeVodTranscodeDataRequest();
        return TeaModel.build(map, self);
    }

}
