// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateMSDdsJobStatusRequest extends TeaModel {
    @NameInMap("Id")
    public Integer id;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Status")
    public String status;

    public static UpdateMSDdsJobStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMSDdsJobStatusRequest self = new UpdateMSDdsJobStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMSDdsJobStatusRequest setId(Integer id) {
        this.id = id;
        return this;
    }
    public Integer getId() {
        return this.id;
    }

    public UpdateMSDdsJobStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateMSDdsJobStatusRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
