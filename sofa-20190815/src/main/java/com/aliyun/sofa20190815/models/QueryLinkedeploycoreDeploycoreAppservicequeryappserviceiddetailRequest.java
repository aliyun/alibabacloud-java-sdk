// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailRequest extends TeaModel {
    @NameInMap("AppServiceId")
    public String appServiceId;

    public static QueryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailRequest self = new QueryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailRequest setAppServiceId(String appServiceId) {
        this.appServiceId = appServiceId;
        return this;
    }
    public String getAppServiceId() {
        return this.appServiceId;
    }

}
