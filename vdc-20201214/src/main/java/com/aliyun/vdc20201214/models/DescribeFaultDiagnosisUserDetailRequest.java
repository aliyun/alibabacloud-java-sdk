// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeFaultDiagnosisUserDetailRequest extends TeaModel {
    // APP ID。
    @NameInMap("AppId")
    public String appId;

    // 频道ID
    @NameInMap("ChannelId")
    public String channelId;

    // 频道创建时间，使用UNIX时间戳表示，单位：秒。
    @NameInMap("CreatedTs")
    public Long createdTs;

    // 异常类型 JOIN_SLOW：进频道慢 AUDIO_STUCK：音频卡顿 VIDEO_STUCK：视频卡顿 VIDEO_VAGUE：视频模糊 HIGH_DELAY：通话延迟高 FIRST_FRAME_SLOW：接收首屏慢
    @NameInMap("FaultType")
    public String faultType;

    // 是否查询通话用户信息，为空默认是false
    @NameInMap("QueryCallUserInfo")
    public Boolean queryCallUserInfo;

    // 用户ID
    @NameInMap("UserId")
    public String userId;

    public static DescribeFaultDiagnosisUserDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFaultDiagnosisUserDetailRequest self = new DescribeFaultDiagnosisUserDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFaultDiagnosisUserDetailRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeFaultDiagnosisUserDetailRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public DescribeFaultDiagnosisUserDetailRequest setCreatedTs(Long createdTs) {
        this.createdTs = createdTs;
        return this;
    }
    public Long getCreatedTs() {
        return this.createdTs;
    }

    public DescribeFaultDiagnosisUserDetailRequest setFaultType(String faultType) {
        this.faultType = faultType;
        return this;
    }
    public String getFaultType() {
        return this.faultType;
    }

    public DescribeFaultDiagnosisUserDetailRequest setQueryCallUserInfo(Boolean queryCallUserInfo) {
        this.queryCallUserInfo = queryCallUserInfo;
        return this;
    }
    public Boolean getQueryCallUserInfo() {
        return this.queryCallUserInfo;
    }

    public DescribeFaultDiagnosisUserDetailRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
