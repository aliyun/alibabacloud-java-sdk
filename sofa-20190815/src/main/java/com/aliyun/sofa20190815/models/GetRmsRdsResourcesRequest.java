// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetRmsRdsResourcesRequest extends TeaModel {
    @NameInMap("EnvJsonStr")
    public String envJsonStr;

    @NameInMap("QueryJsonStr")
    public String queryJsonStr;

    public static GetRmsRdsResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRmsRdsResourcesRequest self = new GetRmsRdsResourcesRequest();
        return TeaModel.build(map, self);
    }

    public GetRmsRdsResourcesRequest setEnvJsonStr(String envJsonStr) {
        this.envJsonStr = envJsonStr;
        return this;
    }
    public String getEnvJsonStr() {
        return this.envJsonStr;
    }

    public GetRmsRdsResourcesRequest setQueryJsonStr(String queryJsonStr) {
        this.queryJsonStr = queryJsonStr;
        return this;
    }
    public String getQueryJsonStr() {
        return this.queryJsonStr;
    }

}
