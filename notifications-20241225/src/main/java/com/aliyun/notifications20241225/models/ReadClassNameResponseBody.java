// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.notifications20241225.models;

import com.aliyun.tea.*;

public class ReadClassNameResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ReadClassNameResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ReadClassNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReadClassNameResponseBody self = new ReadClassNameResponseBody();
        return TeaModel.build(map, self);
    }

    public ReadClassNameResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ReadClassNameResponseBody setData(java.util.List<ReadClassNameResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ReadClassNameResponseBodyData> getData() {
        return this.data;
    }

    public ReadClassNameResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ReadClassNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ReadClassNameResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ReadClassNameResponseBodyData extends TeaModel {
        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        public static ReadClassNameResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ReadClassNameResponseBodyData self = new ReadClassNameResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ReadClassNameResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ReadClassNameResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
