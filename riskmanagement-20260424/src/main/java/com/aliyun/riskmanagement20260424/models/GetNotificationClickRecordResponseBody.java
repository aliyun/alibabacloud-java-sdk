// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class GetNotificationClickRecordResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * <ul>
     * <li><strong>200</strong>: Succeeded.</li>
     * <li><strong>Others (400, 500)</strong>: Failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The metadata.</p>
     */
    @NameInMap("Data")
    public GetNotificationClickRecordResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * <blockquote>
     * <p>If the request was successful, a success message is returned. If the request failed, the failure reason is returned.</p>
     * </blockquote>
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
     * <p>99D93ED4-D462-5FC5-8518-9BC1C49C7B6C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     * <ul>
     * <li><strong>true</strong>: The call was successful.         </li>
     * <li><strong>false</strong>: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetNotificationClickRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetNotificationClickRecordResponseBody self = new GetNotificationClickRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public GetNotificationClickRecordResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetNotificationClickRecordResponseBody setData(GetNotificationClickRecordResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetNotificationClickRecordResponseBodyData getData() {
        return this.data;
    }

    public GetNotificationClickRecordResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetNotificationClickRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetNotificationClickRecordResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetNotificationClickRecordResponseBodyData extends TeaModel {
        /**
         * <p>Indicates whether the user clicked cancel.</p>
         * <ul>
         * <li><strong>true</strong>: Canceled.</li>
         * <li><strong>false</strong>: Not canceled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("UserCancel")
        public String userCancel;

        /**
         * <p>Indicates whether the user clicked confirm.</p>
         * <ul>
         * <li><strong>true</strong>: Confirmed.</li>
         * <li><strong>false</strong>: Not confirmed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("UserConfirm")
        public String userConfirm;

        public static GetNotificationClickRecordResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetNotificationClickRecordResponseBodyData self = new GetNotificationClickRecordResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetNotificationClickRecordResponseBodyData setUserCancel(String userCancel) {
            this.userCancel = userCancel;
            return this;
        }
        public String getUserCancel() {
            return this.userCancel;
        }

        public GetNotificationClickRecordResponseBodyData setUserConfirm(String userConfirm) {
            this.userConfirm = userConfirm;
            return this;
        }
        public String getUserConfirm() {
            return this.userConfirm;
        }

    }

}
