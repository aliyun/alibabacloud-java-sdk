// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AddEditingProjectRequest extends TeaModel {
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

    @NameInMap("Title")
    @Validation(required = true)
    public String title;

    @NameInMap("Description")
    public String description;

    @NameInMap("Timeline")
    public String timeline;

    @NameInMap("CoverURL")
    public String coverURL;

    @NameInMap("Division")
    public String division;

    public static AddEditingProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        AddEditingProjectRequest self = new AddEditingProjectRequest();
        return TeaModel.build(map, self);
    }

}
