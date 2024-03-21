// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class CheckAuthorizationLetterResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TemplateUrl")
    public String templateUrl;

    @NameInMap("Tips")
    public String tips;

    public static CheckAuthorizationLetterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckAuthorizationLetterResponseBody self = new CheckAuthorizationLetterResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckAuthorizationLetterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckAuthorizationLetterResponseBody setTemplateUrl(String templateUrl) {
        this.templateUrl = templateUrl;
        return this;
    }
    public String getTemplateUrl() {
        return this.templateUrl;
    }

    public CheckAuthorizationLetterResponseBody setTips(String tips) {
        this.tips = tips;
        return this;
    }
    public String getTips() {
        return this.tips;
    }

}
