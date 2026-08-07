// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20251111.models;

import com.aliyun.tea.*;

public class ListVoiceAccessProfilesResponseBody extends TeaModel {
    /**
     * <p>返回码</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>返回数据</p>
     */
    @NameInMap("Data")
    public ListVoiceAccessProfilesResponseBodyData data;

    /**
     * <p>HTTP状态码</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>错误信息</p>
     * 
     * <strong>example:</strong>
     * <p>Instance does not exist. Instance=outb001,.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>错误信息中的变量值列表</p>
     */
    @NameInMap("Params")
    public java.util.List<String> params;

    /**
     * <p>请求ID</p>
     * 
     * <strong>example:</strong>
     * <p>019FDAC7-13C5-1B64-A853-999DF105B9EF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>是否调用成功</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListVoiceAccessProfilesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVoiceAccessProfilesResponseBody self = new ListVoiceAccessProfilesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVoiceAccessProfilesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListVoiceAccessProfilesResponseBody setData(ListVoiceAccessProfilesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListVoiceAccessProfilesResponseBodyData getData() {
        return this.data;
    }

    public ListVoiceAccessProfilesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListVoiceAccessProfilesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListVoiceAccessProfilesResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public ListVoiceAccessProfilesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListVoiceAccessProfilesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListVoiceAccessProfilesResponseBodyDataVoiceAccessProfilesProfile extends TeaModel {
        /**
         * <p>访问密钥</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("AccessKey")
        public String accessKey;

        /**
         * <p>百炼同时使用</p>
         * 
         * <strong>example:</strong>
         * <p>a9872e2342952e248727798f642936c7</p>
         */
        @NameInMap("ApiKey")
        public String apiKey;

        /**
         * <p>API密钥</p>
         * 
         * <strong>example:</strong>
         * <p>c0358c6e51c1013b446fdeb21a3a5d2e</p>
         */
        @NameInMap("ApiSecret")
        public String apiSecret;

        /**
         * <p>科大讯飞使用</p>
         * 
         * <strong>example:</strong>
         * <p>9479688350</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>豆包使用</p>
         * 
         * <strong>example:</strong>
         * <p>DW0yKRHQEe1nAd8c</p>
         */
        @NameInMap("AppKey")
        public String appKey;

        /**
         * <p>货拉拉使用</p>
         * 
         * <strong>example:</strong>
         * <p>暂无使用</p>
         */
        @NameInMap("AsrAppKey")
        public String asrAppKey;

        /**
         * <p>腾讯云使用，appId 已存在</p>
         * 
         * <strong>example:</strong>
         * <p>sci_r3b3e62udqcujnkerrorqztnpu</p>
         */
        @NameInMap("SecretId")
        public String secretId;

        /**
         * <p>密钥</p>
         * 
         * <strong>example:</strong>
         * <p>y5MZfFdW6yBZgJdKonHZBA</p>
         */
        @NameInMap("SecretKey")
        public String secretKey;

        /**
         * <p>TTS服务API Key</p>
         * 
         * <strong>example:</strong>
         * <p>暂无使用</p>
         */
        @NameInMap("TtsApiKey")
        public String ttsApiKey;

        public static ListVoiceAccessProfilesResponseBodyDataVoiceAccessProfilesProfile build(java.util.Map<String, ?> map) throws Exception {
            ListVoiceAccessProfilesResponseBodyDataVoiceAccessProfilesProfile self = new ListVoiceAccessProfilesResponseBodyDataVoiceAccessProfilesProfile();
            return TeaModel.build(map, self);
        }

        public ListVoiceAccessProfilesResponseBodyDataVoiceAccessProfilesProfile setAccessKey(String accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public String getAccessKey() {
            return this.accessKey;
        }

        public ListVoiceAccessProfilesResponseBodyDataVoiceAccessProfilesProfile setApiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }
        public String getApiKey() {
            return this.apiKey;
        }

        public ListVoiceAccessProfilesResponseBodyDataVoiceAccessProfilesProfile setApiSecret(String apiSecret) {
            this.apiSecret = apiSecret;
            return this;
        }
        public String getApiSecret() {
            return this.apiSecret;
        }

        public ListVoiceAccessProfilesResponseBodyDataVoiceAccessProfilesProfile setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListVoiceAccessProfilesResponseBodyDataVoiceAccessProfilesProfile setAppKey(String appKey) {
            this.appKey = appKey;
            return this;
        }
        public String getAppKey() {
            return this.appKey;
        }

        public ListVoiceAccessProfilesResponseBodyDataVoiceAccessProfilesProfile setAsrAppKey(String asrAppKey) {
            this.asrAppKey = asrAppKey;
            return this;
        }
        public String getAsrAppKey() {
            return this.asrAppKey;
        }

        public ListVoiceAccessProfilesResponseBodyDataVoiceAccessProfilesProfile setSecretId(String secretId) {
            this.secretId = secretId;
            return this;
        }
        public String getSecretId() {
            return this.secretId;
        }

        public ListVoiceAccessProfilesResponseBodyDataVoiceAccessProfilesProfile setSecretKey(String secretKey) {
            this.secretKey = secretKey;
            return this;
        }
        public String getSecretKey() {
            return this.secretKey;
        }

