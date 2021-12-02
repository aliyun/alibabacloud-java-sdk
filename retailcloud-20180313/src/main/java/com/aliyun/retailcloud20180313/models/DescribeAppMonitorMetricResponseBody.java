// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class DescribeAppMonitorMetricResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("ErrMsg")
    public String errMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<DescribeAppMonitorMetricResponseBodyResult> result;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeAppMonitorMetricResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppMonitorMetricResponseBody self = new DescribeAppMonitorMetricResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAppMonitorMetricResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeAppMonitorMetricResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public DescribeAppMonitorMetricResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAppMonitorMetricResponseBody setResult(java.util.List<DescribeAppMonitorMetricResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribeAppMonitorMetricResponseBodyResult> getResult() {
        return this.result;
    }

    public DescribeAppMonitorMetricResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeAppMonitorMetricResponseBodyResult extends TeaModel {
        @NameInMap("Categories")
        public java.util.List<String> categories;

        @NameInMap("Data")
        public java.util.List<Float> data;

        @NameInMap("Name")
        public String name;

        public static DescribeAppMonitorMetricResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppMonitorMetricResponseBodyResult self = new DescribeAppMonitorMetricResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeAppMonitorMetricResponseBodyResult setCategories(java.util.List<String> categories) {
            this.categories = categories;
            return this;
        }
        public java.util.List<String> getCategories() {
            return this.categories;
        }

        public DescribeAppMonitorMetricResponseBodyResult setData(java.util.List<Float> data) {
            this.data = data;
            return this;
        }
        public java.util.List<Float> getData() {
            return this.data;
        }

        public DescribeAppMonitorMetricResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
