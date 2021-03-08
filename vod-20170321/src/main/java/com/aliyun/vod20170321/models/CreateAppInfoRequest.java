// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CreateAppInfoRequest extends TeaModel {
    @NameInMap("ResourceRealOwnerId")
    public Long resourceRealOwnerId;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("Description")
    public String description;

    public static CreateAppInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppInfoRequest self = new CreateAppInfoRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppInfoRequest setResourceRealOwnerId(Long resourceRealOwnerId) {
        this.resourceRealOwnerId = resourceRealOwnerId;
        return this;
    }
    public Long getResourceRealOwnerId() {
        return this.resourceRealOwnerId;
    }

    public CreateAppInfoRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateAppInfoRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
