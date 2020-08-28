// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class AddTagsToResourceRequest extends TeaModel {
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
    public java.util.List<AddTagsToResourceRequestTag> tag;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    public static AddTagsToResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        AddTagsToResourceRequest self = new AddTagsToResourceRequest();
        return TeaModel.build(map, self);
    }

    public static class AddTagsToResourceRequestTag extends TeaModel {
        @NameInMap("key")
        public String key;

        @NameInMap("value")
        public String value;

        public static AddTagsToResourceRequestTag build(java.util.Map<String, ?> map) throws Exception {
            AddTagsToResourceRequestTag self = new AddTagsToResourceRequestTag();
            return TeaModel.build(map, self);
        }

    }

}
