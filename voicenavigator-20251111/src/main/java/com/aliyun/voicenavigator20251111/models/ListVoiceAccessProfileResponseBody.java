// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class ListVoiceAccessProfileResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListVoiceAccessProfileResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>Instance af81a389-91f0-4157-8d82-720edd02b66a
     *  does not exist.</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Params")
    public java.util.List<String> params;

    /**
     * <strong>example:</strong>
     * <p>C1788610-93C9-574C-AF2D-C053A50C3894</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListVoiceAccessProfileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVoiceAccessProfileResponseBody self = new ListVoiceAccessProfileResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVoiceAccessProfileResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListVoiceAccessProfileResponseBody setData(ListVoiceAccessProfileResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListVoiceAccessProfileResponseBodyData getData() {
        return this.data;
    }

    public ListVoiceAccessProfileResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListVoiceAccessProfileResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListVoiceAccessProfileResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public ListVoiceAccessProfileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListVoiceAccessProfileResponseBodyDataVoiceAccessProfilesProfile extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>HwRnTXgwnQOlsj68URDS5_VMm4Wtapq9</p>
         */
        @NameInMap("AccessKey")
        public String accessKey;

        /**
         * <strong>example:</strong>
         * <p>sk-12341e259b1049e8872b47981e545f78</p>
         */
        @NameInMap("ApiKey")
        public String apiKey;

        /**
         * <strong>example:</strong>
         * <p>c0358c6e51c1013b446fdeb21a3a1234</p>
         */
        @NameInMap("ApiSecret")
        public String apiSecret;

        /**
         * <strong>example:</strong>
         * <p>5b123bfb</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <strong>example:</strong>
         * <p>2541370123</p>
         */
        @NameInMap("AppKey")
        public String appKey;

        @NameInMap("AsrAppKey")
        public String asrAppKey;

        @NameInMap("TtsApiKey")
        public String ttsApiKey;

        public static ListVoiceAccessProfileResponseBodyDataVoiceAccessProfilesProfile build(java.util.Map<String, ?> map) throws Exception {
            ListVoiceAccessProfileResponseBodyDataVoiceAccessProfilesProfile self = new ListVoiceAccessProfileResponseBodyDataVoiceAccessProfilesProfile();
            return TeaModel.build(map, self);
        }

        public ListVoiceAccessProfileResponseBodyDataVoiceAccessProfilesProfile setAccessKey(String accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public String getAccessKey() {
            return this.accessKey;
        }

        public ListVoiceAccessProfileResponseBodyDataVoiceAccessProfilesProfile setApiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }
        public String getApiKey() {
            return this.apiKey;
        }

        public ListVoiceAccessProfileResponseBodyDataVoiceAccessProfilesProfile setApiSecret(String apiSecret) {
            this.apiSecret = apiSecret;
            return this;
        }
        public String getApiSecret() {
            return this.apiSecret;
        }

        public ListVoiceAccessProfileResponseBodyDataVoiceAccessProfilesProfile setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListVoiceAccessProfileResponseBodyDataVoiceAccessProfilesProfile setAppKey(String appKey) {
            this.appKey = appKey;
            return this;
        }
        public String getAppKey() {
            return this.appKey;
        }

        public ListVoiceAccessProfileResponseBodyDataVoiceAccessProfilesProfile setAsrAppKey(String asrAppKey) {
            this.asrAppKey = asrAppKey;
            return this;
        }
        public String getAsrAppKey() {
            return this.asrAppKey;
        }

        public ListVoiceAccessProfileResponseBodyDataVoiceAccessProfilesProfile setTtsApiKey(String ttsApiKey) {
            this.ttsApiKey = ttsApiKey;
            return this;
        }
        public String getTtsApiKey() {
            return this.ttsApiKey;
        }

    }

    public static class ListVoiceAccessProfileResponseBodyDataVoiceAccessProfiles extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>af81a389-91f0-4157-8d82-720edd02b66b</p>
         */
        @NameInMap("AccessProfileId")
        public String accessProfileId;

        @NameInMap("Capabilities")
        public java.util.List<String> capabilities;

        /**
         * <strong>example:</strong>
         * <p>1747620752000</p>
         */
        @NameInMap("CreatedTime")
        public Long createdTime;

        /**
         * <strong>example:</strong>
         * <p>af81a389-91f0-4157-8d82-720edd02b66a</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>VOLC</p>
         */
        @NameInMap("NlsEngine")
        public String nlsEngine;

        @NameInMap("NlsEngineName")
        public String nlsEngineName;

        @NameInMap("Profile")
        public ListVoiceAccessProfileResponseBodyDataVoiceAccessProfilesProfile profile;

        /**
         * <strong>example:</strong>
         * <p>1747620752000</p>
         */
        @NameInMap("UpdatedTime")
        public Long updatedTime;

        public static ListVoiceAccessProfileResponseBodyDataVoiceAccessProfiles build(java.util.Map<String, ?> map) throws Exception {
            ListVoiceAccessProfileResponseBodyDataVoiceAccessProfiles self = new ListVoiceAccessProfileResponseBodyDataVoiceAccessProfiles();
            return TeaModel.build(map, self);
        }

        public ListVoiceAccessProfileResponseBodyDataVoiceAccessProfiles setAccessProfileId(String accessProfileId) {
            this.accessProfileId = accessProfileId;
            return this;
        }
        public String getAccessProfileId() {
            return this.accessProfileId;
        }

        public ListVoiceAccessProfileResponseBodyDataVoiceAccessProfiles setCapabilities(java.util.List<String> capabilities) {
            this.capabilities = capabilities;
            return this;
        }
        public java.util.List<String> getCapabilities() {
            return this.capabilities;
        }

        public ListVoiceAccessProfileResponseBodyDataVoiceAccessProfiles setCreatedTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Long getCreatedTime() {
            return this.createdTime;
        }

        public ListVoiceAccessProfileResponseBodyDataVoiceAccessProfiles setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListVoiceAccessProfileResponseBodyDataVoiceAccessProfiles setNlsEngine(String nlsEngine) {
            this.nlsEngine = nlsEngine;
            return this;
        }
        public String getNlsEngine() {
            return this.nlsEngine;
        }

        public ListVoiceAccessProfileResponseBodyDataVoiceAccessProfiles setNlsEngineName(String nlsEngineName) {
            this.nlsEngineName = nlsEngineName;
            return this;
        }
        public String getNlsEngineName() {
            return this.nlsEngineName;
        }

        public ListVoiceAccessProfileResponseBodyDataVoiceAccessProfiles setProfile(ListVoiceAccessProfileResponseBodyDataVoiceAccessProfilesProfile profile) {
            this.profile = profile;
            return this;
        }
        public ListVoiceAccessProfileResponseBodyDataVoiceAccessProfilesProfile getProfile() {
            return this.profile;
        }

        public ListVoiceAccessProfileResponseBodyDataVoiceAccessProfiles setUpdatedTime(Long updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }
        public Long getUpdatedTime() {
            return this.updatedTime;
        }

    }

    public static class ListVoiceAccessProfileResponseBodyData extends TeaModel {
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
         * <p>20</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("VoiceAccessProfiles")
        public java.util.List<ListVoiceAccessProfileResponseBodyDataVoiceAccessProfiles> voiceAccessProfiles;

        public static ListVoiceAccessProfileResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListVoiceAccessProfileResponseBodyData self = new ListVoiceAccessProfileResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListVoiceAccessProfileResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListVoiceAccessProfileResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListVoiceAccessProfileResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListVoiceAccessProfileResponseBodyData setVoiceAccessProfiles(java.util.List<ListVoiceAccessProfileResponseBodyDataVoiceAccessProfiles> voiceAccessProfiles) {
            this.voiceAccessProfiles = voiceAccessProfiles;
            return this;
        }
        public java.util.List<ListVoiceAccessProfileResponseBodyDataVoiceAccessProfiles> getVoiceAccessProfiles() {
            return this.voiceAccessProfiles;
        }

    }

}
