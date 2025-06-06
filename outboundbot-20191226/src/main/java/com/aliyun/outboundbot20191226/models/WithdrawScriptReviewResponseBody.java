// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class WithdrawScriptReviewResponseBody extends TeaModel {
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
    public WithdrawScriptReviewResponseBodyScript script;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static WithdrawScriptReviewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        WithdrawScriptReviewResponseBody self = new WithdrawScriptReviewResponseBody();
        return TeaModel.build(map, self);
    }

    public WithdrawScriptReviewResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public WithdrawScriptReviewResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public WithdrawScriptReviewResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public WithdrawScriptReviewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public WithdrawScriptReviewResponseBody setScript(WithdrawScriptReviewResponseBodyScript script) {
        this.script = script;
        return this;
    }
    public WithdrawScriptReviewResponseBodyScript getScript() {
        return this.script;
    }

    public WithdrawScriptReviewResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class WithdrawScriptReviewResponseBodyScript extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>PUBLISHED</p>
         */
        @NameInMap("DebugStatus")
        public String debugStatus;

        @NameInMap("Industry")
        public String industry;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsDebugDrafted")
        public Boolean isDebugDrafted;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsDrafted")
        public Boolean isDrafted;

        @NameInMap("Scene")
        public String scene;

        @NameInMap("ScriptDescription")
        public String scriptDescription;

        /**
         * <strong>example:</strong>
         * <p>e4e2a770-b97b-465a-80d8-06dca008c503</p>
         */
        @NameInMap("ScriptId")
        public String scriptId;

        @NameInMap("ScriptName")
        public String scriptName;

        /**
         * <strong>example:</strong>
         * <p>PUBLISHED</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>1578881227000</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static WithdrawScriptReviewResponseBodyScript build(java.util.Map<String, ?> map) throws Exception {
            WithdrawScriptReviewResponseBodyScript self = new WithdrawScriptReviewResponseBodyScript();
            return TeaModel.build(map, self);
        }

        public WithdrawScriptReviewResponseBodyScript setDebugStatus(String debugStatus) {
            this.debugStatus = debugStatus;
            return this;
        }
        public String getDebugStatus() {
            return this.debugStatus;
        }

        public WithdrawScriptReviewResponseBodyScript setIndustry(String industry) {
            this.industry = industry;
            return this;
        }
        public String getIndustry() {
            return this.industry;
        }

        public WithdrawScriptReviewResponseBodyScript setIsDebugDrafted(Boolean isDebugDrafted) {
            this.isDebugDrafted = isDebugDrafted;
            return this;
        }
        public Boolean getIsDebugDrafted() {
            return this.isDebugDrafted;
        }

        public WithdrawScriptReviewResponseBodyScript setIsDrafted(Boolean isDrafted) {
            this.isDrafted = isDrafted;
            return this;
        }
        public Boolean getIsDrafted() {
            return this.isDrafted;
        }

        public WithdrawScriptReviewResponseBodyScript setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public WithdrawScriptReviewResponseBodyScript setScriptDescription(String scriptDescription) {
            this.scriptDescription = scriptDescription;
            return this;
        }
        public String getScriptDescription() {
            return this.scriptDescription;
        }

        public WithdrawScriptReviewResponseBodyScript setScriptId(String scriptId) {
            this.scriptId = scriptId;
            return this;
        }
        public String getScriptId() {
            return this.scriptId;
        }

        public WithdrawScriptReviewResponseBodyScript setScriptName(String scriptName) {
            this.scriptName = scriptName;
            return this;
        }
        public String getScriptName() {
            return this.scriptName;
        }

        public WithdrawScriptReviewResponseBodyScript setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public WithdrawScriptReviewResponseBodyScript setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
