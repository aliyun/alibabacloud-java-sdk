// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class CreateDomainShrinkRequest extends TeaModel {
    /**
     * <p>The mode in which you want to add the domain name to WAF. Valid values:</p>
     * <ul>
     * <li><strong>share:</strong> adds the domain name to WAF in CNAME record mode. This is the default value.</li>
     * <li><strong>hybrid_cloud_cname:</strong> adds the domain name to WAF in hybrid cloud reverse proxy mode.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>share</p>
     */
    @NameInMap("AccessType")
    public String accessType;

    /**
     * <p>The domain name that you want to add to WAF.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.aliyundoc.com">www.aliyundoc.com</a></p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The ID of the Web Application Firewall (WAF) instance.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to obtain the ID of the WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_cdnsdf3****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The listener configurations.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Listen")
    public String listenShrink;

    /**
     * <p>The forwarding configurations.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Redirect")
    public String redirectShrink;

    /**
     * <p>The region where the WAF instance resides. Valid values:</p>
     * <ul>
     * <li><strong>cn-hangzhou</strong>: the Chinese mainland</li>
     * <li><strong>ap-southeast-1</strong>: outside the Chinese mainland</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm***q</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    /**
     * <p>The tags. You can specify up to 20 tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateDomainShrinkRequestTag> tag;

    public static CreateDomainShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDomainShrinkRequest self = new CreateDomainShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateDomainShrinkRequest setAccessType(String accessType) {
        this.accessType = accessType;
        return this;
    }
    public String getAccessType() {
        return this.accessType;
    }

    public CreateDomainShrinkRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public CreateDomainShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateDomainShrinkRequest setListenShrink(String listenShrink) {
        this.listenShrink = listenShrink;
        return this;
    }
    public String getListenShrink() {
        return this.listenShrink;
    }

    public CreateDomainShrinkRequest setRedirectShrink(String redirectShrink) {
        this.redirectShrink = redirectShrink;
        return this;
    }
    public String getRedirectShrink() {
        return this.redirectShrink;
    }

    public CreateDomainShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateDomainShrinkRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public CreateDomainShrinkRequest setTag(java.util.List<CreateDomainShrinkRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateDomainShrinkRequestTag> getTag() {
        return this.tag;
    }

    public static class CreateDomainShrinkRequestTag extends TeaModel {
        /**
         * <p>The key of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>Tagkey1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>TagValue1</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateDomainShrinkRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateDomainShrinkRequestTag self = new CreateDomainShrinkRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateDomainShrinkRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateDomainShrinkRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
