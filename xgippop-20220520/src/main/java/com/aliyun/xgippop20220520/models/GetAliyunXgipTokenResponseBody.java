// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xgippop20220520.models;

import com.aliyun.tea.*;

public class GetAliyunXgipTokenResponseBody extends TeaModel {
    // 结果码
    @NameInMap("Code")
    public String code;

    // 结果
    @NameInMap("Data")
    public String data;

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

    public static GetAliyunXgipTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAliyunXgipTokenResponseBody self = new GetAliyunXgipTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAliyunXgipTokenResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAliyunXgipTokenResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetAliyunXgipTokenResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAliyunXgipTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAliyunXgipTokenResponseBody setRt(Long rt) {
        this.rt = rt;
        return this;
    }
    public Long getRt() {
        return this.rt;
    }

    public GetAliyunXgipTokenResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
