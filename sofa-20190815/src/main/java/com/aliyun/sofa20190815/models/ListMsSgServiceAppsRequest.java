// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListMsSgServiceAppsRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static ListMsSgServiceAppsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMsSgServiceAppsRequest self = new ListMsSgServiceAppsRequest();
        return TeaModel.build(map, self);
    }

    public ListMsSgServiceAppsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
