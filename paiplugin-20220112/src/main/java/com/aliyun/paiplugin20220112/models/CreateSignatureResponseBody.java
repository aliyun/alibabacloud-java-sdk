// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class CreateSignatureResponseBody extends TeaModel {
    /**
     * <p>返回数据。</p>
     */
    @NameInMap("Data")
    public CreateSignatureResponseBodyData data;

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
        /**
         * <p>创建时间 (UTC+8)。</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <p>签名ID。</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>签名名称。</p>
         */
        @NameInMap("Name")
        public String name;

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
