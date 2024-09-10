// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class SetImageSensitiveFileStatusResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public SetImageSensitiveFileStatusResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>20456DD5-5CBF-5015-9173-12CA4246****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static SetImageSensitiveFileStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetImageSensitiveFileStatusResponseBody self = new SetImageSensitiveFileStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public SetImageSensitiveFileStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SetImageSensitiveFileStatusResponseBody setData(SetImageSensitiveFileStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SetImageSensitiveFileStatusResponseBodyData getData() {
        return this.data;
    }

    public SetImageSensitiveFileStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SetImageSensitiveFileStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetImageSensitiveFileStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SetImageSensitiveFileStatusResponseBodyData extends TeaModel {
        /**
         * <p>The primary key ID of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>18551</p>
         */
        @NameInMap("Id")
        public Long id;

        public static SetImageSensitiveFileStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SetImageSensitiveFileStatusResponseBodyData self = new SetImageSensitiveFileStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SetImageSensitiveFileStatusResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
