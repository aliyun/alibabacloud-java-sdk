// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DescribeTTSConfigResponseBody extends TeaModel {
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
     * <p>f765d3ee-ec03-4765-b235-6877501d99d1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TTSConfig")
    public DescribeTTSConfigResponseBodyTTSConfig TTSConfig;

    public static DescribeTTSConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTTSConfigResponseBody self = new DescribeTTSConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTTSConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeTTSConfigResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeTTSConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeTTSConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTTSConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeTTSConfigResponseBody setTTSConfig(DescribeTTSConfigResponseBodyTTSConfig TTSConfig) {
        this.TTSConfig = TTSConfig;
        return this;
    }
    public DescribeTTSConfigResponseBodyTTSConfig getTTSConfig() {
        return this.TTSConfig;
    }

    public static class DescribeTTSConfigResponseBodyTTSConfig extends TeaModel {
        @NameInMap("AppKey")
        public String appKey;

        /**
         * <strong>example:</strong>
         * <p>947e0875-b5d4-4b33-b18c-7b2cf85bcb4f</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>Managed</p>
         */
        @NameInMap("NlsServiceType")
        public String nlsServiceType;

        /**
         * <strong>example:</strong>
         * <p>-150</p>
         */
        @NameInMap("SpeechRate")
        public String speechRate;

        /**
         * <strong>example:</strong>
         * <p>xiaoyun</p>
         */
        @NameInMap("Voice")
        public String voice;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Volume")
        public String volume;

        public static DescribeTTSConfigResponseBodyTTSConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeTTSConfigResponseBodyTTSConfig self = new DescribeTTSConfigResponseBodyTTSConfig();
            return TeaModel.build(map, self);
        }

        public DescribeTTSConfigResponseBodyTTSConfig setAppKey(String appKey) {
            this.appKey = appKey;
            return this;
        }
        public String getAppKey() {
            return this.appKey;
        }

        public DescribeTTSConfigResponseBodyTTSConfig setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeTTSConfigResponseBodyTTSConfig setNlsServiceType(String nlsServiceType) {
            this.nlsServiceType = nlsServiceType;
            return this;
        }
        public String getNlsServiceType() {
            return this.nlsServiceType;
        }

        public DescribeTTSConfigResponseBodyTTSConfig setSpeechRate(String speechRate) {
            this.speechRate = speechRate;
            return this;
        }
        public String getSpeechRate() {
            return this.speechRate;
        }

        public DescribeTTSConfigResponseBodyTTSConfig setVoice(String voice) {
            this.voice = voice;
            return this;
        }
        public String getVoice() {
            return this.voice;
        }

        public DescribeTTSConfigResponseBodyTTSConfig setVolume(String volume) {
            this.volume = volume;
            return this;
        }
        public String getVolume() {
            return this.volume;
        }

    }

}
