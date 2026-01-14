// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ListWhitePortalMenuResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>DC4E1**********0DF67E2C3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<ListWhitePortalMenuResponseBodyResult> result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListWhitePortalMenuResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWhitePortalMenuResponseBody self = new ListWhitePortalMenuResponseBody();
        return TeaModel.build(map, self);
    }

    public ListWhitePortalMenuResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListWhitePortalMenuResponseBody setResult(java.util.List<ListWhitePortalMenuResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListWhitePortalMenuResponseBodyResult> getResult() {
        return this.result;
    }

    public ListWhitePortalMenuResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListWhitePortalMenuResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AuthPointsValue")
        public Integer authPointsValue;

        /**
         * <strong>example:</strong>
         * <p>8a4***********1e769</p>
         */
        @NameInMap("ReceiverId")
        public String receiverId;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ReceiverType")
        public Integer receiverType;

        public static ListWhitePortalMenuResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListWhitePortalMenuResponseBodyResult self = new ListWhitePortalMenuResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListWhitePortalMenuResponseBodyResult setAuthPointsValue(Integer authPointsValue) {
            this.authPointsValue = authPointsValue;
            return this;
        }
        public Integer getAuthPointsValue() {
            return this.authPointsValue;
        }

        public ListWhitePortalMenuResponseBodyResult setReceiverId(String receiverId) {
            this.receiverId = receiverId;
            return this;
        }
        public String getReceiverId() {
            return this.receiverId;
        }

        public ListWhitePortalMenuResponseBodyResult setReceiverType(Integer receiverType) {
            this.receiverType = receiverType;
            return this;
        }
        public Integer getReceiverType() {
            return this.receiverType;
        }

    }

}
