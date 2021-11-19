// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class GetJMeterSceneRunningDataResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("DocumentUrl")
    public String documentUrl;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    // 运行中的数据
    @NameInMap("RunningData")
    public GetJMeterSceneRunningDataResponseBodyRunningData runningData;

    @NameInMap("Success")
    public Boolean success;

    public static GetJMeterSceneRunningDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetJMeterSceneRunningDataResponseBody self = new GetJMeterSceneRunningDataResponseBody();
        return TeaModel.build(map, self);
    }

    public GetJMeterSceneRunningDataResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetJMeterSceneRunningDataResponseBody setDocumentUrl(String documentUrl) {
        this.documentUrl = documentUrl;
        return this;
    }
    public String getDocumentUrl() {
        return this.documentUrl;
    }

    public GetJMeterSceneRunningDataResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetJMeterSceneRunningDataResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetJMeterSceneRunningDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetJMeterSceneRunningDataResponseBody setRunningData(GetJMeterSceneRunningDataResponseBodyRunningData runningData) {
        this.runningData = runningData;
        return this;
    }
    public GetJMeterSceneRunningDataResponseBodyRunningData getRunningData() {
        return this.runningData;
    }

    public GetJMeterSceneRunningDataResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetJMeterSceneRunningDataResponseBodyRunningData extends TeaModel {
        // 压测引擎数量
        @NameInMap("AgentCount")
        public Integer agentCount;

        // 压测引擎列表
        @NameInMap("AgentIdList")
        public java.util.List<String> agentIdList;

        // 场景整体的采样状态
        @NameInMap("AllSampleStat")
        public java.util.Map<String, ?> allSampleStat;

        // 并发量
        @NameInMap("Concurrency")
        public Integer concurrency;

        // 是否生成了报告
        @NameInMap("HasReport")
        public Boolean hasReport;

        // 是否是调试
        @NameInMap("IsDebugging")
        public Boolean isDebugging;

        // 每一个采样器的状态
        @NameInMap("SampleStatList")
        public java.util.List<java.util.Map<String, ?>> sampleStatList;

        // 场景id
        @NameInMap("SceneId")
        public String sceneId;

        // 场景名称
        @NameInMap("SceneName")
        public String sceneName;

        // 当前所处阶段
        @NameInMap("StageName")
        public String stageName;

        // 状态
        @NameInMap("Status")
        public String status;

        // 目前消耗的vum
        @NameInMap("Vum")
        public Long vum;

        public static GetJMeterSceneRunningDataResponseBodyRunningData build(java.util.Map<String, ?> map) throws Exception {
            GetJMeterSceneRunningDataResponseBodyRunningData self = new GetJMeterSceneRunningDataResponseBodyRunningData();
            return TeaModel.build(map, self);
        }

        public GetJMeterSceneRunningDataResponseBodyRunningData setAgentCount(Integer agentCount) {
            this.agentCount = agentCount;
            return this;
        }
        public Integer getAgentCount() {
            return this.agentCount;
        }

        public GetJMeterSceneRunningDataResponseBodyRunningData setAgentIdList(java.util.List<String> agentIdList) {
            this.agentIdList = agentIdList;
            return this;
        }
        public java.util.List<String> getAgentIdList() {
            return this.agentIdList;
        }

        public GetJMeterSceneRunningDataResponseBodyRunningData setAllSampleStat(java.util.Map<String, ?> allSampleStat) {
            this.allSampleStat = allSampleStat;
            return this;
        }
        public java.util.Map<String, ?> getAllSampleStat() {
            return this.allSampleStat;
        }

        public GetJMeterSceneRunningDataResponseBodyRunningData setConcurrency(Integer concurrency) {
            this.concurrency = concurrency;
            return this;
        }
        public Integer getConcurrency() {
            return this.concurrency;
        }

        public GetJMeterSceneRunningDataResponseBodyRunningData setHasReport(Boolean hasReport) {
            this.hasReport = hasReport;
            return this;
        }
        public Boolean getHasReport() {
            return this.hasReport;
        }

        public GetJMeterSceneRunningDataResponseBodyRunningData setIsDebugging(Boolean isDebugging) {
            this.isDebugging = isDebugging;
            return this;
        }
        public Boolean getIsDebugging() {
            return this.isDebugging;
        }

        public GetJMeterSceneRunningDataResponseBodyRunningData setSampleStatList(java.util.List<java.util.Map<String, ?>> sampleStatList) {
            this.sampleStatList = sampleStatList;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getSampleStatList() {
            return this.sampleStatList;
        }

        public GetJMeterSceneRunningDataResponseBodyRunningData setSceneId(String sceneId) {
            this.sceneId = sceneId;
            return this;
        }
        public String getSceneId() {
            return this.sceneId;
        }

        public GetJMeterSceneRunningDataResponseBodyRunningData setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public GetJMeterSceneRunningDataResponseBodyRunningData setStageName(String stageName) {
            this.stageName = stageName;
            return this;
        }
        public String getStageName() {
            return this.stageName;
        }

        public GetJMeterSceneRunningDataResponseBodyRunningData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetJMeterSceneRunningDataResponseBodyRunningData setVum(Long vum) {
            this.vum = vum;
            return this;
        }
        public Long getVum() {
            return this.vum;
        }

    }

}
