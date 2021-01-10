// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeantcodeAntcodeProjectreviewtaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("CreatedAt")
    public String createdAt;

    @NameInMap("GlobPattern")
    public String globPattern;

    @NameInMap("Id")
    public Long id;

    @NameInMap("IsOwner")
    public Boolean isOwner;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("ReviewId")
    public Long reviewId;

    @NameInMap("Role")
    public String role;

    @NameInMap("Score")
    public Long score;

    @NameInMap("State")
    public String state;

    @NameInMap("UpdatedAt")
    public String updatedAt;

    @NameInMap("Weight")
    public Long weight;

    @NameInMap("Reviewer")
    public UpdateLinkeantcodeAntcodeProjectreviewtaskResponseBodyReviewer reviewer;

    public static UpdateLinkeantcodeAntcodeProjectreviewtaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeantcodeAntcodeProjectreviewtaskResponseBody self = new UpdateLinkeantcodeAntcodeProjectreviewtaskResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeantcodeAntcodeProjectreviewtaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateLinkeantcodeAntcodeProjectreviewtaskResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateLinkeantcodeAntcodeProjectreviewtaskResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public UpdateLinkeantcodeAntcodeProjectreviewtaskResponseBody setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public UpdateLinkeantcodeAntcodeProjectreviewtaskResponseBody setGlobPattern(String globPattern) {
        this.globPattern = globPattern;
        return this;
    }
    public String getGlobPattern() {
        return this.globPattern;
    }

    public UpdateLinkeantcodeAntcodeProjectreviewtaskResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateLinkeantcodeAntcodeProjectreviewtaskResponseBody setIsOwner(Boolean isOwner) {
        this.isOwner = isOwner;
        return this;
    }
    public Boolean getIsOwner() {
        return this.isOwner;
    }

    public UpdateLinkeantcodeAntcodeProjectreviewtaskResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public UpdateLinkeantcodeAntcodeProjectreviewtaskResponseBody setReviewId(Long reviewId) {
        this.reviewId = reviewId;
        return this;
    }
    public Long getReviewId() {
        return this.reviewId;
    }

    public UpdateLinkeantcodeAntcodeProjectreviewtaskResponseBody setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public UpdateLinkeantcodeAntcodeProjectreviewtaskResponseBody setScore(Long score) {
        this.score = score;
        return this;
    }
    public Long getScore() {
        return this.score;
    }

    public UpdateLinkeantcodeAntcodeProjectreviewtaskResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public UpdateLinkeantcodeAntcodeProjectreviewtaskResponseBody setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public UpdateLinkeantcodeAntcodeProjectreviewtaskResponseBody setWeight(Long weight) {
        this.weight = weight;
        return this;
    }
    public Long getWeight() {
        return this.weight;
    }

    public UpdateLinkeantcodeAntcodeProjectreviewtaskResponseBody setReviewer(UpdateLinkeantcodeAntcodeProjectreviewtaskResponseBodyReviewer reviewer) {
        this.reviewer = reviewer;
        return this;
    }
    public UpdateLinkeantcodeAntcodeProjectreviewtaskResponseBodyReviewer getReviewer() {
        return this.reviewer;
    }

    public static class UpdateLinkeantcodeAntcodeProjectreviewtaskResponseBodyReviewer extends TeaModel {
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

        public static UpdateLinkeantcodeAntcodeProjectreviewtaskResponseBodyReviewer build(java.util.Map<String, ?> map) throws Exception {
            UpdateLinkeantcodeAntcodeProjectreviewtaskResponseBodyReviewer self = new UpdateLinkeantcodeAntcodeProjectreviewtaskResponseBodyReviewer();
            return TeaModel.build(map, self);
        }

        public UpdateLinkeantcodeAntcodeProjectreviewtaskResponseBodyReviewer setAccessLevel(Long accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }
        public Long getAccessLevel() {
            return this.accessLevel;
        }

        public UpdateLinkeantcodeAntcodeProjectreviewtaskResponseBodyReviewer setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public UpdateLinkeantcodeAntcodeProjectreviewtaskResponseBodyReviewer setBio(String bio) {
            this.bio = bio;
            return this;
        }
        public String getBio() {
            return this.bio;
        }

        public UpdateLinkeantcodeAntcodeProjectreviewtaskResponseBodyReviewer setCanCreateGroup(Boolean canCreateGroup) {
            this.canCreateGroup = canCreateGroup;
            return this;
        }
        public Boolean getCanCreateGroup() {
            return this.canCreateGroup;
        }

        public UpdateLinkeantcodeAntcodeProjectreviewtaskResponseBodyReviewer setCanCreateProject(Boolean canCreateProject) {
            this.canCreateProject = canCreateProject;
            return this;
        }
        public Boolean getCanCreateProject() {
            return this.canCreateProject;
        }

        public UpdateLinkeantcodeAntcodeProjectreviewtaskResponseBodyReviewer setColorSchemeId(Long colorSchemeId) {
            this.colorSchemeId = colorSchemeId;
            return this;
        }
        public Long getColorSchemeId() {
            return this.colorSchemeId;
        }

        public UpdateLinkeantcodeAntcodeProjectreviewtaskResponseBodyReviewer setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public UpdateLinkeantcodeAntcodeProjectreviewtaskResponseBodyReviewer setCurrentSignInAt(String currentSignInAt) {
            this.currentSignInAt = currentSignInAt;
            return this;
        }
        public String getCurrentSignInAt() {
            return this.currentSignInAt;
        }

        public UpdateLinkeantcodeAntcodeProjectreviewtaskResponseBodyReviewer setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public UpdateLinkeantcodeAntcodeProjectreviewtaskResponseBodyReviewer setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public UpdateLinkeantcodeAntcodeProjectreviewtaskResponseBodyReviewer setExpiresAt(String expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }
        public String getExpiresAt() {
            return this.expiresAt;
        }

        public UpdateLinkeantcodeAntcodeProjectreviewtaskResponseBodyReviewer setExternUid(String externUid) {
            this.externUid = externUid;
            return this;
        }
        public String getExternUid() {
            return this.externUid;
        }

        public UpdateLinkeantcodeAntcodeProjectreviewtaskResponseBodyReviewer setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateLinkeantcodeAntcodeProjectreviewtaskResponseBodyReviewer setIsAdmin(Boolean isAdmin) {
            this.isAdmin = isAdmin;
            return this;
        }
        public Boolean getIsAdmin() {
            return this.isAdmin;
        }

        public UpdateLinkeantcodeAntcodeProjectreviewtaskResponseBodyReviewer setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateLinkeantcodeAntcodeProjectreviewtaskResponseBodyReviewer setPrivateToken(String privateToken) {
            this.privateToken = privateToken;
            return this;
        }
        public String getPrivateToken() {
            return this.privateToken;
        }

        public UpdateLinkeantcodeAntcodeProjectreviewtaskResponseBodyReviewer setProjectsLimit(Long projectsLimit) {
            this.projectsLimit = projectsLimit;
            return this;
        }
        public Long getProjectsLimit() {
            return this.projectsLimit;
        }

        public UpdateLinkeantcodeAntcodeProjectreviewtaskResponseBodyReviewer setRegistered(Boolean registered) {
            this.registered = registered;
            return this;
        }
        public Boolean getRegistered() {
            return this.registered;
        }

        public UpdateLinkeantcodeAntcodeProjectreviewtaskResponseBodyReviewer setRole(Long role) {
            this.role = role;
            return this;
        }
        public Long getRole() {
            return this.role;
        }

        public UpdateLinkeantcodeAntcodeProjectreviewtaskResponseBodyReviewer setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public UpdateLinkeantcodeAntcodeProjectreviewtaskResponseBodyReviewer setThemeId(Long themeId) {
            this.themeId = themeId;
            return this;
        }
        public Long getThemeId() {
            return this.themeId;
        }

        public UpdateLinkeantcodeAntcodeProjectreviewtaskResponseBodyReviewer setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public UpdateLinkeantcodeAntcodeProjectreviewtaskResponseBodyReviewer setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public UpdateLinkeantcodeAntcodeProjectreviewtaskResponseBodyReviewer setWebsiteUrl(String websiteUrl) {
            this.websiteUrl = websiteUrl;
            return this;
        }
        public String getWebsiteUrl() {
            return this.websiteUrl;
        }

        public UpdateLinkeantcodeAntcodeProjectreviewtaskResponseBodyReviewer setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

        public UpdateLinkeantcodeAntcodeProjectreviewtaskResponseBodyReviewer setIdentities(java.util.List<String> identities) {
            this.identities = identities;
            return this;
        }
        public java.util.List<String> getIdentities() {
            return this.identities;
        }

    }

}
