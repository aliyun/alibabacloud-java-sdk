// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class CreateGreyTagRouteRequest extends TeaModel {
    /**
     * <p>The canary rules for an application that uses an ALB gateway route.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;condition&quot;:&quot;AND&quot;,&quot;items&quot;:[{&quot;cond&quot;:&quot;==&quot;,&quot;name&quot;:&quot;grey&quot;,&quot;operator&quot;:&quot;rawvalue&quot;,&quot;type&quot;:&quot;sourceIp&quot;,&quot;value&quot;:&quot;127.0.0.1&quot;},{&quot;cond&quot;:&quot;==&quot;,&quot;name&quot;:&quot;grey&quot;,&quot;operator&quot;:&quot;rawvalue&quot;,&quot;type&quot;:&quot;cookie&quot;,&quot;value&quot;:&quot;true&quot;},{&quot;cond&quot;:&quot;==&quot;,&quot;name&quot;:&quot;grey&quot;,&quot;operator&quot;:&quot;rawvalue&quot;,&quot;type&quot;:&quot;header&quot;,&quot;value&quot;:&quot;true&quot;}],&quot;path&quot;:&quot;/post-echo/hi&quot;}]</p>
     */
    @NameInMap("AlbRules")
    public String albRules;

    /**
     * <p>The application ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7802c49a-67bc-4167-8369-9a9c003c****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The description of the canary rule. The description can be up to 64 characters long.</p>
     * 
     * <strong>example:</strong>
     * <p>Canary Release - Regions</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The canary rules for a Dubbo application. This parameter is required for Dubbo applications and cannot be used with the <strong>ScRules</strong> parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;condition&quot;:&quot;OR&quot;,&quot;group&quot;:&quot;DUBBO&quot;,&quot;items&quot;:[{&quot;cond&quot;:&quot;==&quot;,&quot;expr&quot;:&quot;.key1&quot;,&quot;index&quot;:0,&quot;operator&quot;:&quot;rawvalue&quot;,&quot;value&quot;:&quot;value1&quot;},{&quot;cond&quot;:&quot;==&quot;,&quot;expr&quot;:&quot;.key2&quot;,&quot;index&quot;:0,&quot;operator&quot;:&quot;rawvalue&quot;,&quot;value&quot;:&quot;value2&quot;}],&quot;methodName&quot;:&quot;echo&quot;,&quot;serviceName&quot;:&quot;com.alibaba.edas.boot.EchoService&quot;,&quot;version&quot;:&quot;1.0.0&quot;}]</p>
     */
    @NameInMap("DubboRules")
    public String dubboRules;

    /**
     * <p>The name of the canary rule. The name can be up to 64 characters long and can contain only lowercase letters, digits, hyphens (-), and Chinese characters. It must start with a lowercase letter and end with a lowercase letter or a digit.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dubbo-echo</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The canary rules for a Spring Cloud application. This parameter is required for Spring Cloud applications and cannot be used with the <strong>DubboRules</strong> parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;condition&quot;:&quot;OR&quot;,&quot;items&quot;:[{&quot;cond&quot;:&quot;==&quot;,&quot;name&quot;:&quot;grey&quot;,&quot;operator&quot;:&quot;rawvalue&quot;,&quot;type&quot;:&quot;param&quot;,&quot;value&quot;:&quot;true&quot;},{&quot;cond&quot;:&quot;==&quot;,&quot;name&quot;:&quot;grey&quot;,&quot;operator&quot;:&quot;rawvalue&quot;,&quot;type&quot;:&quot;cookie&quot;,&quot;value&quot;:&quot;true&quot;},{&quot;cond&quot;:&quot;==&quot;,&quot;name&quot;:&quot;grey&quot;,&quot;operator&quot;:&quot;rawvalue&quot;,&quot;type&quot;:&quot;header&quot;,&quot;value&quot;:&quot;true&quot;}],&quot;path&quot;:&quot;/post-echo/hi&quot;}]</p>
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
