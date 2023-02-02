// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsGroupListRequest extends TeaModel {
    /**
     * <p>This parameter is required only when you query specific consumer groups by using the fuzzy query method. If this parameter is not configured, the system queries all consumer groups that can be accessed by the current account.</p>
     * <br>
     * <p>If you set this parameter to GID_ABC, the information about the consumer groups whose IDs contain GID_ABC is returned. For example, the information about the GID_test_GID_ABC\_123 and GID_ABC\_356 consumer groups is returned.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The protocol over which the queried consumer groups consume messages. All clients in a consumer group communicate with the Message Queue for Apache RocketMQ broker over the same protocol. A consumer group cannot contain TCP clients and HTTP clients at the same time. You must create different consumer groups for TCP clients and HTTP clients. Valid values:</p>
     * <br>
     * <p>*   **tcp**: specifies the consumer groups that consume messages over TCP. This is the default value.</p>
     * <p>*   **http**: indicates that the consumer group consumes messages over HTTP.</p>
     */
    @NameInMap("GroupType")
    public String groupType;

    /**
     * <p>The ID of the instance to which the consumer group you want to query belongs.</p>
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
         * <p>The key of a tag that is attached to the consumer group. This parameter is not required. If you configure this parameter, you must configure the **Tag.N.Value** parameter.**** If you configure both the Tag.N.Key and Tag.N.Value parameters, the group IDs are filtered based on the specified tag. If you do not configure these parameters, all group IDs are queried.</p>
         * <br>
         * <p>*   The value of this parameter cannot be an empty string.</p>
         * <p>*   The tag key can be up to 128 characters in length and cannot start with `acs:` or `aliyun`. It cannot contain `http://` or `https://`.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag that is attached to the group. This parameter is not required. If you configure this parameter, you must configure the **Tag.N.Value** parameter.**** If you configure both the Tag.N.Key and Tag.N.Value parameters, the group IDs are filtered based on the specified tag. If you do not configure these parameters, all group IDs are queried.</p>
         * <br>
         * <p>*   The value of this parameter can be an empty string.</p>
         * <p>*   The tag key can be up to 128 characters in length and cannot start with `acs:` or `aliyun`. It cannot contain `http://` or `https://`.</p>
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
