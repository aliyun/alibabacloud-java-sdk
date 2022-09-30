// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeParametersHistoryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Respond")
    public java.util.List<DescribeParametersHistoryResponseBodyRespond> respond;

    public static DescribeParametersHistoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeParametersHistoryResponseBody self = new DescribeParametersHistoryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeParametersHistoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeParametersHistoryResponseBody setRespond(java.util.List<DescribeParametersHistoryResponseBodyRespond> respond) {
        this.respond = respond;
        return this;
    }
    public java.util.List<DescribeParametersHistoryResponseBodyRespond> getRespond() {
        return this.respond;
    }

    public static class DescribeParametersHistoryResponseBodyRespondParameters extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DimensionValue")
        public String dimensionValue;

        @NameInMap("Name")
        public String name;

        @NameInMap("NewValue")
        public String newValue;

        @NameInMap("OldValue")
        public String oldValue;

        @NameInMap("Status")
        public String status;

        @NameInMap("UpdateTime")
        public String updateTime;

        public static DescribeParametersHistoryResponseBodyRespondParameters build(java.util.Map<String, ?> map) throws Exception {
            DescribeParametersHistoryResponseBodyRespondParameters self = new DescribeParametersHistoryResponseBodyRespondParameters();
            return TeaModel.build(map, self);
        }

        public DescribeParametersHistoryResponseBodyRespondParameters setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeParametersHistoryResponseBodyRespondParameters setDimensionValue(String dimensionValue) {
            this.dimensionValue = dimensionValue;
            return this;
        }
        public String getDimensionValue() {
            return this.dimensionValue;
        }

        public DescribeParametersHistoryResponseBodyRespondParameters setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeParametersHistoryResponseBodyRespondParameters setNewValue(String newValue) {
            this.newValue = newValue;
            return this;
        }
        public String getNewValue() {
            return this.newValue;
        }

        public DescribeParametersHistoryResponseBodyRespondParameters setOldValue(String oldValue) {
            this.oldValue = oldValue;
            return this;
        }
        public String getOldValue() {
            return this.oldValue;
        }

        public DescribeParametersHistoryResponseBodyRespondParameters setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeParametersHistoryResponseBodyRespondParameters setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class DescribeParametersHistoryResponseBodyRespond extends TeaModel {
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("Parameters")
        public java.util.List<DescribeParametersHistoryResponseBodyRespondParameters> parameters;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeParametersHistoryResponseBodyRespond build(java.util.Map<String, ?> map) throws Exception {
            DescribeParametersHistoryResponseBodyRespond self = new DescribeParametersHistoryResponseBodyRespond();
            return TeaModel.build(map, self);
        }

        public DescribeParametersHistoryResponseBodyRespond setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public DescribeParametersHistoryResponseBodyRespond setParameters(java.util.List<DescribeParametersHistoryResponseBodyRespondParameters> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.List<DescribeParametersHistoryResponseBodyRespondParameters> getParameters() {
            return this.parameters;
        }

        public DescribeParametersHistoryResponseBodyRespond setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
