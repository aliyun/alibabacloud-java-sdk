// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeAnalysisColumnListResponseBody extends TeaModel {
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
    public java.util.List<DescribeAnalysisColumnListResponseBodyResultObject> resultObject;

    public static DescribeAnalysisColumnListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAnalysisColumnListResponseBody self = new DescribeAnalysisColumnListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAnalysisColumnListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAnalysisColumnListResponseBody setResultObject(java.util.List<DescribeAnalysisColumnListResponseBodyResultObject> resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public java.util.List<DescribeAnalysisColumnListResponseBodyResultObject> getResultObject() {
        return this.resultObject;
    }

    public static class DescribeAnalysisColumnListResponseBodyResultObject extends TeaModel {
        /**
         * <p>Event code</p>
         * 
         * <strong>example:</strong>
         * <p>de_aszbjb7236</p>
         */
        @NameInMap("eventCode")
        public String eventCode;

        /**
         * <p>Event name.</p>
         * 
         * <strong>example:</strong>
         * <p>注册风险</p>
         */
        @NameInMap("eventName")
        public String eventName;

        /**
         * <p>Whether it is a default column.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("isDefault")
        public Boolean isDefault;

        /**
         * <p>Variable name.</p>
         * 
         * <strong>example:</strong>
         * <p>age</p>
         */
        @NameInMap("variableName")
        public String variableName;

        /**
         * <p>Variable title.</p>
         * 
         * <strong>example:</strong>
         * <p>年龄</p>
         */
        @NameInMap("variableTitle")
        public String variableTitle;

        /**
         * <p>Variable type.</p>
         * 
         * <strong>example:</strong>
         * <p>NATIVE</p>
         */
        @NameInMap("variableType")
        public String variableType;

        public static DescribeAnalysisColumnListResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeAnalysisColumnListResponseBodyResultObject self = new DescribeAnalysisColumnListResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeAnalysisColumnListResponseBodyResultObject setEventCode(String eventCode) {
            this.eventCode = eventCode;
            return this;
        }
        public String getEventCode() {
            return this.eventCode;
        }

        public DescribeAnalysisColumnListResponseBodyResultObject setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

        public DescribeAnalysisColumnListResponseBodyResultObject setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public DescribeAnalysisColumnListResponseBodyResultObject setVariableName(String variableName) {
            this.variableName = variableName;
            return this;
        }
        public String getVariableName() {
            return this.variableName;
        }

        public DescribeAnalysisColumnListResponseBodyResultObject setVariableTitle(String variableTitle) {
            this.variableTitle = variableTitle;
            return this;
        }
        public String getVariableTitle() {
            return this.variableTitle;
        }

        public DescribeAnalysisColumnListResponseBodyResultObject setVariableType(String variableType) {
            this.variableType = variableType;
            return this;
        }
        public String getVariableType() {
            return this.variableType;
        }

    }

}
