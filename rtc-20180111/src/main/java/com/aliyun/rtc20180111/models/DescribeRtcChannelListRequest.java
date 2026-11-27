// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeRtcChannelListRequest extends TeaModel {
    /**
     * <p>The application ID. You can create and query the ID in the console. Only a single ID is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>aoe****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The channel ID. Only a single ID is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>testChannel</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number. Valid values: greater than <strong>0</strong>. Default value: 1.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Long pageNo;

    /**
     * <p>The number of entries per page. Valid values: greater than <strong>0</strong>. Default value: 10.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The service area. By default, all areas are queried. Valid values:</p>
     * <ul>
     * <li><p><strong>cn</strong>: China.</p>
     * </li>
     * <li><p><strong>us</strong>: United States.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn</p>
     */
    @NameInMap("ServiceArea")
    public String serviceArea;

    /**
     * <p>The sort order. By default, the records are sorted in descending order of StartTime.</p>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("SortType")
    public String sortType;

    /**
     * <p>The query time in UTC. The format is yyyy-MM-ddTHH:mm:ssZ. The time granularity is one day.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2018-01-29T00:00:00Z</p>
     */
    @NameInMap("TimePoint")
    public String timePoint;

    /**
     * <p>The user ID. Only a single ID is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>testUser</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static DescribeRtcChannelListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRtcChannelListRequest self = new DescribeRtcChannelListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRtcChannelListRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeRtcChannelListRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public DescribeRtcChannelListRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeRtcChannelListRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public DescribeRtcChannelListRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeRtcChannelListRequest setServiceArea(String serviceArea) {
        this.serviceArea = serviceArea;
        return this;
    }
    public String getServiceArea() {
        return this.serviceArea;
    }

    public DescribeRtcChannelListRequest setSortType(String sortType) {
        this.sortType = sortType;
        return this;
    }
    public String getSortType() {
        return this.sortType;
    }

    public DescribeRtcChannelListRequest setTimePoint(String timePoint) {
        this.timePoint = timePoint;
        return this;
    }
    public String getTimePoint() {
        return this.timePoint;
    }

    public DescribeRtcChannelListRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
