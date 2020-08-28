// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetAITemplateResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TemplateInfo")
    @Validation(required = true)
    public GetAITemplateResponseTemplateInfo templateInfo;

    public static GetAITemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAITemplateResponse self = new GetAITemplateResponse();
        return TeaModel.build(map, self);
    }

    public static class GetAITemplateResponseTemplateInfo extends TeaModel {
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

        public static GetAITemplateResponseTemplateInfo build(java.util.Map<String, ?> map) throws Exception {
            GetAITemplateResponseTemplateInfo self = new GetAITemplateResponseTemplateInfo();
            return TeaModel.build(map, self);
        }

    }

}
