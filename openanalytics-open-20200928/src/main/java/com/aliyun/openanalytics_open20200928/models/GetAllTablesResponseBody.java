// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20200928.models;

import com.aliyun.tea.*;

public class GetAllTablesResponseBody extends TeaModel {
    // 如果后端处理出现错误，则表示错误的类型
    @NameInMap("Code")
    public String code;

    // 请求数据库低下的所有表
    @NameInMap("Data")
    public java.util.List<String> data;

    // 如果后端处理出现错误，则表示错误的信息
    @NameInMap("Message")
    public String message;

    // 请求的 ID
    @NameInMap("RequestId")
    public String requestId;

    // 标识本次请求是否成功
    @NameInMap("Success")
    public Boolean success;

    public static GetAllTablesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAllTablesResponseBody self = new GetAllTablesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAllTablesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAllTablesResponseBody setData(java.util.List<String> data) {
        this.data = data;
        return this;
    }
    public java.util.List<String> getData() {
        return this.data;
    }

    public GetAllTablesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAllTablesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAllTablesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
