// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rmcore20220121.models;

import com.aliyun.tea.*;

public class DeleteApiRequest extends TeaModel {
    // 目标资源组
    @NameInMap("ApiName")
    public String apiName;

    // 资源Id
    @NameInMap("ApiProductCode")
    public String apiProductCode;

    // 地域Id
    @NameInMap("ApiProductVersion")
    public String apiProductVersion;

    // 资源类型
    @NameInMap("ResourceType")
    public String resourceType;

    // 云产品服务Code
    @NameInMap("Service")
    public String service;

    public static DeleteApiRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteApiRequest self = new DeleteApiRequest();
        return TeaModel.build(map, self);
    }

    public DeleteApiRequest setApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }
    public String getApiName() {
        return this.apiName;
    }

    public DeleteApiRequest setApiProductCode(String apiProductCode) {
        this.apiProductCode = apiProductCode;
        return this;
    }
    public String getApiProductCode() {
        return this.apiProductCode;
    }

    public DeleteApiRequest setApiProductVersion(String apiProductVersion) {
        this.apiProductVersion = apiProductVersion;
        return this;
    }
    public String getApiProductVersion() {
        return this.apiProductVersion;
    }

    public DeleteApiRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public DeleteApiRequest setService(String service) {
        this.service = service;
        return this;
    }
    public String getService() {
        return this.service;
    }

}
