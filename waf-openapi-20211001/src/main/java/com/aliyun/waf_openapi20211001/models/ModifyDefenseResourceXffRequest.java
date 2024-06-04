// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyDefenseResourceXffRequest extends TeaModel {
    /**
     * <p>The status of the tracking cookie.</p>
     * <br>
     * <p>*   **0**: disabled</p>
     * <p>*   **1**: enabled. This is the default value.</p>
     */
    @NameInMap("AcwCookieStatus")
    public Integer acwCookieStatus;

    /**
     * <p>The status of the secure attribute of the tracking cookie.</p>
     * <br>
     * <p>*   **0**: disabled. This is the default value.</p>
     * <p>*   **1**: enabled.</p>
     */
    @NameInMap("AcwSecureStatus")
    public Integer acwSecureStatus;

    /**
     * <p>The status of the secure attribute of the slider CAPTCHA cookie.</p>
     * <br>
     * <p>*   **0**: disabled. This is the default value.</p>
     * <p>*   **1**: enabled.</p>
     */
    @NameInMap("AcwV3SecureStatus")
    public Integer acwV3SecureStatus;

    /**
     * <p>The custom header fields.</p>
     * <br>
     * <p>>  The first IP address in the specified custom header field is used as the originating IP address of the client to prevent X-Forwarded-For forgery. If you specify multiple header fields, WAF reads the values of the header fields in sequence until the originating IP address is obtained. If the originating IP address cannot be obtained, the first IP address in the X-Forwarded-For header is used as the originating IP address of the client.</p>
     */
    @NameInMap("CustomHeaders")
    public java.util.List<String> customHeaders;

    /**
     * <p>The ID of the Web Application Firewall (WAF) instance.</p>
     * <br>
     * <p>>  You can call the [DescribeInstance](https://help.aliyun.com/document_detail/433756.html) operation to query the ID of the WAF instance.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region in which the WAF instance is deployed. Valid values:</p>
     * <br>
     * <p>*   **cn-hangzhou**: Chinese mainland.</p>
     * <p>*   **ap-southeast-1**: outside the Chinese mainland.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the protected object.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Resource")
    public String resource;

    /**
     * <p>The ID of the Alibaba Cloud resource group.</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    /**
     * <p>Specifies whether a Layer 7 proxy is deployed in front of WAF. Layer 7 proxies include Anti-DDoS Proxy and Alibaba Cloud CDN. Valid values:</p>
     * <br>
     * <p>*   **0**: No Layer 7 proxies are deployed. This is the default value.</p>
     * <p>*   **1**: A Layer 7 proxy is deployed.</p>
     * <br>
     * <p>This parameter is required.</p>
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
