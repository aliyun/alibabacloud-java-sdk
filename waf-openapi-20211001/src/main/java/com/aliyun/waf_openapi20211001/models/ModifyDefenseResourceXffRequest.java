// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyDefenseResourceXffRequest extends TeaModel {
    /**
     * <p>The status of the tracking cookie.</p>
     * <ul>
     * <li><strong>0</strong>: disabled</li>
     * <li><strong>1</strong>: enabled. This is the default value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("AcwCookieStatus")
    public Integer acwCookieStatus;

    /**
     * <p>The status of the secure attribute of the tracking cookie.</p>
     * <ul>
     * <li><strong>0</strong>: disabled. This is the default value.</li>
     * <li><strong>1</strong>: enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("AcwSecureStatus")
    public Integer acwSecureStatus;

    /**
     * <p>The status of the secure attribute of the slider CAPTCHA cookie.</p>
     * <ul>
     * <li><strong>0</strong>: disabled. This is the default value.</li>
     * <li><strong>1</strong>: enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("AcwV3SecureStatus")
    public Integer acwV3SecureStatus;

    /**
     * <p>The custom header fields.</p>
     * <blockquote>
     * <p> The first IP address in the specified custom header field is used as the originating IP address of the client to prevent X-Forwarded-For forgery. If you specify multiple header fields, WAF reads the values of the header fields in sequence until the originating IP address is obtained. If the originating IP address cannot be obtained, the first IP address in the X-Forwarded-For header is used as the originating IP address of the client.</p>
     * </blockquote>
     */
    @NameInMap("CustomHeaders")
    public java.util.List<String> customHeaders;

    /**
     * <p>The ID of the Web Application Firewall (WAF) instance.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query the ID of the WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_v2_public_cn-wwo3c****07</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region in which the WAF instance is deployed. Valid values:</p>
     * <ul>
     * <li><strong>cn-hangzhou</strong>: Chinese mainland.</li>
     * <li><strong>ap-southeast-1</strong>: outside the Chinese mainland.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the protected object.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>alb-4pxu81fgagx3****mz-alb</p>
     */
    @NameInMap("Resource")
    public String resource;

    /**
     * <p>The ID of the Alibaba Cloud resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm2kie2****wq</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    /**
     * <p>Specifies whether a Layer 7 proxy is deployed in front of WAF. Layer 7 proxies include Anti-DDoS Proxy and Alibaba Cloud CDN. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: No Layer 7 proxies are deployed. This is the default value.</li>
     * <li><strong>1</strong>: A Layer 7 proxy is deployed.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("XffStatus")
    public Integer xffStatus;

    public static ModifyDefenseResourceXffRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDefenseResourceXffRequest self = new ModifyDefenseResourceXffRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDefenseResourceXffRequest setAcwCookieStatus(Integer acwCookieStatus) {
        this.acwCookieStatus = acwCookieStatus;
        return this;
    }
    public Integer getAcwCookieStatus() {
        return this.acwCookieStatus;
    }

    public ModifyDefenseResourceXffRequest setAcwSecureStatus(Integer acwSecureStatus) {
        this.acwSecureStatus = acwSecureStatus;
        return this;
    }
    public Integer getAcwSecureStatus() {
        return this.acwSecureStatus;
    }

    public ModifyDefenseResourceXffRequest setAcwV3SecureStatus(Integer acwV3SecureStatus) {
        this.acwV3SecureStatus = acwV3SecureStatus;
        return this;
    }
    public Integer getAcwV3SecureStatus() {
        return this.acwV3SecureStatus;
    }

    public ModifyDefenseResourceXffRequest setCustomHeaders(java.util.List<String> customHeaders) {
        this.customHeaders = customHeaders;
        return this;
    }
    public java.util.List<String> getCustomHeaders() {
        return this.customHeaders;
    }

    public ModifyDefenseResourceXffRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyDefenseResourceXffRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyDefenseResourceXffRequest setResource(String resource) {
        this.resource = resource;
        return this;
    }
    public String getResource() {
        return this.resource;
    }

    public ModifyDefenseResourceXffRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public ModifyDefenseResourceXffRequest setXffStatus(Integer xffStatus) {
        this.xffStatus = xffStatus;
        return this;
    }
    public Integer getXffStatus() {
        return this.xffStatus;
    }

}
