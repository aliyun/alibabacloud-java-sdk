// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoseg20200320.models;

import com.aliyun.tea.*;

public class SegmentHalfBodyRequest extends TeaModel {
    @NameInMap("VideoUrl")
    @Validation(required = true)
    public String videoUrl;

    public static SegmentHalfBodyRequest build(java.util.Map<String, ?> map) throws Exception {
        SegmentHalfBodyRequest self = new SegmentHalfBodyRequest();
        return TeaModel.build(map, self);
    }

}
