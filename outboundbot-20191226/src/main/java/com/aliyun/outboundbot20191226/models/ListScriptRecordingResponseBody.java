// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ListScriptRecordingResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ScriptRecordings")
    public java.util.List<ListScriptRecordingResponseBodyScriptRecordings> scriptRecordings;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>99</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>2022-07-11T07:51:49.000+0000</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>1654601332000</p>
         */
        @NameInMap("GmtModified")
        public Long gmtModified;

        /**
         * <strong>example:</strong>
         * <p>1654601332000</p>
         */
        @NameInMap("GmtUpload")
        public Long gmtUpload;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("InnerId")
        public String innerId;

        /**
         * <strong>example:</strong>
         * <p>ff0fb845-9f90-46d3-9716-d36b8a1e753a</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("RecordingContent")
        public String recordingContent;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("RecordingDuration")
        public Integer recordingDuration;

        /**
         * <strong>example:</strong>
         * <p>hello.wav</p>
         */
        @NameInMap("RecordingName")
        public String recordingName;

        @NameInMap("RefId")
        public String refId;

        /**
         * <strong>example:</strong>
         * <p>6019b692-fd9e-4adb-8877-cef6a297b234</p>
         */
        @NameInMap("ScriptId")
        public String scriptId;

        /**
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("State")
        public Integer state;

        @NameInMap("StateExtend")
        public String stateExtend;

        /**
         * <strong>example:</strong>
         * <p>393674ed-3b5d-db44-0fda-615d05210178</p>
         */
        @NameInMap("StorageUuid")
        public String storageUuid;

        /**
         * <strong>example:</strong>
         * <p>0a77386e-6402-8d23-4adf-6ec13b3f404d</p>
         */
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

        public ListScriptRecordingResponseBodyScriptRecordings setRefId(String refId) {
            this.refId = refId;
            return this;
        }
        public String getRefId() {
            return this.refId;
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
