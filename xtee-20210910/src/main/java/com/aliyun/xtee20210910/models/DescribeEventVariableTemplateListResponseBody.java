// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeEventVariableTemplateListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("resultObject")
    public java.util.List<DescribeEventVariableTemplateListResponseBodyResultObject> resultObject;

    public static DescribeEventVariableTemplateListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventVariableTemplateListResponseBody self = new DescribeEventVariableTemplateListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEventVariableTemplateListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEventVariableTemplateListResponseBody setResultObject(java.util.List<DescribeEventVariableTemplateListResponseBodyResultObject> resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public java.util.List<DescribeEventVariableTemplateListResponseBodyResultObject> getResultObject() {
        return this.resultObject;
    }

    public static class DescribeEventVariableTemplateListResponseBodyResultObjectVariables extends TeaModel {
        @NameInMap("code")
        public String code;

        @NameInMap("description")
        public String description;

        @NameInMap("fieldType")
        public String fieldType;

        @NameInMap("id")
        public Long id;

        @NameInMap("name")
        public String name;

        @NameInMap("title")
        public String title;

        @NameInMap("type")
        public String type;

        public static DescribeEventVariableTemplateListResponseBodyResultObjectVariables build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventVariableTemplateListResponseBodyResultObjectVariables self = new DescribeEventVariableTemplateListResponseBodyResultObjectVariables();
            return TeaModel.build(map, self);
        }

        public DescribeEventVariableTemplateListResponseBodyResultObjectVariables setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeEventVariableTemplateListResponseBodyResultObjectVariables setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeEventVariableTemplateListResponseBodyResultObjectVariables setFieldType(String fieldType) {
            this.fieldType = fieldType;
            return this;
        }
        public String getFieldType() {
            return this.fieldType;
        }

        public DescribeEventVariableTemplateListResponseBodyResultObjectVariables setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeEventVariableTemplateListResponseBodyResultObjectVariables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeEventVariableTemplateListResponseBodyResultObjectVariables setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public DescribeEventVariableTemplateListResponseBodyResultObjectVariables setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeEventVariableTemplateListResponseBodyResultObject extends TeaModel {
        @NameInMap("templateCode")
        public String templateCode;

        @NameInMap("templateName")
        public String templateName;

        @NameInMap("variables")
        public java.util.List<DescribeEventVariableTemplateListResponseBodyResultObjectVariables> variables;

        public static DescribeEventVariableTemplateListResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventVariableTemplateListResponseBodyResultObject self = new DescribeEventVariableTemplateListResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeEventVariableTemplateListResponseBodyResultObject setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

        public DescribeEventVariableTemplateListResponseBodyResultObject setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public DescribeEventVariableTemplateListResponseBodyResultObject setVariables(java.util.List<DescribeEventVariableTemplateListResponseBodyResultObjectVariables> variables) {
            this.variables = variables;
            return this;
        }
        public java.util.List<DescribeEventVariableTemplateListResponseBodyResultObjectVariables> getVariables() {
            return this.variables;
        }

    }

}
