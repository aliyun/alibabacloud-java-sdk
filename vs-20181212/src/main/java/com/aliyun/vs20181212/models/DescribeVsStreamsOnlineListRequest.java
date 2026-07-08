// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeVsStreamsOnlineListRequest extends TeaModel {
    /**
     * <p>The application name.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxApp</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The accelerated domain name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end of the time range to query.</p>
     * <blockquote>
     * <ul>
     * <li><p>Specify the time in the UTC format. Example: 2016-06-30T19:00:00Z.</p>
     * </li>
     * <li><p>The time range between EndTime and StartTime cannot exceed 30 days.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2016-06-30T19:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The sorting method. Valid values:</p>
     * <ul>
     * <li><p>stream_name_desc: sorts by stream name in descending order.</p>
     * </li>
     * <li><p>stream_name_asc: sorts by stream name in ascending order.</p>
     * </li>
     * <li><p>publish_time_desc: sorts by ingest time in descending order.</p>
     * </li>
     * <li><p>publish_time_asc (default): sorts by ingest time in ascending order.</p>
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
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of entries per page. Default value: 3000.</p>
     * <p>Valid values: 1 to 3000.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Specifies whether to perform a fuzzy match for the stream name. Valid values:</p>
     * <ul>
     * <li><p>fuzzy: fuzzy match</p>
     * </li>
     * <li><p>strict: exact match</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>fuzzy</p>
     */
    @NameInMap("QueryType")
    public String queryType;

    /**
     * <p>The start of the time range to query.</p>
     * <blockquote>
     * <p>Specify the time in the UTC format. Example: 2016-06-29T19:00:00Z.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2016-06-29T19:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The stream name.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxStream</p>
     */
    @NameInMap("StreamName")
    public String streamName;

    /**
     * <p>The stream type. Valid values:</p>
     * <ul>
     * <li><p>all (default): all streams</p>
     * </li>
     * <li><p>raw: raw streams</p>
     * </li>
     * <li><p>trans: transcoded streams</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>all</p>
     */
    @NameInMap("StreamType")
    public String streamType;

    public static DescribeVsStreamsOnlineListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVsStreamsOnlineListRequest self = new DescribeVsStreamsOnlineListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVsStreamsOnlineListRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public DescribeVsStreamsOnlineListRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeVsStreamsOnlineListRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeVsStreamsOnlineListRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public DescribeVsStreamsOnlineListRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeVsStreamsOnlineListRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public DescribeVsStreamsOnlineListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeVsStreamsOnlineListRequest setQueryType(String queryType) {
        this.queryType = queryType;
        return this;
    }
    public String getQueryType() {
        return this.queryType;
    }

    public DescribeVsStreamsOnlineListRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeVsStreamsOnlineListRequest setStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }
    public String getStreamName() {
        return this.streamName;
    }

    public DescribeVsStreamsOnlineListRequest setStreamType(String streamType) {
        this.streamType = streamType;
        return this;
    }
    public String getStreamType() {
        return this.streamType;
    }

}
