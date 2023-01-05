// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DescribeTTSConfigResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("NlsServiceType")
        public String nlsServiceType;

        @NameInMap("SpeechRate")
        public String speechRate;

        @NameInMap("Voice")
        public String voice;

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
