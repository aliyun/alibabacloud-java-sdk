// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpdateGreyTagRouteRequest extends TeaModel {
    /**
     * <p>The grey tag route for an ALB gateway route.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;condition&quot;:&quot;AND&quot;,&quot;items&quot;:[{&quot;cond&quot;:&quot;==&quot;,&quot;name&quot;:&quot;grey&quot;,&quot;operator&quot;:&quot;rawvalue&quot;,&quot;type&quot;:&quot;sourceIp&quot;,&quot;value&quot;:&quot;127.0.0.1&quot;},{&quot;cond&quot;:&quot;==&quot;,&quot;name&quot;:&quot;grey&quot;,&quot;operator&quot;:&quot;rawvalue&quot;,&quot;type&quot;:&quot;cookie&quot;,&quot;value&quot;:&quot;true&quot;},{&quot;cond&quot;:&quot;==&quot;,&quot;name&quot;:&quot;grey&quot;,&quot;operator&quot;:&quot;rawvalue&quot;,&quot;type&quot;:&quot;header&quot;,&quot;value&quot;:&quot;true&quot;}],&quot;path&quot;:&quot;/post-echo/hi&quot;}]</p>
     */
    @NameInMap("AlbRules")
    public String albRules;

    /**
     * <p>The description of the rule.</p>
     * 
     * <strong>example:</strong>
     * <p>Canary release - region-based</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The grey tag route for a Dubbo application.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;condition&quot;:&quot;OR&quot;,&quot;group&quot;:&quot;DUBBO&quot;,&quot;items&quot;:[{&quot;cond&quot;:&quot;==&quot;,&quot;expr&quot;:&quot;.key1&quot;,&quot;index&quot;:0,&quot;operator&quot;:&quot;rawvalue&quot;,&quot;value&quot;:&quot;value1&quot;},{&quot;cond&quot;:&quot;==&quot;,&quot;expr&quot;:&quot;.key2&quot;,&quot;index&quot;:0,&quot;operator&quot;:&quot;rawvalue&quot;,&quot;value&quot;:&quot;value2&quot;}],&quot;methodName&quot;:&quot;echo&quot;,&quot;serviceName&quot;:&quot;com.alibaba.edas.boot.EchoService&quot;,&quot;version&quot;:&quot;1.0.0&quot;}]</p>
     */
    @NameInMap("DubboRules")
    public String dubboRules;

    /**
     * <p>The grey tag route ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("GreyTagRouteId")
    public Long greyTagRouteId;

    /**
     * <p>The grey tag route for a Spring Cloud application.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;condition&quot;:&quot;OR&quot;,&quot;items&quot;:[{&quot;cond&quot;:&quot;==&quot;,&quot;name&quot;:&quot;grey&quot;,&quot;operator&quot;:&quot;rawvalue&quot;,&quot;type&quot;:&quot;param&quot;,&quot;value&quot;:&quot;true&quot;},{&quot;cond&quot;:&quot;==&quot;,&quot;name&quot;:&quot;grey&quot;,&quot;operator&quot;:&quot;rawvalue&quot;,&quot;type&quot;:&quot;cookie&quot;,&quot;value&quot;:&quot;true&quot;},{&quot;cond&quot;:&quot;==&quot;,&quot;name&quot;:&quot;grey&quot;,&quot;operator&quot;:&quot;rawvalue&quot;,&quot;type&quot;:&quot;header&quot;,&quot;value&quot;:&quot;true&quot;}],&quot;path&quot;:&quot;/post-echo/hi&quot;}]</p>
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
