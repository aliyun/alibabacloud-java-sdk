// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateHoneypotResponseBody extends TeaModel {
    /**
     * <p>The status code returned. The status code <strong>200</strong> indicates that the request was successful. Other status codes indicate that the request failed. You can identify the cause of the failure based on the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The information about the honeypot.</p>
     */
    @NameInMap("Data")
    public UpdateHoneypotResponseBodyData data;

    /**
     * <p>The HTTP status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>3B323ADD-6CF8-51F6-9047-2F0A4E3F5EFD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The request was successful.</li>
     * <li><strong>false</strong>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpdateHoneypotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateHoneypotResponseBody self = new UpdateHoneypotResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateHoneypotResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateHoneypotResponseBody setData(UpdateHoneypotResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateHoneypotResponseBodyData getData() {
        return this.data;
    }

    public UpdateHoneypotResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UpdateHoneypotResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateHoneypotResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateHoneypotResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateHoneypotResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the honeypot.</p>
         * 
         * <strong>example:</strong>
         * <p>9bf8cd373112263d4bc102fc5dba9d9f812ee05d4d35c487d330d52e937f****</p>
         */
        @NameInMap("HoneypotId")
        public String honeypotId;

        /**
         * <p>The display name of the honeypot image.</p>
         * 
         * <strong>example:</strong>
         * <p>Webmin</p>
         */
        @NameInMap("HoneypotImageDisplayName")
        public String honeypotImageDisplayName;

        /**
         * <p>The name of the honeypot image.</p>
         * 
         * <strong>example:</strong>
         * <p>webpage</p>
         */
        @NameInMap("HoneypotImageName")
        public String honeypotImageName;

        /**
         * <p>The custom name of the honeypot.</p>
         * 
         * <strong>example:</strong>
         * <p>hyl-phpmyadmin</p>
         */
        @NameInMap("HoneypotName")
        public String honeypotName;

        /**
         * <p>The ID of the management node.</p>
         * 
         * <strong>example:</strong>
         * <p>a882e590-b87b-45a6-87b9-d0a3e5a0****</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The ID of the custom configuration for the honeypot.</p>
         * 
         * <strong>example:</strong>
         * <p>868a7579-00b5-4a74-999d-8bd3f411e8a3</p>
         */
        @NameInMap("PresetId")
        public String presetId;

        /**
         * <p>An array that consists of the status information about the honeypot.</p>
         */
        @NameInMap("State")
        public java.util.List<String> state;

        public static UpdateHoneypotResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateHoneypotResponseBodyData self = new UpdateHoneypotResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateHoneypotResponseBodyData setHoneypotId(String honeypotId) {
            this.honeypotId = honeypotId;
            return this;
        }
        public String getHoneypotId() {
            return this.honeypotId;
        }

        public UpdateHoneypotResponseBodyData setHoneypotImageDisplayName(String honeypotImageDisplayName) {
            this.honeypotImageDisplayName = honeypotImageDisplayName;
            return this;
        }
        public String getHoneypotImageDisplayName() {
            return this.honeypotImageDisplayName;
        }

        public UpdateHoneypotResponseBodyData setHoneypotImageName(String honeypotImageName) {
            this.honeypotImageName = honeypotImageName;
            return this;
        }
        public String getHoneypotImageName() {
            return this.honeypotImageName;
        }

        public UpdateHoneypotResponseBodyData setHoneypotName(String honeypotName) {
            this.honeypotName = honeypotName;
            return this;
        }
        public String getHoneypotName() {
            return this.honeypotName;
        }

        public UpdateHoneypotResponseBodyData setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public UpdateHoneypotResponseBodyData setPresetId(String presetId) {
            this.presetId = presetId;
            return this;
        }
        public String getPresetId() {
            return this.presetId;
        }

        public UpdateHoneypotResponseBodyData setState(java.util.List<String> state) {
            this.state = state;
            return this;
        }
        public java.util.List<String> getState() {
            return this.state;
        }

    }

}
