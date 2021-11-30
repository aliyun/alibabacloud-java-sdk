// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20211130.models;

import com.aliyun.tea.*;

public class CreateComputeTaskByDataSetIdResponseBody extends TeaModel {
    // 状态码
    @NameInMap("Code")
    public String code;

    // 批量计算任务ID
    @NameInMap("Data")
    public java.util.List<Long> data;

    // 状态描述
    @NameInMap("Msg")
    public String msg;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 是否成功
    @NameInMap("Success")
    public Boolean success;

    public static CreateComputeTaskByDataSetIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateComputeTaskByDataSetIdResponseBody self = new CreateComputeTaskByDataSetIdResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateComputeTaskByDataSetIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateComputeTaskByDataSetIdResponseBody setData(java.util.List<Long> data) {
        this.data = data;
        return this;
    }
    public java.util.List<Long> getData() {
        return this.data;
    }

    public CreateComputeTaskByDataSetIdResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public CreateComputeTaskByDataSetIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateComputeTaskByDataSetIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
