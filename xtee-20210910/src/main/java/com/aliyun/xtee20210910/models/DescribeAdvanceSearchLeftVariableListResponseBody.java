// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeAdvanceSearchLeftVariableListResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>AE7E6105-7DEB-5125-9B24-DCBC139F6CD2</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Return object</p>
     */
    @NameInMap("resultObject")
    public java.util.List<DescribeAdvanceSearchLeftVariableListResponseBodyResultObject> resultObject;

    public static DescribeAdvanceSearchLeftVariableListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAdvanceSearchLeftVariableListResponseBody self = new DescribeAdvanceSearchLeftVariableListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAdvanceSearchLeftVariableListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAdvanceSearchLeftVariableListResponseBody setResultObject(java.util.List<DescribeAdvanceSearchLeftVariableListResponseBodyResultObject> resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public java.util.List<DescribeAdvanceSearchLeftVariableListResponseBodyResultObject> getResultObject() {
        return this.resultObject;
    }

    public static class DescribeAdvanceSearchLeftVariableListResponseBodyResultObject extends TeaModel {
        /**
         * <p>Variable code</p>
         * 
         * <strong>example:</strong>
         * <p>age</p>
         */
        @NameInMap("code")
        public String code;

        /**
         * <p>Description.</p>
         * 
         * <strong>example:</strong>
         * <p>年龄描述</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>Display type and grouping label</p>
         * 
         * <strong>example:</strong>
         * <p>NATIVE</p>
         */
        @NameInMap("displayType")
        public String displayType;

        /**
         * <p>Variable return value type</p>
         * 
         * <strong>example:</strong>
         * <p>STRING</p>
         */
        @NameInMap("fieldRank")
        public Long fieldRank;

        /**
         * <p>Field table sorting</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("fieldType")
        public String fieldType;

        /**
         * <p>Primary key ID</p>
         * 
         * <strong>example:</strong>
         * <p>2453</p>
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
         * <p>Parent node</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("parentName")
        public String parentName;

        /**
         * <p>Data source</p>
         * 
         * <strong>example:</strong>
         * <p>SAF</p>
         */
        @NameInMap("sourceType")
        public String sourceType;

        /**
         * <p>Title.</p>
         * 
         * <strong>example:</strong>
         * <p>年龄</p>
         */
        @NameInMap("title")
        public String title;

        /**
         * <p>Variable type</p>
         * 
         * <strong>example:</strong>
         * <p>NATIVE</p>
         */
        @NameInMap("type")
        public String type;

        public static DescribeAdvanceSearchLeftVariableListResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeAdvanceSearchLeftVariableListResponseBodyResultObject self = new DescribeAdvanceSearchLeftVariableListResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeAdvanceSearchLeftVariableListResponseBodyResultObject setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeAdvanceSearchLeftVariableListResponseBodyResultObject setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeAdvanceSearchLeftVariableListResponseBodyResultObject setDisplayType(String displayType) {
            this.displayType = displayType;
            return this;
        }
        public String getDisplayType() {
            return this.displayType;
        }

        public DescribeAdvanceSearchLeftVariableListResponseBodyResultObject setFieldRank(Long fieldRank) {
            this.fieldRank = fieldRank;
            return this;
        }
        public Long getFieldRank() {
            return this.fieldRank;
        }

        public DescribeAdvanceSearchLeftVariableListResponseBodyResultObject setFieldType(String fieldType) {
            this.fieldType = fieldType;
            return this;
        }
        public String getFieldType() {
            return this.fieldType;
        }

        public DescribeAdvanceSearchLeftVariableListResponseBodyResultObject setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeAdvanceSearchLeftVariableListResponseBodyResultObject setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeAdvanceSearchLeftVariableListResponseBodyResultObject setParentName(String parentName) {
            this.parentName = parentName;
            return this;
        }
        public String getParentName() {
            return this.parentName;
        }

        public DescribeAdvanceSearchLeftVariableListResponseBodyResultObject setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public DescribeAdvanceSearchLeftVariableListResponseBodyResultObject setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public DescribeAdvanceSearchLeftVariableListResponseBodyResultObject setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
