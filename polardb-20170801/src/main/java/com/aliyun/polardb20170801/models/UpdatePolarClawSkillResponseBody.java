// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class UpdatePolarClawSkillResponseBody extends TeaModel {
    /**
     * <p>The application ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-xxx</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The updated Skill configuration. Sensitive values are masked.</p>
     */
    @NameInMap("Config")
    public UpdatePolarClawSkillResponseBodyConfig config;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Indicates whether the operation is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Ok")
    public Boolean ok;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>F45FFACC-xxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The Skill identifier key.</p>
     * 
     * <strong>example:</strong>
     * <p>alibacloud-rds-copilot</p>
     */
    @NameInMap("SkillKey")
    public String skillKey;

    public static UpdatePolarClawSkillResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdatePolarClawSkillResponseBody self = new UpdatePolarClawSkillResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdatePolarClawSkillResponseBody setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public UpdatePolarClawSkillResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public UpdatePolarClawSkillResponseBody setConfig(UpdatePolarClawSkillResponseBodyConfig config) {
        this.config = config;
        return this;
    }
    public UpdatePolarClawSkillResponseBodyConfig getConfig() {
        return this.config;
    }

    public UpdatePolarClawSkillResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdatePolarClawSkillResponseBody setOk(Boolean ok) {
        this.ok = ok;
        return this;
    }
    public Boolean getOk() {
        return this.ok;
    }

    public UpdatePolarClawSkillResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdatePolarClawSkillResponseBody setSkillKey(String skillKey) {
        this.skillKey = skillKey;
        return this;
    }
    public String getSkillKey() {
        return this.skillKey;
    }

    public static class UpdatePolarClawSkillResponseBodyConfig extends TeaModel {
        /**
         * <p>Specifies whether to enable the Skill.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The environment variable configuration.</p>
         */
        @NameInMap("Env")
        public java.util.Map<String, String> env;

        public static UpdatePolarClawSkillResponseBodyConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdatePolarClawSkillResponseBodyConfig self = new UpdatePolarClawSkillResponseBodyConfig();
            return TeaModel.build(map, self);
        }

        public UpdatePolarClawSkillResponseBodyConfig setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public UpdatePolarClawSkillResponseBodyConfig setEnv(java.util.Map<String, String> env) {
            this.env = env;
            return this;
        }
        public java.util.Map<String, String> getEnv() {
            return this.env;
        }

    }

}
