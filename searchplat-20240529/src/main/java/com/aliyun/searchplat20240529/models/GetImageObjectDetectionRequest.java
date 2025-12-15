// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240529.models;

import com.aliyun.tea.*;

public class GetImageObjectDetectionRequest extends TeaModel {
    @NameInMap("image")
    public GetImageObjectDetectionRequestImage image;

    @NameInMap("options")
    public java.util.Map<String, ?> options;

    public static GetImageObjectDetectionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetImageObjectDetectionRequest self = new GetImageObjectDetectionRequest();
        return TeaModel.build(map, self);
    }

    public GetImageObjectDetectionRequest setImage(GetImageObjectDetectionRequestImage image) {
        this.image = image;
        return this;
    }
    public GetImageObjectDetectionRequestImage getImage() {
        return this.image;
    }

    public GetImageObjectDetectionRequest setOptions(java.util.Map<String, ?> options) {
        this.options = options;
        return this;
    }
    public java.util.Map<String, ?> getOptions() {
        return this.options;
    }

    public static class GetImageObjectDetectionRequestImage extends TeaModel {
        @NameInMap("content")
        public String content;

        @NameInMap("url")
        public String url;

        public static GetImageObjectDetectionRequestImage build(java.util.Map<String, ?> map) throws Exception {
            GetImageObjectDetectionRequestImage self = new GetImageObjectDetectionRequestImage();
            return TeaModel.build(map, self);
        }

        public GetImageObjectDetectionRequestImage setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetImageObjectDetectionRequestImage setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
