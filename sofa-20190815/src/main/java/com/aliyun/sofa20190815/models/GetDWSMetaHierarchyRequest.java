// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDWSMetaHierarchyRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RdsMetaModelJsonStr")
    public String rdsMetaModelJsonStr;

    public static GetDWSMetaHierarchyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDWSMetaHierarchyRequest self = new GetDWSMetaHierarchyRequest();
        return TeaModel.build(map, self);
    }

    public GetDWSMetaHierarchyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetDWSMetaHierarchyRequest setRdsMetaModelJsonStr(String rdsMetaModelJsonStr) {
        this.rdsMetaModelJsonStr = rdsMetaModelJsonStr;
        return this;
    }
    public String getRdsMetaModelJsonStr() {
        return this.rdsMetaModelJsonStr;
    }

}
