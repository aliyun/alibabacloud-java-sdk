// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetScheduledTaskPushOptionsResponseBody extends TeaModel {
    /**
     * <p>The list of notification channels.</p>
     */
    @NameInMap("channels")
    public java.util.List<GetScheduledTaskPushOptionsResponseBodyChannels> channels;

    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The prompt displayed when no third-party accounts are bound.</p>
     * 
     * <strong>example:</strong>
     * <p>No push channels available</p>
     */
    @NameInMap("emptyHint")
    public String emptyHint;

    /**
     * <p>The prompt message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetScheduledTaskPushOptionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetScheduledTaskPushOptionsResponseBody self = new GetScheduledTaskPushOptionsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetScheduledTaskPushOptionsResponseBody setChannels(java.util.List<GetScheduledTaskPushOptionsResponseBodyChannels> channels) {
        this.channels = channels;
        return this;
    }
    public java.util.List<GetScheduledTaskPushOptionsResponseBodyChannels> getChannels() {
        return this.channels;
    }

    public GetScheduledTaskPushOptionsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetScheduledTaskPushOptionsResponseBody setEmptyHint(String emptyHint) {
        this.emptyHint = emptyHint;
        return this;
    }
    public String getEmptyHint() {
        return this.emptyHint;
    }

    public GetScheduledTaskPushOptionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetScheduledTaskPushOptionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetScheduledTaskPushOptionsResponseBodyChannelsImGroups extends TeaModel {
        /**
         * <p>The external IM group ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cidExample</p>
         */
        @NameInMap("imGroupId")
        public String imGroupId;

        /**
         * <p>The external IM group name.</p>
         * 
         * <strong>example:</strong>
         * <p>Project collaboration group</p>
         */
        @NameInMap("imGroupName")
        public String imGroupName;

        /**
         * <p>The binding record ID of the IM group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>101</p>
         */
        @NameInMap("mappingId")
        public Long mappingId;

        public static GetScheduledTaskPushOptionsResponseBodyChannelsImGroups build(java.util.Map<String, ?> map) throws Exception {
            GetScheduledTaskPushOptionsResponseBodyChannelsImGroups self = new GetScheduledTaskPushOptionsResponseBodyChannelsImGroups();
            return TeaModel.build(map, self);
        }

        public GetScheduledTaskPushOptionsResponseBodyChannelsImGroups setImGroupId(String imGroupId) {
            this.imGroupId = imGroupId;
            return this;
        }
        public String getImGroupId() {
            return this.imGroupId;
        }

        public GetScheduledTaskPushOptionsResponseBodyChannelsImGroups setImGroupName(String imGroupName) {
            this.imGroupName = imGroupName;
            return this;
        }
        public String getImGroupName() {
            return this.imGroupName;
        }

        public GetScheduledTaskPushOptionsResponseBodyChannelsImGroups setMappingId(Long mappingId) {
            this.mappingId = mappingId;
            return this;
        }
        public Long getMappingId() {
            return this.mappingId;
        }

    }

    public static class GetScheduledTaskPushOptionsResponseBodyChannelsMethods extends TeaModel {
        /**
         * <p>The reason why the option is grayed out.</p>
         * 
         * <strong>example:</strong>
         * <p>No push channel is bound</p>
         */
        @NameInMap("disabledReason")
        public String disabledReason;

        /**
         * <p>The feature switch. This parameter is optional when type is set to web_search.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The method.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>channel_bot</p>
         */
        @NameInMap("method")
        public String method;

        /**
         * <p>The name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Group chatbot</p>
         */
        @NameInMap("name")
        public String name;

        public static GetScheduledTaskPushOptionsResponseBodyChannelsMethods build(java.util.Map<String, ?> map) throws Exception {
            GetScheduledTaskPushOptionsResponseBodyChannelsMethods self = new GetScheduledTaskPushOptionsResponseBodyChannelsMethods();
            return TeaModel.build(map, self);
        }

        public GetScheduledTaskPushOptionsResponseBodyChannelsMethods setDisabledReason(String disabledReason) {
            this.disabledReason = disabledReason;
            return this;
        }
        public String getDisabledReason() {
            return this.disabledReason;
        }

        public GetScheduledTaskPushOptionsResponseBodyChannelsMethods setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public GetScheduledTaskPushOptionsResponseBodyChannelsMethods setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public GetScheduledTaskPushOptionsResponseBodyChannelsMethods setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetScheduledTaskPushOptionsResponseBodyChannels extends TeaModel {
        /**
         * <p>The channel name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DingTalk</p>
         */
        @NameInMap("channelName")
        public String channelName;

        /**
         * <p>The notification method. Valid values:</p>
         * <ul>
         * <li><strong>hdm_alarm_sms</strong>: SMS.</li>
         * <li><strong>dingtalk</strong>: DingTalk chatbot.</li>
         * <li><strong>hdm_alarm_sms_and_email</strong>: SMS and email.</li>
         * <li><strong>hdm_alarm_sms,dingtalk</strong>: SMS and DingTalk chatbot.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DINGTALK</p>
         */
        @NameInMap("channelType")
        public String channelType;

        /**
         * <p>The optional IM groups bound to this channel for the collaboration group. This value is empty when querying personal tasks.</p>
         */
        @NameInMap("imGroups")
        public java.util.List<GetScheduledTaskPushOptionsResponseBodyChannelsImGroups> imGroups;

        /**
         * <p>The supported methods: HEAD, GET, POST, PUT, DELETE, PATCH, OPTIONS.</p>
         */
        @NameInMap("methods")
        public java.util.List<GetScheduledTaskPushOptionsResponseBodyChannelsMethods> methods;

        public static GetScheduledTaskPushOptionsResponseBodyChannels build(java.util.Map<String, ?> map) throws Exception {
            GetScheduledTaskPushOptionsResponseBodyChannels self = new GetScheduledTaskPushOptionsResponseBodyChannels();
            return TeaModel.build(map, self);
        }

        public GetScheduledTaskPushOptionsResponseBodyChannels setChannelName(String channelName) {
            this.channelName = channelName;
            return this;
        }
        public String getChannelName() {
            return this.channelName;
        }

        public GetScheduledTaskPushOptionsResponseBodyChannels setChannelType(String channelType) {
            this.channelType = channelType;
            return this;
        }
        public String getChannelType() {
            return this.channelType;
        }

        public GetScheduledTaskPushOptionsResponseBodyChannels setImGroups(java.util.List<GetScheduledTaskPushOptionsResponseBodyChannelsImGroups> imGroups) {
            this.imGroups = imGroups;
            return this;
        }
        public java.util.List<GetScheduledTaskPushOptionsResponseBodyChannelsImGroups> getImGroups() {
            return this.imGroups;
        }

        public GetScheduledTaskPushOptionsResponseBodyChannels setMethods(java.util.List<GetScheduledTaskPushOptionsResponseBodyChannelsMethods> methods) {
            this.methods = methods;
            return this;
        }
        public java.util.List<GetScheduledTaskPushOptionsResponseBodyChannelsMethods> getMethods() {
            return this.methods;
        }

    }

}
