// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20200928.models;

import com.aliyun.tea.*;

public class CountDatabasesByNameAndTagsResponseBody extends TeaModel {
    // 请求的 ID	
    @NameInMap("RequestId")
    public String requestId;

    // 如果后端处理出现错误，则表示错误的类型
    @NameInMap("Code")
    public String code;

    // 如果后端处理出现错误，则表示错误的信息
    @NameInMap("Message")
    public String message;

    // 标识本次请求是否成功
    @NameInMap("Success")
    public Boolean success;

    // 符合条件库的数量
    @NameInMap("Data")
    public Long data;

    public static CountDatabasesByNameAndTagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CountDatabasesByNameAndTagsResponseBody self = new CountDatabasesByNameAndTagsResponseBody();
        return TeaModel.build(map, self);
    }

    public CountDatabasesByNameAndTagsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CountDatabasesByNameAndTagsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CountDatabasesByNameAndTagsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CountDatabasesByNameAndTagsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CountDatabasesByNameAndTagsResponseBody setData(Long data) {
        this.data = data;
        return this;
    }
    public Long getData() {
        return this.data;
    }

}
