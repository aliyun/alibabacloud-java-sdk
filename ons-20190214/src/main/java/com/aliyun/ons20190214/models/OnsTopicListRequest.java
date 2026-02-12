// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsTopicListRequest extends TeaModel {
    /**
     * <p>The ID of the instance that contains the topics you want to query.</p>
     * 
     * <strong>example:</strong>
     * <p>MQ_INST_188077086902****_BXSuW61e</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The list of tags that are attached to the topic. A maximum of 20 tags can be included in the list.</p>
     */
    @NameInMap("Tag")
    public java.util.List<OnsTopicListRequestTag> tag;

    /**
     * <p>The name of the topic that you want to query. This parameter is required if you want to query a specific topic. If you do not include this parameter in a request, all topics that you can access are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Topic")
    public String topic;

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

    public static class OnsTopicListRequestTag extends TeaModel {
        /**
         * <p>The key of the tag that is attached to the topics you want to query. This parameter is not required. If you configure this parameter, you must also configure the <strong>Value</strong> parameter.**** If you include the Key and Value parameters in a request, this operation queries only the topics that use the specified tag. If you do not include these parameters in a request, this operation queries all topics that you can access.</p>
         * <ul>
         * <li>The value of this parameter cannot be an empty string.</li>
         * <li>A tag value can be up to 128 characters in length and cannot start with <code>acs:</code> or <code>aliyun</code>. It cannot contain <code>http://</code> or <code>https://</code>.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CartService</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag that is attached to the topics you want to query. This parameter is not required. If you configure this parameter, you must also configure the <strong>Key</strong> parameter.**** If you include the Key and Value parameters in a request, this operation queries only the topics that use the specified tag. If you do not include these parameters in a request, this operation queries all topics that you can access.</p>
         * <ul>
         * <li>The value of this parameter can be an empty string.</li>
         * <li>A tag key can be up to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>. It cannot start with <code>acs:</code> or <code>aliyun</code>.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ServiceA</p>
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
