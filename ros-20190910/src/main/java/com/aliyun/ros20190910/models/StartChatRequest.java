// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class StartChatRequest extends TeaModel {
    /**
     * <p>Set this parameter to V2 to route requests to the ROS Agent V2 backend.</p>
     * 
     * <strong>example:</strong>
     * <p>V2</p>
     */
    @NameInMap("AgentVersion")
    public String agentVersion;

    /**
     * <p>The array of image attachments. A maximum of 5 attachments are supported. Currently, only the image type is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;Type&quot;:&quot;image&quot;,&quot;MimeType&quot;:&quot;image/png&quot;,&quot;Name&quot;:&quot;topology.png&quot;,&quot;OssObjectKey&quot;:&quot;user-id/attachments/topology.png&quot;}]</p>
     */
    @NameInMap("Attachments")
    public java.util.List<StartChatRequestAttachments> attachments;

    /**
     * <p>A compatibility field. V2 always returns event streams through SSE. The current service does not consume this field.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnablePartialMessage")
    public Boolean enablePartialMessage;

    /**
     * <p>Specifies whether to output thinking content. Default value: true. This parameter can be reset per request when re-entering the same session.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableThinking")
    public Boolean enableThinking;

    /**
     * <p>V2 supports only IaCCodeNormal or IaCCodePipeline. The default value for a new session is IaCCodeNormal. An existing session cannot switch modes.</p>
     * 
     * <strong>example:</strong>
     * <p>IaCCodeNormal</p>
     */
    @NameInMap("Mode")
    public String mode;

    /**
     * <p>The user input. The value cannot be empty or contain only whitespace characters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Create an ROS template with a VPC and a VSwitch</p>
     */
    @NameInMap("Query")
    public String query;

    /**
     * <p>The region ID for this resource operation.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>If this parameter is not specified, a new session is created. If this parameter is specified, the existing session of the current user is continued.</p>
     * 
     * <strong>example:</strong>
     * <p>7f4e2a8c6d9b4a1f8e3c5b7d2a6f9012</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    public static StartChatRequest build(java.util.Map<String, ?> map) throws Exception {
        StartChatRequest self = new StartChatRequest();
        return TeaModel.build(map, self);
    }

    public StartChatRequest setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
        return this;
    }
    public String getAgentVersion() {
        return this.agentVersion;
    }

    public StartChatRequest setAttachments(java.util.List<StartChatRequestAttachments> attachments) {
        this.attachments = attachments;
        return this;
    }
    public java.util.List<StartChatRequestAttachments> getAttachments() {
        return this.attachments;
    }

    public StartChatRequest setEnablePartialMessage(Boolean enablePartialMessage) {
        this.enablePartialMessage = enablePartialMessage;
        return this;
    }
    public Boolean getEnablePartialMessage() {
        return this.enablePartialMessage;
    }

    public StartChatRequest setEnableThinking(Boolean enableThinking) {
        this.enableThinking = enableThinking;
        return this;
    }
    public Boolean getEnableThinking() {
        return this.enableThinking;
    }

    public StartChatRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public StartChatRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public StartChatRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public StartChatRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public static class StartChatRequestAttachments extends TeaModel {
        /**
         * <p>The image media type. Valid values: image/png, image/jpeg, image/webp, and image/gif.</p>
         * 
         * <strong>example:</strong>
         * <p>image/png</p>
         */
        @NameInMap("MimeType")
        public String mimeType;

        /**
         * <p>The attachment file name. If this parameter is not specified, the file name is obtained from OssObjectKey.</p>
         * 
         * <strong>example:</strong>
         * <p>topology.png</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The OSS object key under the current user directory. The value cannot contain absolute paths or path traversal.</p>
         * 
         * <strong>example:</strong>
         * <p>user-id/attachments/topology.png</p>
         */
        @NameInMap("OssObjectKey")
        public String ossObjectKey;

        /**
         * <p>The attachment type. V2 currently supports only image.</p>
         * 
         * <strong>example:</strong>
         * <p>image</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>V2 does not support direct URL upload. Use OssObjectKey instead.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/topology.png">https://example.com/topology.png</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static StartChatRequestAttachments build(java.util.Map<String, ?> map) throws Exception {
            StartChatRequestAttachments self = new StartChatRequestAttachments();
            return TeaModel.build(map, self);
        }

        public StartChatRequestAttachments setMimeType(String mimeType) {
            this.mimeType = mimeType;
            return this;
        }
        public String getMimeType() {
            return this.mimeType;
        }

        public StartChatRequestAttachments setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public StartChatRequestAttachments setOssObjectKey(String ossObjectKey) {
            this.ossObjectKey = ossObjectKey;
            return this;
        }
        public String getOssObjectKey() {
            return this.ossObjectKey;
        }

        public StartChatRequestAttachments setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public StartChatRequestAttachments setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
