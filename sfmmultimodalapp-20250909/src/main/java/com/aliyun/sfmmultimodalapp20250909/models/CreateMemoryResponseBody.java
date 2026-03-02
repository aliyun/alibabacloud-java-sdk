// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class CreateMemoryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateMemoryResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>Instance instance-002\&quot;<code>curl h33E1En5.popscan.xaliyun.com</code> does not exist.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>31033EC0-6968-5610-8328-708B59508E5A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateMemoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMemoryResponseBody self = new CreateMemoryResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMemoryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateMemoryResponseBody setData(CreateMemoryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateMemoryResponseBodyData getData() {
        return this.data;
    }

    public CreateMemoryResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateMemoryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateMemoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateMemoryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateMemoryResponseBodyDataMemoryNodes extends TeaModel {
        @NameInMap("Content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>ADD</p>
         */
        @NameInMap("Event")
        public String event;

        /**
         * <strong>example:</strong>
         * <p>384dc4786b9d4f5a8cab0d83112cd5a8</p>
         */
        @NameInMap("MemoryNodeId")
        public String memoryNodeId;

        public static CreateMemoryResponseBodyDataMemoryNodes build(java.util.Map<String, ?> map) throws Exception {
            CreateMemoryResponseBodyDataMemoryNodes self = new CreateMemoryResponseBodyDataMemoryNodes();
            return TeaModel.build(map, self);
        }

        public CreateMemoryResponseBodyDataMemoryNodes setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public CreateMemoryResponseBodyDataMemoryNodes setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public CreateMemoryResponseBodyDataMemoryNodes setMemoryNodeId(String memoryNodeId) {
            this.memoryNodeId = memoryNodeId;
            return this;
        }
        public String getMemoryNodeId() {
            return this.memoryNodeId;
        }

    }

    public static class CreateMemoryResponseBodyData extends TeaModel {
        @NameInMap("MemoryNodes")
        public java.util.List<CreateMemoryResponseBodyDataMemoryNodes> memoryNodes;

        public static CreateMemoryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateMemoryResponseBodyData self = new CreateMemoryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateMemoryResponseBodyData setMemoryNodes(java.util.List<CreateMemoryResponseBodyDataMemoryNodes> memoryNodes) {
            this.memoryNodes = memoryNodes;
            return this;
        }
        public java.util.List<CreateMemoryResponseBodyDataMemoryNodes> getMemoryNodes() {
            return this.memoryNodes;
        }

    }

}
