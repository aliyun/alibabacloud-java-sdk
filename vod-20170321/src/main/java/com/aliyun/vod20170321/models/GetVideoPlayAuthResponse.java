// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetVideoPlayAuthResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PlayAuth")
    @Validation(required = true)
    public String playAuth;

    @NameInMap("VideoMeta")
    @Validation(required = true)
    public GetVideoPlayAuthResponseVideoMeta videoMeta;

    public static GetVideoPlayAuthResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVideoPlayAuthResponse self = new GetVideoPlayAuthResponse();
        return TeaModel.build(map, self);
    }

    public static class GetVideoPlayAuthResponseVideoMeta extends TeaModel {
        @NameInMap("CoverURL")
        @Validation(required = true)
        public String coverURL;

        @NameInMap("Duration")
        @Validation(required = true)
        public Double duration;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("Title")
        @Validation(required = true)
        public String title;

        @NameInMap("VideoId")
        @Validation(required = true)
        public String videoId;

        public static GetVideoPlayAuthResponseVideoMeta build(java.util.Map<String, ?> map) throws Exception {
            GetVideoPlayAuthResponseVideoMeta self = new GetVideoPlayAuthResponseVideoMeta();
            return TeaModel.build(map, self);
        }

    }

}
