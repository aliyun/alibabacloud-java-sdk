// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkedeploycoreDeploycoreAppservicequeryconfigversionappserviceidRequest extends TeaModel {
    @NameInMap("AppServiceId")
    public String appServiceId;

    public static QueryLinkedeploycoreDeploycoreAppservicequeryconfigversionappserviceidRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkedeploycoreDeploycoreAppservicequeryconfigversionappserviceidRequest self = new QueryLinkedeploycoreDeploycoreAppservicequeryconfigversionappserviceidRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkedeploycoreDeploycoreAppservicequeryconfigversionappserviceidRequest setAppServiceId(String appServiceId) {
        this.appServiceId = appServiceId;
        return this;
    }
    public String getAppServiceId() {
        return this.appServiceId;
    }

}
