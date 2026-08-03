// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DescribeScriptVoiceConfigResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

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
     * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The scene voice configuration information.</p>
     */
    @NameInMap("ScriptVoiceConfig")
    public DescribeScriptVoiceConfigResponseBodyScriptVoiceConfig scriptVoiceConfig;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeScriptVoiceConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScriptVoiceConfigResponseBody self = new DescribeScriptVoiceConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScriptVoiceConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeScriptVoiceConfigResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeScriptVoiceConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeScriptVoiceConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeScriptVoiceConfigResponseBody setScriptVoiceConfig(DescribeScriptVoiceConfigResponseBodyScriptVoiceConfig scriptVoiceConfig) {
        this.scriptVoiceConfig = scriptVoiceConfig;
        return this;
    }
    public DescribeScriptVoiceConfigResponseBodyScriptVoiceConfig getScriptVoiceConfig() {
        return this.scriptVoiceConfig;
    }

    public DescribeScriptVoiceConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeScriptVoiceConfigResponseBodyScriptVoiceConfig extends TeaModel {
        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>291cfc6a-8703-4bdd-a99d-9cba32d5288a</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The script content.</p>
         * 
         * <strong>example:</strong>
         * <p>Your Huabei payment is overdue and needs to be processed. Can you handle it now?</p>
         */
        @NameInMap("ScriptContent")
        public String scriptContent;

        /**
         * <p>The scene ID.</p>
         * 
         * <strong>example:</strong>
         * <p>947e0875-b5d4-4b33-b18c-7b2cf85bcb4f</p>
         */
        @NameInMap("ScriptId")
        public String scriptId;

        /**
         * <p>The scene voice configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2a07b634-e15d-445f-bbcb-fc4ea2df7b87</p>
         */
        @NameInMap("ScriptVoiceConfigId")
        public String scriptVoiceConfigId;

        /**
         * <p>The script recording data. This parameter has a value only when Type is set to WAVEFORM.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;ScriptContent&quot;:&quot;May I ask if you are&quot;,&quot;ScriptWaveformId&quot;:&quot;07db2f0a-acb2-4e68-b9f4-66397414f50c&quot;},{&quot;ScriptContent&quot;:&quot;?&quot;,&quot;ScriptWaveformId&quot;:&quot;c2a69440-03e3-406e-b0a9-a9791fccb31b&quot;}]</p>
         */
        @NameInMap("ScriptWaveformRelation")
        public String scriptWaveformRelation;

        /**
         * <p>The script source.</p>
         * 
         * <strong>example:</strong>
         * <p>DIALOGUE_FLOW</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The recording type. Valid values:</p>
         * <ul>
         * <li>WAVEFORM: recording.</li>
         * <li>TTS: text-to-speech.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TTS</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeScriptVoiceConfigResponseBodyScriptVoiceConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeScriptVoiceConfigResponseBodyScriptVoiceConfig self = new DescribeScriptVoiceConfigResponseBodyScriptVoiceConfig();
            return TeaModel.build(map, self);
        }

        public DescribeScriptVoiceConfigResponseBodyScriptVoiceConfig setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeScriptVoiceConfigResponseBodyScriptVoiceConfig setScriptContent(String scriptContent) {
            this.scriptContent = scriptContent;
            return this;
        }
        public String getScriptContent() {
            return this.scriptContent;
        }

        public DescribeScriptVoiceConfigResponseBodyScriptVoiceConfig setScriptId(String scriptId) {
            this.scriptId = scriptId;
            return this;
        }
        public String getScriptId() {
            return this.scriptId;
        }

        public DescribeScriptVoiceConfigResponseBodyScriptVoiceConfig setScriptVoiceConfigId(String scriptVoiceConfigId) {
            this.scriptVoiceConfigId = scriptVoiceConfigId;
            return this;
        }
        public String getScriptVoiceConfigId() {
            return this.scriptVoiceConfigId;
        }

        public DescribeScriptVoiceConfigResponseBodyScriptVoiceConfig setScriptWaveformRelation(String scriptWaveformRelation) {
            this.scriptWaveformRelation = scriptWaveformRelation;
            return this;
        }
        public String getScriptWaveformRelation() {
            return this.scriptWaveformRelation;
        }

        public DescribeScriptVoiceConfigResponseBodyScriptVoiceConfig setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public DescribeScriptVoiceConfigResponseBodyScriptVoiceConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
