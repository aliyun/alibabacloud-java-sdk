// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class CreateGroupIdRequest extends TeaModel {
    /**
     * <p>The group ID to be created. Valid values:</p>
     * <ul>
     * <li>The value must start with <code>GID_</code> or <code>GID-</code> and can contain only letters, digits, hyphens (-), and underscores (_). The value must be 7 to 64 characters in length.</li>
     * <li>A group ID cannot be modified after it is created. For more information, see <a href="https://help.aliyun.com/document_detail/42420.html">Terms</a>.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>GID_test</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The ID of the instance where the group ID resides.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mqtt-cn-0pp1ldu****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The array of tag key-value pairs.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateGroupIdRequestTag> tag;

    public static CreateGroupIdRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGroupIdRequest self = new CreateGroupIdRequest();
        return TeaModel.build(map, self);
    }

    public CreateGroupIdRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public CreateGroupIdRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateGroupIdRequest setTag(java.util.List<CreateGroupIdRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateGroupIdRequestTag> getTag() {
        return this.tag;
    }

    public static class CreateGroupIdRequestTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateGroupIdRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateGroupIdRequestTag self = new CreateGroupIdRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateGroupIdRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateGroupIdRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
