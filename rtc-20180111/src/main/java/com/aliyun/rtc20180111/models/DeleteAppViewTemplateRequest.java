// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DeleteAppViewTemplateRequest extends TeaModel {
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
    @NameInMap("Template")
    public DeleteAppViewTemplateRequestTemplate template;

    public static DeleteAppViewTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppViewTemplateRequest self = new DeleteAppViewTemplateRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAppViewTemplateRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DeleteAppViewTemplateRequest setTemplate(DeleteAppViewTemplateRequestTemplate template) {
        this.template = template;
        return this;
    }
    public DeleteAppViewTemplateRequestTemplate getTemplate() {
        return this.template;
    }

    public static class DeleteAppViewTemplateRequestTemplate extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xd4c****</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        public static DeleteAppViewTemplateRequestTemplate build(java.util.Map<String, ?> map) throws Exception {
            DeleteAppViewTemplateRequestTemplate self = new DeleteAppViewTemplateRequestTemplate();
            return TeaModel.build(map, self);
        }

        public DeleteAppViewTemplateRequestTemplate setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

}
