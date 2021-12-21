// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeRtcChannelDetailsRequest extends TeaModel {
    // 应用 ID
    @NameInMap("AppId")
    public String appId;

    // 频道ID
    @NameInMap("ChannelId")
    public String channelId;

    // 结束时间，UTC时间
    @NameInMap("EndTime")
    public String endTime;

    // 页号
    @NameInMap("PageNo")
    public Integer pageNo;

    // 显示数量
    @NameInMap("PageSize")
    public Integer pageSize;

    // 起始时间，UTC格式
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeRtcChannelDetailsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRtcChannelDetailsRequest self = new DescribeRtcChannelDetailsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRtcChannelDetailsRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeRtcChannelDetailsRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public DescribeRtcChannelDetailsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeRtcChannelDetailsRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public DescribeRtcChannelDetailsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeRtcChannelDetailsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
