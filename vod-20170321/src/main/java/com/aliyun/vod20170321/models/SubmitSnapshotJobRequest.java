// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitSnapshotJobRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("VideoId")
    public String videoId;

    @NameInMap("SpecifiedOffsetTime")
    public Long specifiedOffsetTime;

    @NameInMap("Width")
    public String width;

    @NameInMap("Height")
    public String height;

    @NameInMap("Count")
    public Long count;

    @NameInMap("Interval")
    public Long interval;

    @NameInMap("SpriteSnapshotConfig")
    public String spriteSnapshotConfig;

    @NameInMap("SnapshotTemplateId")
    public String snapshotTemplateId;

    @NameInMap("UserData")
    public String userData;

    @NameInMap("FileUrl")
    public String fileUrl;

    public static SubmitSnapshotJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitSnapshotJobRequest self = new SubmitSnapshotJobRequest();
        return TeaModel.build(map, self);
    }

}
