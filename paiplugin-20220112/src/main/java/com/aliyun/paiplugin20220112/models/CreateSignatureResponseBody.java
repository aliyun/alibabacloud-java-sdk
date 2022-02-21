// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class CreateSignatureResponseBody extends TeaModel {
    // 返回数据
    @NameInMap("Data")
    public CreateSignatureResponseBodyData data;

    // 错误码
    @NameInMap("ErrorCode")
    public Integer errorCode;

    // 错误信息
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
        // 创建时间 (UTC+8)。
        @NameInMap("CreatedTime")
        public String createdTime;

        // 签名Id。
        @NameInMap("Id")
        public String id;

        // 签名名称。
        @NameInMap("Name")
        public String name;

        // 签名审核状态。取值：
        // - 0：审核中
        // - 1：审核通过
        // - 2：审核不通过
        @NameInMap("Status")
        public Integer status;

        // 更新时间 (UTC+8)。
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
