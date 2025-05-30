// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class CreateScriptResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Script")
    public CreateScriptResponseBodyScript script;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateScriptResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateScriptResponseBody self = new CreateScriptResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateScriptResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateScriptResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateScriptResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateScriptResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateScriptResponseBody setScript(CreateScriptResponseBodyScript script) {
        this.script = script;
        return this;
    }
    public CreateScriptResponseBodyScript getScript() {
        return this.script;
    }

    public CreateScriptResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateScriptResponseBodyScript extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>DRAFTED</p>
         */
        @NameInMap("DebugStatus")
        public String debugStatus;

        @NameInMap("Industry")
        public String industry;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsDebugDrafted")
        public Boolean isDebugDrafted;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsDrafted")
        public Boolean isDrafted;

        @NameInMap("NluAccessType")
        public String nluAccessType;

        @NameInMap("NluEngine")
        public String nluEngine;

        @NameInMap("Scene")
        public String scene;

        @NameInMap("ScriptDescription")
        public String scriptDescription;

        /**
         * <strong>example:</strong>
         * <p>8c58d3e0-bf27-4685-a5a5-65872ec5abc4</p>
         */
        @NameInMap("ScriptId")
        public String scriptId;

        @NameInMap("ScriptName")
        public String scriptName;

        /**
         * <strong>example:</strong>
         * <p>DRAFTED</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>1578474045152</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static CreateScriptResponseBodyScript build(java.util.Map<String, ?> map) throws Exception {
            CreateScriptResponseBodyScript self = new CreateScriptResponseBodyScript();
            return TeaModel.build(map, self);
        }

        public CreateScriptResponseBodyScript setDebugStatus(String debugStatus) {
            this.debugStatus = debugStatus;
            return this;
        }
        public String getDebugStatus() {
            return this.debugStatus;
        }

        public CreateScriptResponseBodyScript setIndustry(String industry) {
            this.industry = industry;
            return this;
        }
        public String getIndustry() {
            return this.industry;
        }

        public CreateScriptResponseBodyScript setIsDebugDrafted(Boolean isDebugDrafted) {
            this.isDebugDrafted = isDebugDrafted;
            return this;
        }
        public Boolean getIsDebugDrafted() {
            return this.isDebugDrafted;
        }

        public CreateScriptResponseBodyScript setIsDrafted(Boolean isDrafted) {
            this.isDrafted = isDrafted;
            return this;
        }
        public Boolean getIsDrafted() {
            return this.isDrafted;
        }

        public CreateScriptResponseBodyScript setNluAccessType(String nluAccessType) {
            this.nluAccessType = nluAccessType;
            return this;
        }
        public String getNluAccessType() {
            return this.nluAccessType;
        }

        public CreateScriptResponseBodyScript setNluEngine(String nluEngine) {
            this.nluEngine = nluEngine;
            return this;
        }
        public String getNluEngine() {
            return this.nluEngine;
        }

        public CreateScriptResponseBodyScript setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public CreateScriptResponseBodyScript setScriptDescription(String scriptDescription) {
            this.scriptDescription = scriptDescription;
            return this;
        }
        public String getScriptDescription() {
            return this.scriptDescription;
        }

        public CreateScriptResponseBodyScript setScriptId(String scriptId) {
            this.scriptId = scriptId;
            return this;
        }
        public String getScriptId() {
            return this.scriptId;
        }

        public CreateScriptResponseBodyScript setScriptName(String scriptName) {
            this.scriptName = scriptName;
            return this;
        }
        public String getScriptName() {
            return this.scriptName;
        }

        public CreateScriptResponseBodyScript setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateScriptResponseBodyScript setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
