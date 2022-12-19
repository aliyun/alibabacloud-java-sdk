// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateHoneypotResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public UpdateHoneypotResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("HoneypotId")
        public String honeypotId;

        @NameInMap("HoneypotImageDisplayName")
        public String honeypotImageDisplayName;

        @NameInMap("HoneypotImageName")
        public String honeypotImageName;

        @NameInMap("HoneypotName")
        public String honeypotName;

        @NameInMap("NodeId")
        public String nodeId;

        @NameInMap("PresetId")
        public String presetId;

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
