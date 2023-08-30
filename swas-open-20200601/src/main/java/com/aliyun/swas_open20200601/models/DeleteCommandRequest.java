// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class DeleteCommandRequest extends TeaModel {
    @NameInMap("CommandId")
    public String commandId;

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteCommandRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCommandRequest self = new DeleteCommandRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCommandRequest setCommandId(String commandId) {
        this.commandId = commandId;
        return this;
    }
    public String getCommandId() {
        return this.commandId;
    }

    public DeleteCommandRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
