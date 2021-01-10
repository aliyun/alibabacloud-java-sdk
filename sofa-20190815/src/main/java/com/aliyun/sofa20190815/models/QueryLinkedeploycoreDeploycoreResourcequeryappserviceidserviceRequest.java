// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkedeploycoreDeploycoreResourcequeryappserviceidserviceRequest extends TeaModel {
    @NameInMap("AppServiceId")
    public String appServiceId;

    public static QueryLinkedeploycoreDeploycoreResourcequeryappserviceidserviceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkedeploycoreDeploycoreResourcequeryappserviceidserviceRequest self = new QueryLinkedeploycoreDeploycoreResourcequeryappserviceidserviceRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkedeploycoreDeploycoreResourcequeryappserviceidserviceRequest setAppServiceId(String appServiceId) {
        this.appServiceId = appServiceId;
        return this;
    }
    public String getAppServiceId() {
        return this.appServiceId;
    }

}
