// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class CheckPermissionResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<CheckPermissionResponseBodyData> data;

    // 错误码
    @NameInMap("ErrorCode")
    public String errorCode;

    // 错误描述
    @NameInMap("ErrorDesc")
    public String errorDesc;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 接口调用状态
    @NameInMap("Success")
    public Boolean success;

    // traceId
    @NameInMap("TraceId")
    public String traceId;

    public static CheckPermissionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckPermissionResponseBody self = new CheckPermissionResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckPermissionResponseBody setData(java.util.List<CheckPermissionResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<CheckPermissionResponseBodyData> getData() {
        return this.data;
    }

    public CheckPermissionResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CheckPermissionResponseBody setErrorDesc(String errorDesc) {
        this.errorDesc = errorDesc;
        return this;
    }
    public String getErrorDesc() {
        return this.errorDesc;
    }

    public CheckPermissionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckPermissionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CheckPermissionResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class CheckPermissionResponseBodyData extends TeaModel {
        // 字段名
        @NameInMap("FileldName")
        public String fileldName;

        // 字段权限
        @NameInMap("RowPermissions")
        public java.util.List<String> rowPermissions;

        public static CheckPermissionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CheckPermissionResponseBodyData self = new CheckPermissionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CheckPermissionResponseBodyData setFileldName(String fileldName) {
            this.fileldName = fileldName;
            return this;
        }
        public String getFileldName() {
            return this.fileldName;
        }

        public CheckPermissionResponseBodyData setRowPermissions(java.util.List<String> rowPermissions) {
            this.rowPermissions = rowPermissions;
            return this;
        }
        public java.util.List<String> getRowPermissions() {
            return this.rowPermissions;
        }

    }

}
