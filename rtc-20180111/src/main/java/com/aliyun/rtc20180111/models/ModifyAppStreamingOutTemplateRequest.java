// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class ModifyAppStreamingOutTemplateRequest extends TeaModel {
    /**
     * <p>Application ID. You can create and query it in the console. Only a single ID is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>wv7N****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>Template.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("StreamingOutTemplate")
    public ModifyAppStreamingOutTemplateRequestStreamingOutTemplate streamingOutTemplate;

    public static ModifyAppStreamingOutTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAppStreamingOutTemplateRequest self = new ModifyAppStreamingOutTemplateRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAppStreamingOutTemplateRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ModifyAppStreamingOutTemplateRequest setStreamingOutTemplate(ModifyAppStreamingOutTemplateRequestStreamingOutTemplate streamingOutTemplate) {
        this.streamingOutTemplate = streamingOutTemplate;
        return this;
    }
    public ModifyAppStreamingOutTemplateRequestStreamingOutTemplate getStreamingOutTemplate() {
        return this.streamingOutTemplate;
    }

    public static class ModifyAppStreamingOutTemplateRequestStreamingOutTemplate extends TeaModel {
        /**
         * <p>List of layout IDs. A maximum of 16 IDs are allowed.</p>
         * <p>Note: The data sources corresponding to the layouts in the list must not have the same quantity.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("LayoutIds")
        public java.util.List<String> layoutIds;

        /**
         * <p>Encoding options.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MediaEncode")
        public Integer mediaEncode;

        /**
         * <p>Template Name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>模板</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Template ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ac7N****</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        public static ModifyAppStreamingOutTemplateRequestStreamingOutTemplate build(java.util.Map<String, ?> map) throws Exception {
            ModifyAppStreamingOutTemplateRequestStreamingOutTemplate self = new ModifyAppStreamingOutTemplateRequestStreamingOutTemplate();
            return TeaModel.build(map, self);
        }

        public ModifyAppStreamingOutTemplateRequestStreamingOutTemplate setLayoutIds(java.util.List<String> layoutIds) {
            this.layoutIds = layoutIds;
            return this;
        }
        public java.util.List<String> getLayoutIds() {
            return this.layoutIds;
        }

        public ModifyAppStreamingOutTemplateRequestStreamingOutTemplate setMediaEncode(Integer mediaEncode) {
            this.mediaEncode = mediaEncode;
            return this;
        }
        public Integer getMediaEncode() {
            return this.mediaEncode;
        }

        public ModifyAppStreamingOutTemplateRequestStreamingOutTemplate setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ModifyAppStreamingOutTemplateRequestStreamingOutTemplate setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

}
