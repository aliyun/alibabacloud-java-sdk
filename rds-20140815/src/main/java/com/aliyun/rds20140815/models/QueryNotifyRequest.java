// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class QueryNotifyRequest extends TeaModel {
    /**
     * <p>The start time of the query. Specify the time in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format. The time must be in UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-05-02T08:38:37Z</p>
     */
    @NameInMap("From")
    public String from;

    /**
     * <p>The page number. Valid values: integers greater than <strong>0</strong> and less than or equal to the maximum value of the Integer type.</p>
     * <p>Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values:</p>
     * <ul>
     * <li><strong>30</strong></li>
     * <li><strong>50</strong></li>
     * <li><strong>100</strong></li>
     * </ul>
     * <p>Default value: <strong>30</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The end time of the query. The end time must be later than the start time. Specify the time in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format. The time must be in UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-05-09T08:38:37Z</p>
     */
    @NameInMap("To")
    public String to;

    /**
     * <p>Specifies whether the query results include confirmed notifications. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Includes confirmed notifications.</li>
     * <li><strong>false</strong>: Does not include confirmed notifications.<blockquote>
     * <p>Confirmed notifications are those that have been marked as confirmed by calling the ConfirmNotify operation.</p>
     * </blockquote>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("WithConfirmed")
    public Boolean withConfirmed;

    public static QueryNotifyRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryNotifyRequest self = new QueryNotifyRequest();
        return TeaModel.build(map, self);
    }

    public QueryNotifyRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public QueryNotifyRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryNotifyRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryNotifyRequest setTo(String to) {
        this.to = to;
        return this;
    }
    public String getTo() {
        return this.to;
    }

    public QueryNotifyRequest setWithConfirmed(Boolean withConfirmed) {
        this.withConfirmed = withConfirmed;
        return this;
    }
    public Boolean getWithConfirmed() {
        return this.withConfirmed;
    }

}
