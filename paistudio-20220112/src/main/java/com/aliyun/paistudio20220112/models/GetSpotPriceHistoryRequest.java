// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class GetSpotPriceHistoryRequest extends TeaModel {
    /**
     * <p>The end time for querying historical spot instance prices. Specify the time in ISO 8601 format using UTC+0, as yyyy-MM-ddTHH:mm:ssZ. Default value: empty. An empty value means the current time.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-12-30T09:36:46Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The sort order. Default value: asc. Valid values:</p>
     * <ul>
     * <li><p>desc: descending order.</p>
     * </li>
     * <li><p>asc: ascending order.</p>
     * </li>
     * </ul>
     * <p>This parameter applies only when you query historical prices for Lingjun instance types.</p>
     * 
     * <strong>example:</strong>
     * <p>asc</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The page number of the current page. Default value: <em><strong>1</strong></em>. This parameter applies only when you query historical prices for Lingjun instance types.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: <strong>10</strong>. This parameter applies only when you query historical prices for Lingjun instance types.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The field to sort by. Default value: GmtCreatedTime. Valid values:</p>
     * <ul>
     * <li>GmtCreatedTime</li>
     * </ul>
     * <p>This parameter applies only when you query historical prices for Lingjun instance types.</p>
     * 
     * <strong>example:</strong>
     * <p>GmtCreatedTime</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The retention period for the spot instance, in hours. Note that only ECS instance types support this parameter. Default value: 0. Valid values:</p>
     * <ul>
     * <li><p>1: Alibaba Cloud guarantees that the instance runs for at least one hour after creation. After one hour, the system compares your bid price with the current market price and checks resource inventory to decide whether to retain or revoke the instance.</p>
     * </li>
     * <li><p>0: Alibaba Cloud does not guarantee one-hour runtime. The system compares your bid price with the current market price and checks resource inventory to decide whether to retain or revoke the instance.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SpotDuration")
    public Integer spotDuration;

    /**
     * <p>The start time for querying historical spot instance prices. This time must be no more than seven days before the end time. Specify the time in ISO 8601 format using UTC+0, as yyyy-MM-ddTHH:mm:ssZ. Default value: empty. An empty value means three days before the end time.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-12-26T09:36:46Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static GetSpotPriceHistoryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSpotPriceHistoryRequest self = new GetSpotPriceHistoryRequest();
        return TeaModel.build(map, self);
    }

    public GetSpotPriceHistoryRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetSpotPriceHistoryRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public GetSpotPriceHistoryRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public GetSpotPriceHistoryRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetSpotPriceHistoryRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public GetSpotPriceHistoryRequest setSpotDuration(Integer spotDuration) {
        this.spotDuration = spotDuration;
        return this;
    }
    public Integer getSpotDuration() {
        return this.spotDuration;
    }

    public GetSpotPriceHistoryRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
