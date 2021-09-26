// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class GetBaseTemplateListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TemplateList")
    public java.util.List<GetBaseTemplateListResponseBodyTemplateList> templateList;

    public static GetBaseTemplateListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBaseTemplateListResponseBody self = new GetBaseTemplateListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBaseTemplateListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBaseTemplateListResponseBody setTemplateList(java.util.List<GetBaseTemplateListResponseBodyTemplateList> templateList) {
        this.templateList = templateList;
        return this;
    }
    public java.util.List<GetBaseTemplateListResponseBodyTemplateList> getTemplateList() {
        return this.templateList;
    }

    public static class GetBaseTemplateListResponseBodyTemplateList extends TeaModel {
        @NameInMap("DbTypeName")
        public String dbTypeName;

        @NameInMap("TemplateContent")
        public String templateContent;

        @NameInMap("SqlTypeName")
        public String sqlTypeName;

        @NameInMap("TemplateId")
        public String templateId;

        @NameInMap("TemplateState")
        public String templateState;

        public static GetBaseTemplateListResponseBodyTemplateList build(java.util.Map<String, ?> map) throws Exception {
            GetBaseTemplateListResponseBodyTemplateList self = new GetBaseTemplateListResponseBodyTemplateList();
            return TeaModel.build(map, self);
        }

        public GetBaseTemplateListResponseBodyTemplateList setDbTypeName(String dbTypeName) {
            this.dbTypeName = dbTypeName;
            return this;
        }
        public String getDbTypeName() {
            return this.dbTypeName;
        }

        public GetBaseTemplateListResponseBodyTemplateList setTemplateContent(String templateContent) {
            this.templateContent = templateContent;
            return this;
        }
        public String getTemplateContent() {
            return this.templateContent;
        }

        public GetBaseTemplateListResponseBodyTemplateList setSqlTypeName(String sqlTypeName) {
            this.sqlTypeName = sqlTypeName;
            return this;
        }
        public String getSqlTypeName() {
            return this.sqlTypeName;
        }

        public GetBaseTemplateListResponseBodyTemplateList setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public GetBaseTemplateListResponseBodyTemplateList setTemplateState(String templateState) {
            this.templateState = templateState;
            return this;
        }
        public String getTemplateState() {
            return this.templateState;
        }

    }

}
