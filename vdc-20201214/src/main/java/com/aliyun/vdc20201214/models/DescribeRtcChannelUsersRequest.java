// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeRtcChannelUsersRequest extends TeaModel {
    // 应用ID
    @NameInMap("AppId")
    public String appId;

    // ChannelId
    @NameInMap("ChannelId")
    public String channelId;

    // 查询时间点日期，天粒度，UTC格式
    @NameInMap("TimePoint")
    public String timePoint;

    // 页号
    @NameInMap("PageNo")
    public Integer pageNo;

    // 显示数量
    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeRtcChannelUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRtcChannelUsersRequest self = new DescribeRtcChannelUsersRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRtcChannelUsersRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeRtcChannelUsersRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public DescribeRtcChannelUsersRequest setTimePoint(String timePoint) {
        this.timePoint = timePoint;
        return this;
    }
    public String getTimePoint() {
        return this.timePoint;
    }

    public DescribeRtcChannelUsersRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public DescribeRtcChannelUsersRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
