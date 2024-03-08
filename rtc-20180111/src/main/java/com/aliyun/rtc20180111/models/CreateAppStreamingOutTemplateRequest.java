// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class CreateAppStreamingOutTemplateRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("StreamingOutTemplate")
    public CreateAppStreamingOutTemplateRequestStreamingOutTemplate streamingOutTemplate;

    public static CreateAppStreamingOutTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppStreamingOutTemplateRequest self = new CreateAppStreamingOutTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppStreamingOutTemplateRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateAppStreamingOutTemplateRequest setStreamingOutTemplate(CreateAppStreamingOutTemplateRequestStreamingOutTemplate streamingOutTemplate) {
        this.streamingOutTemplate = streamingOutTemplate;
        return this;
    }
    public CreateAppStreamingOutTemplateRequestStreamingOutTemplate getStreamingOutTemplate() {
        return this.streamingOutTemplate;
    }

    public static class CreateAppStreamingOutTemplateRequestStreamingOutTemplate extends TeaModel {
        @NameInMap("LayoutIds")
        public java.util.List<String> layoutIds;

        @NameInMap("MediaEncode")
        public Integer mediaEncode;

        @NameInMap("Name")
        public String name;

        public static CreateAppStreamingOutTemplateRequestStreamingOutTemplate build(java.util.Map<String, ?> map) throws Exception {
            CreateAppStreamingOutTemplateRequestStreamingOutTemplate self = new CreateAppStreamingOutTemplateRequestStreamingOutTemplate();
            return TeaModel.build(map, self);
        }

        public CreateAppStreamingOutTemplateRequestStreamingOutTemplate setLayoutIds(java.util.List<String> layoutIds) {
            this.layoutIds = layoutIds;
            return this;
        }
        public java.util.List<String> getLayoutIds() {
            return this.layoutIds;
        }

        public CreateAppStreamingOutTemplateRequestStreamingOutTemplate setMediaEncode(Integer mediaEncode) {
            this.mediaEncode = mediaEncode;
            return this;
        }
        public Integer getMediaEncode() {
            return this.mediaEncode;
        }

        public CreateAppStreamingOutTemplateRequestStreamingOutTemplate setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
