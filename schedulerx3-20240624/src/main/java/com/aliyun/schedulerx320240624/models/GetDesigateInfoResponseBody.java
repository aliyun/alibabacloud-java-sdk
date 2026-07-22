// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class GetDesigateInfoResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public GetDesigateInfoResponseBodyData data;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Parameter check error</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID. Alibaba Cloud generates a unique identifier for each API request. You can use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>1DF6732E-15D8-5E1F-95E3-C10077F556B5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     * <ul>
     * <li><strong>true</strong>: The call was successful.</li>
     * <li><strong>false</strong>: The call failed.</li>
     * </ul>
     * 
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
         * <p>The type of the specified machine. Valid values:</p>
         * <ul>
         * <li>1: worker.</li>
         * <li>2: label.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("DesignateType")
        public Integer designateType;

        /**
         * <p>Indicates whether failover is enabled.</p>
         * 
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
