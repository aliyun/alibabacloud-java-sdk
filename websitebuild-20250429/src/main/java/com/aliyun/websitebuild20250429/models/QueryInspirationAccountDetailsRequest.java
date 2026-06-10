// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class QueryInspirationAccountDetailsRequest extends TeaModel {
    /**
     * <p>Query End Time</p>
     * 
     * <strong>example:</strong>
     * <p>2025-07-23T16:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>Sorting field</p>
     * 
     * <strong>example:</strong>
     * <p>gmtCreated</p>
     */
    @NameInMap("OrderColumn")
    public String orderColumn;

    /**
     * <p>Sorting type: ASC|DESC</p>
     * 
     * <strong>example:</strong>
     * <p>BUY</p>
     */
    @NameInMap("OrderType")
    public String orderType;

    /**
     * <p>Page number, default is 1</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>Page size, default is 10</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Source type filter (such as FREE_TRIAL_GIFT, INSTANCE_GIFT, UPGRADE_GRANT, PURCHASED)</p>
     * 
     * <strong>example:</strong>
     * <p>MARKET_CLOUD_DREAM</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>Query Start Time</p>
     * 
     * <strong>example:</strong>
     * <p>2025-06-21T16:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static QueryInspirationAccountDetailsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryInspirationAccountDetailsRequest self = new QueryInspirationAccountDetailsRequest();
        return TeaModel.build(map, self);
    }

    public QueryInspirationAccountDetailsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public QueryInspirationAccountDetailsRequest setOrderColumn(String orderColumn) {
        this.orderColumn = orderColumn;
        return this;
    }
    public String getOrderColumn() {
        return this.orderColumn;
    }

    public QueryInspirationAccountDetailsRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public QueryInspirationAccountDetailsRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public QueryInspirationAccountDetailsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryInspirationAccountDetailsRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public QueryInspirationAccountDetailsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
