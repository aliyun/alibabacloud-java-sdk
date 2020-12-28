// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsTopicListRequest extends TeaModel {
    @NameInMap("Topic")
    public String topic;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Tag")
    public java.util.List<OnsTopicListRequestTag> tag;

    public static OnsTopicListRequest build(java.util.Map<String, ?> map) throws Exception {
        OnsTopicListRequest self = new OnsTopicListRequest();
        return TeaModel.build(map, self);
    }

    public OnsTopicListRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public OnsTopicListRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public OnsTopicListRequest setTag(java.util.List<OnsTopicListRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<OnsTopicListRequestTag> getTag() {
        return this.tag;
    }

    public static class OnsTopicListRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static OnsTopicListRequestTag build(java.util.Map<String, ?> map) throws Exception {
            OnsTopicListRequestTag self = new OnsTopicListRequestTag();
            return TeaModel.build(map, self);
        }

        public OnsTopicListRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public OnsTopicListRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
