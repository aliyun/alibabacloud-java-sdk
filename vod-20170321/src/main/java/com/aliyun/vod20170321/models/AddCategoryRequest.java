// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AddCategoryRequest extends TeaModel {
    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("ResourceOwnerId")
    public String resourceOwnerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("CateName")
    @Validation(required = true)
    public String cateName;

    @NameInMap("ParentId")
    public Long parentId;

    @NameInMap("Type")
    public String type;

    public static AddCategoryRequest build(java.util.Map<String, ?> map) throws Exception {
        AddCategoryRequest self = new AddCategoryRequest();
        return TeaModel.build(map, self);
    }

}
