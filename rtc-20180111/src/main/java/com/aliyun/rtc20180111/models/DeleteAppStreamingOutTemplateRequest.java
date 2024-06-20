// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DeleteAppStreamingOutTemplateRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>wv7N****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("StreamingOutTemplate")
    public DeleteAppStreamingOutTemplateRequestStreamingOutTemplate streamingOutTemplate;

    public static DeleteAppStreamingOutTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppStreamingOutTemplateRequest self = new DeleteAppStreamingOutTemplateRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAppStreamingOutTemplateRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DeleteAppStreamingOutTemplateRequest setStreamingOutTemplate(DeleteAppStreamingOutTemplateRequestStreamingOutTemplate streamingOutTemplate) {
        this.streamingOutTemplate = streamingOutTemplate;
        return this;
    }
    public DeleteAppStreamingOutTemplateRequestStreamingOutTemplate getStreamingOutTemplate() {
        return this.streamingOutTemplate;
    }

    public static class DeleteAppStreamingOutTemplateRequestStreamingOutTemplate extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xd4c****</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        public static DeleteAppStreamingOutTemplateRequestStreamingOutTemplate build(java.util.Map<String, ?> map) throws Exception {
            DeleteAppStreamingOutTemplateRequestStreamingOutTemplate self = new DeleteAppStreamingOutTemplateRequestStreamingOutTemplate();
            return TeaModel.build(map, self);
        }

        public DeleteAppStreamingOutTemplateRequestStreamingOutTemplate setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

}
