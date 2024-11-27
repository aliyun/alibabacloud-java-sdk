// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsGroupListRequest extends TeaModel {
    /**
     * <p>This parameter is required only when you query specific consumer groups by using the fuzzy search method. If this parameter is not configured, the system queries all consumer groups that can be accessed by the current account.</p>
     * <p>If you set this parameter to GID_ABC, the information about the consumer groups whose IDs contain GID_ABC is returned. For example, the information about the GID_test_GID_ABC_123 and GID_ABC_356 consumer groups is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>GID_test_group_id</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The protocol over which the queried consumer group publishes and subscribes to messages. All clients in a consumer group communicate with the ApsaraMQ for RocketMQ broker over the same protocol. You must create different consumer groups for TCP clients and HTTP clients. Valid values:</p>
     * <ul>
     * <li><strong>tcp</strong>: specifies that the consumer group publishes or subscribes to messages over TCP. This value is the default value.</li>
     * <li><strong>http</strong>: specifies that the consumer group publishes or subscribes to messages over HTTP.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>tcp</p>
     */
    @NameInMap("GroupType")
    public String groupType;

    /**
     * <p>The ID of the instance to which the consumer group you want to query belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>MQ_INST_111111111111_DOxxxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The list of tags that are attached to the consumer group. A maximum of 20 tags can be included in the list.</p>
     */
    @NameInMap("Tag")
    public java.util.List<OnsGroupListRequestTag> tag;

    public static OnsGroupListRequest build(java.util.Map<String, ?> map) throws Exception {
        OnsGroupListRequest self = new OnsGroupListRequest();
        return TeaModel.build(map, self);
    }

    public OnsGroupListRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public OnsGroupListRequest setGroupType(String groupType) {
        this.groupType = groupType;
        return this;
    }
    public String getGroupType() {
        return this.groupType;
    }

    public OnsGroupListRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public OnsGroupListRequest setTag(java.util.List<OnsGroupListRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<OnsGroupListRequestTag> getTag() {
        return this.tag;
    }

    public static class OnsGroupListRequestTag extends TeaModel {
        /**
         * <p>The key of the tag that is attached to the consumer group. This parameter is not required. If you configure this parameter, you must configure the <strong>Key</strong> parameter.**** If you configure both the Key and Value parameters, the consumer groups are filtered based on the specified tag. If you do not configure these parameters, all consumer groups are queried.</p>
         * <ul>
         * <li>The value of this parameter cannot be an empty string.</li>
         * <li>The tag value must be 1 to 128 characters in length and cannot start with <code>acs:</code> or <code>aliyun</code>. It cannot contain <code>http://</code> or <code>https://</code>.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CartService</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag that is attached to the group. This parameter is not required. If you configure this parameter, you must configure the <strong>Key</strong> parameter.**** If you configure both the Key and Value parameters, the consumer groups are filtered based on the specified tag. If you do not configure these parameters, all consumer groups are queried.</p>
         * <ul>
         * <li>The value of this parameter can be an empty string.</li>
         * <li>The tag key must be 1 to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>. It cannot start with <code>acs:</code> or <code>aliyun</code>.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ServiceA</p>
         */
        @NameInMap("Value")
        public String value;

        public static OnsGroupListRequestTag build(java.util.Map<String, ?> map) throws Exception {
            OnsGroupListRequestTag self = new OnsGroupListRequestTag();
            return TeaModel.build(map, self);
        }

        public OnsGroupListRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public OnsGroupListRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
