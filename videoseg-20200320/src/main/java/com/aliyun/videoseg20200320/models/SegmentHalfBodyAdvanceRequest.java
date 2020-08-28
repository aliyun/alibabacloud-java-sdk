// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoseg20200320.models;

import com.aliyun.tea.*;

public class SegmentHalfBodyAdvanceRequest extends TeaModel {
    @NameInMap("VideoUrlObject")
    @Validation(required = true)
    public java.io.InputStream videoUrlObject;

    public static SegmentHalfBodyAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        SegmentHalfBodyAdvanceRequest self = new SegmentHalfBodyAdvanceRequest();
        return TeaModel.build(map, self);
    }

}
