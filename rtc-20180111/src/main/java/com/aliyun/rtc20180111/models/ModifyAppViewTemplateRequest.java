// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class ModifyAppViewTemplateRequest extends TeaModel {
    /**
     * <p>Application ID. Create and view it in the console. Only one ID is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>wv7N****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The template.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Template")
    public ModifyAppViewTemplateRequestTemplate template;

    public static ModifyAppViewTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAppViewTemplateRequest self = new ModifyAppViewTemplateRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAppViewTemplateRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ModifyAppViewTemplateRequest setTemplate(ModifyAppViewTemplateRequestTemplate template) {
        this.template = template;
        return this;
    }
    public ModifyAppViewTemplateRequestTemplate getTemplate() {
        return this.template;
    }

    public static class ModifyAppViewTemplateRequestTemplate extends TeaModel {
        /**
         * <p>List of layout IDs. Maximum of 16 IDs.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("LayoutIds")
        public java.util.List<String> layoutIds;

        /**
         * <p>Encoding option.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MediaEncode")
        public Integer mediaEncode;

        /**
         * <p>Template name.</p>
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

        public static ModifyAppViewTemplateRequestTemplate build(java.util.Map<String, ?> map) throws Exception {
            ModifyAppViewTemplateRequestTemplate self = new ModifyAppViewTemplateRequestTemplate();
            return TeaModel.build(map, self);
        }

        public ModifyAppViewTemplateRequestTemplate setLayoutIds(java.util.List<String> layoutIds) {
            this.layoutIds = layoutIds;
            return this;
        }
        public java.util.List<String> getLayoutIds() {
            return this.layoutIds;
        }

        public ModifyAppViewTemplateRequestTemplate setMediaEncode(Integer mediaEncode) {
            this.mediaEncode = mediaEncode;
            return this;
        }
        public Integer getMediaEncode() {
            return this.mediaEncode;
        }

        public ModifyAppViewTemplateRequestTemplate setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ModifyAppViewTemplateRequestTemplate setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

}
