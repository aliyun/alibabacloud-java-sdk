// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBody extends TeaModel {
    @NameInMap("Status")
    public String status;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CompletedEventsCount")
    public Long completedEventsCount;

    @NameInMap("CreatedAt")
    public String createdAt;

    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("Creator")
    public CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBodyCreator creator;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("PushedBy")
    public Long pushedBy;

    @NameInMap("UpdatedAt")
    public String updatedAt;

    @NameInMap("Target")
    public String target;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Branch")
    public String branch;

    @NameInMap("TotalEventsCount")
    public Long totalEventsCount;

    @NameInMap("Id")
    public Long id;

    @NameInMap("ResultCode")
    public String resultCode;

    public static CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBody self = new CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBody setCompletedEventsCount(Long completedEventsCount) {
        this.completedEventsCount = completedEventsCount;
        return this;
    }
    public Long getCompletedEventsCount() {
        return this.completedEventsCount;
    }

    public CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBody setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBody setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBody setCreator(CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBodyCreator creator) {
        this.creator = creator;
        return this;
    }
    public CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBodyCreator getCreator() {
        return this.creator;
    }

    public CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBody setPushedBy(Long pushedBy) {
        this.pushedBy = pushedBy;
        return this;
    }
    public Long getPushedBy() {
        return this.pushedBy;
    }

    public CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBody setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBody setTarget(String target) {
        this.target = target;
        return this;
    }
    public String getTarget() {
        return this.target;
    }

    public CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBody setBranch(String branch) {
        this.branch = branch;
        return this;
    }
    public String getBranch() {
        return this.branch;
    }

    public CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBody setTotalEventsCount(Long totalEventsCount) {
        this.totalEventsCount = totalEventsCount;
        return this;
    }
    public Long getTotalEventsCount() {
        return this.totalEventsCount;
    }

    public CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBodyCreator extends TeaModel {
        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("CurrentSignInAt")
        public String currentSignInAt;

        @NameInMap("WebUrl")
        public String webUrl;

        @NameInMap("Name")
        public String name;

        @NameInMap("Department")
        public String department;

        @NameInMap("AvatarUrl")
        public String avatarUrl;

        @NameInMap("ExternUid")
        public String externUid;

        @NameInMap("State")
        public String state;

        @NameInMap("ThemeId")
        public Long themeId;

        @NameInMap("Bio")
        public String bio;

        @NameInMap("CanCreateProject")
        public Boolean canCreateProject;

        @NameInMap("IsAdmin")
        public Boolean isAdmin;

        @NameInMap("CanCreateGroup")
        public Boolean canCreateGroup;

        @NameInMap("NotificationLevel")
        public Long notificationLevel;

        @NameInMap("ExpiresAt")
        public String expiresAt;

        @NameInMap("ProjectsLimit")
        public Long projectsLimit;

        @NameInMap("Email")
        public String email;

        @NameInMap("WebsiteUrl")
        public String websiteUrl;

        @NameInMap("Identities")
        public java.util.List<String> identities;

        @NameInMap("AccessLevel")
        public Long accessLevel;

        @NameInMap("UpdatedAt")
        public String updatedAt;

        @NameInMap("Role")
        public Long role;

        @NameInMap("PrivateToken")
        public String privateToken;

        @NameInMap("Registered")
        public Boolean registered;

        @NameInMap("ColorSchemeId")
        public Long colorSchemeId;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Username")
        public String username;

        public static CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBodyCreator build(java.util.Map<String, ?> map) throws Exception {
            CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBodyCreator self = new CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBodyCreator();
            return TeaModel.build(map, self);
        }

        public CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBodyCreator setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBodyCreator setCurrentSignInAt(String currentSignInAt) {
            this.currentSignInAt = currentSignInAt;
            return this;
        }
        public String getCurrentSignInAt() {
            return this.currentSignInAt;
        }

        public CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBodyCreator setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

        public CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBodyCreator setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBodyCreator setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBodyCreator setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBodyCreator setExternUid(String externUid) {
            this.externUid = externUid;
            return this;
        }
        public String getExternUid() {
            return this.externUid;
        }

        public CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBodyCreator setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBodyCreator setThemeId(Long themeId) {
            this.themeId = themeId;
            return this;
        }
        public Long getThemeId() {
            return this.themeId;
        }

        public CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBodyCreator setBio(String bio) {
            this.bio = bio;
            return this;
        }
        public String getBio() {
            return this.bio;
        }

        public CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBodyCreator setCanCreateProject(Boolean canCreateProject) {
            this.canCreateProject = canCreateProject;
            return this;
        }
        public Boolean getCanCreateProject() {
            return this.canCreateProject;
        }

        public CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBodyCreator setIsAdmin(Boolean isAdmin) {
            this.isAdmin = isAdmin;
            return this;
        }
        public Boolean getIsAdmin() {
            return this.isAdmin;
        }

        public CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBodyCreator setCanCreateGroup(Boolean canCreateGroup) {
            this.canCreateGroup = canCreateGroup;
            return this;
        }
        public Boolean getCanCreateGroup() {
            return this.canCreateGroup;
        }

        public CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBodyCreator setNotificationLevel(Long notificationLevel) {
            this.notificationLevel = notificationLevel;
            return this;
        }
        public Long getNotificationLevel() {
            return this.notificationLevel;
        }

        public CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBodyCreator setExpiresAt(String expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }
        public String getExpiresAt() {
            return this.expiresAt;
        }

        public CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBodyCreator setProjectsLimit(Long projectsLimit) {
            this.projectsLimit = projectsLimit;
            return this;
        }
        public Long getProjectsLimit() {
            return this.projectsLimit;
        }

        public CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBodyCreator setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBodyCreator setWebsiteUrl(String websiteUrl) {
            this.websiteUrl = websiteUrl;
            return this;
        }
        public String getWebsiteUrl() {
            return this.websiteUrl;
        }

        public CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBodyCreator setIdentities(java.util.List<String> identities) {
            this.identities = identities;
            return this;
        }
        public java.util.List<String> getIdentities() {
            return this.identities;
        }

        public CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBodyCreator setAccessLevel(Long accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }
        public Long getAccessLevel() {
            return this.accessLevel;
        }

        public CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBodyCreator setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBodyCreator setRole(Long role) {
            this.role = role;
            return this;
        }
        public Long getRole() {
            return this.role;
        }

        public CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBodyCreator setPrivateToken(String privateToken) {
            this.privateToken = privateToken;
            return this;
        }
        public String getPrivateToken() {
            return this.privateToken;
        }

        public CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBodyCreator setRegistered(Boolean registered) {
            this.registered = registered;
            return this;
        }
        public Boolean getRegistered() {
            return this.registered;
        }

        public CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBodyCreator setColorSchemeId(Long colorSchemeId) {
            this.colorSchemeId = colorSchemeId;
            return this;
        }
        public Long getColorSchemeId() {
            return this.colorSchemeId;
        }

        public CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBodyCreator setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBodyCreator setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

}
