// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CreateUploadAttachedMediaResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("MediaId")
    @Validation(required = true)
    public String mediaId;

    @NameInMap("MediaURL")
    @Validation(required = true)
    public String mediaURL;

    @NameInMap("UploadAddress")
    @Validation(required = true)
    public String uploadAddress;

    @NameInMap("UploadAuth")
    @Validation(required = true)
    public String uploadAuth;

    @NameInMap("FileURL")
    @Validation(required = true)
    public String fileURL;

    public static CreateUploadAttachedMediaResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateUploadAttachedMediaResponse self = new CreateUploadAttachedMediaResponse();
        return TeaModel.build(map, self);
    }

}
