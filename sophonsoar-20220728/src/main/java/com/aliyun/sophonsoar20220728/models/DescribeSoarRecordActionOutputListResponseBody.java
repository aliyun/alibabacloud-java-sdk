// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeSoarRecordActionOutputListResponseBody extends TeaModel {
    /**
     * <p>The data that is returned when the component action is performed. The value is a JSON array.</p>
     * <blockquote>
     * <p> The format of the output data is determined by the component that is configured when the playbook is written.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[
     *     {
     *         &quot;a&quot;: &quot;a&quot;,
     *         &quot;taskname&quot;: &quot;92af3c79-1754-4646-9366-9ddbd1e45536_xxxx&quot;,
     *         &quot;log_time&quot;: 1699868849000
     *     }
     * ]</p>
     */
    @NameInMap("ActionOutputs")
    public String actionOutputs;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6A2BF9CF-3E32-5E45-A79B-8F67E0A4FE90</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of pages returned.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeSoarRecordActionOutputListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSoarRecordActionOutputListResponseBody self = new DescribeSoarRecordActionOutputListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSoarRecordActionOutputListResponseBody setActionOutputs(String actionOutputs) {
        this.actionOutputs = actionOutputs;
        return this;
    }
    public String getActionOutputs() {
        return this.actionOutputs;
    }

    public DescribeSoarRecordActionOutputListResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSoarRecordActionOutputListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSoarRecordActionOutputListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSoarRecordActionOutputListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

}
