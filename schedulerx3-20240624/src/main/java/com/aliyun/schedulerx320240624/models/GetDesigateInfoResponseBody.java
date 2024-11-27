// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class GetDesigateInfoResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("Data")
    public GetDesigateInfoResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>Parameter check error</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>1DF6732E-15D8-5E1F-95E3-C10077F556B5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetDesigateInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDesigateInfoResponseBody self = new GetDesigateInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDesigateInfoResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetDesigateInfoResponseBody setData(GetDesigateInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDesigateInfoResponseBodyData getData() {
        return this.data;
    }

    public GetDesigateInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDesigateInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDesigateInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDesigateInfoResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("DesignateType")
        public Integer designateType;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Transferable")
        public Boolean transferable;

        public static GetDesigateInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDesigateInfoResponseBodyData self = new GetDesigateInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDesigateInfoResponseBodyData setDesignateType(Integer designateType) {
            this.designateType = designateType;
            return this;
        }
        public Integer getDesignateType() {
            return this.designateType;
        }

        public GetDesigateInfoResponseBodyData setTransferable(Boolean transferable) {
            this.transferable = transferable;
            return this;
        }
        public Boolean getTransferable() {
            return this.transferable;
        }

    }

}
