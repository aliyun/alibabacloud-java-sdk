// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_apm20220214.models;

import com.aliyun.tea.*;

public class DeleteSymRecordsResponseBody extends TeaModel {
    /**
     * <p>code</p>
     */
    @NameInMap("code")
    public Long code;

    @NameInMap("msg")
    public String msg;

    @NameInMap("num")
    public Integer num;

    @NameInMap("success")
    public Boolean success;

    /**
     * <p>traceId</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static DeleteSymRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSymRecordsResponseBody self = new DeleteSymRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSymRecordsResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public DeleteSymRecordsResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public DeleteSymRecordsResponseBody setNum(Integer num) {
        this.num = num;
        return this;
    }
    public Integer getNum() {
        return this.num;
    }

    public DeleteSymRecordsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DeleteSymRecordsResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
