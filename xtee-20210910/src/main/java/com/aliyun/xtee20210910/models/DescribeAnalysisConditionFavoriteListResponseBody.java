// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeAnalysisConditionFavoriteListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("condition")
        public String condition;

        @NameInMap("eventBeginTime")
        public Long eventBeginTime;

        @NameInMap("eventCodes")
        public String eventCodes;

        @NameInMap("eventEndTime")
        public Long eventEndTime;

        @NameInMap("fieldName")
        public String fieldName;

        @NameInMap("fieldValue")
        public String fieldValue;

        @NameInMap("id")
        public Long id;

        @NameInMap("name")
        public String name;

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
