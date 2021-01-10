// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RemoveLinkeantcodeAntcodeRemovereviewssubscriptionResponseBody extends TeaModel {
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
    public RemoveLinkeantcodeAntcodeRemovereviewssubscriptionResponseBodyUser user;

    public static RemoveLinkeantcodeAntcodeRemovereviewssubscriptionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveLinkeantcodeAntcodeRemovereviewssubscriptionResponseBody self = new RemoveLinkeantcodeAntcodeRemovereviewssubscriptionResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveLinkeantcodeAntcodeRemovereviewssubscriptionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RemoveLinkeantcodeAntcodeRemovereviewssubscriptionResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public RemoveLinkeantcodeAntcodeRemovereviewssubscriptionResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public RemoveLinkeantcodeAntcodeRemovereviewssubscriptionResponseBody setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public RemoveLinkeantcodeAntcodeRemovereviewssubscriptionResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public RemoveLinkeantcodeAntcodeRemovereviewssubscriptionResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public RemoveLinkeantcodeAntcodeRemovereviewssubscriptionResponseBody setSubscribed(Boolean subscribed) {
        this.subscribed = subscribed;
        return this;
    }
    public Boolean getSubscribed() {
        return this.subscribed;
    }

    public RemoveLinkeantcodeAntcodeRemovereviewssubscriptionResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public RemoveLinkeantcodeAntcodeRemovereviewssubscriptionResponseBody setUser(RemoveLinkeantcodeAntcodeRemovereviewssubscriptionResponseBodyUser user) {
        this.user = user;
        return this;
    }
    public RemoveLinkeantcodeAntcodeRemovereviewssubscriptionResponseBodyUser getUser() {
        return this.user;
    }

    public static class RemoveLinkeantcodeAntcodeRemovereviewssubscriptionResponseBodyUser extends TeaModel {
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

        public static RemoveLinkeantcodeAntcodeRemovereviewssubscriptionResponseBodyUser build(java.util.Map<String, ?> map) throws Exception {
            RemoveLinkeantcodeAntcodeRemovereviewssubscriptionResponseBodyUser self = new RemoveLinkeantcodeAntcodeRemovereviewssubscriptionResponseBodyUser();
            return TeaModel.build(map, self);
        }

        public RemoveLinkeantcodeAntcodeRemovereviewssubscriptionResponseBodyUser setAccessLevel(Long accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }
        public Long getAccessLevel() {
            return this.accessLevel;
        }

        public RemoveLinkeantcodeAntcodeRemovereviewssubscriptionResponseBodyUser setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public RemoveLinkeantcodeAntcodeRemovereviewssubscriptionResponseBodyUser setBio(String bio) {
            this.bio = bio;
            return this;
        }
        public String getBio() {
            return this.bio;
        }

        public RemoveLinkeantcodeAntcodeRemovereviewssubscriptionResponseBodyUser setCanCreateGroup(Boolean canCreateGroup) {
            this.canCreateGroup = canCreateGroup;
            return this;
        }
        public Boolean getCanCreateGroup() {
            return this.canCreateGroup;
        }

        public RemoveLinkeantcodeAntcodeRemovereviewssubscriptionResponseBodyUser setCanCreateProject(Boolean canCreateProject) {
            this.canCreateProject = canCreateProject;
            return this;
        }
        public Boolean getCanCreateProject() {
            return this.canCreateProject;
        }

        public RemoveLinkeantcodeAntcodeRemovereviewssubscriptionResponseBodyUser setColorSchemeId(Long colorSchemeId) {
            this.colorSchemeId = colorSchemeId;
            return this;
        }
        public Long getColorSchemeId() {
            return this.colorSchemeId;
        }

        public RemoveLinkeantcodeAntcodeRemovereviewssubscriptionResponseBodyUser setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public RemoveLinkeantcodeAntcodeRemovereviewssubscriptionResponseBodyUser setCurrentSignInAt(String currentSignInAt) {
            this.currentSignInAt = currentSignInAt;
            return this;
        }
        public String getCurrentSignInAt() {
            return this.currentSignInAt;
        }

        public RemoveLinkeantcodeAntcodeRemovereviewssubscriptionResponseBodyUser setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public RemoveLinkeantcodeAntcodeRemovereviewssubscriptionResponseBodyUser setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public RemoveLinkeantcodeAntcodeRemovereviewssubscriptionResponseBodyUser setExpiresAt(String expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }
        public String getExpiresAt() {
            return this.expiresAt;
        }

        public RemoveLinkeantcodeAntcodeRemovereviewssubscriptionResponseBodyUser setExternUid(String externUid) {
            this.externUid = externUid;
            return this;
        }
        public String getExternUid() {
            return this.externUid;
        }

        public RemoveLinkeantcodeAntcodeRemovereviewssubscriptionResponseBodyUser setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public RemoveLinkeantcodeAntcodeRemovereviewssubscriptionResponseBodyUser setIsAdmin(Boolean isAdmin) {
            this.isAdmin = isAdmin;
            return this;
        }
        public Boolean getIsAdmin() {
            return this.isAdmin;
        }

        public RemoveLinkeantcodeAntcodeRemovereviewssubscriptionResponseBodyUser setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public RemoveLinkeantcodeAntcodeRemovereviewssubscriptionResponseBodyUser setPrivateToken(String privateToken) {
            this.privateToken = privateToken;
            return this;
        }
        public String getPrivateToken() {
            return this.privateToken;
        }

        public RemoveLinkeantcodeAntcodeRemovereviewssubscriptionResponseBodyUser setProjectsLimit(Long projectsLimit) {
            this.projectsLimit = projectsLimit;
            return this;
        }
        public Long getProjectsLimit() {
            return this.projectsLimit;
        }

        public RemoveLinkeantcodeAntcodeRemovereviewssubscriptionResponseBodyUser setRegistered(Boolean registered) {
            this.registered = registered;
            return this;
        }
        public Boolean getRegistered() {
            return this.registered;
        }

        public RemoveLinkeantcodeAntcodeRemovereviewssubscriptionResponseBodyUser setRole(Long role) {
            this.role = role;
            return this;
        }
        public Long getRole() {
            return this.role;
        }

        public RemoveLinkeantcodeAntcodeRemovereviewssubscriptionResponseBodyUser setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public RemoveLinkeantcodeAntcodeRemovereviewssubscriptionResponseBodyUser setThemeId(Long themeId) {
            this.themeId = themeId;
            return this;
        }
        public Long getThemeId() {
            return this.themeId;
        }

        public RemoveLinkeantcodeAntcodeRemovereviewssubscriptionResponseBodyUser setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public RemoveLinkeantcodeAntcodeRemovereviewssubscriptionResponseBodyUser setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public RemoveLinkeantcodeAntcodeRemovereviewssubscriptionResponseBodyUser setWebsiteUrl(String websiteUrl) {
            this.websiteUrl = websiteUrl;
            return this;
        }
        public String getWebsiteUrl() {
            return this.websiteUrl;
        }

        public RemoveLinkeantcodeAntcodeRemovereviewssubscriptionResponseBodyUser setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

        public RemoveLinkeantcodeAntcodeRemovereviewssubscriptionResponseBodyUser setIdentities(java.util.List<String> identities) {
            this.identities = identities;
            return this;
        }
        public java.util.List<String> getIdentities() {
            return this.identities;
        }

    }

}
