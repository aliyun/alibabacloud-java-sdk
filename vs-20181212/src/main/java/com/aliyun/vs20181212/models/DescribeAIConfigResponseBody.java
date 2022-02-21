// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeAIConfigResponseBody extends TeaModel {
    @NameInMap("AIConfig")
    public DescribeAIConfigResponseBodyAIConfig AIConfig;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAIConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAIConfigResponseBody self = new DescribeAIConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAIConfigResponseBody setAIConfig(DescribeAIConfigResponseBodyAIConfig AIConfig) {
        this.AIConfig = AIConfig;
        return this;
    }
    public DescribeAIConfigResponseBodyAIConfig getAIConfig() {
        return this.AIConfig;
    }

    public DescribeAIConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAIConfigResponseBodyAIConfig extends TeaModel {
        @NameInMap("CaptureInterval")
        public Integer captureInterval;

        @NameInMap("Configs")
        public String configs;

        @NameInMap("Description")
        public String description;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("Features")
        public String features;

        @NameInMap("InstanceId")
        public Long instanceId;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("Status")
        public String status;

        public static DescribeAIConfigResponseBodyAIConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeAIConfigResponseBodyAIConfig self = new DescribeAIConfigResponseBodyAIConfig();
            return TeaModel.build(map, self);
        }

        public DescribeAIConfigResponseBodyAIConfig setCaptureInterval(Integer captureInterval) {
            this.captureInterval = captureInterval;
            return this;
        }
        public Integer getCaptureInterval() {
            return this.captureInterval;
        }

        public DescribeAIConfigResponseBodyAIConfig setConfigs(String configs) {
            this.configs = configs;
            return this;
        }
        public String getConfigs() {
            return this.configs;
        }

        public DescribeAIConfigResponseBodyAIConfig setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeAIConfigResponseBodyAIConfig setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeAIConfigResponseBodyAIConfig setFeatures(String features) {
            this.features = features;
            return this;
        }
        public String getFeatures() {
            return this.features;
        }

        public DescribeAIConfigResponseBodyAIConfig setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public DescribeAIConfigResponseBodyAIConfig setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeAIConfigResponseBodyAIConfig setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeAIConfigResponseBodyAIConfig setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
