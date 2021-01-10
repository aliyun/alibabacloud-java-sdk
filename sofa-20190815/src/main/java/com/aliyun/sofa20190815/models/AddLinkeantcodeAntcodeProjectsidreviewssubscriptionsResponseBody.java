// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponseBody extends TeaModel {
    @NameInMap("Type")
    public String type;

    @NameInMap("Email")
    public String email;

    @NameInMap("User")
    public AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponseBodyUser user;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Subscribed")
    public Boolean subscribed;

    @NameInMap("Id")
    public Long id;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    public static AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponseBody self = new AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponseBody();
        return TeaModel.build(map, self);
    }

    public AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponseBody setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponseBody setUser(AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponseBodyUser user) {
        this.user = user;
        return this;
    }
    public AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponseBodyUser getUser() {
        return this.user;
    }

    public AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponseBody setSubscribed(Boolean subscribed) {
        this.subscribed = subscribed;
        return this;
    }
    public Boolean getSubscribed() {
        return this.subscribed;
    }

    public AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponseBodyUser extends TeaModel {
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

        public static AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponseBodyUser build(java.util.Map<String, ?> map) throws Exception {
            AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponseBodyUser self = new AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponseBodyUser();
            return TeaModel.build(map, self);
        }

        public AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponseBodyUser setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponseBodyUser setCurrentSignInAt(String currentSignInAt) {
            this.currentSignInAt = currentSignInAt;
            return this;
        }
        public String getCurrentSignInAt() {
            return this.currentSignInAt;
        }

        public AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponseBodyUser setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

        public AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponseBodyUser setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponseBodyUser setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponseBodyUser setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponseBodyUser setExternUid(String externUid) {
            this.externUid = externUid;
            return this;
        }
        public String getExternUid() {
            return this.externUid;
        }

        public AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponseBodyUser setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponseBodyUser setThemeId(Long themeId) {
            this.themeId = themeId;
            return this;
        }
        public Long getThemeId() {
            return this.themeId;
        }

        public AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponseBodyUser setBio(String bio) {
            this.bio = bio;
            return this;
        }
        public String getBio() {
            return this.bio;
        }

        public AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponseBodyUser setCanCreateProject(Boolean canCreateProject) {
            this.canCreateProject = canCreateProject;
            return this;
        }
        public Boolean getCanCreateProject() {
            return this.canCreateProject;
        }

        public AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponseBodyUser setIsAdmin(Boolean isAdmin) {
            this.isAdmin = isAdmin;
            return this;
        }
        public Boolean getIsAdmin() {
            return this.isAdmin;
        }

        public AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponseBodyUser setCanCreateGroup(Boolean canCreateGroup) {
            this.canCreateGroup = canCreateGroup;
            return this;
        }
        public Boolean getCanCreateGroup() {
            return this.canCreateGroup;
        }

        public AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponseBodyUser setExpiresAt(String expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }
        public String getExpiresAt() {
            return this.expiresAt;
        }

        public AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponseBodyUser setProjectsLimit(Long projectsLimit) {
            this.projectsLimit = projectsLimit;
            return this;
        }
        public Long getProjectsLimit() {
            return this.projectsLimit;
        }

        public AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponseBodyUser setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponseBodyUser setWebsiteUrl(String websiteUrl) {
            this.websiteUrl = websiteUrl;
            return this;
        }
        public String getWebsiteUrl() {
            return this.websiteUrl;
        }

        public AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponseBodyUser setIdentities(java.util.List<String> identities) {
            this.identities = identities;
            return this;
        }
        public java.util.List<String> getIdentities() {
            return this.identities;
        }

        public AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponseBodyUser setAccessLevel(Long accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }
        public Long getAccessLevel() {
            return this.accessLevel;
        }

        public AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponseBodyUser setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponseBodyUser setRole(Long role) {
            this.role = role;
            return this;
        }
        public Long getRole() {
            return this.role;
        }

        public AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponseBodyUser setPrivateToken(String privateToken) {
            this.privateToken = privateToken;
            return this;
        }
        public String getPrivateToken() {
            return this.privateToken;
        }

        public AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponseBodyUser setRegistered(Boolean registered) {
            this.registered = registered;
            return this;
        }
        public Boolean getRegistered() {
            return this.registered;
        }

        public AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponseBodyUser setColorSchemeId(Long colorSchemeId) {
            this.colorSchemeId = colorSchemeId;
            return this;
        }
        public Long getColorSchemeId() {
            return this.colorSchemeId;
        }

        public AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponseBodyUser setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponseBodyUser setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

}
