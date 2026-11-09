// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class ListGroupIdRequest extends TeaModel {
    /**
     * <p>The ID of the instance for which you want to list group IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mqtt-cn-0pp1ldu****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The list of tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<ListGroupIdRequestTag> tag;

    public static ListGroupIdRequest build(java.util.Map<String, ?> map) throws Exception {
        ListGroupIdRequest self = new ListGroupIdRequest();
        return TeaModel.build(map, self);
    }

    public ListGroupIdRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListGroupIdRequest setTag(java.util.List<ListGroupIdRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListGroupIdRequestTag> getTag() {
        return this.tag;
    }

    public static class ListGroupIdRequestTag extends TeaModel {
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

        public static ListGroupIdRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListGroupIdRequestTag self = new ListGroupIdRequestTag();
            return TeaModel.build(map, self);
        }

        public ListGroupIdRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListGroupIdRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
