// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class GetTaskTemplateViewsResponseBody extends TeaModel {
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

    @NameInMap("Views")
    public GetTaskTemplateViewsResponseBodyViews views;

    public static GetTaskTemplateViewsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTaskTemplateViewsResponseBody self = new GetTaskTemplateViewsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTaskTemplateViewsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetTaskTemplateViewsResponseBody setDetails(String details) {
        this.details = details;
        return this;
    }
    public String getDetails() {
        return this.details;
    }

    public GetTaskTemplateViewsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetTaskTemplateViewsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTaskTemplateViewsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTaskTemplateViewsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetTaskTemplateViewsResponseBody setViews(GetTaskTemplateViewsResponseBodyViews views) {
        this.views = views;
        return this;
    }
    public GetTaskTemplateViewsResponseBodyViews getViews() {
        return this.views;
    }

    public static class GetTaskTemplateViewsResponseBodyViews extends TeaModel {
        @NameInMap("ViewPlugins")
        public java.util.List<ViewPlugin> viewPlugins;

        public static GetTaskTemplateViewsResponseBodyViews build(java.util.Map<String, ?> map) throws Exception {
            GetTaskTemplateViewsResponseBodyViews self = new GetTaskTemplateViewsResponseBodyViews();
            return TeaModel.build(map, self);
        }

        public GetTaskTemplateViewsResponseBodyViews setViewPlugins(java.util.List<ViewPlugin> viewPlugins) {
            this.viewPlugins = viewPlugins;
            return this;
        }
        public java.util.List<ViewPlugin> getViewPlugins() {
            return this.viewPlugins;
        }

    }

}
