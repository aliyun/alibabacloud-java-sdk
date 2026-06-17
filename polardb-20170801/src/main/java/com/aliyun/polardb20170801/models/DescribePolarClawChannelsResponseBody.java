// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribePolarClawChannelsResponseBody extends TeaModel {
    /**
     * <p>The application ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-**************</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>A list of PolarClaw channel objects.</p>
     */
    @NameInMap("Channels")
    public java.util.List<DescribePolarClawChannelsResponseBodyChannels> channels;

    /**
     * <p>The returned status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The response message. A value of <code>successful</code> indicates that the request succeeded.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2281C6C9-CBAB-1AFD-8400-670750CF6025_2212</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribePolarClawChannelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePolarClawChannelsResponseBody self = new DescribePolarClawChannelsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePolarClawChannelsResponseBody setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public DescribePolarClawChannelsResponseBody setChannels(java.util.List<DescribePolarClawChannelsResponseBodyChannels> channels) {
        this.channels = channels;
        return this;
    }
    public java.util.List<DescribePolarClawChannelsResponseBodyChannels> getChannels() {
        return this.channels;
    }

    public DescribePolarClawChannelsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribePolarClawChannelsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribePolarClawChannelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePolarClawChannelsResponseBodyChannelsAccounts extends TeaModel {
        /**
         * <p>The account ID.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        /**
         * <p>Indicates whether the account is configured.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Configured")
        public Boolean configured;

        /**
         * <p>Indicates whether the account is connected.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Connected")
        public Boolean connected;

        /**
         * <p>Indicates whether the account is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>A list of issues related to the account.</p>
         */
        @NameInMap("Issues")
        public java.util.List<String> issues;

        /**
         * <p>The timestamp (in milliseconds) of the last inbound message.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("LastInboundAt")
        public Long lastInboundAt;

        /**
         * <p>The timestamp (in milliseconds) of the last outbound message.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("LastOutboundAt")
        public Long lastOutboundAt;

        public static DescribePolarClawChannelsResponseBodyChannelsAccounts build(java.util.Map<String, ?> map) throws Exception {
            DescribePolarClawChannelsResponseBodyChannelsAccounts self = new DescribePolarClawChannelsResponseBodyChannelsAccounts();
            return TeaModel.build(map, self);
        }

        public DescribePolarClawChannelsResponseBodyChannelsAccounts setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public DescribePolarClawChannelsResponseBodyChannelsAccounts setConfigured(Boolean configured) {
            this.configured = configured;
            return this;
        }
        public Boolean getConfigured() {
            return this.configured;
        }

        public DescribePolarClawChannelsResponseBodyChannelsAccounts setConnected(Boolean connected) {
            this.connected = connected;
            return this;
        }
        public Boolean getConnected() {
            return this.connected;
        }

        public DescribePolarClawChannelsResponseBodyChannelsAccounts setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public DescribePolarClawChannelsResponseBodyChannelsAccounts setIssues(java.util.List<String> issues) {
            this.issues = issues;
            return this;
        }
        public java.util.List<String> getIssues() {
            return this.issues;
        }

        public DescribePolarClawChannelsResponseBodyChannelsAccounts setLastInboundAt(Long lastInboundAt) {
            this.lastInboundAt = lastInboundAt;
            return this;
        }
        public Long getLastInboundAt() {
            return this.lastInboundAt;
        }

        public DescribePolarClawChannelsResponseBodyChannelsAccounts setLastOutboundAt(Long lastOutboundAt) {
            this.lastOutboundAt = lastOutboundAt;
            return this;
        }
        public Long getLastOutboundAt() {
            return this.lastOutboundAt;
        }

    }

    public static class DescribePolarClawChannelsResponseBodyChannels extends TeaModel {
        /**
         * <p>A list of account objects for the channel.</p>
         */
        @NameInMap("Accounts")
        public java.util.List<DescribePolarClawChannelsResponseBodyChannelsAccounts> accounts;

        /**
         * <p>The channel ID.</p>
         * 
         * <strong>example:</strong>
         * <p>feishu</p>
         */
        @NameInMap("ChannelId")
        public String channelId;

        /**
         * <p>Indicates whether the channel is configured.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Configured")
        public Boolean configured;

        /**
         * <p>The default account ID for the channel.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("DefaultAccountId")
        public String defaultAccountId;

        /**
         * <p>Indicates whether the channel is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        public static DescribePolarClawChannelsResponseBodyChannels build(java.util.Map<String, ?> map) throws Exception {
            DescribePolarClawChannelsResponseBodyChannels self = new DescribePolarClawChannelsResponseBodyChannels();
            return TeaModel.build(map, self);
        }

        public DescribePolarClawChannelsResponseBodyChannels setAccounts(java.util.List<DescribePolarClawChannelsResponseBodyChannelsAccounts> accounts) {
            this.accounts = accounts;
            return this;
        }
        public java.util.List<DescribePolarClawChannelsResponseBodyChannelsAccounts> getAccounts() {
            return this.accounts;
        }

        public DescribePolarClawChannelsResponseBodyChannels setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public DescribePolarClawChannelsResponseBodyChannels setConfigured(Boolean configured) {
            this.configured = configured;
            return this;
        }
        public Boolean getConfigured() {
            return this.configured;
        }

        public DescribePolarClawChannelsResponseBodyChannels setDefaultAccountId(String defaultAccountId) {
            this.defaultAccountId = defaultAccountId;
            return this;
        }
        public String getDefaultAccountId() {
            return this.defaultAccountId;
        }

        public DescribePolarClawChannelsResponseBodyChannels setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

}
