// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpdateGreyTagRouteRequest extends TeaModel {
    // 规则名称
    @NameInMap("Description")
    public String description;

    // Dubbo规则
    @NameInMap("DubboRules")
    public String dubboRules;

    // 规则ID
    @NameInMap("GreyTagRouteId")
    public Long greyTagRouteId;

    // SpringCloud规则
    @NameInMap("ScRules")
    public String scRules;

    public static UpdateGreyTagRouteRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGreyTagRouteRequest self = new UpdateGreyTagRouteRequest();
        return TeaModel.build(map, self);
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
