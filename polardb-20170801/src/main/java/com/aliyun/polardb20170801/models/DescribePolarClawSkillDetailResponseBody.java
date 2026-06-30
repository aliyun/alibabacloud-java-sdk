// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribePolarClawSkillDetailResponseBody extends TeaModel {
    /**
     * <p>The application ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-xxx</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The latest version information.</p>
     */
    @NameInMap("LatestVersion")
    public DescribePolarClawSkillDetailResponseBodyLatestVersion latestVersion;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The Skill author information.</p>
     */
    @NameInMap("Owner")
    public DescribePolarClawSkillDetailResponseBodyOwner owner;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>F45FFACC-xxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The core information of the Skill.</p>
     */
    @NameInMap("Skill")
    public DescribePolarClawSkillDetailResponseBodySkill skill;

    public static DescribePolarClawSkillDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePolarClawSkillDetailResponseBody self = new DescribePolarClawSkillDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePolarClawSkillDetailResponseBody setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public DescribePolarClawSkillDetailResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribePolarClawSkillDetailResponseBody setLatestVersion(DescribePolarClawSkillDetailResponseBodyLatestVersion latestVersion) {
        this.latestVersion = latestVersion;
        return this;
    }
    public DescribePolarClawSkillDetailResponseBodyLatestVersion getLatestVersion() {
        return this.latestVersion;
    }

    public DescribePolarClawSkillDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribePolarClawSkillDetailResponseBody setOwner(DescribePolarClawSkillDetailResponseBodyOwner owner) {
        this.owner = owner;
        return this;
    }
    public DescribePolarClawSkillDetailResponseBodyOwner getOwner() {
        return this.owner;
    }

    public DescribePolarClawSkillDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePolarClawSkillDetailResponseBody setSkill(DescribePolarClawSkillDetailResponseBodySkill skill) {
        this.skill = skill;
        return this;
    }
    public DescribePolarClawSkillDetailResponseBodySkill getSkill() {
        return this.skill;
    }

    public static class DescribePolarClawSkillDetailResponseBodyLatestVersion extends TeaModel {
        /**
         * <p>The version changelog.</p>
         * 
         * <strong>example:</strong>
         * <p>empty</p>
         */
        @NameInMap("Changelog")
        public String changelog;

        /**
         * <p>The version publish timestamp in Unix milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1767545394459</p>
         */
        @NameInMap("CreatedAt")
        public Long createdAt;

        /**
         * <p>The version number.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("Version")
        public String version;

        public static DescribePolarClawSkillDetailResponseBodyLatestVersion build(java.util.Map<String, ?> map) throws Exception {
            DescribePolarClawSkillDetailResponseBodyLatestVersion self = new DescribePolarClawSkillDetailResponseBodyLatestVersion();
            return TeaModel.build(map, self);
        }

        public DescribePolarClawSkillDetailResponseBodyLatestVersion setChangelog(String changelog) {
            this.changelog = changelog;
            return this;
        }
        public String getChangelog() {
            return this.changelog;
        }

        public DescribePolarClawSkillDetailResponseBodyLatestVersion setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Long getCreatedAt() {
            return this.createdAt;
        }

        public DescribePolarClawSkillDetailResponseBodyLatestVersion setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class DescribePolarClawSkillDetailResponseBodyOwner extends TeaModel {
        /**
         * <p>The display name of the author.</p>
         * 
         * <strong>example:</strong>
         * <p>Peter Steinberger</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The account identifier of the author.</p>
         * 
         * <strong>example:</strong>
         * <p>steipete</p>
         */
        @NameInMap("Handle")
        public String handle;

        /**
         * <p>The profile picture URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://avatars.githubusercontent.com/u/58493?v=4">https://avatars.githubusercontent.com/u/58493?v=4</a></p>
         */
        @NameInMap("Image")
        public String image;

        /**
         * <p>The user ID of the author.</p>
         * 
         * <strong>example:</strong>
         * <p>s179zksw999xz8ms4cy7pb2fr183m5jq</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static DescribePolarClawSkillDetailResponseBodyOwner build(java.util.Map<String, ?> map) throws Exception {
            DescribePolarClawSkillDetailResponseBodyOwner self = new DescribePolarClawSkillDetailResponseBodyOwner();
            return TeaModel.build(map, self);
        }

        public DescribePolarClawSkillDetailResponseBodyOwner setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public DescribePolarClawSkillDetailResponseBodyOwner setHandle(String handle) {
            this.handle = handle;
            return this;
        }
        public String getHandle() {
            return this.handle;
        }

        public DescribePolarClawSkillDetailResponseBodyOwner setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public DescribePolarClawSkillDetailResponseBodyOwner setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class DescribePolarClawSkillDetailResponseBodySkillStats extends TeaModel {
        /**
         * <p>The number of comments.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("Comments")
        public Long comments;

        /**
         * <p>The number of downloads.</p>
         * 
         * <strong>example:</strong>
         * <p>155765</p>
         */
        @NameInMap("Downloads")
        public Long downloads;

        /**
         * <p>The total number of installations of all time.</p>
         * 
         * <strong>example:</strong>
         * <p>3787</p>
         */
        @NameInMap("InstallsAllTime")
        public Long installsAllTime;

        /**
         * <p>The current number of installations.</p>
         * 
         * <strong>example:</strong>
         * <p>3664</p>
         */
        @NameInMap("InstallsCurrent")
        public Long installsCurrent;

        /**
         * <p>The number of stars.</p>
         * 
         * <strong>example:</strong>
         * <p>404</p>
         */
        @NameInMap("Stars")
        public Long stars;

        /**
         * <p>The number of versions.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Versions")
        public Long versions;

        public static DescribePolarClawSkillDetailResponseBodySkillStats build(java.util.Map<String, ?> map) throws Exception {
            DescribePolarClawSkillDetailResponseBodySkillStats self = new DescribePolarClawSkillDetailResponseBodySkillStats();
            return TeaModel.build(map, self);
        }

        public DescribePolarClawSkillDetailResponseBodySkillStats setComments(Long comments) {
            this.comments = comments;
            return this;
        }
        public Long getComments() {
            return this.comments;
        }

        public DescribePolarClawSkillDetailResponseBodySkillStats setDownloads(Long downloads) {
            this.downloads = downloads;
            return this;
        }
        public Long getDownloads() {
            return this.downloads;
        }

        public DescribePolarClawSkillDetailResponseBodySkillStats setInstallsAllTime(Long installsAllTime) {
            this.installsAllTime = installsAllTime;
            return this;
        }
        public Long getInstallsAllTime() {
            return this.installsAllTime;
        }

        public DescribePolarClawSkillDetailResponseBodySkillStats setInstallsCurrent(Long installsCurrent) {
            this.installsCurrent = installsCurrent;
            return this;
        }
        public Long getInstallsCurrent() {
            return this.installsCurrent;
        }

        public DescribePolarClawSkillDetailResponseBodySkillStats setStars(Long stars) {
            this.stars = stars;
            return this;
        }
        public Long getStars() {
            return this.stars;
        }

        public DescribePolarClawSkillDetailResponseBodySkillStats setVersions(Long versions) {
            this.versions = versions;
            return this;
        }
        public Long getVersions() {
            return this.versions;
        }

    }

    public static class DescribePolarClawSkillDetailResponseBodySkill extends TeaModel {
        /**
         * <p>The first publish timestamp in Unix milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1767545394459</p>
         */
        @NameInMap("CreatedAt")
        public Long createdAt;

        /**
         * <p>The display name.</p>
         * 
         * <strong>example:</strong>
         * <p>Weather</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The Skill identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>weather</p>
         */
        @NameInMap("Slug")
        public String slug;

        /**
         * <p>The statistics information.</p>
         */
        @NameInMap("Stats")
        public DescribePolarClawSkillDetailResponseBodySkillStats stats;

        /**
         * <p>The brief description.</p>
         * 
         * <strong>example:</strong>
         * <p>Get current weather and forecasts (no API key required).</p>
         */
        @NameInMap("Summary")
        public String summary;

        /**
         * <p>The tag key-value pairs.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;latest&quot;: &quot;1.0.0&quot;
         * }</p>
         */
        @NameInMap("Tags")
        public java.util.Map<String, ?> tags;

        /**
         * <p>The last update timestamp in Unix milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1778485729679</p>
         */
        @NameInMap("UpdatedAt")
        public Long updatedAt;

        public static DescribePolarClawSkillDetailResponseBodySkill build(java.util.Map<String, ?> map) throws Exception {
            DescribePolarClawSkillDetailResponseBodySkill self = new DescribePolarClawSkillDetailResponseBodySkill();
            return TeaModel.build(map, self);
        }

        public DescribePolarClawSkillDetailResponseBodySkill setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Long getCreatedAt() {
            return this.createdAt;
        }

        public DescribePolarClawSkillDetailResponseBodySkill setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public DescribePolarClawSkillDetailResponseBodySkill setSlug(String slug) {
            this.slug = slug;
            return this;
        }
        public String getSlug() {
            return this.slug;
        }

        public DescribePolarClawSkillDetailResponseBodySkill setStats(DescribePolarClawSkillDetailResponseBodySkillStats stats) {
            this.stats = stats;
            return this;
        }
        public DescribePolarClawSkillDetailResponseBodySkillStats getStats() {
            return this.stats;
        }

        public DescribePolarClawSkillDetailResponseBodySkill setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public DescribePolarClawSkillDetailResponseBodySkill setTags(java.util.Map<String, ?> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.Map<String, ?> getTags() {
            return this.tags;
        }

        public DescribePolarClawSkillDetailResponseBodySkill setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

    }

}
