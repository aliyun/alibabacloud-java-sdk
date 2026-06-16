// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class CreateVirusScanOnceTaskResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateVirusScanOnceTaskResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateVirusScanOnceTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateVirusScanOnceTaskResponseBody self = new CreateVirusScanOnceTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateVirusScanOnceTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateVirusScanOnceTaskResponseBody setData(CreateVirusScanOnceTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateVirusScanOnceTaskResponseBodyData getData() {
        return this.data;
    }

    public CreateVirusScanOnceTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateVirusScanOnceTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateVirusScanOnceTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateVirusScanOnceTaskResponseBodyData extends TeaModel {
        @NameInMap("BusinessType")
        public String businessType;

        @NameInMap("Platform")
        public String platform;

        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("SelectionKey")
        public Integer selectionKey;

        @NameInMap("TargetType")
        public String targetType;

        @NameInMap("Uuid")
        public String uuid;

        public static CreateVirusScanOnceTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateVirusScanOnceTaskResponseBodyData self = new CreateVirusScanOnceTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateVirusScanOnceTaskResponseBodyData setBusinessType(String businessType) {
            this.businessType = businessType;
            return this;
        }
        public String getBusinessType() {
            return this.businessType;
        }

        public CreateVirusScanOnceTaskResponseBodyData setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public CreateVirusScanOnceTaskResponseBodyData setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public CreateVirusScanOnceTaskResponseBodyData setSelectionKey(Integer selectionKey) {
            this.selectionKey = selectionKey;
            return this;
        }
        public Integer getSelectionKey() {
            return this.selectionKey;
        }

        public CreateVirusScanOnceTaskResponseBodyData setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

        public CreateVirusScanOnceTaskResponseBodyData setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
