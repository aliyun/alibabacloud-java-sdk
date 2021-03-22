// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20180117.models;

import com.aliyun.tea.*;

public class DescribeAsyncTaskStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeAsyncTaskStatusResponseBodyResult result;

    public static DescribeAsyncTaskStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAsyncTaskStatusResponseBody self = new DescribeAsyncTaskStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAsyncTaskStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAsyncTaskStatusResponseBody setResult(DescribeAsyncTaskStatusResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeAsyncTaskStatusResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeAsyncTaskStatusResponseBodyResult extends TeaModel {
        @NameInMap("Data")
        public String data;

        @NameInMap("Progress")
        public Integer progress;

        @NameInMap("ErrCode")
        public String errCode;

        @NameInMap("ErrMsg")
        public String errMsg;

        @NameInMap("AsyncTaskStatus")
        public String asyncTaskStatus;

        public static DescribeAsyncTaskStatusResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeAsyncTaskStatusResponseBodyResult self = new DescribeAsyncTaskStatusResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeAsyncTaskStatusResponseBodyResult setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public DescribeAsyncTaskStatusResponseBodyResult setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public DescribeAsyncTaskStatusResponseBodyResult setErrCode(String errCode) {
            this.errCode = errCode;
            return this;
        }
        public String getErrCode() {
            return this.errCode;
        }

        public DescribeAsyncTaskStatusResponseBodyResult setErrMsg(String errMsg) {
            this.errMsg = errMsg;
            return this;
        }
        public String getErrMsg() {
            return this.errMsg;
        }

        public DescribeAsyncTaskStatusResponseBodyResult setAsyncTaskStatus(String asyncTaskStatus) {
            this.asyncTaskStatus = asyncTaskStatus;
            return this;
        }
        public String getAsyncTaskStatus() {
            return this.asyncTaskStatus;
        }

    }

}
