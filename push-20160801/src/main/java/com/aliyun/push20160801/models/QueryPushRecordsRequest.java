// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class QueryPushRecordsRequest extends TeaModel {
    /**
     * <p>The AppKey of the application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>333526247</p>
     */
    @NameInMap("AppKey")
    public Long appKey;

    /**
     * <p>The end time for the query. Specify the time in UTC, using the ISO-8601 format <code>YYYY-MM-DDThh:mm:ssZ</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-09-29T06:24:58Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The keyword used for the query. The search covers the <code>MessageId</code>, <code>Title</code>, and <code>Body</code> fields. For <code>Title</code> and <code>Body</code>, the system applies Chinese word segmentation and matches whole tokens instead of substrings.</p>
     * 
     * <strong>example:</strong>
     * <p>统计数据测试通知805</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>This parameter is deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>FFPpkmhCPm*****************xjk=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The page number to query. Default: 1. Maximum: 10,000.</p>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("Page")
    public Integer page;

    /**
     * <p>The number of entries to return on each page. Default: 20. Maximum: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The push type. Valid values:</p>
     * <ul>
     * <li><p><strong>MESSAGE</strong>: A message.</p>
     * </li>
     * <li><p><strong>NOTICE</strong>: A notification.</p>
     * </li>
     * <li><p><strong>LIVE_ACTIVITY</strong>: A Live Activity.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NOTICE</p>
     */
    @NameInMap("PushType")
    public String pushType;

    /**
     * <p>The push source. Valid values:</p>
     * <ul>
     * <li><p><strong>API</strong>: Pushes initiated via an OpenAPI call.</p>
     * </li>
     * <li><p><strong>CONSOLE</strong>: Pushes initiated from the Mobile Push console.</p>
     * </li>
     * <li><p><strong>OpenAPIExplorer</strong>: Pushes initiated from Alibaba Cloud OpenAPI Explorer.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>API</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The start time for the query. Specify the time in UTC, using the ISO-8601 format <code>YYYY-MM-DDThh:mm:ssZ</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-09-15T02:05:24Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The push target. Valid values:</p>
     * <ul>
     * <li><p><strong>DEVICE</strong>: Push to devices.</p>
     * </li>
     * <li><p><strong>ACCOUNT</strong>: Push to accounts.</p>
     * </li>
     * <li><p><strong>ALIAS</strong>: Push to aliases.</p>
     * </li>
     * <li><p><strong>TAG</strong>: Push to tags.</p>
     * </li>
     * <li><p><strong>ALL</strong>: Push to all devices.</p>
     * </li>
     * <li><p><strong>TBD</strong>: Initializes a continuous push. The push target is specified in a subsequent call to the <code>ContinuouslyPush</code> API operation.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DEVICE</p>
     */
    @NameInMap("Target")
    public String target;

    public static QueryPushRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryPushRecordsRequest self = new QueryPushRecordsRequest();
        return TeaModel.build(map, self);
    }

    public QueryPushRecordsRequest setAppKey(Long appKey) {
        this.appKey = appKey;
        return this;
    }
    public Long getAppKey() {
        return this.appKey;
    }

    public QueryPushRecordsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public QueryPushRecordsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public QueryPushRecordsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public QueryPushRecordsRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public QueryPushRecordsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryPushRecordsRequest setPushType(String pushType) {
        this.pushType = pushType;
        return this;
    }
    public String getPushType() {
        return this.pushType;
    }

    public QueryPushRecordsRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public QueryPushRecordsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public QueryPushRecordsRequest setTarget(String target) {
        this.target = target;
        return this;
    }
    public String getTarget() {
        return this.target;
    }

}
