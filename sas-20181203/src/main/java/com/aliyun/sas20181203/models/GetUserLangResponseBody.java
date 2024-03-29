// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetUserLangResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The language settings.</p>
     */
    @NameInMap("SasUserLang")
    public GetUserLangResponseBodySasUserLang sasUserLang;

    public static GetUserLangResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserLangResponseBody self = new GetUserLangResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserLangResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserLangResponseBody setSasUserLang(GetUserLangResponseBodySasUserLang sasUserLang) {
        this.sasUserLang = sasUserLang;
        return this;
    }
    public GetUserLangResponseBodySasUserLang getSasUserLang() {
        return this.sasUserLang;
    }

    public static class GetUserLangResponseBodySasUserLang extends TeaModel {
        /**
         * <p>The language specified for log analysis. Valid values:</p>
         * <br>
         * <p>*   zh: Chinese</p>
         * <p>*   en: English</p>
         */
        @NameInMap("Lang")
        public String lang;

        public static GetUserLangResponseBodySasUserLang build(java.util.Map<String, ?> map) throws Exception {
            GetUserLangResponseBodySasUserLang self = new GetUserLangResponseBodySasUserLang();
            return TeaModel.build(map, self);
        }

        public GetUserLangResponseBodySasUserLang setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

    }

}
