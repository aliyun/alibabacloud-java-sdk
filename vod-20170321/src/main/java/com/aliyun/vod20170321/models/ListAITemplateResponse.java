// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListAITemplateResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TemplateInfoList")
    @Validation(required = true)
    public java.util.List<ListAITemplateResponseTemplateInfoList> templateInfoList;

    public static ListAITemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAITemplateResponse self = new ListAITemplateResponse();
        return TeaModel.build(map, self);
    }

    public static class ListAITemplateResponseTemplateInfoList extends TeaModel {
        @NameInMap("TemplateId")
        @Validation(required = true)
        public String templateId;

        @NameInMap("TemplateType")
        @Validation(required = true)
        public String templateType;

        @NameInMap("TemplateName")
        @Validation(required = true)
        public String templateName;

        @NameInMap("TemplateConfig")
        @Validation(required = true)
        public String templateConfig;

        @NameInMap("Source")
        @Validation(required = true)
        public String source;

        @NameInMap("IsDefault")
        @Validation(required = true)
        public String isDefault;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("ModifyTime")
        @Validation(required = true)
        public String modifyTime;

        public static ListAITemplateResponseTemplateInfoList build(java.util.Map<String, ?> map) throws Exception {
            ListAITemplateResponseTemplateInfoList self = new ListAITemplateResponseTemplateInfoList();
            return TeaModel.build(map, self);
        }

    }

}
