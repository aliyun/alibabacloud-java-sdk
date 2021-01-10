// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDWSSubsConnectionStringRequest extends TeaModel {
    @NameInMap("ConnectionString")
    public String connectionString;

    @NameInMap("InstanceId")
    public String instanceId;

    public static GetDWSSubsConnectionStringRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDWSSubsConnectionStringRequest self = new GetDWSSubsConnectionStringRequest();
        return TeaModel.build(map, self);
    }

    public GetDWSSubsConnectionStringRequest setConnectionString(String connectionString) {
        this.connectionString = connectionString;
        return this;
    }
    public String getConnectionString() {
        return this.connectionString;
    }

    public GetDWSSubsConnectionStringRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
