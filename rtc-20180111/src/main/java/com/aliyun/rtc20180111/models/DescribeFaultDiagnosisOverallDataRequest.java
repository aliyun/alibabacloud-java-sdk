// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeFaultDiagnosisOverallDataRequest extends TeaModel {
    /**
     * <p>The app ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4eah****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The end time of the query. The value is a UNIX timestamp in seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1615910399</p>
     */
    @NameInMap("EndTs")
    public Long endTs;

    /**
     * <p>The start time of the query. The value is a UNIX timestamp in seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1615824000</p>
     */
    @NameInMap("StartTs")
    public Long startTs;

    /**
     * <p>The statistical dimension. Valid values:</p>
     * <ul>
     * <li><strong>JOIN_SLOW_USER</strong>: the number of users who joined the channel slowly</li>
     * <li><strong>AUDIO_STUCK_USER</strong>: the number of users who experienced audio stuttering</li>
     * <li><strong>VIDEO_STUCK_USER</strong>: the number of users who experienced video stuttering</li>
     * <li><strong>VIDEO_VAGUE_USER</strong>: the number of users who experienced blurry video</li>
     * <li><strong>HIGH_DELAY_USER</strong>: the number of users who experienced high call latency</li>
     * <li><strong>FIRST_FRAME_SLOW_USER</strong>: the number of users who experienced slow first screen rendering</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>JOIN_SLOW_USER</p>
     */
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
