// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class UpdateMiniAppBindingResponseBody extends TeaModel {
    /**
     * <p>Request result.</p>
     */
    @NameInMap("Data")
    public UpdateMiniAppBindingResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>6C6B99AC-39EC-5350-874C-204128C905E6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateMiniAppBindingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateMiniAppBindingResponseBody self = new UpdateMiniAppBindingResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateMiniAppBindingResponseBody setData(UpdateMiniAppBindingResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateMiniAppBindingResponseBodyData getData() {
        return this.data;
    }

    public UpdateMiniAppBindingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateMiniAppBindingResponseBodyData extends TeaModel {
        /**
         * <p>Indicates whether the operation succeeded.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static UpdateMiniAppBindingResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateMiniAppBindingResponseBodyData self = new UpdateMiniAppBindingResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateMiniAppBindingResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
