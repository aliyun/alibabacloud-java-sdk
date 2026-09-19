// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class CreateTemplateCacheResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("templateCache")
    public PublicTemplateCache templateCache;

    public static CreateTemplateCacheResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTemplateCacheResponseBody self = new CreateTemplateCacheResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTemplateCacheResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateTemplateCacheResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateTemplateCacheResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTemplateCacheResponseBody setTemplateCache(PublicTemplateCache templateCache) {
        this.templateCache = templateCache;
        return this;
    }
    public PublicTemplateCache getTemplateCache() {
        return this.templateCache;
    }

}
