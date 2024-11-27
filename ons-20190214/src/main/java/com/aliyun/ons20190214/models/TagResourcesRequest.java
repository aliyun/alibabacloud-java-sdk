// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class TagResourcesRequest extends TeaModel {
    /**
     * <p>The ID of the ApsaraMQ for RocketMQ instance that contains the resource to which you want to attach tags.</p>
     * <blockquote>
     * <p>This parameter is required when you attach tags to a topic or a group.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>MQ_INST_188077086902****_BXSuW61e</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The resource IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TopicA</p>
     */
    @NameInMap("ResourceId")
    public java.util.List<String> resourceId;

    /**
     * <p>The type of the resource to which you want to attach tags. Valid values:</p>
     * <ul>
     * <li><strong>INSTANCE</strong></li>
     * <li><strong>TOPIC</strong></li>
     * <li><strong>GROUP</strong></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TOPIC</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The tags that you want to attach to the resource.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Tag")
    public java.util.List<TagResourcesRequestTag> tag;

    public static TagResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        TagResourcesRequest self = new TagResourcesRequest();
        return TeaModel.build(map, self);
    }

    public TagResourcesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public TagResourcesRequest setResourceId(java.util.List<String> resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public java.util.List<String> getResourceId() {
        return this.resourceId;
    }

    public TagResourcesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public TagResourcesRequest setTag(java.util.List<TagResourcesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<TagResourcesRequestTag> getTag() {
        return this.tag;
    }

    public static class TagResourcesRequestTag extends TeaModel {
        /**
         * <p>The tag key. If you configure this parameter, you must also configure the <strong>Value</strong> parameter.****</p>
         * <ul>
         * <li>The value of this parameter cannot be an empty string.</li>
         * <li>A tag key must be 1 to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>. A tag key cannot start with <code>acs:</code> or <code>aliyun</code>.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag that you want to attach to the resource. If you configure this parameter, you must also configure the <strong>Key</strong> parameter.****</p>
         * <ul>
         * <li>The value of this parameter can be an empty string.</li>
         * <li>A tag value must be 1 to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>. A tag value cannot start with <code>acs:</code> or <code>aliyun</code>.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceJoshua</p>
         */
        @NameInMap("Value")
        public String value;

        public static TagResourcesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            TagResourcesRequestTag self = new TagResourcesRequestTag();
            return TeaModel.build(map, self);
        }

        public TagResourcesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public TagResourcesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
