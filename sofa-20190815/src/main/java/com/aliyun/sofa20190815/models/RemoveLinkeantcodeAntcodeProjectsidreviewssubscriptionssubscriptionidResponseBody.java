// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Email")
    public String email;

    @NameInMap("Id")
    public Long id;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Subscribed")
    public Boolean subscribed;

    @NameInMap("Type")
    public String type;

    @NameInMap("User")
    public RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponseBodyUser user;

    public static RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponseBody self = new RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponseBody setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponseBody setSubscribed(Boolean subscribed) {
        this.subscribed = subscribed;
        return this;
    }
    public Boolean getSubscribed() {
        return this.subscribed;
    }

    public RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponseBody setUser(RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponseBodyUser user) {
        this.user = user;
        return this;
    }
    public RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponseBodyUser getUser() {
        return this.user;
    }

    public static class RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponseBodyUser extends TeaModel {
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

        public static RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponseBodyUser build(java.util.Map<String, ?> map) throws Exception {
            RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponseBodyUser self = new RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponseBodyUser();
            return TeaModel.build(map, self);
        }

        public RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponseBodyUser setAccessLevel(Long accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }
        public Long getAccessLevel() {
            return this.accessLevel;
        }

        public RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponseBodyUser setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponseBodyUser setBio(String bio) {
            this.bio = bio;
            return this;
        }
        public String getBio() {
            return this.bio;
        }

        public RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponseBodyUser setCanCreateGroup(Boolean canCreateGroup) {
            this.canCreateGroup = canCreateGroup;
            return this;
        }
        public Boolean getCanCreateGroup() {
            return this.canCreateGroup;
        }

        public RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponseBodyUser setCanCreateProject(Boolean canCreateProject) {
            this.canCreateProject = canCreateProject;
            return this;
        }
        public Boolean getCanCreateProject() {
            return this.canCreateProject;
        }

        public RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponseBodyUser setColorSchemeId(Long colorSchemeId) {
            this.colorSchemeId = colorSchemeId;
            return this;
        }
        public Long getColorSchemeId() {
            return this.colorSchemeId;
        }

        public RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponseBodyUser setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponseBodyUser setCurrentSignInAt(String currentSignInAt) {
            this.currentSignInAt = currentSignInAt;
            return this;
        }
        public String getCurrentSignInAt() {
            return this.currentSignInAt;
        }

        public RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponseBodyUser setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponseBodyUser setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponseBodyUser setExpiresAt(String expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }
        public String getExpiresAt() {
            return this.expiresAt;
        }

        public RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponseBodyUser setExternUid(String externUid) {
            this.externUid = externUid;
            return this;
        }
        public String getExternUid() {
            return this.externUid;
        }

        public RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponseBodyUser setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponseBodyUser setIsAdmin(Boolean isAdmin) {
            this.isAdmin = isAdmin;
            return this;
        }
        public Boolean getIsAdmin() {
            return this.isAdmin;
        }

        public RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponseBodyUser setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponseBodyUser setPrivateToken(String privateToken) {
            this.privateToken = privateToken;
            return this;
        }
        public String getPrivateToken() {
            return this.privateToken;
        }

        public RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponseBodyUser setProjectsLimit(Long projectsLimit) {
            this.projectsLimit = projectsLimit;
            return this;
        }
        public Long getProjectsLimit() {
            return this.projectsLimit;
        }

        public RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponseBodyUser setRegistered(Boolean registered) {
            this.registered = registered;
            return this;
        }
        public Boolean getRegistered() {
            return this.registered;
        }

        public RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponseBodyUser setRole(Long role) {
            this.role = role;
            return this;
        }
        public Long getRole() {
            return this.role;
        }

        public RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponseBodyUser setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponseBodyUser setThemeId(Long themeId) {
            this.themeId = themeId;
            return this;
        }
        public Long getThemeId() {
            return this.themeId;
        }

        public RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponseBodyUser setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponseBodyUser setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponseBodyUser setWebsiteUrl(String websiteUrl) {
            this.websiteUrl = websiteUrl;
            return this;
        }
        public String getWebsiteUrl() {
            return this.websiteUrl;
        }

        public RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponseBodyUser setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

        public RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponseBodyUser setIdentities(java.util.List<String> identities) {
            this.identities = identities;
            return this;
        }
        public java.util.List<String> getIdentities() {
            return this.identities;
        }

    }

}
