// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteEditingProjectRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("ResourceOwnerId")
    public String resourceOwnerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("ProjectIds")
    @Validation(required = true)
    public String projectIds;

    public static DeleteEditingProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteEditingProjectRequest self = new DeleteEditingProjectRequest();
        return TeaModel.build(map, self);
    }

}
