// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodMultiUsageDataRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TimePoint")
    public String timePoint;

    public static DescribeVodMultiUsageDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodMultiUsageDataRequest self = new DescribeVodMultiUsageDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVodMultiUsageDataRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeVodMultiUsageDataRequest setTimePoint(String timePoint) {
        this.timePoint = timePoint;
        return this;
    }
    public String getTimePoint() {
        return this.timePoint;
    }

}
