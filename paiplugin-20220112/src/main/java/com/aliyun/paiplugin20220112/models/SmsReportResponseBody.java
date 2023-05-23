// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class SmsReportResponseBody extends TeaModel {
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

    public static SmsReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SmsReportResponseBody self = new SmsReportResponseBody();
        return TeaModel.build(map, self);
    }

    public SmsReportResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public SmsReportResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

}
