// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeantcodeAntcodeSnippetsidResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Content")
    public String content;

    @NameInMap("CreatedAt")
    public String createdAt;

    @NameInMap("Description")
    public String description;

    @NameInMap("ExpiresAt")
    public String expiresAt;

    @NameInMap("FileName")
    public String fileName;

    @NameInMap("Id")
    public Long id;

    @NameInMap("Labels")
    public String labels;

    @NameInMap("Language")
    public String language;

    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Title")
    public String title;

    @NameInMap("Type")
    public String type;

    @NameInMap("UpdatedAt")
    public String updatedAt;

    @NameInMap("VisibilityLevel")
    public Long visibilityLevel;

    @NameInMap("Author")
    public UpdateLinkeantcodeAntcodeSnippetsidResponseBodyAuthor author;

    public static UpdateLinkeantcodeAntcodeSnippetsidResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeantcodeAntcodeSnippetsidResponseBody self = new UpdateLinkeantcodeAntcodeSnippetsidResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeantcodeAntcodeSnippetsidResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateLinkeantcodeAntcodeSnippetsidResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateLinkeantcodeAntcodeSnippetsidResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public UpdateLinkeantcodeAntcodeSnippetsidResponseBody setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public UpdateLinkeantcodeAntcodeSnippetsidResponseBody setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public UpdateLinkeantcodeAntcodeSnippetsidResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateLinkeantcodeAntcodeSnippetsidResponseBody setExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }
    public String getExpiresAt() {
        return this.expiresAt;
    }

    public UpdateLinkeantcodeAntcodeSnippetsidResponseBody setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public UpdateLinkeantcodeAntcodeSnippetsidResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateLinkeantcodeAntcodeSnippetsidResponseBody setLabels(String labels) {
        this.labels = labels;
        return this;
    }
    public String getLabels() {
        return this.labels;
    }

    public UpdateLinkeantcodeAntcodeSnippetsidResponseBody setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public UpdateLinkeantcodeAntcodeSnippetsidResponseBody setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public UpdateLinkeantcodeAntcodeSnippetsidResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public UpdateLinkeantcodeAntcodeSnippetsidResponseBody setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public UpdateLinkeantcodeAntcodeSnippetsidResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public UpdateLinkeantcodeAntcodeSnippetsidResponseBody setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public UpdateLinkeantcodeAntcodeSnippetsidResponseBody setVisibilityLevel(Long visibilityLevel) {
        this.visibilityLevel = visibilityLevel;
        return this;
    }
    public Long getVisibilityLevel() {
        return this.visibilityLevel;
    }

    public UpdateLinkeantcodeAntcodeSnippetsidResponseBody setAuthor(UpdateLinkeantcodeAntcodeSnippetsidResponseBodyAuthor author) {
        this.author = author;
        return this;
    }
    public UpdateLinkeantcodeAntcodeSnippetsidResponseBodyAuthor getAuthor() {
        return this.author;
    }

    public static class UpdateLinkeantcodeAntcodeSnippetsidResponseBodyAuthor extends TeaModel {
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

        public static UpdateLinkeantcodeAntcodeSnippetsidResponseBodyAuthor build(java.util.Map<String, ?> map) throws Exception {
            UpdateLinkeantcodeAntcodeSnippetsidResponseBodyAuthor self = new UpdateLinkeantcodeAntcodeSnippetsidResponseBodyAuthor();
            return TeaModel.build(map, self);
        }

        public UpdateLinkeantcodeAntcodeSnippetsidResponseBodyAuthor setAccessLevel(Long accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }
        public Long getAccessLevel() {
            return this.accessLevel;
        }

        public UpdateLinkeantcodeAntcodeSnippetsidResponseBodyAuthor setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public UpdateLinkeantcodeAntcodeSnippetsidResponseBodyAuthor setBio(String bio) {
            this.bio = bio;
            return this;
        }
        public String getBio() {
            return this.bio;
        }

        public UpdateLinkeantcodeAntcodeSnippetsidResponseBodyAuthor setCanCreateGroup(Boolean canCreateGroup) {
            this.canCreateGroup = canCreateGroup;
            return this;
        }
        public Boolean getCanCreateGroup() {
            return this.canCreateGroup;
        }

        public UpdateLinkeantcodeAntcodeSnippetsidResponseBodyAuthor setCanCreateProject(Boolean canCreateProject) {
            this.canCreateProject = canCreateProject;
            return this;
        }
        public Boolean getCanCreateProject() {
            return this.canCreateProject;
        }

        public UpdateLinkeantcodeAntcodeSnippetsidResponseBodyAuthor setColorSchemeId(Long colorSchemeId) {
            this.colorSchemeId = colorSchemeId;
            return this;
        }
        public Long getColorSchemeId() {
            return this.colorSchemeId;
        }

        public UpdateLinkeantcodeAntcodeSnippetsidResponseBodyAuthor setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public UpdateLinkeantcodeAntcodeSnippetsidResponseBodyAuthor setCurrentSignInAt(String currentSignInAt) {
            this.currentSignInAt = currentSignInAt;
            return this;
        }
        public String getCurrentSignInAt() {
            return this.currentSignInAt;
        }

        public UpdateLinkeantcodeAntcodeSnippetsidResponseBodyAuthor setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public UpdateLinkeantcodeAntcodeSnippetsidResponseBodyAuthor setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public UpdateLinkeantcodeAntcodeSnippetsidResponseBodyAuthor setExpiresAt(String expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }
        public String getExpiresAt() {
            return this.expiresAt;
        }

        public UpdateLinkeantcodeAntcodeSnippetsidResponseBodyAuthor setExternUid(String externUid) {
            this.externUid = externUid;
            return this;
        }
        public String getExternUid() {
            return this.externUid;
        }

        public UpdateLinkeantcodeAntcodeSnippetsidResponseBodyAuthor setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateLinkeantcodeAntcodeSnippetsidResponseBodyAuthor setIsAdmin(Boolean isAdmin) {
            this.isAdmin = isAdmin;
            return this;
        }
        public Boolean getIsAdmin() {
            return this.isAdmin;
        }

        public UpdateLinkeantcodeAntcodeSnippetsidResponseBodyAuthor setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateLinkeantcodeAntcodeSnippetsidResponseBodyAuthor setPrivateToken(String privateToken) {
            this.privateToken = privateToken;
            return this;
        }
        public String getPrivateToken() {
            return this.privateToken;
        }

        public UpdateLinkeantcodeAntcodeSnippetsidResponseBodyAuthor setProjectsLimit(Long projectsLimit) {
            this.projectsLimit = projectsLimit;
            return this;
        }
        public Long getProjectsLimit() {
            return this.projectsLimit;
        }

        public UpdateLinkeantcodeAntcodeSnippetsidResponseBodyAuthor setRegistered(Boolean registered) {
            this.registered = registered;
            return this;
        }
        public Boolean getRegistered() {
            return this.registered;
        }

        public UpdateLinkeantcodeAntcodeSnippetsidResponseBodyAuthor setRole(Long role) {
            this.role = role;
            return this;
        }
        public Long getRole() {
            return this.role;
        }

        public UpdateLinkeantcodeAntcodeSnippetsidResponseBodyAuthor setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public UpdateLinkeantcodeAntcodeSnippetsidResponseBodyAuthor setThemeId(Long themeId) {
            this.themeId = themeId;
            return this;
        }
        public Long getThemeId() {
            return this.themeId;
        }

        public UpdateLinkeantcodeAntcodeSnippetsidResponseBodyAuthor setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public UpdateLinkeantcodeAntcodeSnippetsidResponseBodyAuthor setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public UpdateLinkeantcodeAntcodeSnippetsidResponseBodyAuthor setWebsiteUrl(String websiteUrl) {
            this.websiteUrl = websiteUrl;
            return this;
        }
        public String getWebsiteUrl() {
            return this.websiteUrl;
        }

        public UpdateLinkeantcodeAntcodeSnippetsidResponseBodyAuthor setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

        public UpdateLinkeantcodeAntcodeSnippetsidResponseBodyAuthor setIdentities(java.util.List<String> identities) {
            this.identities = identities;
            return this;
        }
        public java.util.List<String> getIdentities() {
            return this.identities;
        }

    }

}
