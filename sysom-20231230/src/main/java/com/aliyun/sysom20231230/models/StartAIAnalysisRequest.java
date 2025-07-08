// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class StartAIAnalysisRequest extends TeaModel {
    @NameInMap("analysisTool")
    public String analysisTool;

    @NameInMap("analysis_params")
    public java.util.List<String> analysisParams;

    /**
     * <strong>example:</strong>
     * <p>ecs_sysom</p>
     */
    @NameInMap("channel")
    public String channel;

    /**
     * <strong>example:</strong>
     * <p>python_test</p>
     */
    @NameInMap("comms")
    public String comms;

    @NameInMap("created_by")
    public String createdBy;

    /**
     * <strong>example:</strong>
     * <p>i-wz9dej066kii4goqxxxx</p>
     */
    @NameInMap("instance")
    public String instance;

    @NameInMap("instance_type")
    public String instanceType;

    @NameInMap("iteration_func")
    public String iterationFunc;

    @NameInMap("iteration_mod")
    public String iterationMod;

    @NameInMap("iteration_range")
    public java.util.List<Integer> iterationRange;

    /**
     * <strong>example:</strong>
     * <p>2421,36547,10043</p>
     */
    @NameInMap("pids")
    public String pids;

    /**
     * <strong>example:</strong>
     * <p>cn-shenzhen</p>
     */
    @NameInMap("region")
    public String region;

    /**
     * <strong>example:</strong>
     * <p>2000</p>
     */
    @NameInMap("timeout")
    public Integer timeout;

    @NameInMap("uid")
    public String uid;

    public static StartAIAnalysisRequest build(java.util.Map<String, ?> map) throws Exception {
        StartAIAnalysisRequest self = new StartAIAnalysisRequest();
        return TeaModel.build(map, self);
    }

    public StartAIAnalysisRequest setAnalysisTool(String analysisTool) {
        this.analysisTool = analysisTool;
        return this;
    }
    public String getAnalysisTool() {
        return this.analysisTool;
    }

    public StartAIAnalysisRequest setAnalysisParams(java.util.List<String> analysisParams) {
        this.analysisParams = analysisParams;
        return this;
    }
    public java.util.List<String> getAnalysisParams() {
        return this.analysisParams;
    }

    public StartAIAnalysisRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public StartAIAnalysisRequest setComms(String comms) {
        this.comms = comms;
        return this;
    }
    public String getComms() {
        return this.comms;
    }

    public StartAIAnalysisRequest setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }
    public String getCreatedBy() {
        return this.createdBy;
    }

    public StartAIAnalysisRequest setInstance(String instance) {
        this.instance = instance;
        return this;
    }
    public String getInstance() {
        return this.instance;
    }

    public StartAIAnalysisRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public StartAIAnalysisRequest setIterationFunc(String iterationFunc) {
        this.iterationFunc = iterationFunc;
        return this;
    }
    public String getIterationFunc() {
        return this.iterationFunc;
    }

    public StartAIAnalysisRequest setIterationMod(String iterationMod) {
        this.iterationMod = iterationMod;
        return this;
    }
    public String getIterationMod() {
        return this.iterationMod;
    }

    public StartAIAnalysisRequest setIterationRange(java.util.List<Integer> iterationRange) {
        this.iterationRange = iterationRange;
        return this;
    }
    public java.util.List<Integer> getIterationRange() {
        return this.iterationRange;
    }

    public StartAIAnalysisRequest setPids(String pids) {
        this.pids = pids;
        return this;
    }
    public String getPids() {
        return this.pids;
    }

    public StartAIAnalysisRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public StartAIAnalysisRequest setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

    public StartAIAnalysisRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

}
