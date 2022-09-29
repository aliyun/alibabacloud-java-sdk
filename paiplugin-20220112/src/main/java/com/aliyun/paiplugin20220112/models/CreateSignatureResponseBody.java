// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class CreateSignatureResponseBody extends TeaModel {
    @NameInMap("Data")
    public CreateSignatureResponseBodyData data;

    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateSignatureResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSignatureResponseBody self = new CreateSignatureResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSignatureResponseBody setData(CreateSignatureResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateSignatureResponseBodyData getData() {
        return this.data;
    }

    public CreateSignatureResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public CreateSignatureResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateSignatureResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateSignatureResponseBodyData extends TeaModel {
        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("UpdatedTime")
        public String updatedTime;

        public static CreateSignatureResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateSignatureResponseBodyData self = new CreateSignatureResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateSignatureResponseBodyData setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public CreateSignatureResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateSignatureResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateSignatureResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public CreateSignatureResponseBodyData setUpdatedTime(String updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }
        public String getUpdatedTime() {
            return this.updatedTime;
        }

    }

}
