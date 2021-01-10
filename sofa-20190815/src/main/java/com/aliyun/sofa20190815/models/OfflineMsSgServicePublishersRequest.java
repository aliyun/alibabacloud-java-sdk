// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class OfflineMsSgServicePublishersRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Ips")
    public String ips;

    public static OfflineMsSgServicePublishersRequest build(java.util.Map<String, ?> map) throws Exception {
        OfflineMsSgServicePublishersRequest self = new OfflineMsSgServicePublishersRequest();
        return TeaModel.build(map, self);
    }

    public OfflineMsSgServicePublishersRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public OfflineMsSgServicePublishersRequest setIps(String ips) {
        this.ips = ips;
        return this;
    }
    public String getIps() {
        return this.ips;
    }

}
