// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoseg20200320.models;

import com.aliyun.tea.*;

public class SegmentVideoBodyRequest extends TeaModel {
    @NameInMap("VideoUrl")
    @Validation(required = true)
    public String videoUrl;

    public static SegmentVideoBodyRequest build(java.util.Map<String, ?> map) throws Exception {
        SegmentVideoBodyRequest self = new SegmentVideoBodyRequest();
        return TeaModel.build(map, self);
    }

}
