// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ListScriptVoiceConfigsResponseBody extends TeaModel {
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
     * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ScriptVoiceConfigs")
    public ListScriptVoiceConfigsResponseBodyScriptVoiceConfigs scriptVoiceConfigs;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListScriptVoiceConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListScriptVoiceConfigsResponseBody self = new ListScriptVoiceConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListScriptVoiceConfigsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListScriptVoiceConfigsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListScriptVoiceConfigsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListScriptVoiceConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListScriptVoiceConfigsResponseBody setScriptVoiceConfigs(ListScriptVoiceConfigsResponseBodyScriptVoiceConfigs scriptVoiceConfigs) {
        this.scriptVoiceConfigs = scriptVoiceConfigs;
        return this;
    }
    public ListScriptVoiceConfigsResponseBodyScriptVoiceConfigs getScriptVoiceConfigs() {
        return this.scriptVoiceConfigs;
    }

    public ListScriptVoiceConfigsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListScriptVoiceConfigsResponseBodyScriptVoiceConfigsList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>bdd49242-114c-4045-b1d1-25ccc1756c75</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("ScriptContent")
        public String scriptContent;

        /**
         * <strong>example:</strong>
         * <p>a7441a05-43bb-4a2d-acb0-365f245d7a5b</p>
         */
        @NameInMap("ScriptId")
        public String scriptId;

        /**
         * <strong>example:</strong>
         * <p>2c8fa91f-9856-4145-90f2-08252f09bc18</p>
         */
        @NameInMap("ScriptVoiceConfigId")
        public String scriptVoiceConfigId;

        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("ScriptWaveformRelation")
        public String scriptWaveformRelation;

        /**
         * <strong>example:</strong>
         * <p>DIALOGUE_FLOW</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <strong>example:</strong>
         * <p>TTS</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListScriptVoiceConfigsResponseBodyScriptVoiceConfigsList build(java.util.Map<String, ?> map) throws Exception {
            ListScriptVoiceConfigsResponseBodyScriptVoiceConfigsList self = new ListScriptVoiceConfigsResponseBodyScriptVoiceConfigsList();
            return TeaModel.build(map, self);
        }

        public ListScriptVoiceConfigsResponseBodyScriptVoiceConfigsList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListScriptVoiceConfigsResponseBodyScriptVoiceConfigsList setScriptContent(String scriptContent) {
            this.scriptContent = scriptContent;
            return this;
        }
        public String getScriptContent() {
            return this.scriptContent;
        }

        public ListScriptVoiceConfigsResponseBodyScriptVoiceConfigsList setScriptId(String scriptId) {
            this.scriptId = scriptId;
            return this;
        }
        public String getScriptId() {
            return this.scriptId;
        }

        public ListScriptVoiceConfigsResponseBodyScriptVoiceConfigsList setScriptVoiceConfigId(String scriptVoiceConfigId) {
            this.scriptVoiceConfigId = scriptVoiceConfigId;
            return this;
        }
        public String getScriptVoiceConfigId() {
            return this.scriptVoiceConfigId;
        }

        public ListScriptVoiceConfigsResponseBodyScriptVoiceConfigsList setScriptWaveformRelation(String scriptWaveformRelation) {
            this.scriptWaveformRelation = scriptWaveformRelation;
            return this;
        }
        public String getScriptWaveformRelation() {
            return this.scriptWaveformRelation;
        }

        public ListScriptVoiceConfigsResponseBodyScriptVoiceConfigsList setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListScriptVoiceConfigsResponseBodyScriptVoiceConfigsList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListScriptVoiceConfigsResponseBodyScriptVoiceConfigs extends TeaModel {
        @NameInMap("List")
        public java.util.List<ListScriptVoiceConfigsResponseBodyScriptVoiceConfigsList> list;

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
         * <p>100</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListScriptVoiceConfigsResponseBodyScriptVoiceConfigs build(java.util.Map<String, ?> map) throws Exception {
            ListScriptVoiceConfigsResponseBodyScriptVoiceConfigs self = new ListScriptVoiceConfigsResponseBodyScriptVoiceConfigs();
            return TeaModel.build(map, self);
        }

        public ListScriptVoiceConfigsResponseBodyScriptVoiceConfigs setList(java.util.List<ListScriptVoiceConfigsResponseBodyScriptVoiceConfigsList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListScriptVoiceConfigsResponseBodyScriptVoiceConfigsList> getList() {
            return this.list;
        }

        public ListScriptVoiceConfigsResponseBodyScriptVoiceConfigs setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListScriptVoiceConfigsResponseBodyScriptVoiceConfigs setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListScriptVoiceConfigsResponseBodyScriptVoiceConfigs setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
