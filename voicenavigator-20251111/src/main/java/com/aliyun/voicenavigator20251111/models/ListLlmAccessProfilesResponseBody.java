// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class ListLlmAccessProfilesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListLlmAccessProfilesResponseBodyData data;

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
     * <p>ED56B723-5802-5C32-865F-6E20B06D2455</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListLlmAccessProfilesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLlmAccessProfilesResponseBody self = new ListLlmAccessProfilesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLlmAccessProfilesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListLlmAccessProfilesResponseBody setData(ListLlmAccessProfilesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListLlmAccessProfilesResponseBodyData getData() {
        return this.data;
    }

    public ListLlmAccessProfilesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListLlmAccessProfilesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListLlmAccessProfilesResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public ListLlmAccessProfilesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListLlmAccessProfilesResponseBodyDataLlmAccessProfilesProfile extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>akm-93929110-d7c1-4014-8678-613aacd58fa2</p>
         */
        @NameInMap("ApiKey")
        public String apiKey;

        /**
         * <strong>example:</strong>
         * <p>api.llm.enpoint.example.com</p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>MANAGED</p>
         */
        @NameInMap("NluAccessType")
        public String nluAccessType;

        /**
         * <strong>example:</strong>
         * <p>BEEBOT</p>
         */
        @NameInMap("NluEngine")
        public String nluEngine;

        public static ListLlmAccessProfilesResponseBodyDataLlmAccessProfilesProfile build(java.util.Map<String, ?> map) throws Exception {
            ListLlmAccessProfilesResponseBodyDataLlmAccessProfilesProfile self = new ListLlmAccessProfilesResponseBodyDataLlmAccessProfilesProfile();
            return TeaModel.build(map, self);
        }

        public ListLlmAccessProfilesResponseBodyDataLlmAccessProfilesProfile setApiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }
        public String getApiKey() {
            return this.apiKey;
        }

        public ListLlmAccessProfilesResponseBodyDataLlmAccessProfilesProfile setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public ListLlmAccessProfilesResponseBodyDataLlmAccessProfilesProfile setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListLlmAccessProfilesResponseBodyDataLlmAccessProfilesProfile setNluAccessType(String nluAccessType) {
            this.nluAccessType = nluAccessType;
            return this;
        }
        public String getNluAccessType() {
            return this.nluAccessType;
        }

        public ListLlmAccessProfilesResponseBodyDataLlmAccessProfilesProfile setNluEngine(String nluEngine) {
            this.nluEngine = nluEngine;
            return this;
        }
        public String getNluEngine() {
            return this.nluEngine;
        }

    }

    public static class ListLlmAccessProfilesResponseBodyDataLlmAccessProfiles extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>af81a389-91f0-4157-8d82-720edd02b66b</p>
         */
        @NameInMap("AccessProfileId")
        public String accessProfileId;

        /**
         * <strong>example:</strong>
         * <p>1747620752000</p>
         */
        @NameInMap("CreatedTime")
        public Long createdTime;

        /**
         * <strong>example:</strong>
         * <p>8fe2b8b1cdd446318610ccbc70bcfff0</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Profile")
        public ListLlmAccessProfilesResponseBodyDataLlmAccessProfilesProfile profile;

        /**
         * <strong>example:</strong>
         * <p>1768788798</p>
         */
        @NameInMap("UpdatedTime")
        public Long updatedTime;

        public static ListLlmAccessProfilesResponseBodyDataLlmAccessProfiles build(java.util.Map<String, ?> map) throws Exception {
            ListLlmAccessProfilesResponseBodyDataLlmAccessProfiles self = new ListLlmAccessProfilesResponseBodyDataLlmAccessProfiles();
            return TeaModel.build(map, self);
        }

        public ListLlmAccessProfilesResponseBodyDataLlmAccessProfiles setAccessProfileId(String accessProfileId) {
            this.accessProfileId = accessProfileId;
            return this;
        }
        public String getAccessProfileId() {
            return this.accessProfileId;
        }

        public ListLlmAccessProfilesResponseBodyDataLlmAccessProfiles setCreatedTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Long getCreatedTime() {
            return this.createdTime;
        }

        public ListLlmAccessProfilesResponseBodyDataLlmAccessProfiles setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListLlmAccessProfilesResponseBodyDataLlmAccessProfiles setProfile(ListLlmAccessProfilesResponseBodyDataLlmAccessProfilesProfile profile) {
            this.profile = profile;
            return this;
        }
        public ListLlmAccessProfilesResponseBodyDataLlmAccessProfilesProfile getProfile() {
            return this.profile;
        }

        public ListLlmAccessProfilesResponseBodyDataLlmAccessProfiles setUpdatedTime(Long updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }
        public Long getUpdatedTime() {
            return this.updatedTime;
        }

    }

    public static class ListLlmAccessProfilesResponseBodyData extends TeaModel {
        @NameInMap("LlmAccessProfiles")
        public java.util.List<ListLlmAccessProfilesResponseBodyDataLlmAccessProfiles> llmAccessProfiles;

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

        public static ListLlmAccessProfilesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListLlmAccessProfilesResponseBodyData self = new ListLlmAccessProfilesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListLlmAccessProfilesResponseBodyData setLlmAccessProfiles(java.util.List<ListLlmAccessProfilesResponseBodyDataLlmAccessProfiles> llmAccessProfiles) {
            this.llmAccessProfiles = llmAccessProfiles;
            return this;
        }
        public java.util.List<ListLlmAccessProfilesResponseBodyDataLlmAccessProfiles> getLlmAccessProfiles() {
            return this.llmAccessProfiles;
        }

        public ListLlmAccessProfilesResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListLlmAccessProfilesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListLlmAccessProfilesResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
