// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsTopicListRequest extends TeaModel {
    /**
     * <p>The ID of the instance that contains the topics you want to query.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The list of tags that are attached to the topic. A maximum of 20 tags can be included in the list.</p>
     */
    @NameInMap("Tag")
    public java.util.List<OnsTopicListRequestTag> tag;

    /**
     * <p>The name of the topic that you want to query. This parameter is required when you want to query a specific topic. If you do not include this parameter in a request, all topics that you can access are queried.</p>
     */
    @NameInMap("Topic")
    public String topic;

    @NameInMap("UserId")
    public String userId;

    public static OnsTopicListRequest build(java.util.Map<String, ?> map) throws Exception {
        OnsTopicListRequest self = new OnsTopicListRequest();
        return TeaModel.build(map, self);
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

    public OnsTopicListRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public OnsTopicListRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public static class OnsTopicListRequestTag extends TeaModel {
        /**
         * <p>The key of a tag that is attached to the topics you want to query. This parameter is not required. If you configure this parameter, you must also configure the **Tag.N.Value** parameter.**** If you include the Key and Value parameters in a request, this operation queries only the topics that use the specified tags. If you do not include these parameters in a request, this operation queries all topics that you can access.</p>
         * <br>
         * <p>*   The value of this parameter cannot be an empty string.</p>
         * <p>*   The tag value can be up to 128 characters in length and cannot start with `acs:` or `aliyun`. It cannot contain `http://` or `https://`.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of a tag that is attached to the topics you want to query. This parameter is not required. If you configure this parameter, you must also configure the **Tag.N.Key** parameter.**** If you include the Key and Value parameters in a request, this operation queries only the topics that use the specified tags. If you do not include these parameters in a request, this operation queries all topics that you can access.</p>
         * <br>
         * <p>*   The value of this parameter can be an empty string.</p>
         * <p>*   The tag value can be up to 128 characters in length and cannot start with `acs:` or `aliyun`. It cannot contain `http://` or `https://`.</p>
         */
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
