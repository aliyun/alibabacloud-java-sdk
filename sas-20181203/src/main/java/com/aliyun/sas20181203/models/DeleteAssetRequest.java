// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteAssetRequest extends TeaModel {
    @NameInMap("Uuid")
    public String uuid;

    public static DeleteAssetRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAssetRequest self = new DeleteAssetRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAssetRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
