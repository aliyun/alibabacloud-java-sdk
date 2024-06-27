// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeGroupConditionListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("resultObject")
    public java.util.List<DescribeGroupConditionListResponseBodyResultObject> resultObject;

    public static DescribeGroupConditionListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGroupConditionListResponseBody self = new DescribeGroupConditionListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGroupConditionListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGroupConditionListResponseBody setResultObject(java.util.List<DescribeGroupConditionListResponseBodyResultObject> resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public java.util.List<DescribeGroupConditionListResponseBodyResultObject> getResultObject() {
        return this.resultObject;
    }

    public static class DescribeGroupConditionListResponseBodyResultObject extends TeaModel {
        @NameInMap("fieldKey")
        public String fieldKey;

        @NameInMap("fieldValue")
        public String fieldValue;

        public static DescribeGroupConditionListResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeGroupConditionListResponseBodyResultObject self = new DescribeGroupConditionListResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeGroupConditionListResponseBodyResultObject setFieldKey(String fieldKey) {
            this.fieldKey = fieldKey;
            return this;
        }
        public String getFieldKey() {
            return this.fieldKey;
        }

        public DescribeGroupConditionListResponseBodyResultObject setFieldValue(String fieldValue) {
            this.fieldValue = fieldValue;
            return this;
        }
        public String getFieldValue() {
            return this.fieldValue;
        }

    }

}
