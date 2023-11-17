// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeSoarRecordActionOutputListResponseBody extends TeaModel {
    @NameInMap("ActionOutputs")
    public String actionOutputs;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

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
