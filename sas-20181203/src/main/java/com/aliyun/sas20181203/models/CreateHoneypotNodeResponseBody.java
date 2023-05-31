// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateHoneypotNodeResponseBody extends TeaModel {
    /**
     * <p>The status code returned. The status code **200** indicates that the request was successful. Other status codes indicate that the request failed. You can identify the cause of the failure based on the status code.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("HoneypotNode")
    public CreateHoneypotNodeResponseBodyHoneypotNode honeypotNode;

    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   **true**: The request was successful.</p>
     * <p>*   **false**: The request failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateHoneypotNodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateHoneypotNodeResponseBody self = new CreateHoneypotNodeResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateHoneypotNodeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateHoneypotNodeResponseBody setHoneypotNode(CreateHoneypotNodeResponseBodyHoneypotNode honeypotNode) {
        this.honeypotNode = honeypotNode;
        return this;
    }
    public CreateHoneypotNodeResponseBodyHoneypotNode getHoneypotNode() {
        return this.honeypotNode;
    }

    public CreateHoneypotNodeResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateHoneypotNodeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateHoneypotNodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateHoneypotNodeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateHoneypotNodeResponseBodyHoneypotNode extends TeaModel {
        /**
         * <p>The ID of the management node.</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        public static CreateHoneypotNodeResponseBodyHoneypotNode build(java.util.Map<String, ?> map) throws Exception {
            CreateHoneypotNodeResponseBodyHoneypotNode self = new CreateHoneypotNodeResponseBodyHoneypotNode();
            return TeaModel.build(map, self);
        }

        public CreateHoneypotNodeResponseBodyHoneypotNode setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

    }

}
