// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class GetObjectRequest extends TeaModel {
    /**
     * <p>The cache-control header in the response that OSS returns.</p>
     */
    @NameInMap("response-cache-control")
    public String responseCacheControl;

    /**
     * <p>The content-disposition header in the response that OSS returns.</p>
     */
    @NameInMap("response-content-disposition")
    public String responseContentDisposition;

    /**
     * <p>The content-encoding header in the response that OSS returns.</p>
     */
    @NameInMap("response-content-encoding")
    public String responseContentEncoding;

    /**
     * <p>The content-language header in the response that OSS returns.</p>
     */
    @NameInMap("response-content-language")
    public String responseContentLanguage;

    /**
     * <p>The content-type header in the response that OSS returns.</p>
     */
    @NameInMap("response-content-type")
    public String responseContentType;

    /**
     * <p>The expires header in the response that OSS returns.</p>
     */
    @NameInMap("response-expires")
    public String responseExpires;

    public static GetObjectRequest build(java.util.Map<String, ?> map) throws Exception {
        GetObjectRequest self = new GetObjectRequest();
        return TeaModel.build(map, self);
    }

    public GetObjectRequest setResponseCacheControl(String responseCacheControl) {
        this.responseCacheControl = responseCacheControl;
        return this;
    }
    public String getResponseCacheControl() {
        return this.responseCacheControl;
    }

    public GetObjectRequest setResponseContentDisposition(String responseContentDisposition) {
        this.responseContentDisposition = responseContentDisposition;
        return this;
    }
    public String getResponseContentDisposition() {
        return this.responseContentDisposition;
    }

    public GetObjectRequest setResponseContentEncoding(String responseContentEncoding) {
        this.responseContentEncoding = responseContentEncoding;
        return this;
    }
    public String getResponseContentEncoding() {
        return this.responseContentEncoding;
    }

    public GetObjectRequest setResponseContentLanguage(String responseContentLanguage) {
        this.responseContentLanguage = responseContentLanguage;
        return this;
    }
    public String getResponseContentLanguage() {
        return this.responseContentLanguage;
    }

    public GetObjectRequest setResponseContentType(String responseContentType) {
        this.responseContentType = responseContentType;
        return this;
    }
    public String getResponseContentType() {
        return this.responseContentType;
    }

    public GetObjectRequest setResponseExpires(String responseExpires) {
        this.responseExpires = responseExpires;
        return this;
    }
    public String getResponseExpires() {
        return this.responseExpires;
    }

}
