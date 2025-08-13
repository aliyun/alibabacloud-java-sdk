// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeVariableBindDetailResponseBody extends TeaModel {
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
    public DescribeVariableBindDetailResponseBodyResultObject resultObject;

    public static DescribeVariableBindDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVariableBindDetailResponseBody self = new DescribeVariableBindDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVariableBindDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVariableBindDetailResponseBody setResultObject(DescribeVariableBindDetailResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public DescribeVariableBindDetailResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class DescribeVariableBindDetailResponseBodyResultObjectParams extends TeaModel {
        /**
         * <p>Event field name</p>
         * 
         * <strong>example:</strong>
         * <p>ip</p>
         */
        @NameInMap("eventFieldName")
        public String eventFieldName;

        /**
         * <p>Whether it is required, default is false</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("required")
        public Boolean required;

        /**
         * <p>Bound variable name</p>
         * 
         * <strong>example:</strong>
         * <p>ip</p>
         */
        @NameInMap("variableName")
        public String variableName;

        public static DescribeVariableBindDetailResponseBodyResultObjectParams build(java.util.Map<String, ?> map) throws Exception {
            DescribeVariableBindDetailResponseBodyResultObjectParams self = new DescribeVariableBindDetailResponseBodyResultObjectParams();
            return TeaModel.build(map, self);
        }

        public DescribeVariableBindDetailResponseBodyResultObjectParams setEventFieldName(String eventFieldName) {
            this.eventFieldName = eventFieldName;
            return this;
        }
        public String getEventFieldName() {
            return this.eventFieldName;
        }

        public DescribeVariableBindDetailResponseBodyResultObjectParams setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

        public DescribeVariableBindDetailResponseBodyResultObjectParams setVariableName(String variableName) {
            this.variableName = variableName;
            return this;
        }
        public String getVariableName() {
            return this.variableName;
        }

    }

    public static class DescribeVariableBindDetailResponseBodyResultObjectRelationRules extends TeaModel {
        /**
         * <p>Policy rule ID</p>
         * 
         * <strong>example:</strong>
         * <p>104566</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>Policy name</p>
         * 
         * <strong>example:</strong>
         * <p>营销风险识别</p>
         */
        @NameInMap("value")
        public String value;

        public static DescribeVariableBindDetailResponseBodyResultObjectRelationRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeVariableBindDetailResponseBodyResultObjectRelationRules self = new DescribeVariableBindDetailResponseBodyResultObjectRelationRules();
            return TeaModel.build(map, self);
        }

        public DescribeVariableBindDetailResponseBodyResultObjectRelationRules setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeVariableBindDetailResponseBodyResultObjectRelationRules setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeVariableBindDetailResponseBodyResultObject extends TeaModel {
        /**
         * <p>Whether modification is allowed, default is false</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("allowModify")
        public Boolean allowModify;

        /**
         * <p>Variable definition ID</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("defineId")
        public Long defineId;

        /**
         * <p>Variable definition title</p>
         * 
         * <strong>example:</strong>
         * <p>IP所在地_城市Code</p>
         */
        @NameInMap("defineTitle")
        public String defineTitle;

        /**
         * <p>Variable description information</p>
         * 
         * <strong>example:</strong>
         * <p>描述</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>Event code</p>
         * 
         * <strong>example:</strong>
         * <p>de_aszbjb7236</p>
         */
        @NameInMap("eventCode")
        public String eventCode;

        /**
         * <p>Variable ID.</p>
         * 
         * <strong>example:</strong>
         * <p>497</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <p>Bound parameters.</p>
         */
        @NameInMap("params")
        public java.util.List<DescribeVariableBindDetailResponseBodyResultObjectParams> params;

        /**
         * <p>List of associated policies</p>
         */
        @NameInMap("relationRules")
        public java.util.List<DescribeVariableBindDetailResponseBodyResultObjectRelationRules> relationRules;

        /**
         * <p>Title.</p>
         * 
         * <strong>example:</strong>
         * <p>变量title</p>
         */
        @NameInMap("title")
        public String title;

        public static DescribeVariableBindDetailResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeVariableBindDetailResponseBodyResultObject self = new DescribeVariableBindDetailResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeVariableBindDetailResponseBodyResultObject setAllowModify(Boolean allowModify) {
            this.allowModify = allowModify;
            return this;
        }
        public Boolean getAllowModify() {
            return this.allowModify;
        }

        public DescribeVariableBindDetailResponseBodyResultObject setDefineId(Long defineId) {
            this.defineId = defineId;
            return this;
        }
        public Long getDefineId() {
            return this.defineId;
        }

        public DescribeVariableBindDetailResponseBodyResultObject setDefineTitle(String defineTitle) {
            this.defineTitle = defineTitle;
            return this;
        }
        public String getDefineTitle() {
            return this.defineTitle;
        }

        public DescribeVariableBindDetailResponseBodyResultObject setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeVariableBindDetailResponseBodyResultObject setEventCode(String eventCode) {
            this.eventCode = eventCode;
            return this;
        }
        public String getEventCode() {
            return this.eventCode;
        }

        public DescribeVariableBindDetailResponseBodyResultObject setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeVariableBindDetailResponseBodyResultObject setParams(java.util.List<DescribeVariableBindDetailResponseBodyResultObjectParams> params) {
            this.params = params;
            return this;
        }
        public java.util.List<DescribeVariableBindDetailResponseBodyResultObjectParams> getParams() {
            return this.params;
        }

        public DescribeVariableBindDetailResponseBodyResultObject setRelationRules(java.util.List<DescribeVariableBindDetailResponseBodyResultObjectRelationRules> relationRules) {
            this.relationRules = relationRules;
            return this;
        }
        public java.util.List<DescribeVariableBindDetailResponseBodyResultObjectRelationRules> getRelationRules() {
            return this.relationRules;
        }

        public DescribeVariableBindDetailResponseBodyResultObject setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
