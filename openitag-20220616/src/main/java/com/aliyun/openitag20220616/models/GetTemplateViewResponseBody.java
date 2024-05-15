// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class GetTemplateViewResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Details")
    public String details;

    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ViewConfigs")
    public GetTemplateViewResponseBodyViewConfigs viewConfigs;

    public static GetTemplateViewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTemplateViewResponseBody self = new GetTemplateViewResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTemplateViewResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetTemplateViewResponseBody setDetails(String details) {
        this.details = details;
        return this;
    }
    public String getDetails() {
        return this.details;
    }

    public GetTemplateViewResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetTemplateViewResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTemplateViewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTemplateViewResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetTemplateViewResponseBody setViewConfigs(GetTemplateViewResponseBodyViewConfigs viewConfigs) {
        this.viewConfigs = viewConfigs;
        return this;
    }
    public GetTemplateViewResponseBodyViewConfigs getViewConfigs() {
        return this.viewConfigs;
    }

    public static class GetTemplateViewResponseBodyViewConfigs extends TeaModel {
        @NameInMap("ViewPlugins")
        public java.util.List<ViewPlugin> viewPlugins;

        public static GetTemplateViewResponseBodyViewConfigs build(java.util.Map<String, ?> map) throws Exception {
            GetTemplateViewResponseBodyViewConfigs self = new GetTemplateViewResponseBodyViewConfigs();
            return TeaModel.build(map, self);
        }

        public GetTemplateViewResponseBodyViewConfigs setViewPlugins(java.util.List<ViewPlugin> viewPlugins) {
            this.viewPlugins = viewPlugins;
            return this;
        }
        public java.util.List<ViewPlugin> getViewPlugins() {
            return this.viewPlugins;
        }

    }

}
