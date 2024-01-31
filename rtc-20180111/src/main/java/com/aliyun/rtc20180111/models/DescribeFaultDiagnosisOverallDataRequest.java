// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeFaultDiagnosisOverallDataRequest extends TeaModel {
    /**
     * <p>APP ID</p>
     */
    @NameInMap("AppId")
    public String appId;

    @NameInMap("EndTs")
    public Long endTs;

    @NameInMap("StartTs")
    public Long startTs;

    @NameInMap("StatDim")
    public String statDim;

    public static DescribeFaultDiagnosisOverallDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFaultDiagnosisOverallDataRequest self = new DescribeFaultDiagnosisOverallDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFaultDiagnosisOverallDataRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeFaultDiagnosisOverallDataRequest setEndTs(Long endTs) {
        this.endTs = endTs;
        return this;
    }
    public Long getEndTs() {
        return this.endTs;
    }

    public DescribeFaultDiagnosisOverallDataRequest setStartTs(Long startTs) {
        this.startTs = startTs;
        return this;
    }
    public Long getStartTs() {
        return this.startTs;
    }

    public DescribeFaultDiagnosisOverallDataRequest setStatDim(String statDim) {
        this.statDim = statDim;
        return this;
    }
    public String getStatDim() {
        return this.statDim;
    }

}
