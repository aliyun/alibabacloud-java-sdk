// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class GetSpotPriceHistoryRequest extends TeaModel {
    /**
     * <p>The end time for querying the historical prices of spot instances. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC. Default value: null, which indicates the current time.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-12-30T09:36:46Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The sort order. Default value: asc. Valid values:</p>
     * <ul>
     * <li>desc: descending order.</li>
     * <li>asc: ascending order.</li>
     * </ul>
     * <p>This parameter takes effect only when you query the historical prices of Lingjun instance types.</p>
     * 
     * <strong>example:</strong>
     * <p>asc</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The page number. Default value: <em><strong>1</strong></em>. This parameter takes effect only when you query the historical prices of Lingjun instance types.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: <strong>10</strong>. This parameter takes effect only when you query the historical prices of Lingjun instance types.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The field used for sorting. Default value: GmtCreatedTime. Valid values:</p>
     * <ul>
     * <li>GmtCreatedTime</li>
     * </ul>
     * <p>This parameter takes effect only when you query the historical prices of Lingjun instance types.</p>
     * 
     * <strong>example:</strong>
     * <p>GmtCreatedTime</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The protection period of the spot instance. Unit: hours. Note that only ECS instance types support Settings for the protection period of spot instances. Default value: 0. Valid values:</p>
     * <ul>
     * <li>1: After the spot instance is created, Alibaba Cloud ensures that the instance runs for 1 hour without automatic release. After 1 hour, the system automatically compares the bid price with the marketplace price and checks resource inventory to determine whether to retain or revoke the instance.</li>
     * <li>0: After the spot instance is created, Alibaba Cloud does not guarantee that the instance runs for 1 hour. The system automatically compares the bid price with the marketplace price and checks resource inventory to determine whether to retain or revoke the instance.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SpotDuration")
    public Integer spotDuration;

    /**
     * <p>The start time for querying the historical prices of spot instances. The maximum value cannot exceed 7 days before the specified end time. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC. Default value: null, which indicates 3 days before the end time.</p>
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
