// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Id")
    public Long id;

    @NameInMap("MergeAccessLevel")
    public String mergeAccessLevel;

    @NameInMap("Name")
    public String name;

    @NameInMap("PushAccessLevel")
    public String pushAccessLevel;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("MatchedBranches")
    public java.util.List<String> matchedBranches;

    @NameInMap("AllowedMergeUsers")
    public java.util.List<UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBodyAllowedMergeUsers> allowedMergeUsers;

    @NameInMap("AllowedPushUsers")
    public java.util.List<UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBodyAllowedPushUsers> allowedPushUsers;

    @NameInMap("Commit")
    public UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBodyCommit commit;

    public static UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBody self = new UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBody setMergeAccessLevel(String mergeAccessLevel) {
        this.mergeAccessLevel = mergeAccessLevel;
        return this;
    }
    public String getMergeAccessLevel() {
        return this.mergeAccessLevel;
    }

    public UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBody setPushAccessLevel(String pushAccessLevel) {
        this.pushAccessLevel = pushAccessLevel;
        return this;
    }
    public String getPushAccessLevel() {
        return this.pushAccessLevel;
    }

    public UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBody setMatchedBranches(java.util.List<String> matchedBranches) {
        this.matchedBranches = matchedBranches;
        return this;
    }
    public java.util.List<String> getMatchedBranches() {
        return this.matchedBranches;
    }

    public UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBody setAllowedMergeUsers(java.util.List<UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBodyAllowedMergeUsers> allowedMergeUsers) {
        this.allowedMergeUsers = allowedMergeUsers;
        return this;
    }
    public java.util.List<UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBodyAllowedMergeUsers> getAllowedMergeUsers() {
        return this.allowedMergeUsers;
    }

    public UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBody setAllowedPushUsers(java.util.List<UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBodyAllowedPushUsers> allowedPushUsers) {
        this.allowedPushUsers = allowedPushUsers;
        return this;
    }
    public java.util.List<UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBodyAllowedPushUsers> getAllowedPushUsers() {
        return this.allowedPushUsers;
    }

    public UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBody setCommit(UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBodyCommit commit) {
        this.commit = commit;
        return this;
    }
    public UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBodyCommit getCommit() {
        return this.commit;
    }

    public static class UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBodyAllowedMergeUsers extends TeaModel {
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

        public static UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBodyAllowedMergeUsers build(java.util.Map<String, ?> map) throws Exception {
            UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBodyAllowedMergeUsers self = new UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBodyAllowedMergeUsers();
            return TeaModel.build(map, self);
        }

        public UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBodyAllowedMergeUsers setAccessLevel(Long accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }
        public Long getAccessLevel() {
            return this.accessLevel;
        }

        public UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBodyAllowedMergeUsers setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBodyAllowedMergeUsers setBio(String bio) {
            this.bio = bio;
            return this;
        }
        public String getBio() {
            return this.bio;
        }

        public UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBodyAllowedMergeUsers setCanCreateGroup(Boolean canCreateGroup) {
            this.canCreateGroup = canCreateGroup;
            return this;
        }
        public Boolean getCanCreateGroup() {
            return this.canCreateGroup;
        }

        public UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBodyAllowedMergeUsers setCanCreateProject(Boolean canCreateProject) {
            this.canCreateProject = canCreateProject;
            return this;
        }
        public Boolean getCanCreateProject() {
            return this.canCreateProject;
        }

        public UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBodyAllowedMergeUsers setColorSchemeId(Long colorSchemeId) {
            this.colorSchemeId = colorSchemeId;
            return this;
        }
        public Long getColorSchemeId() {
            return this.colorSchemeId;
        }

        public UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBodyAllowedMergeUsers setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBodyAllowedMergeUsers setCurrentSignInAt(String currentSignInAt) {
            this.currentSignInAt = currentSignInAt;
            return this;
        }
        public String getCurrentSignInAt() {
            return this.currentSignInAt;
        }

        public UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBodyAllowedMergeUsers setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBodyAllowedMergeUsers setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBodyAllowedMergeUsers setExpiresAt(String expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }
        public String getExpiresAt() {
            return this.expiresAt;
        }

        public UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBodyAllowedMergeUsers setExternUid(String externUid) {
            this.externUid = externUid;
            return this;
        }
        public String getExternUid() {
            return this.externUid;
        }

        public UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBodyAllowedMergeUsers setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBodyAllowedMergeUsers setIsAdmin(Boolean isAdmin) {
            this.isAdmin = isAdmin;
            return this;
        }
        public Boolean getIsAdmin() {
            return this.isAdmin;
        }

        public UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBodyAllowedMergeUsers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBodyAllowedMergeUsers setPrivateToken(String privateToken) {
            this.privateToken = privateToken;
            return this;
        }
        public String getPrivateToken() {
            return this.privateToken;
        }

        public UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBodyAllowedMergeUsers setProjectsLimit(Long projectsLimit) {
            this.projectsLimit = projectsLimit;
            return this;
        }
        public Long getProjectsLimit() {
            return this.projectsLimit;
        }

        public UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBodyAllowedMergeUsers setRegistered(Boolean registered) {
            this.registered = registered;
            return this;
        }
        public Boolean getRegistered() {
            return this.registered;
        }

        public UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBodyAllowedMergeUsers setRole(Long role) {
            this.role = role;
            return this;
        }
        public Long getRole() {
            return this.role;
        }

        public UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBodyAllowedMergeUsers setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBodyAllowedMergeUsers setThemeId(Long themeId) {
            this.themeId = themeId;
            return this;
        }
        public Long getThemeId() {
            return this.themeId;
        }

        public UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBodyAllowedMergeUsers setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBodyAllowedMergeUsers setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBodyAllowedMergeUsers setWebsiteUrl(String websiteUrl) {
            this.websiteUrl = websiteUrl;
            return this;
        }
        public String getWebsiteUrl() {
            return this.websiteUrl;
        }

        public UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBodyAllowedMergeUsers setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

        public UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBodyAllowedMergeUsers setIdentities(java.util.List<String> identities) {
            this.identities = identities;
            return this;
        }
        public java.util.List<String> getIdentities() {
            return this.identities;
        }

    }

    public static class UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBodyAllowedPushUsers extends TeaModel {
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

        public static UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBodyAllowedPushUsers build(java.util.Map<String, ?> map) throws Exception {
            UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBodyAllowedPushUsers self = new UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBodyAllowedPushUsers();
            return TeaModel.build(map, self);
        }

        public UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBodyAllowedPushUsers setAccessLevel(Long accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }
        public Long getAccessLevel() {
            return this.accessLevel;
        }

        public UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBodyAllowedPushUsers setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBodyAllowedPushUsers setBio(String bio) {
            this.bio = bio;
            return this;
        }
        public String getBio() {
            return this.bio;
        }

        public UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBodyAllowedPushUsers setCanCreateGroup(Boolean canCreateGroup) {
            this.canCreateGroup = canCreateGroup;
            return this;
        }
        public Boolean getCanCreateGroup() {
            return this.canCreateGroup;
        }

        public UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBodyAllowedPushUsers setCanCreateProject(Boolean canCreateProject) {
            this.canCreateProject = canCreateProject;
            return this;
        }
        public Boolean getCanCreateProject() {
            return this.canCreateProject;
        }

        public UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBodyAllowedPushUsers setColorSchemeId(Long colorSchemeId) {
            this.colorSchemeId = colorSchemeId;
            return this;
        }
        public Long getColorSchemeId() {
            return this.colorSchemeId;
        }

        public UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBodyAllowedPushUsers setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBodyAllowedPushUsers setCurrentSignInAt(String currentSignInAt) {
            this.currentSignInAt = currentSignInAt;
            return this;
        }
        public String getCurrentSignInAt() {
            return this.currentSignInAt;
        }

        public UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBodyAllowedPushUsers setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBodyAllowedPushUsers setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBodyAllowedPushUsers setExpiresAt(String expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }
        public String getExpiresAt() {
            return this.expiresAt;
        }

        public UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBodyAllowedPushUsers setExternUid(String externUid) {
            this.externUid = externUid;
            return this;
        }
        public String getExternUid() {
            return this.externUid;
        }

        public UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBodyAllowedPushUsers setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBodyAllowedPushUsers setIsAdmin(Boolean isAdmin) {
            this.isAdmin = isAdmin;
            return this;
        }
        public Boolean getIsAdmin() {
            return this.isAdmin;
        }

        public UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBodyAllowedPushUsers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBodyAllowedPushUsers setPrivateToken(String privateToken) {
            this.privateToken = privateToken;
            return this;
        }
        public String getPrivateToken() {
            return this.privateToken;
        }

        public UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBodyAllowedPushUsers setProjectsLimit(Long projectsLimit) {
            this.projectsLimit = projectsLimit;
            return this;
        }
        public Long getProjectsLimit() {
            return this.projectsLimit;
        }

        public UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBodyAllowedPushUsers setRegistered(Boolean registered) {
            this.registered = registered;
            return this;
        }
        public Boolean getRegistered() {
            return this.registered;
        }

        public UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBodyAllowedPushUsers setRole(Long role) {
            this.role = role;
            return this;
        }
        public Long getRole() {
            return this.role;
        }

        public UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBodyAllowedPushUsers setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBodyAllowedPushUsers setThemeId(Long themeId) {
            this.themeId = themeId;
            return this;
        }
        public Long getThemeId() {
            return this.themeId;
        }

        public UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBodyAllowedPushUsers setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBodyAllowedPushUsers setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBodyAllowedPushUsers setWebsiteUrl(String websiteUrl) {
            this.websiteUrl = websiteUrl;
            return this;
        }
        public String getWebsiteUrl() {
            return this.websiteUrl;
        }

        public UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBodyAllowedPushUsers setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

        public UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBodyAllowedPushUsers setIdentities(java.util.List<String> identities) {
            this.identities = identities;
            return this;
        }
        public java.util.List<String> getIdentities() {
            return this.identities;
        }

    }

    public static class UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBodyCommit extends TeaModel {
        @NameInMap("Author")
        public String author;

        @NameInMap("AuthoredDate")
        public String authoredDate;

        @NameInMap("AuthorEmail")
        public String authorEmail;

        @NameInMap("AuthorName")
        public String authorName;

        @NameInMap("CommittedDate")
        public String committedDate;

        @NameInMap("Committer")
        public String committer;

        @NameInMap("CommitterEmail")
        public String committerEmail;

        @NameInMap("CommitterName")
        public String committerName;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("Id")
        public String id;

        @NameInMap("Message")
        public String message;

        @NameInMap("ShortId")
        public String shortId;

        @NameInMap("Signature")
        public String signature;

        @NameInMap("Title")
        public String title;

        @NameInMap("CheckSuites")
        public java.util.List<String> checkSuites;

        @NameInMap("ParentIds")
        public java.util.List<String> parentIds;

        public static UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBodyCommit build(java.util.Map<String, ?> map) throws Exception {
            UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBodyCommit self = new UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBodyCommit();
            return TeaModel.build(map, self);
        }

        public UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBodyCommit setAuthor(String author) {
            this.author = author;
            return this;
        }
        public String getAuthor() {
            return this.author;
        }

        public UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBodyCommit setAuthoredDate(String authoredDate) {
            this.authoredDate = authoredDate;
            return this;
        }
        public String getAuthoredDate() {
            return this.authoredDate;
        }

        public UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBodyCommit setAuthorEmail(String authorEmail) {
            this.authorEmail = authorEmail;
            return this;
        }
        public String getAuthorEmail() {
            return this.authorEmail;
        }

        public UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBodyCommit setAuthorName(String authorName) {
            this.authorName = authorName;
            return this;
        }
        public String getAuthorName() {
            return this.authorName;
        }

        public UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBodyCommit setCommittedDate(String committedDate) {
            this.committedDate = committedDate;
            return this;
        }
        public String getCommittedDate() {
            return this.committedDate;
        }

        public UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBodyCommit setCommitter(String committer) {
            this.committer = committer;
            return this;
        }
        public String getCommitter() {
            return this.committer;
        }

        public UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBodyCommit setCommitterEmail(String committerEmail) {
            this.committerEmail = committerEmail;
            return this;
        }
        public String getCommitterEmail() {
            return this.committerEmail;
        }

        public UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBodyCommit setCommitterName(String committerName) {
            this.committerName = committerName;
            return this;
        }
        public String getCommitterName() {
            return this.committerName;
        }

        public UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBodyCommit setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBodyCommit setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBodyCommit setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBodyCommit setShortId(String shortId) {
            this.shortId = shortId;
            return this;
        }
        public String getShortId() {
            return this.shortId;
        }

        public UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBodyCommit setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

        public UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBodyCommit setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBodyCommit setCheckSuites(java.util.List<String> checkSuites) {
            this.checkSuites = checkSuites;
            return this;
        }
        public java.util.List<String> getCheckSuites() {
            return this.checkSuites;
        }

        public UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBodyCommit setParentIds(java.util.List<String> parentIds) {
            this.parentIds = parentIds;
            return this;
        }
        public java.util.List<String> getParentIds() {
            return this.parentIds;
        }

    }

}
