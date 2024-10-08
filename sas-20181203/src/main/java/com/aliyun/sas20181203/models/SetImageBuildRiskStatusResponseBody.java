// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class SetImageBuildRiskStatusResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SetImageBuildRiskStatusResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>52870893-48A7-5A9E-9E05-6253E5B6****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static SetImageBuildRiskStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetImageBuildRiskStatusResponseBody self = new SetImageBuildRiskStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public SetImageBuildRiskStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SetImageBuildRiskStatusResponseBody setData(SetImageBuildRiskStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SetImageBuildRiskStatusResponseBodyData getData() {
        return this.data;
    }

    public SetImageBuildRiskStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SetImageBuildRiskStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetImageBuildRiskStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SetImageBuildRiskStatusResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>273698***</p>
         */
        @NameInMap("Id")
        public Long id;

        public static SetImageBuildRiskStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SetImageBuildRiskStatusResponseBodyData self = new SetImageBuildRiskStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SetImageBuildRiskStatusResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