        public ListVoiceAccessProfilesResponseBodyDataVoiceAccessProfilesProfile setTtsApiKey(String ttsApiKey) {
            this.ttsApiKey = ttsApiKey;
            return this;
        }
        public String getTtsApiKey() {
            return this.ttsApiKey;
        }

    }

    public static class ListVoiceAccessProfilesResponseBodyDataVoiceAccessProfiles extends TeaModel {
        /**
         * <p>接入配置ID</p>
         * 
         * <strong>example:</strong>
         * <p>4f9a8e2b-6c1d-4a7e-9b3f-2d5c8a1e7b15</p>
         */
        @NameInMap("AccessProfileId")
        public String accessProfileId;

        /**
         * <p>能力列表</p>
         */
        @NameInMap("Capabilities")
        public java.util.List<String> capabilities;

        /**
         * <p>创建时间，毫秒级时间戳</p>
         * 
         * <strong>example:</strong>
         * <p>1735660800000</p>
         */
        @NameInMap("CreatedTime")
        public Long createdTime;

        /**
         * <p>实例ID</p>
         * 
         * <strong>example:</strong>
         * <p>4f9a8e2b-6c1d-4a7e-9b3f-2d5c8a1e7b04</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>目前支持IFLYTEK、VOLC</p>
         * 
         * <strong>example:</strong>
         * <p>BAILIAN</p>
         */
        @NameInMap("NlsEngine")
        public String nlsEngine;

        /**
         * <p>引擎显示名称(例如：豆包、货拉拉)</p>
         * 
         * <strong>example:</strong>
         * <p>百炼</p>
         */
        @NameInMap("NlsEngineName")
        public String nlsEngineName;

        /**
         * <p>配置</p>
         */
        @NameInMap("Profile")
        public ListVoiceAccessProfilesResponseBodyDataVoiceAccessProfilesProfile profile;

        /**
         * <p>更新时间，毫秒级时间戳</p>
         * 
         * <strong>example:</strong>
         * <p>1735660800000</p>
         */
        @NameInMap("UpdatedTime")
        public Long updatedTime;

        public static ListVoiceAccessProfilesResponseBodyDataVoiceAccessProfiles build(java.util.Map<String, ?> map) throws Exception {
            ListVoiceAccessProfilesResponseBodyDataVoiceAccessProfiles self = new ListVoiceAccessProfilesResponseBodyDataVoiceAccessProfiles();
            return TeaModel.build(map, self);
        }

        public ListVoiceAccessProfilesResponseBodyDataVoiceAccessProfiles setAccessProfileId(String accessProfileId) {
            this.accessProfileId = accessProfileId;
            return this;
        }
        public String getAccessProfileId() {
            return this.accessProfileId;
        }

        public ListVoiceAccessProfilesResponseBodyDataVoiceAccessProfiles setCapabilities(java.util.List<String> capabilities) {
            this.capabilities = capabilities;
            return this;
        }
        public java.util.List<String> getCapabilities() {
            return this.capabilities;
        }

        public ListVoiceAccessProfilesResponseBodyDataVoiceAccessProfiles setCreatedTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Long getCreatedTime() {
            return this.createdTime;
        }

        public ListVoiceAccessProfilesResponseBodyDataVoiceAccessProfiles setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListVoiceAccessProfilesResponseBodyDataVoiceAccessProfiles setNlsEngine(String nlsEngine) {
            this.nlsEngine = nlsEngine;
            return this;
        }
        public String getNlsEngine() {
            return this.nlsEngine;
        }

        public ListVoiceAccessProfilesResponseBodyDataVoiceAccessProfiles setNlsEngineName(String nlsEngineName) {
            this.nlsEngineName = nlsEngineName;
            return this;
        }
        public String getNlsEngineName() {
            return this.nlsEngineName;
        }

        public ListVoiceAccessProfilesResponseBodyDataVoiceAccessProfiles setProfile(ListVoiceAccessProfilesResponseBodyDataVoiceAccessProfilesProfile profile) {
            this.profile = profile;
            return this;
        }
        public ListVoiceAccessProfilesResponseBodyDataVoiceAccessProfilesProfile getProfile() {
            return this.profile;
        }

        public ListVoiceAccessProfilesResponseBodyDataVoiceAccessProfiles setUpdatedTime(Long updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }
        public Long getUpdatedTime() {
            return this.updatedTime;
        }

    }

    public static class ListVoiceAccessProfilesResponseBodyData extends TeaModel {
        /**
         * <p>页码，从1开始</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>每页记录数</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>符合条件的记录总数</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        /**
         * <p>数据列表</p>
         */
        @NameInMap("VoiceAccessProfiles")
        public java.util.List<ListVoiceAccessProfilesResponseBodyDataVoiceAccessProfiles> voiceAccessProfiles;

        public static ListVoiceAccessProfilesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListVoiceAccessProfilesResponseBodyData self = new ListVoiceAccessProfilesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListVoiceAccessProfilesResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListVoiceAccessProfilesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListVoiceAccessProfilesResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListVoiceAccessProfilesResponseBodyData setVoiceAccessProfiles(java.util.List<ListVoiceAccessProfilesResponseBodyDataVoiceAccessProfiles> voiceAccessProfiles) {
            this.voiceAccessProfiles = voiceAccessProfiles;
            return this;
        }
        public java.util.List<ListVoiceAccessProfilesResponseBodyDataVoiceAccessProfiles> getVoiceAccessProfiles() {
            return this.voiceAccessProfiles;
        }

    }

}
