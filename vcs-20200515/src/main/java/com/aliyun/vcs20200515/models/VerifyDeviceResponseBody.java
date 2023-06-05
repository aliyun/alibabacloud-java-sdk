// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class VerifyDeviceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<VerifyDeviceResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static VerifyDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VerifyDeviceResponseBody self = new VerifyDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public VerifyDeviceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public VerifyDeviceResponseBody setData(java.util.List<VerifyDeviceResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<VerifyDeviceResponseBodyData> getData() {
        return this.data;
    }

    public VerifyDeviceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public VerifyDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class VerifyDeviceResponseBodyData extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Id")
        public String id;

        @NameInMap("Message")
        public String message;

        @NameInMap("OriginalGbId")
        public String originalGbId;

        @NameInMap("RowNumber")
        public Long rowNumber;

        @NameInMap("SuggestGbId")
        public String suggestGbId;

        public static VerifyDeviceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            VerifyDeviceResponseBodyData self = new VerifyDeviceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public VerifyDeviceResponseBodyData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public VerifyDeviceResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public VerifyDeviceResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public VerifyDeviceResponseBodyData setOriginalGbId(String originalGbId) {
            this.originalGbId = originalGbId;
            return this;
        }
        public String getOriginalGbId() {
            return this.originalGbId;
        }

        public VerifyDeviceResponseBodyData setRowNumber(Long rowNumber) {
            this.rowNumber = rowNumber;
            return this;
        }
        public Long getRowNumber() {
            return this.rowNumber;
        }

        public VerifyDeviceResponseBodyData setSuggestGbId(String suggestGbId) {
            this.suggestGbId = suggestGbId;
            return this;
        }
        public String getSuggestGbId() {
            return this.suggestGbId;
        }

    }

}
