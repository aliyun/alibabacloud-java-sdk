// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20200928.models;

import com.aliyun.tea.*;

public class AlterDatabaseResponseBody extends TeaModel {
    // 如果后端处理出现错误，则表示错误的类型
    @NameInMap("Code")
    public String code;

    // null
    @NameInMap("Data")
    public String data;

    // 如果后端处理出现错误，则表示错误的信息
    @NameInMap("Message")
    public String message;

    // 请求的 ID
    @NameInMap("RequestId")
    public String requestId;

    // 标识本次请求是否成功
    @NameInMap("Success")
    public Boolean success;

    public static AlterDatabaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AlterDatabaseResponseBody self = new AlterDatabaseResponseBody();
        return TeaModel.build(map, self);
    }

    public AlterDatabaseResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AlterDatabaseResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public AlterDatabaseResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AlterDatabaseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AlterDatabaseResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
