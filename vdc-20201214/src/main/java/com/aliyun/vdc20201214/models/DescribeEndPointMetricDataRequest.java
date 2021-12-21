// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeEndPointMetricDataRequest extends TeaModel {
    // APP ID。
    @NameInMap("AppId")
    public String appId;

    // 频道ID
    @NameInMap("ChannelId")
    public String channelId;

    // 创建频道时间，使用UNIX时间戳表示，单位：秒。
    @NameInMap("CreatedTs")
    public Long createdTs;

    // 释放频道时间，使用UNIX时间戳表示，单位：秒。参数为空表示获取当前时间。
    @NameInMap("DestroyedTs")
    public Long destroyedTs;

    // 指标枚举列表，以半角逗号分隔，包括以下类型APP_CPU APPCPU SYSTEM_CPU 系统CPU APP_MEMORY APP内存 SYSTEM_MEMORY 系统占用内存 SYSTEM_TOTAL_MEMORY 系统总内存 AUDIO_LOST_RATE 音频丢包率 VIDEO_LOST_RATE 视频丢包率 AUDIO_RTT 音频延时 VIDEO_RTT 视频延时 AUDIO_END_TO_END_RTT 音频端到端延时 VIDEO_END_TO_END_RTT 视频端到端延时 AUDIO_BIT_RATE 音频码率 AUDIO_STUCK 音频卡顿 AUDIO_LEVEL 音量 VIDEO_BIT_RATE_CAMERA 视频码率 VIDEO_BIT_RATE_LARGE 视频码率（大画面） VIDEO_BIT_RATE_SMALL 视频码率（小画面） VIDEO_BIT_RATE_SUPER 视频码率（超大屏幕） VIDEO_BIT_RATE_SHARE 视频码率（屏幕分享） VIDEO_STUCK_CAMERA 视频卡顿 VIDEO_STUCK_LARGE 视频卡顿（大画面） VIDEO_STUCK_SMALL 视频卡顿（小画面） VIDEO_STUCK_SUPER 视频卡顿（超大屏幕） VIDEO_STUCK_SHARE 视频卡顿（屏幕分享） VIDEO_RESOLUTION_CAMERA 视频分辨率 VIDEO_RESOLUTION_LARGE 视频分辨率（大画面） VIDEO_RESOLUTION_SMALL 视频分辨率（小画面） VIDEO_RESOLUTION_SUPER 视频分辨率（超大屏幕） VIDEO_RESOLUTION_SHARE 视频分辨率（屏幕分享） VIDEO_FPS_CAMERA 视频帧率 VIDEO_FPS_LARGE 视频帧率（大画面） VIDEO_FPS_SMALL 视频帧率（小画面） VIDEO_FPS_SUPER 视频帧率（超大屏幕） VIDEO_FPS_SHARE 视频帧率（屏幕分享）
    @NameInMap("Metrics")
    public String metrics;

    // 发布端用户通信流的Call ID，多个用英文逗号（,）分隔。
    @NameInMap("PubCallIdList")
    public String pubCallIdList;

    // 发布端用户ID。
    @NameInMap("PubUserId")
    public String pubUserId;

    // 订阅端用户ID。
    @NameInMap("SubUserId")
    public String subUserId;

    public static DescribeEndPointMetricDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEndPointMetricDataRequest self = new DescribeEndPointMetricDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEndPointMetricDataRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeEndPointMetricDataRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public DescribeEndPointMetricDataRequest setCreatedTs(Long createdTs) {
        this.createdTs = createdTs;
        return this;
    }
    public Long getCreatedTs() {
        return this.createdTs;
    }

    public DescribeEndPointMetricDataRequest setDestroyedTs(Long destroyedTs) {
        this.destroyedTs = destroyedTs;
        return this;
    }
    public Long getDestroyedTs() {
        return this.destroyedTs;
    }

    public DescribeEndPointMetricDataRequest setMetrics(String metrics) {
        this.metrics = metrics;
        return this;
    }
    public String getMetrics() {
        return this.metrics;
    }

    public DescribeEndPointMetricDataRequest setPubCallIdList(String pubCallIdList) {
        this.pubCallIdList = pubCallIdList;
        return this;
    }
    public String getPubCallIdList() {
        return this.pubCallIdList;
    }

    public DescribeEndPointMetricDataRequest setPubUserId(String pubUserId) {
        this.pubUserId = pubUserId;
        return this;
    }
    public String getPubUserId() {
        return this.pubUserId;
    }

    public DescribeEndPointMetricDataRequest setSubUserId(String subUserId) {
        this.subUserId = subUserId;
        return this;
    }
    public String getSubUserId() {
        return this.subUserId;
    }

}
