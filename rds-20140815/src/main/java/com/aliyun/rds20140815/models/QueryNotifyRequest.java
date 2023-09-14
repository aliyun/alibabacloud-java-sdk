// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class QueryNotifyRequest extends TeaModel {
    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time must be in UTC.</p>
     */
    @NameInMap("From")
    public String from;

    /**
     * <p>The number of the page to return. Valid values: any **non-zero** positive integer.</p>
     * <br>
     * <p>Default value: **1**.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Valid values:</p>
     * <br>
     * <p>*   **30**</p>
     * <p>*   **50**</p>
     * <p>*   **100**</p>
     * <br>
     * <p>Default value: **30**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The end of the time range to query. The end time must be later than the start time. Specify the time in the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time must be in UTC.</p>
     */
    @NameInMap("To")
    public String to;

    /**
     * <p>Specifies whether the query results contain confirmed notifications. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     * <br>
     * <p>> You can call the [ConfirmNotify](~~610444~~) operation to confirm notifications of an instance.</p>
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
