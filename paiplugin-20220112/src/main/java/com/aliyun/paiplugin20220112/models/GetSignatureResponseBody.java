// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class GetSignatureResponseBody extends TeaModel {
    /**
     * <p>返回数据。</p>
     */
    @NameInMap("Data")
    public GetSignatureResponseBodyData data;

    /**
     * <p>错误码。</p>
     */
    @NameInMap("ErrorCode")
    public Integer errorCode;

    /**
     * <p>错误信息。</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>请求ID。</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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

    public GetSignatureResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetSignatureResponseBodyData extends TeaModel {
        /**
         * <p>创建时间 (UTC+8)。</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <p>申请说明。</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>签名Id。</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>签名名称。</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>审核建议。</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>签名审核状态。</p>
         * <p>- 0：审核中。</p>
         * <p>- 1：审核通过。</p>
         * <p>- 2：审核不通过。</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>更新时间 (UTC+8)。</p>
         */
        @NameInMap("UpdatedTime")
        public String updatedTime;

        public static GetSignatureResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSignatureResponseBodyData self = new GetSignatureResponseBodyData();
            return TeaModel.build(map, self);
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

        public GetSignatureResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetSignatureResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
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
