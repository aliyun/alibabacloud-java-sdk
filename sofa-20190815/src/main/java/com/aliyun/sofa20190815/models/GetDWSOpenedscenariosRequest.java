// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDWSOpenedscenariosRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetDWSOpenedscenariosRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDWSOpenedscenariosRequest self = new GetDWSOpenedscenariosRequest();
        return TeaModel.build(map, self);
    }

    public GetDWSOpenedscenariosRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
