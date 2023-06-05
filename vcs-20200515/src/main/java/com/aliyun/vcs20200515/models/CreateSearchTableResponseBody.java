// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class CreateSearchTableResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateSearchTableResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateSearchTableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSearchTableResponseBody self = new CreateSearchTableResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSearchTableResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateSearchTableResponseBody setData(CreateSearchTableResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateSearchTableResponseBodyData getData() {
        return this.data;
    }

    public CreateSearchTableResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateSearchTableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSearchTableResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateSearchTableResponseBodyData extends TeaModel {
        @NameInMap("SearchTableId")
        public String searchTableId;

        public static CreateSearchTableResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateSearchTableResponseBodyData self = new CreateSearchTableResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateSearchTableResponseBodyData setSearchTableId(String searchTableId) {
            this.searchTableId = searchTableId;
            return this;
        }
        public String getSearchTableId() {
            return this.searchTableId;
        }

    }

}
