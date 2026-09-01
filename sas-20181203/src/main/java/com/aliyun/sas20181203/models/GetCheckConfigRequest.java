// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetCheckConfigRequest extends TeaModel {
    @NameInMap("ResourceDirectoryAccountId")
    public Long resourceDirectoryAccountId;

    public static GetCheckConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCheckConfigRequest self = new GetCheckConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetCheckConfigRequest setResourceDirectoryAccountId(Long resourceDirectoryAccountId) {
        this.resourceDirectoryAccountId = resourceDirectoryAccountId;
        return this;
    }
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

}
