// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class RemoveTagsFromResourceRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("proxyId")
    public String proxyId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    @NameInMap("Tags")
    public String tags;

    @NameInMap("Tag")
    @Validation(required = true)
    public java.util.List<RemoveTagsFromResourceRequestTag> tag;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    public static RemoveTagsFromResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveTagsFromResourceRequest self = new RemoveTagsFromResourceRequest();
        return TeaModel.build(map, self);
    }

    public static class RemoveTagsFromResourceRequestTag extends TeaModel {
        @NameInMap("key")
        public String key;

        @NameInMap("value")
        public String value;

        public static RemoveTagsFromResourceRequestTag build(java.util.Map<String, ?> map) throws Exception {
            RemoveTagsFromResourceRequestTag self = new RemoveTagsFromResourceRequestTag();
            return TeaModel.build(map, self);
        }

    }

}
