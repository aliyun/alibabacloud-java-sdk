// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class ChangeVideoSizeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public ChangeVideoSizeResponseData data;

    public static ChangeVideoSizeResponse build(java.util.Map<String, ?> map) throws Exception {
        ChangeVideoSizeResponse self = new ChangeVideoSizeResponse();
        return TeaModel.build(map, self);
    }

    public static class ChangeVideoSizeResponseData extends TeaModel {
        @NameInMap("VideoUrl")
        @Validation(required = true)
        public String videoUrl;

        @NameInMap("VideoCoverUrl")
        @Validation(required = true)
        public String videoCoverUrl;

        public static ChangeVideoSizeResponseData build(java.util.Map<String, ?> map) throws Exception {
            ChangeVideoSizeResponseData self = new ChangeVideoSizeResponseData();
            return TeaModel.build(map, self);
        }

    }

}
