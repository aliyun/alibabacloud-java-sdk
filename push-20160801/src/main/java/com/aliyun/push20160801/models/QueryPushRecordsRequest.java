// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class QueryPushRecordsRequest extends TeaModel {
    /**
     * <p>The AppKey information.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>333526247</p>
     */
    @NameInMap("AppKey")
    public Long appKey;

    /**
     * <p>The end time of the query. The time is in UTC and follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-09-29T06:24:58Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The query keyword. The query is performed based on the MessageId, Title, and Body fields. The system performs Chinese word segmentation on the title and body of the push, and uses the segmented words for the query instead of substring matching.</p>
     * 
     * <strong>example:</strong>
     * <p>Statistics data test notification 805</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p><strong>[Deprecated]</strong> This parameter is deprecated and no longer used.</p>
     * 
     * <strong>example:</strong>
     * <p>FFPpkmhCPm*****************xjk=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The current page number of the push records. Default value: 1. Maximum value: 10000.</p>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("Page")
    public Integer page;

    /**
     * <p>The number of entries per page. Default value: 20. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The push type. Valid values:</p>
     * <ul>
     * <li><p><strong>MESSAGE</strong>: message</p>
     * </li>
     * <li><p><strong>NOTICE</strong>: notification</p>
     * </li>
     * <li><p><strong>LIVE_ACTIVITY</strong>: live activity</p>
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
     * <li><strong>API</strong>: push initiated by OpenAPI, including pushes initiated from the OpenAPI platform console</li>
     * <li><strong>CONSOLE</strong>: push initiated from the Mobile Push console</li>
     * <li><strong>OpenAPIExplorer</strong>: push initiated from the Alibaba Cloud OpenAPI Explorer platform</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>API</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The start time of the query. The time is in UTC and follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format.</p>
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
     * <li><p><strong>DEVICE</strong>: push by device</p>
     * </li>
     * <li><p><strong>ACCOUNT</strong>: push by account</p>
     * </li>
     * <li><p><strong>ALIAS</strong>: push by alias</p>
     * </li>
     * <li><p><strong>TAG</strong>: push by tag</p>
     * </li>
     * <li><p><strong>ALL</strong>: push to all devices</p>
     * </li>
     * <li><p><strong>TBD</strong>: initialize continuous push, where the push target is specified by the subsequent ContinuouslyPush operation</p>
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
