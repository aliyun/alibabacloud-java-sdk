// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class CreateDomainShrinkRequest extends TeaModel {
    /**
     * <p>The access type of the WAF instance. Valid values:</p>
     * <ul>
     * <li><p><strong>share</strong> (default): CNAME access.</p>
     * </li>
     * <li><p><strong>hybrid_cloud_cname</strong>: hybrid cloud CNAME access.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If the value is <strong>share</strong>, or the value is <strong>hybrid_cloud_cname</strong> and public cloud disaster recovery is enabled, you must first invoke the <a href="https://help.aliyun.com/document_detail/2985193.html">DescribeVerifyContent</a> and <a href="https://help.aliyun.com/document_detail/2985192.html">VerifyDomainOwner</a> operations to authenticate the domain name ownership. If the website config is added to a region in the Chinese mainland, it must also have an ICP filing.</p>
     * <p>If the value is <strong>hybrid_cloud_cname</strong> and public cloud disaster recovery is disabled, you do not need to authenticate the domain name ownership and can directly invoke this operation.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>share</p>
     */
    @NameInMap("AccessType")
    public String accessType;

    /**
     * <p>The name of the domain name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.aliyundoc.com">www.aliyundoc.com</a></p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The ID of the WAF instance.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query the ID of the current WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_cdnsdf3****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The listener configuration.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Listen")
    public String listenShrink;

    /**
     * <p>The forwarding configuration.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Redirect")
    public String redirectShrink;

    /**
     * <p>The region where the WAF instance resides. Valid values:</p>
     * <ul>
     * <li><p><strong>cn-hangzhou</strong>: the Chinese mainland.</p>
     * </li>
     * <li><p><strong>ap-southeast-1</strong>: outside the Chinese mainland.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the Alibaba Cloud resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm***q</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    /**
     * <p>The list of tags. A maximum of 20 tags are supported.</p>
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
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>Tagkey1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
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
