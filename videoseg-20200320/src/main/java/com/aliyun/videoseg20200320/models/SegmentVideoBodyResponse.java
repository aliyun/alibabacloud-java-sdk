// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoseg20200320.models;

import com.aliyun.tea.*;

public class SegmentVideoBodyResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public SegmentVideoBodyResponseData data;

    public static SegmentVideoBodyResponse build(java.util.Map<String, ?> map) throws Exception {
        SegmentVideoBodyResponse self = new SegmentVideoBodyResponse();
        return TeaModel.build(map, self);
    }

    public static class SegmentVideoBodyResponseData extends TeaModel {
        @NameInMap("VideoUrl")
        @Validation(required = true)
        public String videoUrl;

        public static SegmentVideoBodyResponseData build(java.util.Map<String, ?> map) throws Exception {
            SegmentVideoBodyResponseData self = new SegmentVideoBodyResponseData();
            return TeaModel.build(map, self);
        }

    }

}
