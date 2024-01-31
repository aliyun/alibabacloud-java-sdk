// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class ModifyAppStreamingOutTemplateRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

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
        @NameInMap("EnableVad")
        public Boolean enableVad;

        @NameInMap("LayoutIds")
        public java.util.List<String> layoutIds;

        @NameInMap("MediaEncode")
        public Integer mediaEncode;

        @NameInMap("Name")
        public String name;

        @NameInMap("TemplateId")
        public String templateId;

        public static ModifyAppStreamingOutTemplateRequestStreamingOutTemplate build(java.util.Map<String, ?> map) throws Exception {
            ModifyAppStreamingOutTemplateRequestStreamingOutTemplate self = new ModifyAppStreamingOutTemplateRequestStreamingOutTemplate();
            return TeaModel.build(map, self);
        }

        public ModifyAppStreamingOutTemplateRequestStreamingOutTemplate setEnableVad(Boolean enableVad) {
            this.enableVad = enableVad;
            return this;
        }
        public Boolean getEnableVad() {
            return this.enableVad;
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
