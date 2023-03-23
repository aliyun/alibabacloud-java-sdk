// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class CreateGreyTagRouteRequest extends TeaModel {
    @NameInMap("AlbRules")
    public String albRules;

    /**
     * <p>7802c49a-67bc-4167-8369-9a9c003c\*\*\*\*</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>Canary Release - Regions</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>\[{"condition":"OR","group":"DUBBO","items":\[{"cond":"==","expr":".key1","index":0,"operator":"rawvalue","value":"value1"},{"cond":"==","expr":".key2","index":0,"operator":"rawvalue","value":"value2"}],"methodName":"echo","serviceName":"com.alibaba.edas.boot.EchoService","version":"1.0.0"}]</p>
     */
    @NameInMap("DubboRules")
    public String dubboRules;

    /**
     * <p>dubbo-echo</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>\[{"condition":"OR","items":\[{"cond":"==","name":"grey","operator":"rawvalue","type":"param","value":"true"},{"cond":"==","name":"grey","operator":"rawvalue","type":"cookie","value":"true"},{"cond":"==","name":"grey","operator":"rawvalue","type":"header","value":"true"}],"path":"/post-echo/hi"}]</p>
     */
    @NameInMap("ScRules")
    public String scRules;

    public static CreateGreyTagRouteRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGreyTagRouteRequest self = new CreateGreyTagRouteRequest();
        return TeaModel.build(map, self);
    }

    public CreateGreyTagRouteRequest setAlbRules(String albRules) {
        this.albRules = albRules;
        return this;
    }
    public String getAlbRules() {
        return this.albRules;
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
