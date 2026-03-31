// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class CreateChatConfigurationResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{&quot;Name&quot;: &quot;TestChatConfig-9be97b40&quot;, &quot;CreatedDate&quot;: &quot;2025-12-11T13:49:10+00:00&quot;, &quot;UpdatedDate&quot;: &quot;2025-12-11T13:59:02+00:00&quot;}</p>
     */
    @NameInMap("ChatConfiguration")
    public CreateChatConfigurationResponseBodyChatConfiguration chatConfiguration;

    /**
     * <strong>example:</strong>
     * <p>4DB0****1234</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateChatConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateChatConfigurationResponseBody self = new CreateChatConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateChatConfigurationResponseBody setChatConfiguration(CreateChatConfigurationResponseBodyChatConfiguration chatConfiguration) {
        this.chatConfiguration = chatConfiguration;
        return this;
    }
    public CreateChatConfigurationResponseBodyChatConfiguration getChatConfiguration() {
        return this.chatConfiguration;
    }

    public CreateChatConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateChatConfigurationResponseBodyChatConfiguration extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2025-12-11T13:49:10+00:00</p>
         */
        @NameInMap("CreatedDate")
        public String createdDate;

        /**
         * <strong>example:</strong>
         * <p>TestChatConfig-9be97b40</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>2025-12-11T13:59:02+00:00</p>
         */
        @NameInMap("UpdatedDate")
        public String updatedDate;

        public static CreateChatConfigurationResponseBodyChatConfiguration build(java.util.Map<String, ?> map) throws Exception {
            CreateChatConfigurationResponseBodyChatConfiguration self = new CreateChatConfigurationResponseBodyChatConfiguration();
            return TeaModel.build(map, self);
        }

        public CreateChatConfigurationResponseBodyChatConfiguration setCreatedDate(String createdDate) {
            this.createdDate = createdDate;
            return this;
        }
        public String getCreatedDate() {
            return this.createdDate;
        }

        public CreateChatConfigurationResponseBodyChatConfiguration setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateChatConfigurationResponseBodyChatConfiguration setUpdatedDate(String updatedDate) {
            this.updatedDate = updatedDate;
            return this;
        }
        public String getUpdatedDate() {
            return this.updatedDate;
        }

    }

}
