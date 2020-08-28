// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteImageRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("DeleteImageType")
    @Validation(required = true)
    public String deleteImageType;

    @NameInMap("ImageURLs")
    public String imageURLs;

    @NameInMap("ImageIds")
    public String imageIds;

    @NameInMap("VideoId")
    public String videoId;

    @NameInMap("ImageType")
    public String imageType;

    public static DeleteImageRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteImageRequest self = new DeleteImageRequest();
        return TeaModel.build(map, self);
    }

}
