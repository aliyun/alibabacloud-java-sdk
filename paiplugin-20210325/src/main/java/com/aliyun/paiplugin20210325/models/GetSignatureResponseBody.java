// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20210325.models;

import com.aliyun.tea.*;

public class GetSignatureResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetSignatureResponseBodyData data;

    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    public static GetSignatureResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSignatureResponseBody self = new GetSignatureResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSignatureResponseBody setData(GetSignatureResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSignatureResponseBodyData getData() {
        return this.data;
    }

    public GetSignatureResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public GetSignatureResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public static class GetSignatureResponseBodyData extends TeaModel {
        // 签名归属方的三证合一，OSS地址
        @NameInMap("Certificates")
        public String certificates;

        // 创建时间 (UTC+8)
        @NameInMap("CreatedTime")
        public String createdTime;

        // 申请说明
        @NameInMap("Description")
        public String description;

        // ID UUID
        @NameInMap("ID")
        public String ID;

        // 签名名称
        @NameInMap("Name")
        public String name;

        // 授权委托书(Power of attorney)， OSS地址
        @NameInMap("PowerOfAttorney")
        public String powerOfAttorney;

        // 审核结果说明
        @NameInMap("Reason")
        public String reason;

        // 审核状态
        // - 0 : 审核中
        // - 1 : 审核通过
        // - 2 : 审核不通过
        @NameInMap("Status")
        public Integer status;

        // 更新时间 (UTC+8)
        @NameInMap("UpdatedTime")
        public String updatedTime;

        public static GetSignatureResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSignatureResponseBodyData self = new GetSignatureResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSignatureResponseBodyData setCertificates(String certificates) {
            this.certificates = certificates;
            return this;
        }
        public String getCertificates() {
            return this.certificates;
        }

        public GetSignatureResponseBodyData setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public GetSignatureResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetSignatureResponseBodyData setID(String ID) {
            this.ID = ID;
            return this;
        }
        public String getID() {
            return this.ID;
        }

        public GetSignatureResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetSignatureResponseBodyData setPowerOfAttorney(String powerOfAttorney) {
            this.powerOfAttorney = powerOfAttorney;
            return this;
        }
        public String getPowerOfAttorney() {
            return this.powerOfAttorney;
        }

        public GetSignatureResponseBodyData setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public GetSignatureResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetSignatureResponseBodyData setUpdatedTime(String updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }
        public String getUpdatedTime() {
            return this.updatedTime;
        }

    }

}
