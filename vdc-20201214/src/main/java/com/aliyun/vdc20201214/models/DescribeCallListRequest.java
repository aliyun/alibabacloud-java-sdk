// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeCallListRequest extends TeaModel {
    // APP ID。
    @NameInMap("AppId")
    public String appId;

    // 查询的开始时间，使用UNIX时间戳表示，单位：秒。
    @NameInMap("StartTs")
    public Long startTs;

    // 查询的结束时间，使用UNIX时间戳表示，单位：秒。
    @NameInMap("EndTs")
    public Long endTs;

    // 频道ID
    @NameInMap("ChannelId")
    public String channelId;

    // 用户ID
    @NameInMap("UserId")
    public String userId;

    // 通信状态。取值：IN：进行中。OUT：已结束。
    @NameInMap("CallStatus")
    public String callStatus;

    // 排序字段。取值：BAD_EXP_USER_COUNT_DESC：按体验欠佳人数降序。BAD_EXP_USER_COUNT_ASC：按体验欠佳人数升序
    @NameInMap("OrderBy")
    public String orderBy;

    // 查询模式。取值：ALL：全部通话。FOLLOW：关注通话。
    @NameInMap("QueryMode")
    public String queryMode;

    // 页码
    @NameInMap("PageNo")
    public Integer pageNo;

    // 每页数量
    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeCallListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCallListRequest self = new DescribeCallListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCallListRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeCallListRequest setStartTs(Long startTs) {
        this.startTs = startTs;
        return this;
    }
    public Long getStartTs() {
        return this.startTs;
    }

    public DescribeCallListRequest setEndTs(Long endTs) {
        this.endTs = endTs;
        return this;
    }
    public Long getEndTs() {
        return this.endTs;
    }

    public DescribeCallListRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public DescribeCallListRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public DescribeCallListRequest setCallStatus(String callStatus) {
        this.callStatus = callStatus;
        return this;
    }
    public String getCallStatus() {
        return this.callStatus;
    }

    public DescribeCallListRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public DescribeCallListRequest setQueryMode(String queryMode) {
        this.queryMode = queryMode;
        return this;
    }
    public String getQueryMode() {
        return this.queryMode;
    }

    public DescribeCallListRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public DescribeCallListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
