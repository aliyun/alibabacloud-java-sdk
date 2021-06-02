// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class BucketIsExistResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 返回码
    @NameInMap("Code")
    public Long code;

    // 是否请求成功
    @NameInMap("Success")
    public Boolean success;

    // 错误消息
    @NameInMap("Message")
    public String message;

    // bucket是否存在
    @NameInMap("IsExist")
    public Boolean isExist;

    public static BucketIsExistResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BucketIsExistResponseBody self = new BucketIsExistResponseBody();
        return TeaModel.build(map, self);
    }

    public BucketIsExistResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BucketIsExistResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public BucketIsExistResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public BucketIsExistResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BucketIsExistResponseBody setIsExist(Boolean isExist) {
        this.isExist = isExist;
        return this;
    }
    public Boolean getIsExist() {
        return this.isExist;
    }

}
