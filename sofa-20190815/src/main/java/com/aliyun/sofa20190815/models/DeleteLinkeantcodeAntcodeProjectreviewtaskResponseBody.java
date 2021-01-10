// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeantcodeAntcodeProjectreviewtaskResponseBody extends TeaModel {
    @NameInMap("GlobPattern")
    public String globPattern;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CreatedAt")
    public String createdAt;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("UpdatedAt")
    public String updatedAt;

    @NameInMap("Reviewer")
    public DeleteLinkeantcodeAntcodeProjectreviewtaskResponseBodyReviewer reviewer;

    @NameInMap("Weight")
    public Long weight;

    @NameInMap("Role")
    public String role;

    @NameInMap("Score")
    public Long score;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("State")
    public String state;

    @NameInMap("ReviewId")
    public Long reviewId;

    @NameInMap("Id")
    public Long id;

    @NameInMap("IsOwner")
    public Boolean isOwner;

    @NameInMap("ResultCode")
    public String resultCode;

    public static DeleteLinkeantcodeAntcodeProjectreviewtaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeantcodeAntcodeProjectreviewtaskResponseBody self = new DeleteLinkeantcodeAntcodeProjectreviewtaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeantcodeAntcodeProjectreviewtaskResponseBody setGlobPattern(String globPattern) {
        this.globPattern = globPattern;
        return this;
    }
    public String getGlobPattern() {
        return this.globPattern;
    }

    public DeleteLinkeantcodeAntcodeProjectreviewtaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteLinkeantcodeAntcodeProjectreviewtaskResponseBody setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public DeleteLinkeantcodeAntcodeProjectreviewtaskResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public DeleteLinkeantcodeAntcodeProjectreviewtaskResponseBody setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public DeleteLinkeantcodeAntcodeProjectreviewtaskResponseBody setReviewer(DeleteLinkeantcodeAntcodeProjectreviewtaskResponseBodyReviewer reviewer) {
        this.reviewer = reviewer;
        return this;
    }
    public DeleteLinkeantcodeAntcodeProjectreviewtaskResponseBodyReviewer getReviewer() {
        return this.reviewer;
    }

    public DeleteLinkeantcodeAntcodeProjectreviewtaskResponseBody setWeight(Long weight) {
        this.weight = weight;
        return this;
    }
    public Long getWeight() {
        return this.weight;
    }

    public DeleteLinkeantcodeAntcodeProjectreviewtaskResponseBody setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public DeleteLinkeantcodeAntcodeProjectreviewtaskResponseBody setScore(Long score) {
        this.score = score;
        return this;
    }
    public Long getScore() {
        return this.score;
    }

    public DeleteLinkeantcodeAntcodeProjectreviewtaskResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public DeleteLinkeantcodeAntcodeProjectreviewtaskResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public DeleteLinkeantcodeAntcodeProjectreviewtaskResponseBody setReviewId(Long reviewId) {
        this.reviewId = reviewId;
        return this;
    }
    public Long getReviewId() {
        return this.reviewId;
    }

    public DeleteLinkeantcodeAntcodeProjectreviewtaskResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DeleteLinkeantcodeAntcodeProjectreviewtaskResponseBody setIsOwner(Boolean isOwner) {
        this.isOwner = isOwner;
        return this;
    }
    public Boolean getIsOwner() {
        return this.isOwner;
    }

    public DeleteLinkeantcodeAntcodeProjectreviewtaskResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class DeleteLinkeantcodeAntcodeProjectreviewtaskResponseBodyReviewer extends TeaModel {
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

        public static DeleteLinkeantcodeAntcodeProjectreviewtaskResponseBodyReviewer build(java.util.Map<String, ?> map) throws Exception {
            DeleteLinkeantcodeAntcodeProjectreviewtaskResponseBodyReviewer self = new DeleteLinkeantcodeAntcodeProjectreviewtaskResponseBodyReviewer();
            return TeaModel.build(map, self);
        }

        public DeleteLinkeantcodeAntcodeProjectreviewtaskResponseBodyReviewer setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public DeleteLinkeantcodeAntcodeProjectreviewtaskResponseBodyReviewer setCurrentSignInAt(String currentSignInAt) {
            this.currentSignInAt = currentSignInAt;
            return this;
        }
        public String getCurrentSignInAt() {
            return this.currentSignInAt;
        }

        public DeleteLinkeantcodeAntcodeProjectreviewtaskResponseBodyReviewer setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

        public DeleteLinkeantcodeAntcodeProjectreviewtaskResponseBodyReviewer setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DeleteLinkeantcodeAntcodeProjectreviewtaskResponseBodyReviewer setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public DeleteLinkeantcodeAntcodeProjectreviewtaskResponseBodyReviewer setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public DeleteLinkeantcodeAntcodeProjectreviewtaskResponseBodyReviewer setExternUid(String externUid) {
            this.externUid = externUid;
            return this;
        }
        public String getExternUid() {
            return this.externUid;
        }

        public DeleteLinkeantcodeAntcodeProjectreviewtaskResponseBodyReviewer setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DeleteLinkeantcodeAntcodeProjectreviewtaskResponseBodyReviewer setThemeId(Long themeId) {
            this.themeId = themeId;
            return this;
        }
        public Long getThemeId() {
            return this.themeId;
        }

        public DeleteLinkeantcodeAntcodeProjectreviewtaskResponseBodyReviewer setBio(String bio) {
            this.bio = bio;
            return this;
        }
        public String getBio() {
            return this.bio;
        }

        public DeleteLinkeantcodeAntcodeProjectreviewtaskResponseBodyReviewer setCanCreateProject(Boolean canCreateProject) {
            this.canCreateProject = canCreateProject;
            return this;
        }
        public Boolean getCanCreateProject() {
            return this.canCreateProject;
        }

        public DeleteLinkeantcodeAntcodeProjectreviewtaskResponseBodyReviewer setIsAdmin(Boolean isAdmin) {
            this.isAdmin = isAdmin;
            return this;
        }
        public Boolean getIsAdmin() {
            return this.isAdmin;
        }

        public DeleteLinkeantcodeAntcodeProjectreviewtaskResponseBodyReviewer setCanCreateGroup(Boolean canCreateGroup) {
            this.canCreateGroup = canCreateGroup;
            return this;
        }
        public Boolean getCanCreateGroup() {
            return this.canCreateGroup;
        }

        public DeleteLinkeantcodeAntcodeProjectreviewtaskResponseBodyReviewer setExpiresAt(String expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }
        public String getExpiresAt() {
            return this.expiresAt;
        }

        public DeleteLinkeantcodeAntcodeProjectreviewtaskResponseBodyReviewer setProjectsLimit(Long projectsLimit) {
            this.projectsLimit = projectsLimit;
            return this;
        }
        public Long getProjectsLimit() {
            return this.projectsLimit;
        }

        public DeleteLinkeantcodeAntcodeProjectreviewtaskResponseBodyReviewer setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public DeleteLinkeantcodeAntcodeProjectreviewtaskResponseBodyReviewer setWebsiteUrl(String websiteUrl) {
            this.websiteUrl = websiteUrl;
            return this;
        }
        public String getWebsiteUrl() {
            return this.websiteUrl;
        }

        public DeleteLinkeantcodeAntcodeProjectreviewtaskResponseBodyReviewer setIdentities(java.util.List<String> identities) {
            this.identities = identities;
            return this;
        }
        public java.util.List<String> getIdentities() {
            return this.identities;
        }

        public DeleteLinkeantcodeAntcodeProjectreviewtaskResponseBodyReviewer setAccessLevel(Long accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }
        public Long getAccessLevel() {
            return this.accessLevel;
        }

        public DeleteLinkeantcodeAntcodeProjectreviewtaskResponseBodyReviewer setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public DeleteLinkeantcodeAntcodeProjectreviewtaskResponseBodyReviewer setRole(Long role) {
            this.role = role;
            return this;
        }
        public Long getRole() {
            return this.role;
        }

        public DeleteLinkeantcodeAntcodeProjectreviewtaskResponseBodyReviewer setPrivateToken(String privateToken) {
            this.privateToken = privateToken;
            return this;
        }
        public String getPrivateToken() {
            return this.privateToken;
        }

        public DeleteLinkeantcodeAntcodeProjectreviewtaskResponseBodyReviewer setRegistered(Boolean registered) {
            this.registered = registered;
            return this;
        }
        public Boolean getRegistered() {
            return this.registered;
        }

        public DeleteLinkeantcodeAntcodeProjectreviewtaskResponseBodyReviewer setColorSchemeId(Long colorSchemeId) {
            this.colorSchemeId = colorSchemeId;
            return this;
        }
        public Long getColorSchemeId() {
            return this.colorSchemeId;
        }

        public DeleteLinkeantcodeAntcodeProjectreviewtaskResponseBodyReviewer setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DeleteLinkeantcodeAntcodeProjectreviewtaskResponseBodyReviewer setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

}
