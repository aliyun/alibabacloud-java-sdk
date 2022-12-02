// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateHoneypotNodeResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HoneypotNode")
    public CreateHoneypotNodeResponseBodyHoneypotNode honeypotNode;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
