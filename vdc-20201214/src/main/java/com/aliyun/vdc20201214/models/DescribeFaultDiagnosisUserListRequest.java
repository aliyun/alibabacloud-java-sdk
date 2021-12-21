// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeFaultDiagnosisUserListRequest extends TeaModel {
    // APP ID。
    @NameInMap("AppId")
    public String appId;

    // 搜索的频道ID
    @NameInMap("ChannelId")
    public String channelId;

    // 查询的结束时间，使用UNIX时间戳表示，单位：秒。
    @NameInMap("EndTs")
    public Long endTs;

    // 过滤的异常类型，多个使用半角逗号分隔 JOIN_SLOW：进频道慢 AUDIO_STUCK：音频卡顿 VIDEO_STUCK：视频卡顿 VIDEO_VAGUE：视频模糊 HIGH_DELAY：通话延迟高 FIRST_FRAME_SLOW：接收首屏慢
    @NameInMap("FaultTypes")
    public String faultTypes;

    // 页码
    @NameInMap("PageNo")
    public Integer pageNo;

    // 每页数量
    @NameInMap("PageSize")
    public Integer pageSize;

    // 查询的开始时间，使用UNIX时间戳表示，单位：秒。
    @NameInMap("StartTs")
    public Long startTs;

    // 搜索的用户ID
    @NameInMap("UserId")
    public String userId;

    public static DescribeFaultDiagnosisUserListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFaultDiagnosisUserListRequest self = new DescribeFaultDiagnosisUserListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFaultDiagnosisUserListRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeFaultDiagnosisUserListRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public DescribeFaultDiagnosisUserListRequest setEndTs(Long endTs) {
        this.endTs = endTs;
        return this;
    }
    public Long getEndTs() {
        return this.endTs;
    }

    public DescribeFaultDiagnosisUserListRequest setFaultTypes(String faultTypes) {
        this.faultTypes = faultTypes;
        return this;
    }
    public String getFaultTypes() {
        return this.faultTypes;
    }

    public DescribeFaultDiagnosisUserListRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public DescribeFaultDiagnosisUserListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeFaultDiagnosisUserListRequest setStartTs(Long startTs) {
        this.startTs = startTs;
        return this;
    }
    public Long getStartTs() {
        return this.startTs;
    }

    public DescribeFaultDiagnosisUserListRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
