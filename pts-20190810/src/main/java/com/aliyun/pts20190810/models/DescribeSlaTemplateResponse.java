// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20190810.models;

import com.aliyun.tea.*;

public class DescribeSlaTemplateResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("HttpStatusCode")
    @Validation(required = true)
    public Integer httpStatusCode;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("Templates")
    @Validation(required = true)
    public java.util.List<DescribeSlaTemplateResponseTemplates> templates;

    public static DescribeSlaTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlaTemplateResponse self = new DescribeSlaTemplateResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeSlaTemplateResponseTemplates extends TeaModel {
        @NameInMap("Id")
        @Validation(required = true)
        public String id;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("Uid")
        @Validation(required = true)
        public String uid;

        @NameInMap("ModifiedTime")
        @Validation(required = true)
        public Long modifiedTime;

        @NameInMap("Classification")
        @Validation(required = true)
        public String classification;

        @NameInMap("BusinessGroup")
        @Validation(required = true)
        public String businessGroup;

        @NameInMap("BusinessChildGroup")
        @Validation(required = true)
        public String businessChildGroup;

        @NameInMap("Rules")
        @Validation(required = true)
        public String rules;

        @NameInMap("Deleted")
        @Validation(required = true)
        public Integer deleted;

        public static DescribeSlaTemplateResponseTemplates build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlaTemplateResponseTemplates self = new DescribeSlaTemplateResponseTemplates();
            return TeaModel.build(map, self);
        }

    }

}
