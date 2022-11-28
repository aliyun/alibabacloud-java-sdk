// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_apm20220214.models;

import com.aliyun.tea.*;

public class UpdateAlertPlanResponseBody extends TeaModel {
    @NameInMap("code")
    public Long code;

    @NameInMap("msg")
    public String msg;

    @NameInMap("success")
    public Boolean success;

    public static UpdateAlertPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAlertPlanResponseBody self = new UpdateAlertPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAlertPlanResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public UpdateAlertPlanResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public UpdateAlertPlanResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
