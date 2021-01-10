// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkedeploycoreDeploycorePipelinesRequest extends TeaModel {
    @NameInMap("EnvType")
    public String envType;

    public static QueryLinkedeploycoreDeploycorePipelinesRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkedeploycoreDeploycorePipelinesRequest self = new QueryLinkedeploycoreDeploycorePipelinesRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkedeploycoreDeploycorePipelinesRequest setEnvType(String envType) {
        this.envType = envType;
        return this;
    }
    public String getEnvType() {
        return this.envType;
    }

}
