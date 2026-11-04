// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class PublicTemplate extends TeaModel {
    /**
     * <p>The time when the template was created, in UTC and RFC 3339 format.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-08-20T08:30:00Z</p>
     */
    @NameInMap("createdTime")
    public String createdTime;

    /**
     * <p>The name of the template, which is unique within a team.</p>
     * 
     * <strong>example:</strong>
     * <p>python-data-analysis</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The ID of the Alibaba Cloud resource group to which the team belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-****</p>
     */
    @NameInMap("resourceGroupID")
    public String resourceGroupID;

    /**
     * <p>The resource tags.</p>
     */
    @NameInMap("resourceTags")
    public java.util.List<PublicTemplateResourceTags> resourceTags;

    /**
     * <p>The runtime configuration of the template, which determines the specifications and environment of the sandbox instances created from the template.</p>
     */
    @NameInMap("runtimeConfig")
    public PublicTemplateRuntimeConfig runtimeConfig;

    /**
     * <p>The current status of the template.</p>
     */
    @NameInMap("status")
    public PublicTemplateStatus status;

    /**
     * <p>The ID of the team to which the resource belongs, in UUID format.</p>
     * 
     * <strong>example:</strong>
     * <p>5f4a2c18-****</p>
     */
    @NameInMap("teamID")
    public String teamID;

    /**
     * <p>The name of the team.</p>
     * 
     * <strong>example:</strong>
     * <p>sandbox-dev</p>
     */
    @NameInMap("teamName")
    public String teamName;

    /**
     * <p>The ID of the sandbox template.</p>
     * 
     * <strong>example:</strong>
     * <p>tm-8f3a2c7b5e14d806</p>
     */
    @NameInMap("templateID")
    public String templateID;

    public static PublicTemplate build(java.util.Map<String, ?> map) throws Exception {
        PublicTemplate self = new PublicTemplate();
        return TeaModel.build(map, self);
    }

    public PublicTemplate setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public PublicTemplate setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public PublicTemplate setResourceGroupID(String resourceGroupID) {
        this.resourceGroupID = resourceGroupID;
        return this;
    }
    public String getResourceGroupID() {
        return this.resourceGroupID;
    }

    public PublicTemplate setResourceTags(java.util.List<PublicTemplateResourceTags> resourceTags) {
        this.resourceTags = resourceTags;
        return this;
    }
    public java.util.List<PublicTemplateResourceTags> getResourceTags() {
        return this.resourceTags;
    }

    public PublicTemplate setRuntimeConfig(PublicTemplateRuntimeConfig runtimeConfig) {
        this.runtimeConfig = runtimeConfig;
        return this;
    }
    public PublicTemplateRuntimeConfig getRuntimeConfig() {
        return this.runtimeConfig;
    }

    public PublicTemplate setStatus(PublicTemplateStatus status) {
        this.status = status;
        return this;
    }
    public PublicTemplateStatus getStatus() {
        return this.status;
    }

    public PublicTemplate setTeamID(String teamID) {
        this.teamID = teamID;
        return this;
    }
    public String getTeamID() {
        return this.teamID;
    }

    public PublicTemplate setTeamName(String teamName) {
        this.teamName = teamName;
        return this;
    }
    public String getTeamName() {
        return this.teamName;
    }

    public PublicTemplate setTemplateID(String templateID) {
        this.templateID = templateID;
        return this;
    }
    public String getTemplateID() {
        return this.templateID;
    }

    public static class PublicTemplateResourceTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>project</p>
         */
        @NameInMap("tagKey")
        public String tagKey;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("tagValue")
        public String tagValue;

        public static PublicTemplateResourceTags build(java.util.Map<String, ?> map) throws Exception {
            PublicTemplateResourceTags self = new PublicTemplateResourceTags();
            return TeaModel.build(map, self);
        }

        public PublicTemplateResourceTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public PublicTemplateResourceTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

}
