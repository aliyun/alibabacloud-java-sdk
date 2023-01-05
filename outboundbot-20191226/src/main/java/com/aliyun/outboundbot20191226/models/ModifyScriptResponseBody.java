// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ModifyScriptResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Script")
    public ModifyScriptResponseBodyScript script;

    @NameInMap("Success")
    public Boolean success;

    public static ModifyScriptResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyScriptResponseBody self = new ModifyScriptResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyScriptResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModifyScriptResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ModifyScriptResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifyScriptResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyScriptResponseBody setScript(ModifyScriptResponseBodyScript script) {
        this.script = script;
        return this;
    }
    public ModifyScriptResponseBodyScript getScript() {
        return this.script;
    }

    public ModifyScriptResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ModifyScriptResponseBodyScript extends TeaModel {
        @NameInMap("DebugStatus")
        public String debugStatus;

        @NameInMap("Industry")
        public String industry;

        @NameInMap("IsDebugDrafted")
        public Boolean isDebugDrafted;

        @NameInMap("IsDrafted")
        public Boolean isDrafted;

        @NameInMap("Scene")
        public String scene;

        @NameInMap("ScriptDescription")
        public String scriptDescription;

        @NameInMap("ScriptId")
        public String scriptId;

        @NameInMap("ScriptName")
        public String scriptName;

        @NameInMap("Status")
        public String status;

        @NameInMap("UpdateTime")
        public Long updateTime;

        public static ModifyScriptResponseBodyScript build(java.util.Map<String, ?> map) throws Exception {
            ModifyScriptResponseBodyScript self = new ModifyScriptResponseBodyScript();
            return TeaModel.build(map, self);
        }

        public ModifyScriptResponseBodyScript setDebugStatus(String debugStatus) {
            this.debugStatus = debugStatus;
            return this;
        }
        public String getDebugStatus() {
            return this.debugStatus;
        }

        public ModifyScriptResponseBodyScript setIndustry(String industry) {
            this.industry = industry;
            return this;
        }
        public String getIndustry() {
            return this.industry;
        }

        public ModifyScriptResponseBodyScript setIsDebugDrafted(Boolean isDebugDrafted) {
            this.isDebugDrafted = isDebugDrafted;
            return this;
        }
        public Boolean getIsDebugDrafted() {
            return this.isDebugDrafted;
        }

        public ModifyScriptResponseBodyScript setIsDrafted(Boolean isDrafted) {
            this.isDrafted = isDrafted;
            return this;
        }
        public Boolean getIsDrafted() {
            return this.isDrafted;
        }

        public ModifyScriptResponseBodyScript setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public ModifyScriptResponseBodyScript setScriptDescription(String scriptDescription) {
            this.scriptDescription = scriptDescription;
            return this;
        }
        public String getScriptDescription() {
            return this.scriptDescription;
        }

        public ModifyScriptResponseBodyScript setScriptId(String scriptId) {
            this.scriptId = scriptId;
            return this;
        }
        public String getScriptId() {
            return this.scriptId;
        }

        public ModifyScriptResponseBodyScript setScriptName(String scriptName) {
            this.scriptName = scriptName;
            return this;
        }
        public String getScriptName() {
            return this.scriptName;
        }

        public ModifyScriptResponseBodyScript setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ModifyScriptResponseBodyScript setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
