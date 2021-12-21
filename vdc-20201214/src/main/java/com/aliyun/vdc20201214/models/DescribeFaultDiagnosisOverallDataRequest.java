// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeFaultDiagnosisOverallDataRequest extends TeaModel {
    // APP ID
    @NameInMap("AppId")
    public String appId;

    // 结束时间，秒级时间戳：1609344000
    @NameInMap("EndTs")
    public Long endTs;

    // 开始时间，秒级时间戳：1609344000
    @NameInMap("StartTs")
    public Long startTs;

    // 获取数据统计维度： JOIN_SLOW_USER：进频道慢用户数 AUDIO_STUCK_USER：音频卡顿用户数 VIDEO_STUCK_USER：视频卡顿用户数 VIDEO_VAGUE_USER：视频模糊用户数 HIGH_DELAY_USER：通话延迟高用户数 FIRST_SCREEN_SLOW_USER：接收首屏慢用户数
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
