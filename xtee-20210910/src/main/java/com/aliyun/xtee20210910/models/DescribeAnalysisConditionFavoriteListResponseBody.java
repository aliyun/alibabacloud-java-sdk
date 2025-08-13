// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeAnalysisConditionFavoriteListResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Returned object</p>
     */
    @NameInMap("resultObject")
    public java.util.List<DescribeAnalysisConditionFavoriteListResponseBodyResultObject> resultObject;

    public static DescribeAnalysisConditionFavoriteListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAnalysisConditionFavoriteListResponseBody self = new DescribeAnalysisConditionFavoriteListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAnalysisConditionFavoriteListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAnalysisConditionFavoriteListResponseBody setResultObject(java.util.List<DescribeAnalysisConditionFavoriteListResponseBodyResultObject> resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public java.util.List<DescribeAnalysisConditionFavoriteListResponseBodyResultObject> getResultObject() {
        return this.resultObject;
    }

    public static class DescribeAnalysisConditionFavoriteListResponseBodyResultObject extends TeaModel {
        /**
         * <p>Condition value.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;currentId&quot;:1,&quot;deepCount&quot;:0,&quot;list&quot;:[{&quot;currentId&quot;:2,&quot;deepCount&quot;:1,&quot;left&quot;:{&quot;code&quot;:&quot;accountId&quot;,&quot;fieldType&quot;:&quot;STRING&quot;,&quot;functionName&quot;:&quot;&quot;,&quot;hasRightVariable&quot;:false,&quot;name&quot;:&quot;accountId&quot;},&quot;operatorCode&quot;:&quot;isNotEmptyWrapper&quot;,&quot;parentId&quot;:1,&quot;right&quot;:{&quot;code&quot;:&quot;\&quot;A\nB\nC\&quot;&quot;,&quot;functionName&quot;:&quot;&quot;,&quot;name&quot;:&quot;&quot;,&quot;rightVariableType&quot;:&quot;constant&quot;}}],&quot;parentId&quot;:0,&quot;relationship&quot;:&quot;and&quot;}</p>
         */
        @NameInMap("condition")
        public String condition;

        /**
         * <p>Event start timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1752076800000</p>
         */
        @NameInMap("eventBeginTime")
        public Long eventBeginTime;

        /**
         * <p>Event codes.</p>
         * 
         * <strong>example:</strong>
         * <p>de_ahespg8137</p>
         */
        @NameInMap("eventCodes")
        public String eventCodes;

        /**
         * <p>Event end time.</p>
         * 
         * <strong>example:</strong>
         * <p>1753891199000</p>
         */
        @NameInMap("eventEndTime")
        public Long eventEndTime;

        /**
         * <p>Field name.</p>
         * 
         * <strong>example:</strong>
         * <p>age</p>
         */
        @NameInMap("fieldName")
        public String fieldName;

        /**
         * <p>Field value.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("fieldValue")
        public String fieldValue;

        /**
         * <p>Primary key ID</p>
         * 
         * <strong>example:</strong>
         * <p>497</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <p>Condition name</p>
         * 
         * <strong>example:</strong>
         * <p>查询条件1</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>Type, BASIC: Basic query, ADVANCE: Advanced query, BATCH: Batch query</p>
         * 
         * <strong>example:</strong>
         * <p>BASIC</p>
         */
        @NameInMap("type")
        public String type;

        public static DescribeAnalysisConditionFavoriteListResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeAnalysisConditionFavoriteListResponseBodyResultObject self = new DescribeAnalysisConditionFavoriteListResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeAnalysisConditionFavoriteListResponseBodyResultObject setCondition(String condition) {
            this.condition = condition;
            return this;
        }
        public String getCondition() {
            return this.condition;
        }

        public DescribeAnalysisConditionFavoriteListResponseBodyResultObject setEventBeginTime(Long eventBeginTime) {
            this.eventBeginTime = eventBeginTime;
            return this;
        }
        public Long getEventBeginTime() {
            return this.eventBeginTime;
        }

        public DescribeAnalysisConditionFavoriteListResponseBodyResultObject setEventCodes(String eventCodes) {
            this.eventCodes = eventCodes;
            return this;
        }
        public String getEventCodes() {
            return this.eventCodes;
        }

        public DescribeAnalysisConditionFavoriteListResponseBodyResultObject setEventEndTime(Long eventEndTime) {
            this.eventEndTime = eventEndTime;
            return this;
        }
        public Long getEventEndTime() {
            return this.eventEndTime;
        }

        public DescribeAnalysisConditionFavoriteListResponseBodyResultObject setFieldName(String fieldName) {
            this.fieldName = fieldName;
            return this;
        }
        public String getFieldName() {
            return this.fieldName;
        }

        public DescribeAnalysisConditionFavoriteListResponseBodyResultObject setFieldValue(String fieldValue) {
            this.fieldValue = fieldValue;
            return this;
        }
        public String getFieldValue() {
            return this.fieldValue;
        }

        public DescribeAnalysisConditionFavoriteListResponseBodyResultObject setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeAnalysisConditionFavoriteListResponseBodyResultObject setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeAnalysisConditionFavoriteListResponseBodyResultObject setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
