// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetDefaultAITemplateResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TemplateInfo")
    @Validation(required = true)
    public GetDefaultAITemplateResponseTemplateInfo templateInfo;

    public static GetDefaultAITemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDefaultAITemplateResponse self = new GetDefaultAITemplateResponse();
        return TeaModel.build(map, self);
    }

    public static class GetDefaultAITemplateResponseTemplateInfo extends TeaModel {
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

        public static GetDefaultAITemplateResponseTemplateInfo build(java.util.Map<String, ?> map) throws Exception {
            GetDefaultAITemplateResponseTemplateInfo self = new GetDefaultAITemplateResponseTemplateInfo();
            return TeaModel.build(map, self);
        }

    }

}
