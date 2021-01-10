// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkedeploycoreDeploycoreResourceRequest extends TeaModel {
    @NameInMap("AppServiceId")
    public Long appServiceId;

    @NameInMap("ResourceType")
    public String resourceType;

    public static QueryLinkedeploycoreDeploycoreResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkedeploycoreDeploycoreResourceRequest self = new QueryLinkedeploycoreDeploycoreResourceRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkedeploycoreDeploycoreResourceRequest setAppServiceId(Long appServiceId) {
        this.appServiceId = appServiceId;
        return this;
    }
    public Long getAppServiceId() {
        return this.appServiceId;
    }

    public QueryLinkedeploycoreDeploycoreResourceRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
