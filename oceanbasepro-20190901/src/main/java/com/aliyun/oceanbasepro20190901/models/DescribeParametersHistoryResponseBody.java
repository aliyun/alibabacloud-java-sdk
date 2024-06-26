// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeParametersHistoryResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EE205C00-30E4-XXXX-XXXX-87E3A8A2AA0C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of parameter modification records.</p>
     */
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
        /**
         * <p>The time when the parameter modification was initiated.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-09-14 10:57:44</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The resource ID of the parameter type.    </p>
         * <ul>
         * <li>When you called this operation to query the modification history of cluster parameters, the value is DEFAULT_DIMENSION_VALUE.   </li>
         * <li>When you called this operation to query the modification history of tenant parameters, the value is the tenant ID.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DEFAULT_DIMENSION_VALUE</p>
         */
        @NameInMap("DimensionValue")
        public String dimensionValue;

        /**
         * <p>The name of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>connect_timeout</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The value of the parameter after the modification.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("NewValue")
        public String newValue;

        /**
         * <p>The parameter value before modification.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("OldValue")
        public String oldValue;

        /**
         * <p>The modification status. Valid values:    </p>
         * <ul>
         * <li>APPLIED: The modification was successful.   </li>
         * <li>SCHEDULING: The modification was to be made.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>APPLIED</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The time when the parameter modification took effect.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-09-14 10:57:44</p>
         */
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
        /**
         * <p>The number of returned entries on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>Default value: 10.</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The parameter modification history.</p>
         */
        @NameInMap("Parameters")
        public java.util.List<DescribeParametersHistoryResponseBodyRespondParameters> parameters;

        /**
         * <p>The number of parameter modification records.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
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
