// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeSoarRecordActionOutputListResponseBody extends TeaModel {
    /**
     * <p>The data that is returned when the component action is performed. The value is a JSON array.</p>
     * <br>
     * <p>>  The format of the output data is determined by the component that is configured when the playbook is written.</p>
     */
    @NameInMap("ActionOutputs")
    public String actionOutputs;

    /**
     * <p>The page number. Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of pages returned.</p>
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
