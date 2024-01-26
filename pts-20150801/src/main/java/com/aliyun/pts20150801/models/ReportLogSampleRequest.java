// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20150801.models;

import com.aliyun.tea.*;

public class ReportLogSampleRequest extends TeaModel {
    @NameInMap("LogSample")
    public String logSample;

    @NameInMap("ScenarioId")
    public Integer scenarioId;

    @NameInMap("Wskey")
    public String wskey;

    public static ReportLogSampleRequest build(java.util.Map<String, ?> map) throws Exception {
        ReportLogSampleRequest self = new ReportLogSampleRequest();
        return TeaModel.build(map, self);
    }

    public ReportLogSampleRequest setLogSample(String logSample) {
        this.logSample = logSample;
        return this;
    }
    public String getLogSample() {
        return this.logSample;
    }

    public ReportLogSampleRequest setScenarioId(Integer scenarioId) {
        this.scenarioId = scenarioId;
        return this;
    }
    public Integer getScenarioId() {
        return this.scenarioId;
    }

    public ReportLogSampleRequest setWskey(String wskey) {
        this.wskey = wskey;
        return this;
    }
    public String getWskey() {
        return this.wskey;
    }

}
