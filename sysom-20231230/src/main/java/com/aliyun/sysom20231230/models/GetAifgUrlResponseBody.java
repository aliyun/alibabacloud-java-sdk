// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetAifgUrlResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("data")
    public GetAifgUrlResponseBodyData data;

    /**
     * <p>The status code description.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    public static GetAifgUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAifgUrlResponseBody self = new GetAifgUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAifgUrlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAifgUrlResponseBody setData(GetAifgUrlResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAifgUrlResponseBodyData getData() {
        return this.data;
    }

    public GetAifgUrlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public static class GetAifgUrlResponseBodyData extends TeaModel {
        /**
         * <p>The URL for diagnostic details.</p>
         * 
         * <strong>example:</strong>
         * <p>/diagnose/detail/qe3Z34sa</p>
         */
        @NameInMap("url")
        public String url;

        public static GetAifgUrlResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAifgUrlResponseBodyData self = new GetAifgUrlResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAifgUrlResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
