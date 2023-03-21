// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateOrUpdateAssetGroupResponseBody extends TeaModel {
    @NameInMap("GroupId")
    public Long groupId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateOrUpdateAssetGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateOrUpdateAssetGroupResponseBody self = new CreateOrUpdateAssetGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateOrUpdateAssetGroupResponseBody setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public CreateOrUpdateAssetGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
