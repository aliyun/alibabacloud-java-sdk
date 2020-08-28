// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListTranscodeTemplateGroupRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("AppId")
    public String appId;

    public static ListTranscodeTemplateGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTranscodeTemplateGroupRequest self = new ListTranscodeTemplateGroupRequest();
        return TeaModel.build(map, self);
    }

}
