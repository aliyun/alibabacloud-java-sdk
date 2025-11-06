// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class CreateAppViewTemplateRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ac7N****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Template")
    public CreateAppViewTemplateRequestTemplate template;

    public static CreateAppViewTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppViewTemplateRequest self = new CreateAppViewTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppViewTemplateRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateAppViewTemplateRequest setTemplate(CreateAppViewTemplateRequestTemplate template) {
        this.template = template;
        return this;
    }
    public CreateAppViewTemplateRequestTemplate getTemplate() {
        return this.template;
    }

    public static class CreateAppViewTemplateRequestTemplate extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("LayoutIds")
        public java.util.List<String> layoutIds;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MediaEncode")
        public Integer mediaEncode;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>模版</p>
         */
        @NameInMap("Name")
        public String name;

        public static CreateAppViewTemplateRequestTemplate build(java.util.Map<String, ?> map) throws Exception {
            CreateAppViewTemplateRequestTemplate self = new CreateAppViewTemplateRequestTemplate();
            return TeaModel.build(map, self);
        }

        public CreateAppViewTemplateRequestTemplate setLayoutIds(java.util.List<String> layoutIds) {
            this.layoutIds = layoutIds;
            return this;
        }
        public java.util.List<String> getLayoutIds() {
            return this.layoutIds;
        }

        public CreateAppViewTemplateRequestTemplate setMediaEncode(Integer mediaEncode) {
            this.mediaEncode = mediaEncode;
            return this;
        }
        public Integer getMediaEncode() {
            return this.mediaEncode;
        }

        public CreateAppViewTemplateRequestTemplate setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
