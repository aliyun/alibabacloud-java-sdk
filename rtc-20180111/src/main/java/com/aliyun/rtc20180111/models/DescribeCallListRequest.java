// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeCallListRequest extends TeaModel {
    /**
     * <p>APP ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testappid</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <strong>example:</strong>
     * <p>OUT</p>
     */
    @NameInMap("CallStatus")
    public String callStatus;

    /**
     * <strong>example:</strong>
     * <p>311</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1615892596</p>
     */
    @NameInMap("EndTs")
    public Long endTs;

    /**
     * <strong>example:</strong>
     * <p>BAD_EXP_USER_COUNT_DESC</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>ALL</p>
     */
    @NameInMap("QueryMode")
    public String queryMode;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1615806196</p>
     */
    @NameInMap("StartTs")
    public Long startTs;

    /**
     * <strong>example:</strong>
     * <p>c906531af5f9****</p>
     */
    @NameInMap("UserId")
    public String userId;

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

    public DescribeCallListRequest setCallStatus(String callStatus) {
        this.callStatus = callStatus;
        return this;
    }
    public String getCallStatus() {
        return this.callStatus;
    }

    public DescribeCallListRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public DescribeCallListRequest setEndTs(Long endTs) {
        this.endTs = endTs;
        return this;
    }
    public Long getEndTs() {
        return this.endTs;
    }

    public DescribeCallListRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
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

    public DescribeCallListRequest setQueryMode(String queryMode) {
        this.queryMode = queryMode;
        return this;
    }
    public String getQueryMode() {
        return this.queryMode;
    }

    public DescribeCallListRequest setStartTs(Long startTs) {
        this.startTs = startTs;
        return this;
    }
    public Long getStartTs() {
        return this.startTs;
    }

    public DescribeCallListRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
