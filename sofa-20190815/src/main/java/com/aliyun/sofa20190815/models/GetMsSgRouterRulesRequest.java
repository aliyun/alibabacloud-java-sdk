// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetMsSgRouterRulesRequest extends TeaModel {
    @NameInMap("DataId")
    public String dataId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Type")
    public String type;

    public static GetMsSgRouterRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMsSgRouterRulesRequest self = new GetMsSgRouterRulesRequest();
        return TeaModel.build(map, self);
    }

    public GetMsSgRouterRulesRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public GetMsSgRouterRulesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetMsSgRouterRulesRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
