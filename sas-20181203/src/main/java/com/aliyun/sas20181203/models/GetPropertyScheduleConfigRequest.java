// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetPropertyScheduleConfigRequest extends TeaModel {
    @NameInMap("Type")
    public String type;

    @NameInMap("Uuid")
    public String uuid;

    public static GetPropertyScheduleConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPropertyScheduleConfigRequest self = new GetPropertyScheduleConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetPropertyScheduleConfigRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public GetPropertyScheduleConfigRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
