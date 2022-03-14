// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_uapp20220225.models;

import com.aliyun.tea.*;

public class UwebSiteIdBlockResponseBody extends TeaModel {
    // code
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public Boolean data;

    // msg
    @NameInMap("Msg")
    public String msg;

    // requestId
    @NameInMap("RequestId")
    public String requestId;

    // success
    @NameInMap("Success")
    public Boolean success;

    public static UwebSiteIdBlockResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UwebSiteIdBlockResponseBody self = new UwebSiteIdBlockResponseBody();
        return TeaModel.build(map, self);
    }

    public UwebSiteIdBlockResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public UwebSiteIdBlockResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public UwebSiteIdBlockResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public UwebSiteIdBlockResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UwebSiteIdBlockResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
