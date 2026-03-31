// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListChatConfigurationsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[{&quot;Name&quot;: &quot;test-wechat&quot;, &quot;CreatedDate&quot;: &quot;2025-12-10T10:09:32+00:00&quot;, &quot;UpdatedDate&quot;: &quot;2025-12-28T13:59:48+00:00&quot;, &quot;RamRole&quot;: &quot;OOSServiceRole&quot;, &quot;Type&quot;: &quot;WeChat&quot;, &quot;Outputs&quot;: &quot;{\&quot;URL\&quot;: \&quot;<a href="https://1407907063606569.appflow.aliyunnes%5C%5C%22%7D%5D%7D">https://1407907063606569.appflow.aliyunnes\\&quot;}]}</a></p>
     */
    @NameInMap("ChatConfigurations")
    public java.util.List<ListChatConfigurationsResponseBodyChatConfigurations> chatConfigurations;

    /**
     * <strong>example:</strong>
     * <p>4DB0****1234</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListChatConfigurationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListChatConfigurationsResponseBody self = new ListChatConfigurationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListChatConfigurationsResponseBody setChatConfigurations(java.util.List<ListChatConfigurationsResponseBodyChatConfigurations> chatConfigurations) {
        this.chatConfigurations = chatConfigurations;
        return this;
    }
    public java.util.List<ListChatConfigurationsResponseBodyChatConfigurations> getChatConfigurations() {
        return this.chatConfigurations;
    }

    public ListChatConfigurationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListChatConfigurationsResponseBodyChatConfigurations extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2025-12-10T10:09:32+00:00</p>
         */
        @NameInMap("CreatedDate")
        public String createdDate;

        /**
         * <strong>example:</strong>
         * <p>test-wechat</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>{&quot;URL&quot;: &quot;<a href="https://1407907063606569.appflow.aliyunnes">https://1407907063606569.appflow.aliyunnes</a>&quot;, &quot;AesKey&quot;: &quot;UKAxyRabaJlaDxS3XZ6st18grPteemRtGeDVVgF&quot;}</p>
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
         * <p>WeChat</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>2025-12-28T13:59:48+00:00</p>
         */
        @NameInMap("UpdatedDate")
        public String updatedDate;

        public static ListChatConfigurationsResponseBodyChatConfigurations build(java.util.Map<String, ?> map) throws Exception {
            ListChatConfigurationsResponseBodyChatConfigurations self = new ListChatConfigurationsResponseBodyChatConfigurations();
            return TeaModel.build(map, self);
        }

        public ListChatConfigurationsResponseBodyChatConfigurations setCreatedDate(String createdDate) {
            this.createdDate = createdDate;
            return this;
        }
        public String getCreatedDate() {
            return this.createdDate;
        }

        public ListChatConfigurationsResponseBodyChatConfigurations setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListChatConfigurationsResponseBodyChatConfigurations setOutputs(String outputs) {
            this.outputs = outputs;
            return this;
        }
        public String getOutputs() {
            return this.outputs;
        }

        public ListChatConfigurationsResponseBodyChatConfigurations setRamRole(String ramRole) {
            this.ramRole = ramRole;
            return this;
        }
        public String getRamRole() {
            return this.ramRole;
        }

        public ListChatConfigurationsResponseBodyChatConfigurations setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListChatConfigurationsResponseBodyChatConfigurations setUpdatedDate(String updatedDate) {
            this.updatedDate = updatedDate;
            return this;
        }
        public String getUpdatedDate() {
            return this.updatedDate;
        }

    }

}
