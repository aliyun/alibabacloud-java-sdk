// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class GetApplicationResponseBody extends TeaModel {
    /**
     * <p>The details of the application.</p>
     */
    @NameInMap("Application")
    public GetApplicationResponseBodyApplication application;

    /**
     * <p>The response message.</p>
     * <ul>
     * <li><p>If the request is successful, the value is <strong>success</strong>.</p>
     * </li>
     * <li><p>If the request fails, the value is a specific error code.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>01CF26C7-00A3-4AA6-BA76-7E95F2A3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The trace ID used to query the details of the request.</p>
     * 
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
        /**
         * <p>The application description.</p>
         * 
         * <strong>example:</strong>
         * <p>Test</p>
         */
        @NameInMap("AppDescription")
        public String appDescription;

        /**
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>443d638a-ef76-47c4-b707-61197d******</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The application name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The base application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ee99cce6-1c8e-4bfa-96c3-3e2fa9******</p>
         */
        @NameInMap("BaseAppId")
        public String baseAppId;

        /**
         * <p>The CPU required for each instance, in millicores. This value cannot be 0. Valid values:</p>
         * <ul>
         * <li><p><strong>500</strong></p>
         * </li>
         * <li><p><strong>1000</strong></p>
         * </li>
         * <li><p><strong>2000</strong></p>
         * </li>
         * <li><p><strong>4000</strong></p>
         * </li>
         * <li><p><strong>8000</strong></p>
         * </li>
         * <li><p><strong>12000</strong></p>
         * </li>
         * <li><p><strong>16000</strong></p>
         * </li>
         * <li><p><strong>32000</strong></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("Cpu")
        public Integer cpu;

        /**
         * <p>The total number of application instances.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("Instances")
        public Integer instances;

        /**
         * <p>Indicates whether the application is stateful.</p>
         */
        @NameInMap("IsStateful")
        public Boolean isStateful;

        /**
         * <p>The memory required for each instance, in MB. This value cannot be 0. The memory specification is coupled with the CPU specification. The following configurations are supported:</p>
         * <ul>
         * <li><p><strong>1024</strong>: corresponds to 500 or 1,000 millicores of CPU.</p>
         * </li>
         * <li><p><strong>2048</strong>: corresponds to 500, 1,000, or 2,000 millicores of CPU.</p>
         * </li>
         * <li><p><strong>4096</strong>: corresponds to 1,000, 2,000, or 4,000 millicores of CPU.</p>
         * </li>
         * <li><p><strong>8192</strong>: corresponds to 2,000, 4,000, or 8,000 millicores of CPU.</p>
         * </li>
         * <li><p><strong>12288</strong>: corresponds to 12,000 millicores of CPU.</p>
         * </li>
         * <li><p><strong>16384</strong>: corresponds to 4,000, 8,000, or 16,000 millicores of CPU.</p>
         * </li>
         * <li><p><strong>24576</strong>: corresponds to 12,000 millicores of CPU.</p>
         * </li>
         * <li><p><strong>32768</strong>: corresponds to 16,000 millicores of CPU.</p>
         * </li>
         * <li><p><strong>65536</strong>: corresponds to 8,000, 16,000, or 32,000 millicores of CPU.</p>
         * </li>
         * <li><p><strong>131072</strong>: corresponds to 32,000 millicores of CPU.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>4096</p>
         */
        @NameInMap("Mem")
        public Integer mem;

        /**
         * <p>Indicates whether WebAssemblyFilter is enabled. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: enabled.</p>
         * </li>
         * <li><p><strong>false</strong>: disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("MseEnabled")
        public Boolean mseEnabled;

        /**
         * <p>The namespace ID of the MSE instance.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("MseNamespaceId")
        public String mseNamespaceId;

        /**
         * <p>The namespace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shenzhen</p>
         */
        @NameInMap("NamespaceId")
        public String namespaceId;

        /**
         * <p>The programming language of the application. Valid values:</p>
         * <ul>
         * <li><p><strong>java</strong>: Java.</p>
         * </li>
         * <li><p><strong>php</strong>: PHP.</p>
         * </li>
         * <li><p><strong>other</strong>: other languages, such as Python, C++, Go, .NET, and Node.js.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>java</p>
         */
        @NameInMap("ProgrammingLanguage")
        public String programmingLanguage;

        /**
         * <p>The number of running instances.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("RunningInstances")
        public Integer runningInstances;

        /**
         * <p>Indicates whether the auto scaling policy is enabled. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: The policy is enabled.</p>
         * </li>
         * <li><p><strong>false</strong>: The policy is disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ScaleRuleEnabled")
        public String scaleRuleEnabled;

        /**
         * <p>The type of the auto scaling policy. Valid values:</p>
         * <ul>
         * <li><p><strong>timing</strong>: scheduled auto scaling.</p>
         * </li>
         * <li><p><strong>metric</strong>: metric-based auto scaling.</p>
         * </li>
         * <li><p><strong>mix</strong>: hybrid auto scaling.</p>
         * </li>
         * </ul>
         * 
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

        public GetApplicationResponseBodyApplication setIsStateful(Boolean isStateful) {
            this.isStateful = isStateful;
            return this;
        }
        public Boolean getIsStateful() {
            return this.isStateful;
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
