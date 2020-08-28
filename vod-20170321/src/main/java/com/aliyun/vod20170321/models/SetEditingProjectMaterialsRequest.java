// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SetEditingProjectMaterialsRequest extends TeaModel {
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

    @NameInMap("ProjectId")
    @Validation(required = true)
    public String projectId;

    @NameInMap("MaterialIds")
    @Validation(required = true)
    public String materialIds;

    public static SetEditingProjectMaterialsRequest build(java.util.Map<String, ?> map) throws Exception {
        SetEditingProjectMaterialsRequest self = new SetEditingProjectMaterialsRequest();
        return TeaModel.build(map, self);
    }

}
