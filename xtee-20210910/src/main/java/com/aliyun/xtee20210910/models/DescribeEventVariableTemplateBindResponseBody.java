// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeEventVariableTemplateBindResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("resultObject")
    public DescribeEventVariableTemplateBindResponseBodyResultObject resultObject;

    public static DescribeEventVariableTemplateBindResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventVariableTemplateBindResponseBody self = new DescribeEventVariableTemplateBindResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEventVariableTemplateBindResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEventVariableTemplateBindResponseBody setResultObject(DescribeEventVariableTemplateBindResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public DescribeEventVariableTemplateBindResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class DescribeEventVariableTemplateBindResponseBodyResultObjectChargeVariables extends TeaModel {
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

        public static DescribeEventVariableTemplateBindResponseBodyResultObjectChargeVariables build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventVariableTemplateBindResponseBodyResultObjectChargeVariables self = new DescribeEventVariableTemplateBindResponseBodyResultObjectChargeVariables();
            return TeaModel.build(map, self);
        }

        public DescribeEventVariableTemplateBindResponseBodyResultObjectChargeVariables setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeEventVariableTemplateBindResponseBodyResultObjectChargeVariables setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeEventVariableTemplateBindResponseBodyResultObjectChargeVariables setFieldType(String fieldType) {
            this.fieldType = fieldType;
            return this;
        }
        public String getFieldType() {
            return this.fieldType;
        }

        public DescribeEventVariableTemplateBindResponseBodyResultObjectChargeVariables setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeEventVariableTemplateBindResponseBodyResultObjectChargeVariables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeEventVariableTemplateBindResponseBodyResultObjectChargeVariables setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public DescribeEventVariableTemplateBindResponseBodyResultObjectChargeVariables setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeEventVariableTemplateBindResponseBodyResultObjectFreeVariables extends TeaModel {
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

        public static DescribeEventVariableTemplateBindResponseBodyResultObjectFreeVariables build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventVariableTemplateBindResponseBodyResultObjectFreeVariables self = new DescribeEventVariableTemplateBindResponseBodyResultObjectFreeVariables();
            return TeaModel.build(map, self);
        }

        public DescribeEventVariableTemplateBindResponseBodyResultObjectFreeVariables setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeEventVariableTemplateBindResponseBodyResultObjectFreeVariables setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeEventVariableTemplateBindResponseBodyResultObjectFreeVariables setFieldType(String fieldType) {
            this.fieldType = fieldType;
            return this;
        }
        public String getFieldType() {
            return this.fieldType;
        }

        public DescribeEventVariableTemplateBindResponseBodyResultObjectFreeVariables setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeEventVariableTemplateBindResponseBodyResultObjectFreeVariables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeEventVariableTemplateBindResponseBodyResultObjectFreeVariables setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public DescribeEventVariableTemplateBindResponseBodyResultObjectFreeVariables setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeEventVariableTemplateBindResponseBodyResultObject extends TeaModel {
        @NameInMap("chargeVariables")
        public java.util.List<DescribeEventVariableTemplateBindResponseBodyResultObjectChargeVariables> chargeVariables;

        @NameInMap("freeVariables")
        public java.util.List<DescribeEventVariableTemplateBindResponseBodyResultObjectFreeVariables> freeVariables;

        @NameInMap("templateCode")
        public String templateCode;

        @NameInMap("totalCount")
        public String totalCount;

        public static DescribeEventVariableTemplateBindResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventVariableTemplateBindResponseBodyResultObject self = new DescribeEventVariableTemplateBindResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeEventVariableTemplateBindResponseBodyResultObject setChargeVariables(java.util.List<DescribeEventVariableTemplateBindResponseBodyResultObjectChargeVariables> chargeVariables) {
            this.chargeVariables = chargeVariables;
            return this;
        }
        public java.util.List<DescribeEventVariableTemplateBindResponseBodyResultObjectChargeVariables> getChargeVariables() {
            return this.chargeVariables;
        }

        public DescribeEventVariableTemplateBindResponseBodyResultObject setFreeVariables(java.util.List<DescribeEventVariableTemplateBindResponseBodyResultObjectFreeVariables> freeVariables) {
            this.freeVariables = freeVariables;
            return this;
        }
        public java.util.List<DescribeEventVariableTemplateBindResponseBodyResultObjectFreeVariables> getFreeVariables() {
            return this.freeVariables;
        }

        public DescribeEventVariableTemplateBindResponseBodyResultObject setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

        public DescribeEventVariableTemplateBindResponseBodyResultObject setTotalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public String getTotalCount() {
            return this.totalCount;
        }

    }

}
