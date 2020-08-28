// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListMediaDNADeleteJobRequest extends TeaModel {
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

    @NameInMap("JobIds")
    @Validation(required = true)
    public String jobIds;

    public static ListMediaDNADeleteJobRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMediaDNADeleteJobRequest self = new ListMediaDNADeleteJobRequest();
        return TeaModel.build(map, self);
    }

}
