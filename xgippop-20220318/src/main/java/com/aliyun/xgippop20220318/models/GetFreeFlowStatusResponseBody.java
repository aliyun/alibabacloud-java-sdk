// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xgippop20220318.models;

import com.aliyun.tea.*;

public class GetFreeFlowStatusResponseBody extends TeaModel {
    // 结果码
    @NameInMap("Code")
    public String code;

    // 结果
    @NameInMap("Data")
    public Object data;

    // 结果描述
    @NameInMap("Message")
    public String message;

    // 请求链路ID，如POP请求进来的requestId，返回时原样返回
    @NameInMap("RequestId")
    public String requestId;

    // 服务端处理耗时，ms
    @NameInMap("Rt")
    public Long rt;

    // 是否成功
    @NameInMap("Success")
    public Boolean success;

    public static GetFreeFlowStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFreeFlowStatusResponseBody self = new GetFreeFlowStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFreeFlowStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetFreeFlowStatusResponseBody setData(Object data) {
        this.data = data;
        return this;
    }
    public Object getData() {
        return this.data;
    }

    public GetFreeFlowStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetFreeFlowStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetFreeFlowStatusResponseBody setRt(Long rt) {
        this.rt = rt;
        return this;
    }
    public Long getRt() {
        return this.rt;
    }

    public GetFreeFlowStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
