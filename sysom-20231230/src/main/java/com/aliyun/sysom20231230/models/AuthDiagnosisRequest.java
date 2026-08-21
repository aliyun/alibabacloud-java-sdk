// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class AuthDiagnosisRequest extends TeaModel {
    @NameInMap("X-Debug-Id")
    public String xDebugId;

    /**
     * <p>Specifies whether to enable automatic creation of the service-linked role.</p>
     */
    @NameInMap("autoCreateRole")
    public Boolean autoCreateRole;

    /**
     * <p>Specifies whether to automatically install the latest version of the agent if it is not installed.</p>
     */
    @NameInMap("autoInstallAgent")
    public Boolean autoInstallAgent;

    /**
     * <p>The list of instances authorized for diagnosis.</p>
     */
    @NameInMap("instances")
    public java.util.List<AuthDiagnosisRequestInstances> instances;

    @NameInMap("x-sysom-invoke-source")
    public String xSysomInvokeSource;

    public static AuthDiagnosisRequest build(java.util.Map<String, ?> map) throws Exception {
        AuthDiagnosisRequest self = new AuthDiagnosisRequest();
        return TeaModel.build(map, self);
    }

    public AuthDiagnosisRequest setXDebugId(String xDebugId) {
        this.xDebugId = xDebugId;
        return this;
    }
    public String getXDebugId() {
        return this.xDebugId;
    }

    public AuthDiagnosisRequest setAutoCreateRole(Boolean autoCreateRole) {
        this.autoCreateRole = autoCreateRole;
        return this;
    }
    public Boolean getAutoCreateRole() {
        return this.autoCreateRole;
    }

    public AuthDiagnosisRequest setAutoInstallAgent(Boolean autoInstallAgent) {
        this.autoInstallAgent = autoInstallAgent;
        return this;
    }
    public Boolean getAutoInstallAgent() {
        return this.autoInstallAgent;
    }

    public AuthDiagnosisRequest setInstances(java.util.List<AuthDiagnosisRequestInstances> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<AuthDiagnosisRequestInstances> getInstances() {
        return this.instances;
    }

    public AuthDiagnosisRequest setXSysomInvokeSource(String xSysomInvokeSource) {
        this.xSysomInvokeSource = xSysomInvokeSource;
        return this;
    }
    public String getXSysomInvokeSource() {
        return this.xSysomInvokeSource;
    }

    public static class AuthDiagnosisRequestInstances extends TeaModel {
        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i-wz9b9vucz1iubsz8sjqo</p>
         */
        @NameInMap("instance")
        public String instance;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("region")
        public String region;

        public static AuthDiagnosisRequestInstances build(java.util.Map<String, ?> map) throws Exception {
            AuthDiagnosisRequestInstances self = new AuthDiagnosisRequestInstances();
            return TeaModel.build(map, self);
        }

        public AuthDiagnosisRequestInstances setInstance(String instance) {
            this.instance = instance;
            return this;
        }
        public String getInstance() {
            return this.instance;
        }

        public AuthDiagnosisRequestInstances setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

}
