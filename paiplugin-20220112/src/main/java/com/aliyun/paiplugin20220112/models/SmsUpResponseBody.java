// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class SmsUpResponseBody extends TeaModel {
    /**
     * <p>应答编码。</p>
     */
    @NameInMap("code")
    public Integer code;

    /**
     * <p>描述信息。</p>
     */
    @NameInMap("msg")
    public String msg;

    public static SmsUpResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SmsUpResponseBody self = new SmsUpResponseBody();
        return TeaModel.build(map, self);
    }

    public SmsUpResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public SmsUpResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

}
