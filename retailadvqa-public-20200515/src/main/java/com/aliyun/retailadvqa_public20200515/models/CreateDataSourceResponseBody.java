// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class CreateDataSourceResponseBody extends TeaModel {
    @NameInMap("Data")
    public CreateDataSourceResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorDesc")
    public String errorDesc;

    @NameInMap("ExStack")
    public String exStack;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    @NameInMap("TraceId")
    public String traceId;

    public static CreateDataSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDataSourceResponseBody self = new CreateDataSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDataSourceResponseBody setData(CreateDataSourceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateDataSourceResponseBodyData getData() {
        return this.data;
    }

    public CreateDataSourceResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateDataSourceResponseBody setErrorDesc(String errorDesc) {
        this.errorDesc = errorDesc;
        return this;
    }
    public String getErrorDesc() {
        return this.errorDesc;
    }

    public CreateDataSourceResponseBody setExStack(String exStack) {
        this.exStack = exStack;
        return this;
    }
    public String getExStack() {
        return this.exStack;
    }

    public CreateDataSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDataSourceResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public CreateDataSourceResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class CreateDataSourceResponseBodyData extends TeaModel {
        @NameInMap("DataSourceId")
        public String dataSourceId;

        public static CreateDataSourceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateDataSourceResponseBodyData self = new CreateDataSourceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateDataSourceResponseBodyData setDataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public String getDataSourceId() {
            return this.dataSourceId;
        }

    }

}
