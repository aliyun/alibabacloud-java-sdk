// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeVsStreamsPublishListRequest extends TeaModel {
    /**
     * <p>The application name of the live stream.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxApp</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>Your domain name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.aliyundoc.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end time.</p>
     * <blockquote>
     * <ul>
     * <li><p>Use UTC format. Example: 2016-06-30T19:00:00Z</p>
     * </li>
     * <li><p>The interval between EndTime and StartTime must not exceed 30 days.</p>
     * </li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2016-06-30T19:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The sort order. Valid values:</p>
     * <ul>
     * <li><p>stream_name_desc (sort by stream name in descending order)</p>
     * </li>
     * <li><p>stream_name_asc (sort by stream name in ascending order)</p>
     * </li>
     * <li><p>publish_time_desc (sort by publish time in descending order)</p>
     * </li>
     * <li><p>publish_time_asc (sort by publish time in ascending order) (default)</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>publish_time_asc</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 3000.<br>
     * Valid values: 1 to 3000.<br></p>
     * 
     * <strong>example:</strong>
     * <p>3000</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Specifies whether to use fuzzy matching for the stream name. Valid values:</p>
     * <ul>
     * <li><p>fuzzy (fuzzy match)</p>
     * </li>
     * <li><p>strict (exact match)</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>fuzzy</p>
     */
    @NameInMap("QueryType")
    public String queryType;

    /**
     * <p>The start time.</p>
     * <blockquote>
     * <p>Use UTC format. Example: 2016-06-29T19:00:00Z</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2016-06-29T19:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The live stream name.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxStream</p>
     */
    @NameInMap("StreamName")
    public String streamName;

    /**
     * <p>The stream type. Valid values:</p>
     * <ul>
     * <li><p>all (all streams) (default)</p>
     * </li>
     * <li><p>raw (raw stream)</p>
     * </li>
     * <li><p>trans (transcoded stream)</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>all</p>
     */
    @NameInMap("StreamType")
    public String streamType;

    public static DescribeVsStreamsPublishListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVsStreamsPublishListRequest self = new DescribeVsStreamsPublishListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVsStreamsPublishListRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public DescribeVsStreamsPublishListRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeVsStreamsPublishListRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeVsStreamsPublishListRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public DescribeVsStreamsPublishListRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeVsStreamsPublishListRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeVsStreamsPublishListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeVsStreamsPublishListRequest setQueryType(String queryType) {
        this.queryType = queryType;
        return this;
    }
    public String getQueryType() {
        return this.queryType;
    }

    public DescribeVsStreamsPublishListRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeVsStreamsPublishListRequest setStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }
    public String getStreamName() {
        return this.streamName;
    }

    public DescribeVsStreamsPublishListRequest setStreamType(String streamType) {
        this.streamType = streamType;
        return this;
    }
    public String getStreamType() {
        return this.streamType;
    }

}
