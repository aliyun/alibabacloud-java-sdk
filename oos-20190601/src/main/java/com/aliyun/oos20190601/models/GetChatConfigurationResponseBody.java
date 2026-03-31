// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class GetChatConfigurationResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{
     *   &quot;Name&quot;: &quot;chatops&quot;,
     *   &quot;Type&quot;: &quot;DingTalk&quot;,
     *   &quot;RamRole&quot;: &quot;OOSServiceRole&quot;,
     *   &quot;Configuration&quot;: &quot;{\&quot;DingTalkClientId\&quot;: \&quot;dingpxlbxp0rgs7uxmtb\&quot;, \&quot;DingTalkClientSecret\&quot;: \&quot;******\&quot;, \&quot;DingTalkTemplateId\&quot;: \&quot;381c5aee-f8af-48a4-94be-cce587e42ea4.schema\&quot;}&quot;,
     *   &quot;ResourceGroupId&quot;: &quot;s&quot;,
     *   &quot;CreatedDate&quot;: &quot;2025-12-26T09:53:02+00:00&quot;,
     *   &quot;UpdatedDate&quot;: &quot;2026-01-07T02:14:55+00:00&quot;,
     *   &quot;Outputs&quot;: &quot;{\&quot;URL\&quot;: \&quot;<a href="https://1407907063606569.appflow.aliyunnest.com/webhook/%5C%5C%22%7D">https://1407907063606569.appflow.aliyunnest.com/webhook/\\&quot;}</a>&quot;,
     *   &quot;RequestId&quot;: &quot;4DB0****1234&quot;
     * }</p>
     */
    @NameInMap("ChatConfiguration")
    public GetChatConfigurationResponseBodyChatConfiguration chatConfiguration;

    /**
     * <strong>example:</strong>
     * <p>4DB0****1234</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetChatConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetChatConfigurationResponseBody self = new GetChatConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetChatConfigurationResponseBody setChatConfiguration(GetChatConfigurationResponseBodyChatConfiguration chatConfiguration) {
        this.chatConfiguration = chatConfiguration;
        return this;
    }
    public GetChatConfigurationResponseBodyChatConfiguration getChatConfiguration() {
        return this.chatConfiguration;
    }

    public GetChatConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetChatConfigurationResponseBodyChatConfiguration extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{&quot;DingTalkClientId&quot;: &quot;dingpxlbxp0rgs7uxmtb&quot;, &quot;DingTalkClientSecret&quot;: &quot;******&quot;, &quot;DingTalkTemplateId&quot;: &quot;381c5aee-f8af-48a4-94be-cce587e42ea4.schema&quot;}</p>
         */
        @NameInMap("Configuration")
        public String configuration;

        /**
         * <strong>example:</strong>
         * <p>2025-12-26T09:53:02+00:00</p>
         */
        @NameInMap("CreatedDate")
        public String createdDate;

        /**
         * <strong>example:</strong>
         * <p>chatops</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>{&quot;URL&quot;: &quot;<a href="https://1407907063606569.appflow.aliyunnest.com/webhook/%22%7D">https://1407907063606569.appflow.aliyunnest.com/webhook/&quot;}</a></p>
         */
        @NameInMap("Outputs")
        public String outputs;

        /**
         * <strong>example:</strong>
         * <p>OOSServiceRole</p>
         */
        @NameInMap("RamRole")
        public String ramRole;

        /**
         * <strong>example:</strong>
         * <p>s</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <strong>example:</strong>
         * <p>DingTalk</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>2026-01-07T02:14:55+00:00</p>
         */
        @NameInMap("UpdatedDate")
        public String updatedDate;

        public static GetChatConfigurationResponseBodyChatConfiguration build(java.util.Map<String, ?> map) throws Exception {
            GetChatConfigurationResponseBodyChatConfiguration self = new GetChatConfigurationResponseBodyChatConfiguration();
            return TeaModel.build(map, self);
        }

        public GetChatConfigurationResponseBodyChatConfiguration setConfiguration(String configuration) {
            this.configuration = configuration;
            return this;
        }
        public String getConfiguration() {
            return this.configuration;
        }

        public GetChatConfigurationResponseBodyChatConfiguration setCreatedDate(String createdDate) {
            this.createdDate = createdDate;
            return this;
        }
        public String getCreatedDate() {
            return this.createdDate;
        }

        public GetChatConfigurationResponseBodyChatConfiguration setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetChatConfigurationResponseBodyChatConfiguration setOutputs(String outputs) {
            this.outputs = outputs;
            return this;
        }
        public String getOutputs() {
            return this.outputs;
        }

        public GetChatConfigurationResponseBodyChatConfiguration setRamRole(String ramRole) {
            this.ramRole = ramRole;
            return this;
        }
        public String getRamRole() {
            return this.ramRole;
        }

        public GetChatConfigurationResponseBodyChatConfiguration setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public GetChatConfigurationResponseBodyChatConfiguration setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetChatConfigurationResponseBodyChatConfiguration setUpdatedDate(String updatedDate) {
            this.updatedDate = updatedDate;
            return this;
        }
        public String getUpdatedDate() {
            return this.updatedDate;
        }

    }

}
