// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetEditingProjectMaterialsRequest extends TeaModel {
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

    @NameInMap("Type")
    public String type;

    @NameInMap("MaterialType")
    public String materialType;

    public static GetEditingProjectMaterialsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEditingProjectMaterialsRequest self = new GetEditingProjectMaterialsRequest();
        return TeaModel.build(map, self);
    }

}
