// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeantcodeAntcodeUsersResponseBody extends TeaModel {
    @NameInMap("PrivateToken")
    public String privateToken;

    @NameInMap("IsAdmin")
    public Boolean isAdmin;

    @NameInMap("Email")
    public String email;

    @NameInMap("CreatedAt")
    public String createdAt;

    @NameInMap("Name")
    public String name;

    @NameInMap("Department")
    public String department;

    @NameInMap("AvatarUrl")
    public String avatarUrl;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("ExternUid")
    public String externUid;

    @NameInMap("Identities")
    public java.util.List<CreateLinkeantcodeAntcodeUsersResponseBodyIdentities> identities;

    @NameInMap("CanCreateProject")
    public Boolean canCreateProject;

    @NameInMap("ColorSchemeId")
    public Long colorSchemeId;

    @NameInMap("ThemeId")
    public Long themeId;

    @NameInMap("CanCreateGroup")
    public Boolean canCreateGroup;

    @NameInMap("CurrentSignInAt")
    public String currentSignInAt;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ProjectsLimit")
    public Long projectsLimit;

    @NameInMap("WebsiteUrl")
    public String websiteUrl;

    @NameInMap("WebUrl")
    public String webUrl;

    @NameInMap("Bio")
    public String bio;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("UpdatedAt")
    public String updatedAt;

    @NameInMap("Role")
    public Long role;

    @NameInMap("Username")
    public String username;

    @NameInMap("State")
    public String state;

    @NameInMap("Id")
    public Long id;

    @NameInMap("ResultCode")
    public String resultCode;

    public static CreateLinkeantcodeAntcodeUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeantcodeAntcodeUsersResponseBody self = new CreateLinkeantcodeAntcodeUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLinkeantcodeAntcodeUsersResponseBody setPrivateToken(String privateToken) {
        this.privateToken = privateToken;
        return this;
    }
    public String getPrivateToken() {
        return this.privateToken;
    }

    public CreateLinkeantcodeAntcodeUsersResponseBody setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
        return this;
    }
    public Boolean getIsAdmin() {
        return this.isAdmin;
    }

    public CreateLinkeantcodeAntcodeUsersResponseBody setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public CreateLinkeantcodeAntcodeUsersResponseBody setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public CreateLinkeantcodeAntcodeUsersResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateLinkeantcodeAntcodeUsersResponseBody setDepartment(String department) {
        this.department = department;
        return this;
    }
    public String getDepartment() {
        return this.department;
    }

    public CreateLinkeantcodeAntcodeUsersResponseBody setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
        return this;
    }
    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    public CreateLinkeantcodeAntcodeUsersResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public CreateLinkeantcodeAntcodeUsersResponseBody setExternUid(String externUid) {
        this.externUid = externUid;
        return this;
    }
    public String getExternUid() {
        return this.externUid;
    }

    public CreateLinkeantcodeAntcodeUsersResponseBody setIdentities(java.util.List<CreateLinkeantcodeAntcodeUsersResponseBodyIdentities> identities) {
        this.identities = identities;
        return this;
    }
    public java.util.List<CreateLinkeantcodeAntcodeUsersResponseBodyIdentities> getIdentities() {
        return this.identities;
    }

    public CreateLinkeantcodeAntcodeUsersResponseBody setCanCreateProject(Boolean canCreateProject) {
        this.canCreateProject = canCreateProject;
        return this;
    }
    public Boolean getCanCreateProject() {
        return this.canCreateProject;
    }

    public CreateLinkeantcodeAntcodeUsersResponseBody setColorSchemeId(Long colorSchemeId) {
        this.colorSchemeId = colorSchemeId;
        return this;
    }
    public Long getColorSchemeId() {
        return this.colorSchemeId;
    }

    public CreateLinkeantcodeAntcodeUsersResponseBody setThemeId(Long themeId) {
        this.themeId = themeId;
        return this;
    }
    public Long getThemeId() {
        return this.themeId;
    }

    public CreateLinkeantcodeAntcodeUsersResponseBody setCanCreateGroup(Boolean canCreateGroup) {
        this.canCreateGroup = canCreateGroup;
        return this;
    }
    public Boolean getCanCreateGroup() {
        return this.canCreateGroup;
    }

    public CreateLinkeantcodeAntcodeUsersResponseBody setCurrentSignInAt(String currentSignInAt) {
        this.currentSignInAt = currentSignInAt;
        return this;
    }
    public String getCurrentSignInAt() {
        return this.currentSignInAt;
    }

    public CreateLinkeantcodeAntcodeUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateLinkeantcodeAntcodeUsersResponseBody setProjectsLimit(Long projectsLimit) {
        this.projectsLimit = projectsLimit;
        return this;
    }
    public Long getProjectsLimit() {
        return this.projectsLimit;
    }

    public CreateLinkeantcodeAntcodeUsersResponseBody setWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
        return this;
    }
    public String getWebsiteUrl() {
        return this.websiteUrl;
    }

    public CreateLinkeantcodeAntcodeUsersResponseBody setWebUrl(String webUrl) {
        this.webUrl = webUrl;
        return this;
    }
    public String getWebUrl() {
        return this.webUrl;
    }

    public CreateLinkeantcodeAntcodeUsersResponseBody setBio(String bio) {
        this.bio = bio;
        return this;
    }
    public String getBio() {
        return this.bio;
    }

    public CreateLinkeantcodeAntcodeUsersResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CreateLinkeantcodeAntcodeUsersResponseBody setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public CreateLinkeantcodeAntcodeUsersResponseBody setRole(Long role) {
        this.role = role;
        return this;
    }
    public Long getRole() {
        return this.role;
    }

    public CreateLinkeantcodeAntcodeUsersResponseBody setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

    public CreateLinkeantcodeAntcodeUsersResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public CreateLinkeantcodeAntcodeUsersResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public CreateLinkeantcodeAntcodeUsersResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class CreateLinkeantcodeAntcodeUsersResponseBodyIdentities extends TeaModel {
        @NameInMap("ExternUid")
        public String externUid;

        @NameInMap("Provider")
        public String provider;

        public static CreateLinkeantcodeAntcodeUsersResponseBodyIdentities build(java.util.Map<String, ?> map) throws Exception {
            CreateLinkeantcodeAntcodeUsersResponseBodyIdentities self = new CreateLinkeantcodeAntcodeUsersResponseBodyIdentities();
            return TeaModel.build(map, self);
        }

        public CreateLinkeantcodeAntcodeUsersResponseBodyIdentities setExternUid(String externUid) {
            this.externUid = externUid;
            return this;
        }
        public String getExternUid() {
            return this.externUid;
        }

        public CreateLinkeantcodeAntcodeUsersResponseBodyIdentities setProvider(String provider) {
            this.provider = provider;
            return this;
        }
        public String getProvider() {
            return this.provider;
        }

    }

}
