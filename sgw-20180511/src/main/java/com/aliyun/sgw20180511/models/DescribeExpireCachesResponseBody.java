// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeExpireCachesResponseBody extends TeaModel {
    @NameInMap("CacheFilePaths")
    public String cacheFilePaths;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeExpireCachesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeExpireCachesResponseBody self = new DescribeExpireCachesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeExpireCachesResponseBody setCacheFilePaths(String cacheFilePaths) {
        this.cacheFilePaths = cacheFilePaths;
        return this;
    }
    public String getCacheFilePaths() {
        return this.cacheFilePaths;
    }

    public DescribeExpireCachesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeExpireCachesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeExpireCachesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeExpireCachesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
