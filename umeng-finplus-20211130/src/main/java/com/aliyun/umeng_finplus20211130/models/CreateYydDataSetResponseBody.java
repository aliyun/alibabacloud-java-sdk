// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20211130.models;

import com.aliyun.tea.*;

public class CreateYydDataSetResponseBody extends TeaModel {
    // 状态码
    @NameInMap("Code")
    public String code;

    // 数据集ID
    @NameInMap("Data")
    public Long data;

    // 状态描述
    @NameInMap("Msg")
    public String msg;

    // 是否成功
    @NameInMap("Success")
    public Boolean success;

    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    public static CreateYydDataSetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateYydDataSetResponseBody self = new CreateYydDataSetResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateYydDataSetResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateYydDataSetResponseBody setData(Long data) {
        this.data = data;
        return this;
    }
    public Long getData() {
        return this.data;
    }

    public CreateYydDataSetResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public CreateYydDataSetResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateYydDataSetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
