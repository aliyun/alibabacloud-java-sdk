// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class CreateGreyTagRouteRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("Description")
    public String description;

    @NameInMap("DubboRules")
    public String dubboRules;

    @NameInMap("Name")
    public String name;

    @NameInMap("ScRules")
    public String scRules;

    public static CreateGreyTagRouteRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGreyTagRouteRequest self = new CreateGreyTagRouteRequest();
        return TeaModel.build(map, self);
    }

    public CreateGreyTagRouteRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateGreyTagRouteRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateGreyTagRouteRequest setDubboRules(String dubboRules) {
        this.dubboRules = dubboRules;
        return this;
    }
    public String getDubboRules() {
        return this.dubboRules;
    }

    public CreateGreyTagRouteRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateGreyTagRouteRequest setScRules(String scRules) {
        this.scRules = scRules;
        return this;
    }
    public String getScRules() {
        return this.scRules;
    }

}
