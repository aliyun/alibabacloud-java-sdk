// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20210325.models;

import com.aliyun.tea.*;

public class CreateSignatureResponseBody extends TeaModel {
    @NameInMap("Data")
    public CreateSignatureResponseBodyData data;

    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

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

    public static class CreateSignatureResponseBodyData extends TeaModel {
        // 创建时间 (UTC+8)
        @NameInMap("CreatedTime")
        public String createdTime;

        // ID UUID
        @NameInMap("ID")
        public String ID;

        // 签名名称
        @NameInMap("Name")
        public String name;

        // 审核状态
        // - 0 : 审核中
        // - 1 : 审核通过
        // - 2 : 审核不通过
        @NameInMap("Status")
        public Integer status;

        // 更新时间 (UTC+8)
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

        public CreateSignatureResponseBodyData setID(String ID) {
            this.ID = ID;
            return this;
        }
        public String getID() {
            return this.ID;
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
