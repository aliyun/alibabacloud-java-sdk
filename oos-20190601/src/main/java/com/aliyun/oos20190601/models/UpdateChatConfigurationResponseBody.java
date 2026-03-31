// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class UpdateChatConfigurationResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{&quot;Name&quot;: &quot;dingtalk&quot;, &quot;CreatedDate&quot;: &quot;2025-12-23T10:14:28+00:00&quot;, &quot;UpdatedDate&quot;: &quot;2025-12-23T10:16:37.178097&quot;}</p>
     */
    @NameInMap("ChatConfiguration")
    public UpdateChatConfigurationResponseBodyChatConfiguration chatConfiguration;

    /**
     * <strong>example:</strong>
     * <p>4DB0****1234</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateChatConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateChatConfigurationResponseBody self = new UpdateChatConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateChatConfigurationResponseBody setChatConfiguration(UpdateChatConfigurationResponseBodyChatConfiguration chatConfiguration) {
        this.chatConfiguration = chatConfiguration;
        return this;
    }
    public UpdateChatConfigurationResponseBodyChatConfiguration getChatConfiguration() {
        return this.chatConfiguration;
    }

    public UpdateChatConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateChatConfigurationResponseBodyChatConfiguration extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2025-12-23T10:14:28+00:00</p>
         */
        @NameInMap("CreatedDate")
        public String createdDate;

        /**
         * <strong>example:</strong>
         * <p>dingtalk</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>2025-12-23T10:16:37.178097</p>
         */
        @NameInMap("UpdatedDate")
        public String updatedDate;

        public static UpdateChatConfigurationResponseBodyChatConfiguration build(java.util.Map<String, ?> map) throws Exception {
            UpdateChatConfigurationResponseBodyChatConfiguration self = new UpdateChatConfigurationResponseBodyChatConfiguration();
            return TeaModel.build(map, self);
        }

        public UpdateChatConfigurationResponseBodyChatConfiguration setCreatedDate(String createdDate) {
            this.createdDate = createdDate;
            return this;
        }
        public String getCreatedDate() {
            return this.createdDate;
        }

        public UpdateChatConfigurationResponseBodyChatConfiguration setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateChatConfigurationResponseBodyChatConfiguration setUpdatedDate(String updatedDate) {
            this.updatedDate = updatedDate;
            return this;
        }
        public String getUpdatedDate() {
            return this.updatedDate;
        }

    }

}
