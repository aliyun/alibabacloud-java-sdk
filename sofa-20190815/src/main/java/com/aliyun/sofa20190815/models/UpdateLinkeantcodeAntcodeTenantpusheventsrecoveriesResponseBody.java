// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Branch")
    public String branch;

    @NameInMap("CompletedEventsCount")
    public Long completedEventsCount;

    @NameInMap("CreatedAt")
    public String createdAt;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("Id")
    public Long id;

    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("PushedBy")
    public Long pushedBy;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("Status")
    public String status;

    @NameInMap("Target")
    public String target;

    @NameInMap("TotalEventsCount")
    public Long totalEventsCount;

    @NameInMap("UpdatedAt")
    public String updatedAt;

    @NameInMap("Creator")
    public UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBodyCreator creator;

    public static UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBody self = new UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBody setBranch(String branch) {
        this.branch = branch;
        return this;
    }
    public String getBranch() {
        return this.branch;
    }

    public UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBody setCompletedEventsCount(Long completedEventsCount) {
        this.completedEventsCount = completedEventsCount;
        return this;
    }
    public Long getCompletedEventsCount() {
        return this.completedEventsCount;
    }

    public UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBody setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBody setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBody setPushedBy(Long pushedBy) {
        this.pushedBy = pushedBy;
        return this;
    }
    public Long getPushedBy() {
        return this.pushedBy;
    }

    public UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBody setTarget(String target) {
        this.target = target;
        return this;
    }
    public String getTarget() {
        return this.target;
    }

    public UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBody setTotalEventsCount(Long totalEventsCount) {
        this.totalEventsCount = totalEventsCount;
        return this;
    }
    public Long getTotalEventsCount() {
        return this.totalEventsCount;
    }

    public UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBody setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBody setCreator(UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBodyCreator creator) {
        this.creator = creator;
        return this;
    }
    public UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBodyCreator getCreator() {
        return this.creator;
    }

    public static class UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBodyCreator extends TeaModel {
        @NameInMap("AccessLevel")
        public Long accessLevel;

        @NameInMap("AvatarUrl")
        public String avatarUrl;

        @NameInMap("Bio")
        public String bio;

        @NameInMap("CanCreateGroup")
        public Boolean canCreateGroup;

        @NameInMap("CanCreateProject")
        public Boolean canCreateProject;

        @NameInMap("ColorSchemeId")
        public Long colorSchemeId;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("CurrentSignInAt")
        public String currentSignInAt;

        @NameInMap("Department")
        public String department;

        @NameInMap("Email")
        public String email;

        @NameInMap("ExpiresAt")
        public String expiresAt;

        @NameInMap("ExternUid")
        public String externUid;

        @NameInMap("Id")
        public Long id;

        @NameInMap("IsAdmin")
        public Boolean isAdmin;

        @NameInMap("Name")
        public String name;

        @NameInMap("PrivateToken")
        public String privateToken;

        @NameInMap("ProjectsLimit")
        public Long projectsLimit;

        @NameInMap("Registered")
        public Boolean registered;

        @NameInMap("Role")
        public Long role;

        @NameInMap("State")
        public String state;

        @NameInMap("ThemeId")
        public Long themeId;

        @NameInMap("UpdatedAt")
        public String updatedAt;

        @NameInMap("Username")
        public String username;

        @NameInMap("WebsiteUrl")
        public String websiteUrl;

        @NameInMap("WebUrl")
        public String webUrl;

        @NameInMap("Identities")
        public java.util.List<String> identities;

        public static UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBodyCreator build(java.util.Map<String, ?> map) throws Exception {
            UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBodyCreator self = new UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBodyCreator();
            return TeaModel.build(map, self);
        }

        public UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBodyCreator setAccessLevel(Long accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }
        public Long getAccessLevel() {
            return this.accessLevel;
        }

        public UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBodyCreator setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBodyCreator setBio(String bio) {
            this.bio = bio;
            return this;
        }
        public String getBio() {
            return this.bio;
        }

        public UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBodyCreator setCanCreateGroup(Boolean canCreateGroup) {
            this.canCreateGroup = canCreateGroup;
            return this;
        }
        public Boolean getCanCreateGroup() {
            return this.canCreateGroup;
        }

        public UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBodyCreator setCanCreateProject(Boolean canCreateProject) {
            this.canCreateProject = canCreateProject;
            return this;
        }
        public Boolean getCanCreateProject() {
            return this.canCreateProject;
        }

        public UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBodyCreator setColorSchemeId(Long colorSchemeId) {
            this.colorSchemeId = colorSchemeId;
            return this;
        }
        public Long getColorSchemeId() {
            return this.colorSchemeId;
        }

        public UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBodyCreator setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBodyCreator setCurrentSignInAt(String currentSignInAt) {
            this.currentSignInAt = currentSignInAt;
            return this;
        }
        public String getCurrentSignInAt() {
            return this.currentSignInAt;
        }

        public UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBodyCreator setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBodyCreator setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBodyCreator setExpiresAt(String expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }
        public String getExpiresAt() {
            return this.expiresAt;
        }

        public UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBodyCreator setExternUid(String externUid) {
            this.externUid = externUid;
            return this;
        }
        public String getExternUid() {
            return this.externUid;
        }

        public UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBodyCreator setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBodyCreator setIsAdmin(Boolean isAdmin) {
            this.isAdmin = isAdmin;
            return this;
        }
        public Boolean getIsAdmin() {
            return this.isAdmin;
        }

        public UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBodyCreator setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBodyCreator setPrivateToken(String privateToken) {
            this.privateToken = privateToken;
            return this;
        }
        public String getPrivateToken() {
            return this.privateToken;
        }

        public UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBodyCreator setProjectsLimit(Long projectsLimit) {
            this.projectsLimit = projectsLimit;
            return this;
        }
        public Long getProjectsLimit() {
            return this.projectsLimit;
        }

        public UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBodyCreator setRegistered(Boolean registered) {
            this.registered = registered;
            return this;
        }
        public Boolean getRegistered() {
            return this.registered;
        }

        public UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBodyCreator setRole(Long role) {
            this.role = role;
            return this;
        }
        public Long getRole() {
            return this.role;
        }

        public UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBodyCreator setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBodyCreator setThemeId(Long themeId) {
            this.themeId = themeId;
            return this;
        }
        public Long getThemeId() {
            return this.themeId;
        }

        public UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBodyCreator setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBodyCreator setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBodyCreator setWebsiteUrl(String websiteUrl) {
            this.websiteUrl = websiteUrl;
            return this;
        }
        public String getWebsiteUrl() {
            return this.websiteUrl;
        }

        public UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBodyCreator setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

        public UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBodyCreator setIdentities(java.util.List<String> identities) {
            this.identities = identities;
            return this;
        }
        public java.util.List<String> getIdentities() {
            return this.identities;
        }

    }

}
