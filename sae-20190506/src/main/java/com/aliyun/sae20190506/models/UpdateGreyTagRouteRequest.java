// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpdateGreyTagRouteRequest extends TeaModel {
    @NameInMap("AlbRules")
    public String albRules;

    /**
     * <p>Canary Release - Regions</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>[{"condition":"OR","group":"DUBBO","items":[{"cond":"==","expr":".key1","index":0,"operator":"rawvalue","value":"value1"},{"cond":"==","expr":".key2","index":0,"operator":"rawvalue","value":"value2"}],"methodName":"echo","serviceName":"com.alibaba.edas.boot.EchoService","version":"1.0.0"}]</p>
     */
    @NameInMap("DubboRules")
    public String dubboRules;

    /**
     * <p>1</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("GreyTagRouteId")
    public Long greyTagRouteId;

    /**
     * <p>[{"condition":"OR","items":[{"cond":"==","name":"grey","operator":"rawvalue","type":"param","value":"true"},{"cond":"==","name":"grey","operator":"rawvalue","type":"cookie","value":"true"},{"cond":"==","name":"grey","operator":"rawvalue","type":"header","value":"true"}],"path":"/post-echo/hi"}]</p>
     */
    @NameInMap("ScRules")
    public String scRules;

    public static UpdateGreyTagRouteRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGreyTagRouteRequest self = new UpdateGreyTagRouteRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGreyTagRouteRequest setAlbRules(String albRules) {
        this.albRules = albRules;
        return this;
    }
    public String getAlbRules() {
        return this.albRules;
    }

    public UpdateGreyTagRouteRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateGreyTagRouteRequest setDubboRules(String dubboRules) {
        this.dubboRules = dubboRules;
        return this;
    }
    public String getDubboRules() {
        return this.dubboRules;
    }

    public UpdateGreyTagRouteRequest setGreyTagRouteId(Long greyTagRouteId) {
        this.greyTagRouteId = greyTagRouteId;
        return this;
    }
    public Long getGreyTagRouteId() {
        return this.greyTagRouteId;
    }

    public UpdateGreyTagRouteRequest setScRules(String scRules) {
        this.scRules = scRules;
        return this;
    }
    public String getScRules() {
        return this.scRules;
    }

}
