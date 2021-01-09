// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sms_intl20180501.models;

import com.aliyun.tea.*;

public class SmsConversionResponseBody extends TeaModel {
    @NameInMap("ResponseCode")
    public String responseCode;

    @NameInMap("ResponseDescription")
    public String responseDescription;

    public static SmsConversionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SmsConversionResponseBody self = new SmsConversionResponseBody();
        return TeaModel.build(map, self);
    }

    public SmsConversionResponseBody setResponseCode(String responseCode) {
        this.responseCode = responseCode;
        return this;
    }
    public String getResponseCode() {
        return this.responseCode;
    }

    public SmsConversionResponseBody setResponseDescription(String responseDescription) {
        this.responseDescription = responseDescription;
        return this;
    }
    public String getResponseDescription() {
        return this.responseDescription;
    }

}
