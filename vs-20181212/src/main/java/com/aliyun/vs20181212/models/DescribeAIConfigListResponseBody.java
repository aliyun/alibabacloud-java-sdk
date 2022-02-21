// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeAIConfigListResponseBody extends TeaModel {
    @NameInMap("AIConfigList")
    public DescribeAIConfigListResponseBodyAIConfigList AIConfigList;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAIConfigListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAIConfigListResponseBody self = new DescribeAIConfigListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAIConfigListResponseBody setAIConfigList(DescribeAIConfigListResponseBodyAIConfigList AIConfigList) {
        this.AIConfigList = AIConfigList;
        return this;
    }
    public DescribeAIConfigListResponseBodyAIConfigList getAIConfigList() {
        return this.AIConfigList;
    }

    public DescribeAIConfigListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAIConfigListResponseBodyAIConfigListAIConfigList extends TeaModel {
        @NameInMap("CaptureInterval")
        public Integer captureInterval;

        @NameInMap("ConfigId")
        public String configId;

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

        public static DescribeAIConfigListResponseBodyAIConfigListAIConfigList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAIConfigListResponseBodyAIConfigListAIConfigList self = new DescribeAIConfigListResponseBodyAIConfigListAIConfigList();
            return TeaModel.build(map, self);
        }

        public DescribeAIConfigListResponseBodyAIConfigListAIConfigList setCaptureInterval(Integer captureInterval) {
            this.captureInterval = captureInterval;
            return this;
        }
        public Integer getCaptureInterval() {
            return this.captureInterval;
        }

        public DescribeAIConfigListResponseBodyAIConfigListAIConfigList setConfigId(String configId) {
            this.configId = configId;
            return this;
        }
        public String getConfigId() {
            return this.configId;
        }

        public DescribeAIConfigListResponseBodyAIConfigListAIConfigList setConfigs(String configs) {
            this.configs = configs;
            return this;
        }
        public String getConfigs() {
            return this.configs;
        }

        public DescribeAIConfigListResponseBodyAIConfigListAIConfigList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeAIConfigListResponseBodyAIConfigListAIConfigList setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeAIConfigListResponseBodyAIConfigListAIConfigList setFeatures(String features) {
            this.features = features;
            return this;
        }
        public String getFeatures() {
            return this.features;
        }

        public DescribeAIConfigListResponseBodyAIConfigListAIConfigList setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public DescribeAIConfigListResponseBodyAIConfigListAIConfigList setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeAIConfigListResponseBodyAIConfigListAIConfigList setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeAIConfigListResponseBodyAIConfigListAIConfigList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeAIConfigListResponseBodyAIConfigList extends TeaModel {
        @NameInMap("AIConfigList")
        public java.util.List<DescribeAIConfigListResponseBodyAIConfigListAIConfigList> AIConfigList;

        public static DescribeAIConfigListResponseBodyAIConfigList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAIConfigListResponseBodyAIConfigList self = new DescribeAIConfigListResponseBodyAIConfigList();
            return TeaModel.build(map, self);
        }

        public DescribeAIConfigListResponseBodyAIConfigList setAIConfigList(java.util.List<DescribeAIConfigListResponseBodyAIConfigListAIConfigList> AIConfigList) {
            this.AIConfigList = AIConfigList;
            return this;
        }
        public java.util.List<DescribeAIConfigListResponseBodyAIConfigListAIConfigList> getAIConfigList() {
            return this.AIConfigList;
        }

    }

}
