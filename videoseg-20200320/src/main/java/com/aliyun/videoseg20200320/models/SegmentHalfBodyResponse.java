// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoseg20200320.models;

import com.aliyun.tea.*;

public class SegmentHalfBodyResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public SegmentHalfBodyResponseData data;

    public static SegmentHalfBodyResponse build(java.util.Map<String, ?> map) throws Exception {
        SegmentHalfBodyResponse self = new SegmentHalfBodyResponse();
        return TeaModel.build(map, self);
    }

    public static class SegmentHalfBodyResponseData extends TeaModel {
        @NameInMap("VideoUrl")
        @Validation(required = true)
        public String videoUrl;

        public static SegmentHalfBodyResponseData build(java.util.Map<String, ?> map) throws Exception {
            SegmentHalfBodyResponseData self = new SegmentHalfBodyResponseData();
            return TeaModel.build(map, self);
        }

    }

}
