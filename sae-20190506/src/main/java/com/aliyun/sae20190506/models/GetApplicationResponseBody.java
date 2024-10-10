// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class GetApplicationResponseBody extends TeaModel {
    @NameInMap("Application")
    public GetApplicationResponseBodyApplication application;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>01CF26C7-00A3-4AA6-BA76-7E95F2A3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>ac1a0b2215622920113732501e****</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static GetApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationResponseBody self = new GetApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetApplicationResponseBody setApplication(GetApplicationResponseBodyApplication application) {
        this.application = application;
        return this;
    }
    public GetApplicationResponseBodyApplication getApplication() {
        return this.application;
    }

    public GetApplicationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetApplicationResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class GetApplicationResponseBodyApplication extends TeaModel {
        @NameInMap("AppDescription")
        public String appDescription;

        /**
         * <strong>example:</strong>
         * <p>443d638a-ef76-47c4-b707-61197d******</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <strong>example:</strong>
         * <p>ee99cce6-1c8e-4bfa-96c3-3e2fa9******</p>
         */
        @NameInMap("BaseAppId")
        public String baseAppId;

        /**
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("Cpu")
        public Integer cpu;

        /**
         * <strong>example:</strong>
         * <p>i-8ps2o182102o1jv05bys</p>
         */
        @NameInMap("Instances")
        public Integer instances;

        /**
         * <strong>example:</strong>
         * <p>4096</p>
         */
        @NameInMap("Mem")
        public Integer mem;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("MseEnabled")
        public Boolean mseEnabled;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("MseNamespaceId")
        public String mseNamespaceId;

        /**
         * <strong>example:</strong>
         * <p>cn-shenzhen</p>
         */
        @NameInMap("NamespaceId")
        public String namespaceId;

        /**
         * <strong>example:</strong>
         * <p>java</p>
         */
        @NameInMap("ProgrammingLanguage")
        public String programmingLanguage;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RunningInstances")
        public Integer runningInstances;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ScaleRuleEnabled")
        public String scaleRuleEnabled;

        /**
         * <strong>example:</strong>
         * <p>timing</p>
         */
        @NameInMap("ScaleRuleType")
        public String scaleRuleType;

        public static GetApplicationResponseBodyApplication build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationResponseBodyApplication self = new GetApplicationResponseBodyApplication();
            return TeaModel.build(map, self);
        }

        public GetApplicationResponseBodyApplication setAppDescription(String appDescription) {
            this.appDescription = appDescription;
            return this;
        }
        public String getAppDescription() {
            return this.appDescription;
        }

        public GetApplicationResponseBodyApplication setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetApplicationResponseBodyApplication setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public GetApplicationResponseBodyApplication setBaseAppId(String baseAppId) {
            this.baseAppId = baseAppId;
            return this;
        }
        public String getBaseAppId() {
            return this.baseAppId;
        }

        public GetApplicationResponseBodyApplication setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public GetApplicationResponseBodyApplication setInstances(Integer instances) {
            this.instances = instances;
            return this;
        }
        public Integer getInstances() {
            return this.instances;
        }

        public GetApplicationResponseBodyApplication setMem(Integer mem) {
            this.mem = mem;
            return this;
        }
        public Integer getMem() {
            return this.mem;
        }

        public GetApplicationResponseBodyApplication setMseEnabled(Boolean mseEnabled) {
            this.mseEnabled = mseEnabled;
            return this;
        }
        public Boolean getMseEnabled() {
            return this.mseEnabled;
        }

        public GetApplicationResponseBodyApplication setMseNamespaceId(String mseNamespaceId) {
            this.mseNamespaceId = mseNamespaceId;
            return this;
        }
        public String getMseNamespaceId() {
            return this.mseNamespaceId;
        }

        public GetApplicationResponseBodyApplication setNamespaceId(String namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }
        public String getNamespaceId() {
            return this.namespaceId;
        }

        public GetApplicationResponseBodyApplication setProgrammingLanguage(String programmingLanguage) {
            this.programmingLanguage = programmingLanguage;
            return this;
        }
        public String getProgrammingLanguage() {
            return this.programmingLanguage;
        }

        public GetApplicationResponseBodyApplication setRunningInstances(Integer runningInstances) {
            this.runningInstances = runningInstances;
            return this;
        }
        public Integer getRunningInstances() {
            return this.runningInstances;
        }

        public GetApplicationResponseBodyApplication setScaleRuleEnabled(String scaleRuleEnabled) {
            this.scaleRuleEnabled = scaleRuleEnabled;
            return this;
        }
        public String getScaleRuleEnabled() {
            return this.scaleRuleEnabled;
        }

        public GetApplicationResponseBodyApplication setScaleRuleType(String scaleRuleType) {
            this.scaleRuleType = scaleRuleType;
            return this;
        }
        public String getScaleRuleType() {
            return this.scaleRuleType;
        }

    }

}
