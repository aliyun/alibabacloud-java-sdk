// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qianzhou20211111.models;

import com.aliyun.tea.*;

public class AICreateSessionMessageRequest extends TeaModel {
    @NameInMap("context")
    public AICreateSessionMessageRequestContext context;

    @NameInMap("language")
    public String language;

    @NameInMap("message")
    public String message;

    @NameInMap("session_id")
    public String sessionId;

    /**
     * <strong>example:</strong>
     * <p>QA / K8S_DIAGNOSE</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("employee_id")
    public String employeeId;

    public static AICreateSessionMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        AICreateSessionMessageRequest self = new AICreateSessionMessageRequest();
        return TeaModel.build(map, self);
    }

    public AICreateSessionMessageRequest setContext(AICreateSessionMessageRequestContext context) {
        this.context = context;
        return this;
    }
    public AICreateSessionMessageRequestContext getContext() {
        return this.context;
    }

    public AICreateSessionMessageRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public AICreateSessionMessageRequest setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AICreateSessionMessageRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public AICreateSessionMessageRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public AICreateSessionMessageRequest setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
        return this;
    }
    public String getEmployeeId() {
        return this.employeeId;
    }

    public static class AICreateSessionMessageRequestContext extends TeaModel {
        @NameInMap("cluster_id")
        public String clusterId;

        @NameInMap("error")
        public String error;

        @NameInMap("kind")
        public String kind;

        @NameInMap("name")
        public String name;

        @NameInMap("namespace")
        public String namespace;

        @NameInMap("uuid")
        public String uuid;

        public static AICreateSessionMessageRequestContext build(java.util.Map<String, ?> map) throws Exception {
            AICreateSessionMessageRequestContext self = new AICreateSessionMessageRequestContext();
            return TeaModel.build(map, self);
        }

        public AICreateSessionMessageRequestContext setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public AICreateSessionMessageRequestContext setError(String error) {
            this.error = error;
            return this;
        }
        public String getError() {
            return this.error;
        }

        public AICreateSessionMessageRequestContext setKind(String kind) {
            this.kind = kind;
            return this;
        }
        public String getKind() {
            return this.kind;
        }

        public AICreateSessionMessageRequestContext setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public AICreateSessionMessageRequestContext setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public AICreateSessionMessageRequestContext setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
