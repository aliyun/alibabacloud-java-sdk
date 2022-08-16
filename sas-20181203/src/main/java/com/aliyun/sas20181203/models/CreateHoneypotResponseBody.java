// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateHoneypotResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateHoneypotResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateHoneypotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateHoneypotResponseBody self = new CreateHoneypotResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateHoneypotResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateHoneypotResponseBody setData(CreateHoneypotResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateHoneypotResponseBodyData getData() {
        return this.data;
    }

    public CreateHoneypotResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateHoneypotResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateHoneypotResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateHoneypotResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateHoneypotResponseBodyData extends TeaModel {
        @NameInMap("ControlNodeName")
        public String controlNodeName;

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

        public static CreateHoneypotResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateHoneypotResponseBodyData self = new CreateHoneypotResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateHoneypotResponseBodyData setControlNodeName(String controlNodeName) {
            this.controlNodeName = controlNodeName;
            return this;
        }
        public String getControlNodeName() {
            return this.controlNodeName;
        }

        public CreateHoneypotResponseBodyData setHoneypotId(String honeypotId) {
            this.honeypotId = honeypotId;
            return this;
        }
        public String getHoneypotId() {
            return this.honeypotId;
        }

        public CreateHoneypotResponseBodyData setHoneypotImageDisplayName(String honeypotImageDisplayName) {
            this.honeypotImageDisplayName = honeypotImageDisplayName;
            return this;
        }
        public String getHoneypotImageDisplayName() {
            return this.honeypotImageDisplayName;
        }

        public CreateHoneypotResponseBodyData setHoneypotImageName(String honeypotImageName) {
            this.honeypotImageName = honeypotImageName;
            return this;
        }
        public String getHoneypotImageName() {
            return this.honeypotImageName;
        }

        public CreateHoneypotResponseBodyData setHoneypotName(String honeypotName) {
            this.honeypotName = honeypotName;
            return this;
        }
        public String getHoneypotName() {
            return this.honeypotName;
        }

        public CreateHoneypotResponseBodyData setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public CreateHoneypotResponseBodyData setPresetId(String presetId) {
            this.presetId = presetId;
            return this;
        }
        public String getPresetId() {
            return this.presetId;
        }

        public CreateHoneypotResponseBodyData setState(java.util.List<String> state) {
            this.state = state;
            return this;
        }
        public java.util.List<String> getState() {
            return this.state;
        }

    }

}
