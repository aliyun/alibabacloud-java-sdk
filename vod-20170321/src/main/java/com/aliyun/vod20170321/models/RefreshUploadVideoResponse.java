// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class RefreshUploadVideoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("UploadAuth")
    @Validation(required = true)
    public String uploadAuth;

    @NameInMap("UploadAddress")
    @Validation(required = true)
    public String uploadAddress;

    @NameInMap("VideoId")
    @Validation(required = true)
    public String videoId;

    public static RefreshUploadVideoResponse build(java.util.Map<String, ?> map) throws Exception {
        RefreshUploadVideoResponse self = new RefreshUploadVideoResponse();
        return TeaModel.build(map, self);
    }

}
