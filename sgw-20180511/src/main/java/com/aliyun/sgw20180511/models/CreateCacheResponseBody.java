// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class CreateCacheResponseBody extends TeaModel {
    @NameInMap("BuyURL")
    public String buyURL;

    @NameInMap("CacheId")
    public String cacheId;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateCacheResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCacheResponseBody self = new CreateCacheResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCacheResponseBody setBuyURL(String buyURL) {
        this.buyURL = buyURL;
        return this;
    }
    public String getBuyURL() {
        return this.buyURL;
    }

    public CreateCacheResponseBody setCacheId(String cacheId) {
        this.cacheId = cacheId;
        return this;
    }
    public String getCacheId() {
        return this.cacheId;
    }

    public CreateCacheResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateCacheResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateCacheResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateCacheResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
