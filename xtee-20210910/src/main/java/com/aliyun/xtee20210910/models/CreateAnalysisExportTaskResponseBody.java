// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CreateAnalysisExportTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("columns")
        public String columns;

        @NameInMap("conditions")
        public String conditions;

        @NameInMap("eventBeginTime")
        public Long eventBeginTime;

        @NameInMap("eventCodes")
        public String eventCodes;

        @NameInMap("eventEndTime")
        public Long eventEndTime;

        @NameInMap("fileFormat")
        public String fileFormat;

        @NameInMap("ossKey")
        public String ossKey;

        @NameInMap("scope")
        public String scope;

        @NameInMap("status")
        public String status;

        @NameInMap("type")
        public String type;

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
