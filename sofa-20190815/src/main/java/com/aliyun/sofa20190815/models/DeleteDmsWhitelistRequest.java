// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteDmsWhitelistRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    @NameInMap("InstanceId")
    public String instanceId;

    public static DeleteDmsWhitelistRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDmsWhitelistRequest self = new DeleteDmsWhitelistRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDmsWhitelistRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DeleteDmsWhitelistRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
