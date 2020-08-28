// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CreateUploadVideoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("VideoId")
    @Validation(required = true)
    public String videoId;

    @NameInMap("UploadAddress")
    @Validation(required = true)
    public String uploadAddress;

    @NameInMap("UploadAuth")
    @Validation(required = true)
    public String uploadAuth;

    public static CreateUploadVideoResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateUploadVideoResponse self = new CreateUploadVideoResponse();
        return TeaModel.build(map, self);
    }

}
