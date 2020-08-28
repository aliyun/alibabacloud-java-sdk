// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ProduceEditingProjectVideoRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("Timeline")
    public String timeline;

    @NameInMap("Title")
    public String title;

    @NameInMap("Description")
    public String description;

    @NameInMap("CoverURL")
    public String coverURL;

    @NameInMap("MediaMetadata")
    public String mediaMetadata;

    @NameInMap("ProduceConfig")
    public String produceConfig;

    @NameInMap("UserData")
    public String userData;

    public static ProduceEditingProjectVideoRequest build(java.util.Map<String, ?> map) throws Exception {
        ProduceEditingProjectVideoRequest self = new ProduceEditingProjectVideoRequest();
        return TeaModel.build(map, self);
    }

}
