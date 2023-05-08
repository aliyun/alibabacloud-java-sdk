// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyRefreshProcessInfoRequest extends TeaModel {
    @NameInMap("Uuid")
    public String uuid;

    public static ModifyRefreshProcessInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyRefreshProcessInfoRequest self = new ModifyRefreshProcessInfoRequest();
        return TeaModel.build(map, self);
    }

    public ModifyRefreshProcessInfoRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
