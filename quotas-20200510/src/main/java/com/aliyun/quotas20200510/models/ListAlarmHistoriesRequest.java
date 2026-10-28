// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class ListAlarmHistoriesRequest extends TeaModel {
    /**
     * <p>The alert ID.</p>
     * 
     * <strong>example:</strong>
     * <p>18b3be23-b7b0-4d45-91bc-d0c331aa****</p>
     */
    @NameInMap("AlarmId")
    public String alarmId;

    /**
     * <p>The end time of the query.</p>
     * 
     * <strong>example:</strong>
     * <p>20201024</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The search keyword.</p>
     * 
     * <strong>example:</strong>
     * <p>Quantity</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The maximum number of entries to return for the current query.</p>
     * <p>Valid values: 1 to 200. Default value: 30.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that specifies the starting position of the query. An empty value indicates that the query starts from the beginning.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The abbreviation of the cloud service name.</p>
     * <blockquote>
     * <p>For more information about the cloud services that support Quota Center, see <a href="https://help.aliyun.com/document_detail/182368.html">Cloud services that support Quota Center</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The start time of the query.</p>
     * 
     * <strong>example:</strong>
     * <p>20201020</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static ListAlarmHistoriesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAlarmHistoriesRequest self = new ListAlarmHistoriesRequest();
        return TeaModel.build(map, self);
    }

    public ListAlarmHistoriesRequest setAlarmId(String alarmId) {
        this.alarmId = alarmId;
        return this;
    }
    public String getAlarmId() {
        return this.alarmId;
    }

    public ListAlarmHistoriesRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListAlarmHistoriesRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListAlarmHistoriesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAlarmHistoriesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAlarmHistoriesRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public ListAlarmHistoriesRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
