// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class GetTemplateResponseBody extends TeaModel {
    /**
     * <p>The error code. The value is 200 if the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The creation time in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-09-19T10:00:00Z</p>
     */
    @NameInMap("createdTime")
    public String createdTime;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The name of the template.</p>
     * 
     * <strong>example:</strong>
     * <p>my-template</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>B5AD8B54-4358-5F5B-ACAA-52F2016459C6</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxazb4ph6aiy</p>
     */
    @NameInMap("resourceGroupID")
    public String resourceGroupID;

    /**
     * <p>The resource tags.</p>
     */
    @NameInMap("resourceTags")
    public java.util.List<GetTemplateResponseBodyResourceTags> resourceTags;

    /**
     * <p>The runtime configuration of the template.</p>
     */
    @NameInMap("runtimeConfig")
    public PublicTemplateRuntimeConfig runtimeConfig;

    /**
     * <p>The status of the template.</p>
     */
    @NameInMap("status")
    public PublicTemplateStatus status;

    /**
     * <p>The team ID.</p>
     * 
     * <strong>example:</strong>
     * <p>13b721e6-8cc8-5df2-af13-80316f7508af</p>
     */
    @NameInMap("teamID")
    public String teamID;

    /**
     * <p>The name of the team.</p>
     * 
     * <strong>example:</strong>
     * <p>my-team</p>
     */
    @NameInMap("teamName")
    public String teamName;

    /**
     * <p>The unique identifier of the template.</p>
     * 
     * <strong>example:</strong>
     * <p>us7dxqaezw5uu7aa2cm5</p>
     */
    @NameInMap("templateID")
    public String templateID;

    public static GetTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTemplateResponseBody self = new GetTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTemplateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetTemplateResponseBody setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public GetTemplateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTemplateResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTemplateResponseBody setResourceGroupID(String resourceGroupID) {
        this.resourceGroupID = resourceGroupID;
        return this;
    }
    public String getResourceGroupID() {
        return this.resourceGroupID;
    }

    public GetTemplateResponseBody setResourceTags(java.util.List<GetTemplateResponseBodyResourceTags> resourceTags) {
        this.resourceTags = resourceTags;
        return this;
    }
    public java.util.List<GetTemplateResponseBodyResourceTags> getResourceTags() {
        return this.resourceTags;
    }

    public GetTemplateResponseBody setRuntimeConfig(PublicTemplateRuntimeConfig runtimeConfig) {
        this.runtimeConfig = runtimeConfig;
        return this;
    }
    public PublicTemplateRuntimeConfig getRuntimeConfig() {
        return this.runtimeConfig;
    }

    public GetTemplateResponseBody setStatus(PublicTemplateStatus status) {
        this.status = status;
        return this;
    }
    public PublicTemplateStatus getStatus() {
        return this.status;
    }

    public GetTemplateResponseBody setTeamID(String teamID) {
        this.teamID = teamID;
        return this;
    }
    public String getTeamID() {
        return this.teamID;
    }

    public GetTemplateResponseBody setTeamName(String teamName) {
        this.teamName = teamName;
        return this;
    }
    public String getTeamName() {
        return this.teamName;
    }

    public GetTemplateResponseBody setTemplateID(String templateID) {
        this.templateID = templateID;
        return this;
    }
    public String getTemplateID() {
        return this.templateID;
    }

    public static class GetTemplateResponseBodyResourceTags extends TeaModel {
        /**
         * <p>The key of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>project</p>
         */
        @NameInMap("tagKey")
        public String tagKey;

        /**
         * <p>The value of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("tagValue")
        public String tagValue;

        public static GetTemplateResponseBodyResourceTags build(java.util.Map<String, ?> map) throws Exception {
            GetTemplateResponseBodyResourceTags self = new GetTemplateResponseBodyResourceTags();
            return TeaModel.build(map, self);
        }

        public GetTemplateResponseBodyResourceTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public GetTemplateResponseBodyResourceTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

}
