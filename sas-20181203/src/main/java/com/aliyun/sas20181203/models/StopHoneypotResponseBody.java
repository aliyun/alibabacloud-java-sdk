// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class StopHoneypotResponseBody extends TeaModel {
    /**
     * <p>The response code. The status code **200** indicates that the request was successful. Other status codes indicate that the request failed. You can identify the cause of the failure based on the status code.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public StopHoneypotResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static StopHoneypotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopHoneypotResponseBody self = new StopHoneypotResponseBody();
        return TeaModel.build(map, self);
    }

    public StopHoneypotResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public StopHoneypotResponseBody setData(StopHoneypotResponseBodyData data) {
        this.data = data;
        return this;
    }
    public StopHoneypotResponseBodyData getData() {
        return this.data;
    }

    public StopHoneypotResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public StopHoneypotResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public StopHoneypotResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StopHoneypotResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class StopHoneypotResponseBodyData extends TeaModel {
        /**
         * <p>The name of the management node to which the honeypot belongs.</p>
         */
        @NameInMap("ControlNodeName")
        public String controlNodeName;

        /**
         * <p>The ID of the honeypot.</p>
         */
        @NameInMap("HoneypotId")
        public String honeypotId;

        /**
         * <p>The display name of the image.</p>
         */
        @NameInMap("HoneypotImageDisplayName")
        public String honeypotImageDisplayName;

        /**
         * <p>The name of the image that is used for the honeypot.</p>
         */
        @NameInMap("HoneypotImageName")
        public String honeypotImageName;

        /**
         * <p>The name of the honeypot.</p>
         */
        @NameInMap("HoneypotName")
        public String honeypotName;

        /**
         * <p>The ID of the management node.</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The ID of the honeypot custom parameter.</p>
         */
        @NameInMap("PresetId")
        public String presetId;

        /**
         * <p>The statuses of the honeypots.</p>
         */
        @NameInMap("State")
        public java.util.List<String> state;

        public static StopHoneypotResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            StopHoneypotResponseBodyData self = new StopHoneypotResponseBodyData();
            return TeaModel.build(map, self);
        }

        public StopHoneypotResponseBodyData setControlNodeName(String controlNodeName) {
            this.controlNodeName = controlNodeName;
            return this;
        }
        public String getControlNodeName() {
            return this.controlNodeName;
        }

        public StopHoneypotResponseBodyData setHoneypotId(String honeypotId) {
            this.honeypotId = honeypotId;
            return this;
        }
        public String getHoneypotId() {
            return this.honeypotId;
        }

        public StopHoneypotResponseBodyData setHoneypotImageDisplayName(String honeypotImageDisplayName) {
            this.honeypotImageDisplayName = honeypotImageDisplayName;
            return this;
        }
        public String getHoneypotImageDisplayName() {
            return this.honeypotImageDisplayName;
        }

        public StopHoneypotResponseBodyData setHoneypotImageName(String honeypotImageName) {
            this.honeypotImageName = honeypotImageName;
            return this;
        }
        public String getHoneypotImageName() {
            return this.honeypotImageName;
        }

        public StopHoneypotResponseBodyData setHoneypotName(String honeypotName) {
            this.honeypotName = honeypotName;
            return this;
        }
        public String getHoneypotName() {
            return this.honeypotName;
        }

        public StopHoneypotResponseBodyData setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public StopHoneypotResponseBodyData setPresetId(String presetId) {
            this.presetId = presetId;
            return this;
        }
        public String getPresetId() {
            return this.presetId;
        }

        public StopHoneypotResponseBodyData setState(java.util.List<String> state) {
            this.state = state;
            return this;
        }
        public java.util.List<String> getState() {
            return this.state;
        }

    }

}
