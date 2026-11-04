// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class PublicListedSandbox extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("autoPause")
    public Boolean autoPause;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("autoResume")
    public Boolean autoResume;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("cpu")
    public Float cpu;

    /**
     * <strong>example:</strong>
     * <p>2048</p>
     */
    @NameInMap("diskSize")
    public Integer diskSize;

    /**
     * <strong>example:</strong>
     * <p>2026-10-30T03:09:21.313Z</p>
     */
    @NameInMap("endAt")
    public String endAt;

    /**
     * <strong>example:</strong>
     * <p>10240</p>
     */
    @NameInMap("memorySize")
    public Integer memorySize;

    /**
     * <strong>example:</strong>
     * <p>rg-acfmwxqyrgwabcd</p>
     */
    @NameInMap("resourceGroupID")
    public String resourceGroupID;

    @NameInMap("resourceTags")
    public java.util.List<PublicListedSandboxResourceTags> resourceTags;

    /**
     * <strong>example:</strong>
     * <p>sbx-4a4356a4-b731-42c1-ba8e-650f725be098</p>
     */
    @NameInMap("sandboxID")
    public String sandboxID;

    /**
     * <strong>example:</strong>
     * <p>2026-10-30T02:09:21.313Z</p>
     */
    @NameInMap("startedAt")
    public String startedAt;

    /**
     * <strong>example:</strong>
     * <p>running</p>
     */
    @NameInMap("state")
    public String state;

    /**
     * <strong>example:</strong>
     * <p>13b721e6-8cc8-5df2-af13-80316f7508af</p>
     */
    @NameInMap("teamID")
    public String teamID;

    /**
     * <strong>example:</strong>
     * <p>my-team</p>
     */
    @NameInMap("teamName")
    public String teamName;

    /**
     * <strong>example:</strong>
     * <p>us7dxqaezw5uu7aa2cm5</p>
     */
    @NameInMap("templateID")
    public String templateID;

    /**
     * <strong>example:</strong>
     * <p>my-base-template</p>
     */
    @NameInMap("templateName")
    public String templateName;

    /**
     * <strong>example:</strong>
     * <p>123456789</p>
     */
    @NameInMap("userID")
    public String userID;

    public static PublicListedSandbox build(java.util.Map<String, ?> map) throws Exception {
        PublicListedSandbox self = new PublicListedSandbox();
        return TeaModel.build(map, self);
    }

    public PublicListedSandbox setAutoPause(Boolean autoPause) {
        this.autoPause = autoPause;
        return this;
    }
    public Boolean getAutoPause() {
        return this.autoPause;
    }

    public PublicListedSandbox setAutoResume(Boolean autoResume) {
        this.autoResume = autoResume;
        return this;
    }
    public Boolean getAutoResume() {
        return this.autoResume;
    }

    public PublicListedSandbox setCpu(Float cpu) {
        this.cpu = cpu;
        return this;
    }
    public Float getCpu() {
        return this.cpu;
    }

    public PublicListedSandbox setDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
        return this;
    }
    public Integer getDiskSize() {
        return this.diskSize;
    }

    public PublicListedSandbox setEndAt(String endAt) {
        this.endAt = endAt;
        return this;
    }
    public String getEndAt() {
        return this.endAt;
    }

    public PublicListedSandbox setMemorySize(Integer memorySize) {
        this.memorySize = memorySize;
        return this;
    }
    public Integer getMemorySize() {
        return this.memorySize;
    }

    public PublicListedSandbox setResourceGroupID(String resourceGroupID) {
        this.resourceGroupID = resourceGroupID;
        return this;
    }
    public String getResourceGroupID() {
        return this.resourceGroupID;
    }

    public PublicListedSandbox setResourceTags(java.util.List<PublicListedSandboxResourceTags> resourceTags) {
        this.resourceTags = resourceTags;
        return this;
    }
    public java.util.List<PublicListedSandboxResourceTags> getResourceTags() {
        return this.resourceTags;
    }

    public PublicListedSandbox setSandboxID(String sandboxID) {
        this.sandboxID = sandboxID;
        return this;
    }
    public String getSandboxID() {
        return this.sandboxID;
    }

    public PublicListedSandbox setStartedAt(String startedAt) {
        this.startedAt = startedAt;
        return this;
    }
    public String getStartedAt() {
        return this.startedAt;
    }

    public PublicListedSandbox setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public PublicListedSandbox setTeamID(String teamID) {
        this.teamID = teamID;
        return this;
    }
    public String getTeamID() {
        return this.teamID;
    }

    public PublicListedSandbox setTeamName(String teamName) {
        this.teamName = teamName;
        return this;
    }
    public String getTeamName() {
        return this.teamName;
    }

    public PublicListedSandbox setTemplateID(String templateID) {
        this.templateID = templateID;
        return this;
    }
    public String getTemplateID() {
        return this.templateID;
    }

    public PublicListedSandbox setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public PublicListedSandbox setUserID(String userID) {
        this.userID = userID;
        return this;
    }
    public String getUserID() {
        return this.userID;
    }

    public static class PublicListedSandboxResourceTags extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>project</p>
         */
        @NameInMap("tagKey")
        public String tagKey;

        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("tagValue")
        public String tagValue;

        public static PublicListedSandboxResourceTags build(java.util.Map<String, ?> map) throws Exception {
            PublicListedSandboxResourceTags self = new PublicListedSandboxResourceTags();
            return TeaModel.build(map, self);
        }

        public PublicListedSandboxResourceTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public PublicListedSandboxResourceTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

}
