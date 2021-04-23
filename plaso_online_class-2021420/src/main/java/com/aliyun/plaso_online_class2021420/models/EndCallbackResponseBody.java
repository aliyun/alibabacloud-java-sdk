// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.plaso_online_class2021420.models;

import com.aliyun.tea.*;

public class EndCallbackResponseBody extends TeaModel {
    @NameInMap("Msg")
    public String msg;

    @NameInMap("Code")
    public Integer code;

    public static EndCallbackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EndCallbackResponseBody self = new EndCallbackResponseBody();
        return TeaModel.build(map, self);
    }

    public EndCallbackResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public EndCallbackResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

}
