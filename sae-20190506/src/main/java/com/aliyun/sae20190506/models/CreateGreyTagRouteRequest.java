// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class CreateGreyTagRouteRequest extends TeaModel {
    /**
     * <p>The canary release rule of the application for which Application Load Balancer (ALB) gateway routing is configured.</p>
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
     * <p>The description of the canary release rule. The name must be 1 to 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>灰度发布-地域灰度</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The canary release rule that you created for Dubbo applications. If your application uses the Dubbo framework, you must configure this parameter. You do not need to configure the <strong>ScRules</strong> parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;condition&quot;:&quot;OR&quot;,&quot;group&quot;:&quot;DUBBO&quot;,&quot;items&quot;:[{&quot;cond&quot;:&quot;==&quot;,&quot;expr&quot;:&quot;.key1&quot;,&quot;index&quot;:0,&quot;operator&quot;:&quot;rawvalue&quot;,&quot;value&quot;:&quot;value1&quot;},{&quot;cond&quot;:&quot;==&quot;,&quot;expr&quot;:&quot;.key2&quot;,&quot;index&quot;:0,&quot;operator&quot;:&quot;rawvalue&quot;,&quot;value&quot;:&quot;value2&quot;}],&quot;methodName&quot;:&quot;echo&quot;,&quot;serviceName&quot;:&quot;com.alibaba.edas.boot.EchoService&quot;,&quot;version&quot;:&quot;1.0.0&quot;}]</p>
     */
    @NameInMap("DubboRules")
    public String dubboRules;

    /**
     * <p>The name of the canary release rule. The name must start with a lowercase letter and end with a digit or a lowercase letter. The name can contain only lowercase letters, Chinese characters, digits, and hyphens (-). The name must be 1 to 64 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dubbo-echo</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The canary release rule that you created for Spring Cloud application. If your application uses the Spring Cloud framework, you must configure this parameter. You do not need to configure the <strong>DubboRules</strong> parameter.</p>
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
