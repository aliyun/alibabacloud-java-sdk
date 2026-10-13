// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ListVoiceCloneResponseBody extends TeaModel {
    /**
     * <p>The API status code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public ListVoiceCloneResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The message returned by the API.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7A573837-3AD3-54CF-930A-07A3287042C2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListVoiceCloneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVoiceCloneResponseBody self = new ListVoiceCloneResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVoiceCloneResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListVoiceCloneResponseBody setData(ListVoiceCloneResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListVoiceCloneResponseBodyData getData() {
        return this.data;
    }

    public ListVoiceCloneResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListVoiceCloneResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListVoiceCloneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListVoiceCloneResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListVoiceCloneResponseBodyDataVoiceClones extends TeaModel {
        /**
         * <p>The Alibaba Cloud account ID of the creator of the voice.</p>
         * 
         * <strong>example:</strong>
         * <p>1353945678901234</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <p>The type of the text-to-speech (TTS) engine used by the voice.</p>
         * 
         * <strong>example:</strong>
         * <p>bailian</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <p>The creation time. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1791891200000</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <p>The last modification time. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1791891200000</p>
         */
        @NameInMap("GmtModified")
        public Long gmtModified;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>af81a389-91f0-4157-8d82-720edd02b66a</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The identifier of the model used for cloning.</p>
         * 
         * <strong>example:</strong>
         * <p>cosyvoice-v3.5-flash</p>
         */
        @NameInMap("Model")
        public String model;

        /**
         * <p>The voice status. Valid values: Enabled (available) and Disabled (unavailable).</p>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The voice ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cosyvoice-v2-067dc4b2e9d34dbeb5de20b5b093d1e3</p>
         */
        @NameInMap("VoiceId")
        public String voiceId;

        /**
         * <p>The voice name.</p>
         * 
         * <strong>example:</strong>
         * <p>Cloned Voice 1</p>
         */
        @NameInMap("VoiceName")
        public String voiceName;

        public static ListVoiceCloneResponseBodyDataVoiceClones build(java.util.Map<String, ?> map) throws Exception {
            ListVoiceCloneResponseBodyDataVoiceClones self = new ListVoiceCloneResponseBodyDataVoiceClones();
            return TeaModel.build(map, self);
        }

        public ListVoiceCloneResponseBodyDataVoiceClones setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListVoiceCloneResponseBodyDataVoiceClones setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public ListVoiceCloneResponseBodyDataVoiceClones setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListVoiceCloneResponseBodyDataVoiceClones setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListVoiceCloneResponseBodyDataVoiceClones setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListVoiceCloneResponseBodyDataVoiceClones setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public ListVoiceCloneResponseBodyDataVoiceClones setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListVoiceCloneResponseBodyDataVoiceClones setVoiceId(String voiceId) {
            this.voiceId = voiceId;
            return this;
        }
        public String getVoiceId() {
            return this.voiceId;
        }

        public ListVoiceCloneResponseBodyDataVoiceClones setVoiceName(String voiceName) {
            this.voiceName = voiceName;
            return this;
        }
        public String getVoiceName() {
            return this.voiceName;
        }

    }

    public static class ListVoiceCloneResponseBodyData extends TeaModel {
        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of cloned voices that meet the filter conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        /**
         * <p>The list of cloned voices.</p>
         */
        @NameInMap("VoiceClones")
        public java.util.List<ListVoiceCloneResponseBodyDataVoiceClones> voiceClones;

        public static ListVoiceCloneResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListVoiceCloneResponseBodyData self = new ListVoiceCloneResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListVoiceCloneResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListVoiceCloneResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListVoiceCloneResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListVoiceCloneResponseBodyData setVoiceClones(java.util.List<ListVoiceCloneResponseBodyDataVoiceClones> voiceClones) {
            this.voiceClones = voiceClones;
            return this;
        }
        public java.util.List<ListVoiceCloneResponseBodyDataVoiceClones> getVoiceClones() {
            return this.voiceClones;
        }

    }

}
