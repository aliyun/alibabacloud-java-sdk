// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class IncreaseNodeGroupDiskResponseBody extends TeaModel {
    // code
    @NameInMap("Code")
    public String code;

    // message
    @NameInMap("Message")
    public String message;

    // data
    @NameInMap("data")
    public String data;

    // requestId
    @NameInMap("requestId")
    public String requestId;

    // success
    @NameInMap("success")
    public Boolean success;

    public static IncreaseNodeGroupDiskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        IncreaseNodeGroupDiskResponseBody self = new IncreaseNodeGroupDiskResponseBody();
        return TeaModel.build(map, self);
    }

    public IncreaseNodeGroupDiskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public IncreaseNodeGroupDiskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public IncreaseNodeGroupDiskResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public IncreaseNodeGroupDiskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public IncreaseNodeGroupDiskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
