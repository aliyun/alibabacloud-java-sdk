// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trafficfxopen20240815.models;

import com.aliyun.tea.*;

public class ConvertUrlHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <p>token</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJhbGciOiJSUzI1NiIsImtpZCI6ImRpc3RyaWJ1dGlvbl9rZXlpZCJ9.eyJqdGkiOiI2cDQwZDctSDQ0dUJicEJkYTZadzdBIiwiaWF0IjoxNzI0MzE2MzM1LCJleHAiOjE3MjQzMjM1MzUsIm5iZiI6MTcyNDMxNjI3NSwiYXBwS2V5IjoiNjE3NzgxZDQxM2FmNGRlZGFiNzkifQ.XtjSM7qVbESvt7n31RtD5Pp6854IVyGMEco4aEruMDMkrXHkcdZejyecKFx3RdsCldZPgvowc5EOl44c3JJfm6DENH4M6BRBSc90eqXYcD_xVJ9FhDWzK9O6OnkvR7HX1t-qqMdikLviM1w1G0DGMLaasvZ8MPMewL8k6NnvOSGePwUhb-m5IZ14VYv7BPO2dp8Jh00qNSJQrmNiWWzJUtK_xllNr3LKQ7cIVtPgFUckvRDw9Hal5oACXSRdkZFOAGlFSjpB_BbTpe5vc-AJ8K89nRD53sIy9YyVQClV_HH7PrXxFFJgReGvNsnP1h9gf55q86IzOQBkj9vGm2zXdw</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("xAcsAirticketAccessToken")
    public String xAcsAirticketAccessToken;

    /**
     * <strong>example:</strong>
     * <p>en_US</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("xAcsAirticketLanguage")
    public String xAcsAirticketLanguage;

    public static ConvertUrlHeaders build(java.util.Map<String, ?> map) throws Exception {
        ConvertUrlHeaders self = new ConvertUrlHeaders();
        return TeaModel.build(map, self);
    }

    public ConvertUrlHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public ConvertUrlHeaders setXAcsAirticketAccessToken(String xAcsAirticketAccessToken) {
        this.xAcsAirticketAccessToken = xAcsAirticketAccessToken;
        return this;
    }
    public String getXAcsAirticketAccessToken() {
        return this.xAcsAirticketAccessToken;
    }

    public ConvertUrlHeaders setXAcsAirticketLanguage(String xAcsAirticketLanguage) {
        this.xAcsAirticketLanguage = xAcsAirticketLanguage;
        return this;
    }
    public String getXAcsAirticketLanguage() {
        return this.xAcsAirticketLanguage;
    }

}
