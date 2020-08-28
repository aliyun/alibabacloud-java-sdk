// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CreateUploadImageResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ImageId")
    @Validation(required = true)
    public String imageId;

    @NameInMap("ImageURL")
    @Validation(required = true)
    public String imageURL;

    @NameInMap("UploadAddress")
    @Validation(required = true)
    public String uploadAddress;

    @NameInMap("UploadAuth")
    @Validation(required = true)
    public String uploadAuth;

    @NameInMap("FileURL")
    @Validation(required = true)
    public String fileURL;

    public static CreateUploadImageResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateUploadImageResponse self = new CreateUploadImageResponse();
        return TeaModel.build(map, self);
    }

}
