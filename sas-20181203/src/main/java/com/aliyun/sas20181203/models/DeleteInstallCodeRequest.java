// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteInstallCodeRequest extends TeaModel {
    @NameInMap("CaptchaCode")
    public String captchaCode;

    public static DeleteInstallCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteInstallCodeRequest self = new DeleteInstallCodeRequest();
        return TeaModel.build(map, self);
    }

    public DeleteInstallCodeRequest setCaptchaCode(String captchaCode) {
        this.captchaCode = captchaCode;
        return this;
    }
    public String getCaptchaCode() {
        return this.captchaCode;
    }

}
