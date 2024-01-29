// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class AuthDiagnosisRequest extends TeaModel {
    @NameInMap("instances")
    public java.util.List<AuthDiagnosisRequestInstances> instances;

    public static AuthDiagnosisRequest build(java.util.Map<String, ?> map) throws Exception {
        AuthDiagnosisRequest self = new AuthDiagnosisRequest();
        return TeaModel.build(map, self);
    }

    public AuthDiagnosisRequest setInstances(java.util.List<AuthDiagnosisRequestInstances> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<AuthDiagnosisRequestInstances> getInstances() {
        return this.instances;
    }

    public static class AuthDiagnosisRequestInstances extends TeaModel {
        @NameInMap("instance")
        public String instance;

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
