// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class ThirdPartyTransferResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ThirdPartyTransferResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ThirdPartyTransferResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ThirdPartyTransferResponseBody self = new ThirdPartyTransferResponseBody();
        return TeaModel.build(map, self);
    }

    public ThirdPartyTransferResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ThirdPartyTransferResponseBody setData(java.util.List<ThirdPartyTransferResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ThirdPartyTransferResponseBodyData> getData() {
        return this.data;
    }

    public ThirdPartyTransferResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ThirdPartyTransferResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ThirdPartyTransferResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ThirdPartyTransferResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ThirdPartyTransferResponseBodyData extends TeaModel {
        @NameInMap("Children")
        public String children;

        @NameInMap("IsSelectable")
        public Boolean isSelectable;

        @NameInMap("Label")
        public String label;

        @NameInMap("Value")
        public String value;

        public static ThirdPartyTransferResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ThirdPartyTransferResponseBodyData self = new ThirdPartyTransferResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ThirdPartyTransferResponseBodyData setChildren(String children) {
            this.children = children;
            return this;
        }
        public String getChildren() {
            return this.children;
        }

        public ThirdPartyTransferResponseBodyData setIsSelectable(Boolean isSelectable) {
            this.isSelectable = isSelectable;
            return this;
        }
        public Boolean getIsSelectable() {
            return this.isSelectable;
        }

        public ThirdPartyTransferResponseBodyData setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public ThirdPartyTransferResponseBodyData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
