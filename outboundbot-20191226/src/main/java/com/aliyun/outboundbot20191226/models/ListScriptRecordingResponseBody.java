// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ListScriptRecordingResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ScriptRecordings")
    public java.util.List<ListScriptRecordingResponseBodyScriptRecordings> scriptRecordings;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListScriptRecordingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListScriptRecordingResponseBody self = new ListScriptRecordingResponseBody();
        return TeaModel.build(map, self);
    }

    public ListScriptRecordingResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListScriptRecordingResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListScriptRecordingResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListScriptRecordingResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListScriptRecordingResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListScriptRecordingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListScriptRecordingResponseBody setScriptRecordings(java.util.List<ListScriptRecordingResponseBodyScriptRecordings> scriptRecordings) {
        this.scriptRecordings = scriptRecordings;
        return this;
    }
    public java.util.List<ListScriptRecordingResponseBodyScriptRecordings> getScriptRecordings() {
        return this.scriptRecordings;
    }

    public ListScriptRecordingResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListScriptRecordingResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListScriptRecordingResponseBodyScriptRecordings extends TeaModel {
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("GmtUpload")
        public Long gmtUpload;

        @NameInMap("InnerId")
        public String innerId;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("RecordingContent")
        public String recordingContent;

        @NameInMap("RecordingDuration")
        public Integer recordingDuration;

        @NameInMap("RecordingName")
        public String recordingName;

        @NameInMap("ScriptId")
        public String scriptId;

        @NameInMap("State")
        public Integer state;

        @NameInMap("StateExtend")
        public String stateExtend;

        @NameInMap("StorageUuid")
        public String storageUuid;

        @NameInMap("Uuid")
        public String uuid;

        public static ListScriptRecordingResponseBodyScriptRecordings build(java.util.Map<String, ?> map) throws Exception {
            ListScriptRecordingResponseBodyScriptRecordings self = new ListScriptRecordingResponseBodyScriptRecordings();
            return TeaModel.build(map, self);
        }

        public ListScriptRecordingResponseBodyScriptRecordings setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListScriptRecordingResponseBodyScriptRecordings setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListScriptRecordingResponseBodyScriptRecordings setGmtUpload(Long gmtUpload) {
            this.gmtUpload = gmtUpload;
            return this;
        }
        public Long getGmtUpload() {
            return this.gmtUpload;
        }

        public ListScriptRecordingResponseBodyScriptRecordings setInnerId(String innerId) {
            this.innerId = innerId;
            return this;
        }
        public String getInnerId() {
            return this.innerId;
        }

        public ListScriptRecordingResponseBodyScriptRecordings setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListScriptRecordingResponseBodyScriptRecordings setRecordingContent(String recordingContent) {
            this.recordingContent = recordingContent;
            return this;
        }
        public String getRecordingContent() {
            return this.recordingContent;
        }

        public ListScriptRecordingResponseBodyScriptRecordings setRecordingDuration(Integer recordingDuration) {
            this.recordingDuration = recordingDuration;
            return this;
        }
        public Integer getRecordingDuration() {
            return this.recordingDuration;
        }

        public ListScriptRecordingResponseBodyScriptRecordings setRecordingName(String recordingName) {
            this.recordingName = recordingName;
            return this;
        }
        public String getRecordingName() {
            return this.recordingName;
        }

        public ListScriptRecordingResponseBodyScriptRecordings setScriptId(String scriptId) {
            this.scriptId = scriptId;
            return this;
        }
        public String getScriptId() {
            return this.scriptId;
        }

        public ListScriptRecordingResponseBodyScriptRecordings setState(Integer state) {
            this.state = state;
            return this;
        }
        public Integer getState() {
            return this.state;
        }

        public ListScriptRecordingResponseBodyScriptRecordings setStateExtend(String stateExtend) {
            this.stateExtend = stateExtend;
            return this;
        }
        public String getStateExtend() {
            return this.stateExtend;
        }

        public ListScriptRecordingResponseBodyScriptRecordings setStorageUuid(String storageUuid) {
            this.storageUuid = storageUuid;
            return this;
        }
        public String getStorageUuid() {
            return this.storageUuid;
        }

        public ListScriptRecordingResponseBodyScriptRecordings setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
