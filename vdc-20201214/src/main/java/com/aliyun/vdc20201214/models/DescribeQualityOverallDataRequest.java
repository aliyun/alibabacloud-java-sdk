// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeQualityOverallDataRequest extends TeaModel {
    // 开始时间，秒级时间戳，如1609344000
    @NameInMap("StartDate")
    public Long startDate;

    // 结束时间，秒级时间戳，如1609344000
    @NameInMap("EndDate")
    public Long endDate;

    // 类型，以半角逗号分隔 加入频道成功率： JOIN_CHANNEL_SUC_RATE 五秒加入频道成功率： JOIN_CHANNEL_SUC_FIVE_SEC_RATE  首次出声时间： AUDIO_SPEAK_OUT_DUR 首次出图时间： VIDEO_FIRST_PIC_DUR 音频卡顿率： AUDIO_STUCK_RATE 视频卡顿率： VIDEO_STUCK_RATE 音频延时： AUDIO_DELAY 视频延时： AUDIO_DELAY 音频优质传输率： AUDIO_HIGH_QUALITY_TRANSMISSION_RATE 视频优质传输率： VIDEO_HIGH_QUALITY_TRANSMISSION_RATE
    @NameInMap("Types")
    public String types;

    // APP ID
    @NameInMap("AppId")
    public String appId;

    public static DescribeQualityOverallDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeQualityOverallDataRequest self = new DescribeQualityOverallDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeQualityOverallDataRequest setStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }
    public Long getStartDate() {
        return this.startDate;
    }

    public DescribeQualityOverallDataRequest setEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }
    public Long getEndDate() {
        return this.endDate;
    }

    public DescribeQualityOverallDataRequest setTypes(String types) {
        this.types = types;
        return this;
    }
    public String getTypes() {
        return this.types;
    }

    public DescribeQualityOverallDataRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
