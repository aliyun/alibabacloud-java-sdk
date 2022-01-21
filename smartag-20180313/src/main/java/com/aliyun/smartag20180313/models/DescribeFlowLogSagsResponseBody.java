// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeFlowLogSagsResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Sags")
    public DescribeFlowLogSagsResponseBodySags sags;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeFlowLogSagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlowLogSagsResponseBody self = new DescribeFlowLogSagsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFlowLogSagsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeFlowLogSagsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeFlowLogSagsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFlowLogSagsResponseBody setSags(DescribeFlowLogSagsResponseBodySags sags) {
        this.sags = sags;
        return this;
    }
    public DescribeFlowLogSagsResponseBodySags getSags() {
        return this.sags;
    }

    public DescribeFlowLogSagsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeFlowLogSagsResponseBodySagsSag extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Name")
        public String name;

        @NameInMap("SmartAGId")
        public String smartAGId;

        public static DescribeFlowLogSagsResponseBodySagsSag build(java.util.Map<String, ?> map) throws Exception {
            DescribeFlowLogSagsResponseBodySagsSag self = new DescribeFlowLogSagsResponseBodySagsSag();
            return TeaModel.build(map, self);
        }

        public DescribeFlowLogSagsResponseBodySagsSag setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeFlowLogSagsResponseBodySagsSag setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeFlowLogSagsResponseBodySagsSag setSmartAGId(String smartAGId) {
            this.smartAGId = smartAGId;
            return this;
        }
        public String getSmartAGId() {
            return this.smartAGId;
        }

    }

    public static class DescribeFlowLogSagsResponseBodySags extends TeaModel {
        @NameInMap("Sag")
        public java.util.List<DescribeFlowLogSagsResponseBodySagsSag> sag;

        public static DescribeFlowLogSagsResponseBodySags build(java.util.Map<String, ?> map) throws Exception {
            DescribeFlowLogSagsResponseBodySags self = new DescribeFlowLogSagsResponseBodySags();
            return TeaModel.build(map, self);
        }

        public DescribeFlowLogSagsResponseBodySags setSag(java.util.List<DescribeFlowLogSagsResponseBodySagsSag> sag) {
            this.sag = sag;
            return this;
        }
        public java.util.List<DescribeFlowLogSagsResponseBodySagsSag> getSag() {
            return this.sag;
        }

    }

}
