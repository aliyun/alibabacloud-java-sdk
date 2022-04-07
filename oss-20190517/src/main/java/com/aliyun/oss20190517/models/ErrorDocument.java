// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class ErrorDocument extends TeaModel {
    // description
    @NameInMap("HttpStatus")
    public String httpStatus;

    // description
    @NameInMap("Key")
    public String key;

    public static ErrorDocument build(java.util.Map<String, ?> map) throws Exception {
        ErrorDocument self = new ErrorDocument();
        return TeaModel.build(map, self);
    }

    public ErrorDocument setHttpStatus(String httpStatus) {
        this.httpStatus = httpStatus;
        return this;
    }
    public String getHttpStatus() {
        return this.httpStatus;
    }

    public ErrorDocument setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

}
