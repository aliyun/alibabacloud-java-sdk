// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DeleteAppRecordTemplateRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ac7N****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <strong>example:</strong>
     * <p>53200b81-b761-4c10-842a-a0726d97xxxx</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Template")
    public DeleteAppRecordTemplateRequestTemplate template;

    public static DeleteAppRecordTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppRecordTemplateRequest self = new DeleteAppRecordTemplateRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAppRecordTemplateRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DeleteAppRecordTemplateRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteAppRecordTemplateRequest setTemplate(DeleteAppRecordTemplateRequestTemplate template) {
        this.template = template;
        return this;
    }
    public DeleteAppRecordTemplateRequestTemplate getTemplate() {
        return this.template;
    }

    public static class DeleteAppRecordTemplateRequestTemplate extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2xh6****</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        public static DeleteAppRecordTemplateRequestTemplate build(java.util.Map<String, ?> map) throws Exception {
            DeleteAppRecordTemplateRequestTemplate self = new DeleteAppRecordTemplateRequestTemplate();
            return TeaModel.build(map, self);
        }

        public DeleteAppRecordTemplateRequestTemplate setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

}
