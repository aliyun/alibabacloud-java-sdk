// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeEventVariableTemplateListResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Return object</p>
     */
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
        /**
         * <p>Variable code</p>
         * 
         * <strong>example:</strong>
         * <p>age</p>
         */
        @NameInMap("code")
        public String code;

        /**
         * <p>Description information.</p>
         * 
         * <strong>example:</strong>
         * <p>描述</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>Variable input type</p>
         * 
         * <strong>example:</strong>
         * <p>STRING</p>
         */
        @NameInMap("fieldType")
        public String fieldType;

        /**
         * <p>Primary key ID</p>
         * 
         * <strong>example:</strong>
         * <p>454</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <p>Variable name</p>
         * 
         * <strong>example:</strong>
         * <p>age</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>Title.</p>
         * 
         * <strong>example:</strong>
         * <p>年龄</p>
         */
        @NameInMap("title")
        public String title;

        /**
         * <p>Variable type.</p>
         * 
         * <strong>example:</strong>
         * <p>NATIVE</p>
         */
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
        /**
         * <p>Template code.</p>
         * 
         * <strong>example:</strong>
         * <p>register</p>
         */
        @NameInMap("templateCode")
        public String templateCode;

        /**
         * <p>Template name.</p>
         * 
         * <strong>example:</strong>
         * <p>注册模版</p>
         */
        @NameInMap("templateName")
        public String templateName;

        /**
         * <p>Variable list.</p>
         */
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
