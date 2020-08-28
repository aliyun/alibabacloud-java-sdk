// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListTemplatesResponse extends TeaModel {
    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("Templates")
    @Validation(required = true)
    public java.util.List<ListTemplatesResponseTemplates> templates;

    public static ListTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTemplatesResponse self = new ListTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public static class ListTemplatesResponseTemplates extends TeaModel {
        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("TemplateId")
        @Validation(required = true)
        public String templateId;

        @NameInMap("TemplateName")
        @Validation(required = true)
        public String templateName;

        @NameInMap("UpdateTime")
        @Validation(required = true)
        public String updateTime;

        public static ListTemplatesResponseTemplates build(java.util.Map<String, ?> map) throws Exception {
            ListTemplatesResponseTemplates self = new ListTemplatesResponseTemplates();
            return TeaModel.build(map, self);
        }

    }

}
