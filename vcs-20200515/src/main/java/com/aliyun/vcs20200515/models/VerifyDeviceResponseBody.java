// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class VerifyDeviceResponseBody extends TeaModel {
    // 响应码
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<VerifyDeviceResponseBodyData> data;

    // 响应码描述
    @NameInMap("Message")
    public String message;

    // Id of the request
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
        // 格式错误或国标冲突的错误码，0为成功，-1为失败
        @NameInMap("Code")
        public String code;

        // Excel中的序号列的值
        @NameInMap("Id")
        public String id;

        // 格式错误或国标冲突提示
        @NameInMap("Message")
        public String message;

        // 原始国标编码
        @NameInMap("OriginalGbId")
        public String originalGbId;

        // 记录所在行号
        @NameInMap("RowNumber")
        public Long rowNumber;

        // 建议的国标编码
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
