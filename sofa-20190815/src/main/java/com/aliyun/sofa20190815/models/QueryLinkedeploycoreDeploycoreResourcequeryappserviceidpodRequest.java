// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkedeploycoreDeploycoreResourcequeryappserviceidpodRequest extends TeaModel {
    @NameInMap("AppServiceId")
    public String appServiceId;

    public static QueryLinkedeploycoreDeploycoreResourcequeryappserviceidpodRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkedeploycoreDeploycoreResourcequeryappserviceidpodRequest self = new QueryLinkedeploycoreDeploycoreResourcequeryappserviceidpodRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkedeploycoreDeploycoreResourcequeryappserviceidpodRequest setAppServiceId(String appServiceId) {
        this.appServiceId = appServiceId;
        return this;
    }
    public String getAppServiceId() {
        return this.appServiceId;
    }

}
