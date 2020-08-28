// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetURLUploadInfosRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("JobIds")
    public String jobIds;

    @NameInMap("UploadURLs")
    public String uploadURLs;

    public static GetURLUploadInfosRequest build(java.util.Map<String, ?> map) throws Exception {
        GetURLUploadInfosRequest self = new GetURLUploadInfosRequest();
        return TeaModel.build(map, self);
    }

}
