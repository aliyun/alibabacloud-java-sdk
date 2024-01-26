// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20150801.models;

import com.aliyun.tea.*;

public class ReportVuserRequest extends TeaModel {
    @NameInMap("GmtCreated")
    public Long gmtCreated;

    @NameInMap("ScenarioId")
    public Integer scenarioId;

    @NameInMap("Vuser")
    public Integer vuser;

    @NameInMap("Wskey")
    public String wskey;

    public static ReportVuserRequest build(java.util.Map<String, ?> map) throws Exception {
        ReportVuserRequest self = new ReportVuserRequest();
        return TeaModel.build(map, self);
    }

    public ReportVuserRequest setGmtCreated(Long gmtCreated) {
        this.gmtCreated = gmtCreated;
        return this;
    }
    public Long getGmtCreated() {
        return this.gmtCreated;
    }

    public ReportVuserRequest setScenarioId(Integer scenarioId) {
        this.scenarioId = scenarioId;
        return this;
    }
    public Integer getScenarioId() {
        return this.scenarioId;
    }

    public ReportVuserRequest setVuser(Integer vuser) {
        this.vuser = vuser;
        return this;
    }
    public Integer getVuser() {
        return this.vuser;
    }

    public ReportVuserRequest setWskey(String wskey) {
        this.wskey = wskey;
        return this;
    }
    public String getWskey() {
        return this.wskey;
    }

}
