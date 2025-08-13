// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CreateAnalysisExportTaskResponseBody extends TeaModel {
    /**
     * <p>Request ID</p>
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
    public CreateAnalysisExportTaskResponseBodyResultObject resultObject;

    public static CreateAnalysisExportTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAnalysisExportTaskResponseBody self = new CreateAnalysisExportTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAnalysisExportTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAnalysisExportTaskResponseBody setResultObject(CreateAnalysisExportTaskResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public CreateAnalysisExportTaskResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class CreateAnalysisExportTaskResponseBodyResultObject extends TeaModel {
        /**
         * <p>Export list.</p>
         * 
         * <strong>example:</strong>
         * <p>[
         *                 {
         *                     &quot;fieldName&quot;: &quot;requestId&quot;,
         *                     &quot;fieldTitle&quot;: &quot;RequestId&quot;
         *                 },
         *                 {
         *                     &quot;fieldName&quot;: &quot;eventTime&quot;,
         *                     &quot;fieldTitle&quot;: &quot;事件时间&quot;
         *                 },
         *                 {
         *                     &quot;fieldName&quot;: &quot;accountId&quot;,
         *                     &quot;fieldTitle&quot;: &quot;账号&quot;
         *                 },
         *                 {
         *                     &quot;fieldName&quot;: &quot;deviceId&quot;,
         *                     &quot;fieldTitle&quot;: &quot;设备ID&quot;
         *                 },
         *                 {
         *                     &quot;fieldName&quot;: &quot;eventCode&quot;,
         *                     &quot;fieldTitle&quot;: &quot;事件编码&quot;
         *                 },
         *                 {
         *                     &quot;fieldName&quot;: &quot;ip&quot;,
         *                     &quot;fieldTitle&quot;: &quot;IP&quot;
         *                 },
         *                 {
         *                     &quot;fieldName&quot;: &quot;score&quot;,
         *                     &quot;fieldTitle&quot;: &quot;分值&quot;
         *                 },
         *                 {
         *                     &quot;fieldName&quot;: &quot;tags&quot;,
         *                     &quot;fieldTitle&quot;: &quot;标签&quot;
         *                 },
         *                 {
         *                     &quot;fieldName&quot;: &quot;DEtest222&quot;,
         *                     &quot;fieldTitle&quot;: &quot;测试222&quot;
         *                 }
         *             ]</p>
         */
        @NameInMap("columns")
        public String columns;

        /**
         * <p>Export task conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *      &quot;fieldName&quot;: null, 
         *       &quot;fieldValue&quot;: null 
         *       }</p>
         */
        @NameInMap("conditions")
        public String conditions;

        /**
         * <p>Event start time.</p>
         * 
         * <strong>example:</strong>
         * <p>1752076800000</p>
         */
        @NameInMap("eventBeginTime")
        public Long eventBeginTime;

        /**
         * <p>Event code.</p>
         * 
         * <strong>example:</strong>
         * <p>de_ahespg8137</p>
         */
        @NameInMap("eventCodes")
        public String eventCodes;

        /**
         * <p>End time.</p>
         * 
         * <strong>example:</strong>
         * <p>1753891199000</p>
         */
        @NameInMap("eventEndTime")
        public Long eventEndTime;

        /**
         * <p>File format.</p>
         * 
         * <strong>example:</strong>
         * <p>CSV</p>
         */
        @NameInMap("fileFormat")
        public String fileFormat;

        /**
         * <p>OSS-generated key.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxx</p>
         */
        @NameInMap("ossKey")
        public String ossKey;

        /**
         * <p>Export task scope.</p>
         * 
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        @NameInMap("scope")
        public String scope;

        /**
         * <p>Task status.</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>Export task type.</p>
         * 
         * <strong>example:</strong>
         * <p>BASIC</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>User UID</p>
         * 
         * <strong>example:</strong>
         * <p>1519714049632764</p>
         */
        @NameInMap("userId")
        public Long userId;

        public static CreateAnalysisExportTaskResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            CreateAnalysisExportTaskResponseBodyResultObject self = new CreateAnalysisExportTaskResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public CreateAnalysisExportTaskResponseBodyResultObject setColumns(String columns) {
            this.columns = columns;
            return this;
        }
        public String getColumns() {
            return this.columns;
        }

        public CreateAnalysisExportTaskResponseBodyResultObject setConditions(String conditions) {
            this.conditions = conditions;
            return this;
        }
        public String getConditions() {
            return this.conditions;
        }

        public CreateAnalysisExportTaskResponseBodyResultObject setEventBeginTime(Long eventBeginTime) {
            this.eventBeginTime = eventBeginTime;
            return this;
        }
        public Long getEventBeginTime() {
            return this.eventBeginTime;
        }

        public CreateAnalysisExportTaskResponseBodyResultObject setEventCodes(String eventCodes) {
            this.eventCodes = eventCodes;
            return this;
        }
        public String getEventCodes() {
            return this.eventCodes;
        }

        public CreateAnalysisExportTaskResponseBodyResultObject setEventEndTime(Long eventEndTime) {
            this.eventEndTime = eventEndTime;
            return this;
        }
        public Long getEventEndTime() {
            return this.eventEndTime;
        }

        public CreateAnalysisExportTaskResponseBodyResultObject setFileFormat(String fileFormat) {
            this.fileFormat = fileFormat;
            return this;
        }
        public String getFileFormat() {
            return this.fileFormat;
        }

        public CreateAnalysisExportTaskResponseBodyResultObject setOssKey(String ossKey) {
            this.ossKey = ossKey;
            return this;
        }
        public String getOssKey() {
            return this.ossKey;
        }

        public CreateAnalysisExportTaskResponseBodyResultObject setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public CreateAnalysisExportTaskResponseBodyResultObject setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateAnalysisExportTaskResponseBodyResultObject setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateAnalysisExportTaskResponseBodyResultObject setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

    }

}
