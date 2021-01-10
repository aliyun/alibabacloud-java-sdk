// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeantcodeAntcodeProtectbrancheResponseBody extends TeaModel {
    @NameInMap("Commit")
    public ExecLinkeantcodeAntcodeProtectbrancheResponseBodyCommit commit;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("PushAccessLevel")
    public String pushAccessLevel;

    @NameInMap("MergeAccessLevel")
    public String mergeAccessLevel;

    @NameInMap("AllowedPushUsers")
    public java.util.List<ExecLinkeantcodeAntcodeProtectbrancheResponseBodyAllowedPushUsers> allowedPushUsers;

    @NameInMap("MatchedBranches")
    public java.util.List<String> matchedBranches;

    @NameInMap("Id")
    public Long id;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("AllowedMergeUsers")
    public java.util.List<ExecLinkeantcodeAntcodeProtectbrancheResponseBodyAllowedMergeUsers> allowedMergeUsers;

    @NameInMap("Name")
    public String name;

    public static ExecLinkeantcodeAntcodeProtectbrancheResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeantcodeAntcodeProtectbrancheResponseBody self = new ExecLinkeantcodeAntcodeProtectbrancheResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecLinkeantcodeAntcodeProtectbrancheResponseBody setCommit(ExecLinkeantcodeAntcodeProtectbrancheResponseBodyCommit commit) {
        this.commit = commit;
        return this;
    }
    public ExecLinkeantcodeAntcodeProtectbrancheResponseBodyCommit getCommit() {
        return this.commit;
    }

    public ExecLinkeantcodeAntcodeProtectbrancheResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecLinkeantcodeAntcodeProtectbrancheResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public ExecLinkeantcodeAntcodeProtectbrancheResponseBody setPushAccessLevel(String pushAccessLevel) {
        this.pushAccessLevel = pushAccessLevel;
        return this;
    }
    public String getPushAccessLevel() {
        return this.pushAccessLevel;
    }

    public ExecLinkeantcodeAntcodeProtectbrancheResponseBody setMergeAccessLevel(String mergeAccessLevel) {
        this.mergeAccessLevel = mergeAccessLevel;
        return this;
    }
    public String getMergeAccessLevel() {
        return this.mergeAccessLevel;
    }

    public ExecLinkeantcodeAntcodeProtectbrancheResponseBody setAllowedPushUsers(java.util.List<ExecLinkeantcodeAntcodeProtectbrancheResponseBodyAllowedPushUsers> allowedPushUsers) {
        this.allowedPushUsers = allowedPushUsers;
        return this;
    }
    public java.util.List<ExecLinkeantcodeAntcodeProtectbrancheResponseBodyAllowedPushUsers> getAllowedPushUsers() {
        return this.allowedPushUsers;
    }

    public ExecLinkeantcodeAntcodeProtectbrancheResponseBody setMatchedBranches(java.util.List<String> matchedBranches) {
        this.matchedBranches = matchedBranches;
        return this;
    }
    public java.util.List<String> getMatchedBranches() {
        return this.matchedBranches;
    }

    public ExecLinkeantcodeAntcodeProtectbrancheResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ExecLinkeantcodeAntcodeProtectbrancheResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ExecLinkeantcodeAntcodeProtectbrancheResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ExecLinkeantcodeAntcodeProtectbrancheResponseBody setAllowedMergeUsers(java.util.List<ExecLinkeantcodeAntcodeProtectbrancheResponseBodyAllowedMergeUsers> allowedMergeUsers) {
        this.allowedMergeUsers = allowedMergeUsers;
        return this;
    }
    public java.util.List<ExecLinkeantcodeAntcodeProtectbrancheResponseBodyAllowedMergeUsers> getAllowedMergeUsers() {
        return this.allowedMergeUsers;
    }

    public ExecLinkeantcodeAntcodeProtectbrancheResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public static class ExecLinkeantcodeAntcodeProtectbrancheResponseBodyCommit extends TeaModel {
        @NameInMap("ShortId")
        public String shortId;

        @NameInMap("Committer")
        public String committer;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("Message")
        public String message;

        @NameInMap("Author")
        public String author;

        @NameInMap("AuthoredDate")
        public String authoredDate;

        @NameInMap("Signature")
        public String signature;

        @NameInMap("ParentIds")
        public java.util.List<String> parentIds;

        @NameInMap("AuthorName")
        public String authorName;

        @NameInMap("CheckSuites")
        public java.util.List<String> checkSuites;

        @NameInMap("CommitterName")
        public String committerName;

        @NameInMap("Title")
        public String title;

        @NameInMap("AuthorEmail")
        public String authorEmail;

        @NameInMap("CommitterEmail")
        public String committerEmail;

        @NameInMap("Id")
        public String id;

        @NameInMap("CommittedDate")
        public String committedDate;

        public static ExecLinkeantcodeAntcodeProtectbrancheResponseBodyCommit build(java.util.Map<String, ?> map) throws Exception {
            ExecLinkeantcodeAntcodeProtectbrancheResponseBodyCommit self = new ExecLinkeantcodeAntcodeProtectbrancheResponseBodyCommit();
            return TeaModel.build(map, self);
        }

        public ExecLinkeantcodeAntcodeProtectbrancheResponseBodyCommit setShortId(String shortId) {
            this.shortId = shortId;
            return this;
        }
        public String getShortId() {
            return this.shortId;
        }

        public ExecLinkeantcodeAntcodeProtectbrancheResponseBodyCommit setCommitter(String committer) {
            this.committer = committer;
            return this;
        }
        public String getCommitter() {
            return this.committer;
        }

        public ExecLinkeantcodeAntcodeProtectbrancheResponseBodyCommit setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ExecLinkeantcodeAntcodeProtectbrancheResponseBodyCommit setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ExecLinkeantcodeAntcodeProtectbrancheResponseBodyCommit setAuthor(String author) {
            this.author = author;
            return this;
        }
        public String getAuthor() {
            return this.author;
        }

        public ExecLinkeantcodeAntcodeProtectbrancheResponseBodyCommit setAuthoredDate(String authoredDate) {
            this.authoredDate = authoredDate;
            return this;
        }
        public String getAuthoredDate() {
            return this.authoredDate;
        }

        public ExecLinkeantcodeAntcodeProtectbrancheResponseBodyCommit setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

        public ExecLinkeantcodeAntcodeProtectbrancheResponseBodyCommit setParentIds(java.util.List<String> parentIds) {
            this.parentIds = parentIds;
            return this;
        }
        public java.util.List<String> getParentIds() {
            return this.parentIds;
        }

        public ExecLinkeantcodeAntcodeProtectbrancheResponseBodyCommit setAuthorName(String authorName) {
            this.authorName = authorName;
            return this;
        }
        public String getAuthorName() {
            return this.authorName;
        }

        public ExecLinkeantcodeAntcodeProtectbrancheResponseBodyCommit setCheckSuites(java.util.List<String> checkSuites) {
            this.checkSuites = checkSuites;
            return this;
        }
        public java.util.List<String> getCheckSuites() {
            return this.checkSuites;
        }

        public ExecLinkeantcodeAntcodeProtectbrancheResponseBodyCommit setCommitterName(String committerName) {
            this.committerName = committerName;
            return this;
        }
        public String getCommitterName() {
            return this.committerName;
        }

        public ExecLinkeantcodeAntcodeProtectbrancheResponseBodyCommit setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ExecLinkeantcodeAntcodeProtectbrancheResponseBodyCommit setAuthorEmail(String authorEmail) {
            this.authorEmail = authorEmail;
            return this;
        }
        public String getAuthorEmail() {
            return this.authorEmail;
        }

        public ExecLinkeantcodeAntcodeProtectbrancheResponseBodyCommit setCommitterEmail(String committerEmail) {
            this.committerEmail = committerEmail;
            return this;
        }
        public String getCommitterEmail() {
            return this.committerEmail;
        }

        public ExecLinkeantcodeAntcodeProtectbrancheResponseBodyCommit setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ExecLinkeantcodeAntcodeProtectbrancheResponseBodyCommit setCommittedDate(String committedDate) {
            this.committedDate = committedDate;
            return this;
        }
        public String getCommittedDate() {
            return this.committedDate;
        }

    }

    public static class ExecLinkeantcodeAntcodeProtectbrancheResponseBodyAllowedPushUsers extends TeaModel {
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

        public static ExecLinkeantcodeAntcodeProtectbrancheResponseBodyAllowedPushUsers build(java.util.Map<String, ?> map) throws Exception {
            ExecLinkeantcodeAntcodeProtectbrancheResponseBodyAllowedPushUsers self = new ExecLinkeantcodeAntcodeProtectbrancheResponseBodyAllowedPushUsers();
            return TeaModel.build(map, self);
        }

        public ExecLinkeantcodeAntcodeProtectbrancheResponseBodyAllowedPushUsers setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ExecLinkeantcodeAntcodeProtectbrancheResponseBodyAllowedPushUsers setCurrentSignInAt(String currentSignInAt) {
            this.currentSignInAt = currentSignInAt;
            return this;
        }
        public String getCurrentSignInAt() {
            return this.currentSignInAt;
        }

        public ExecLinkeantcodeAntcodeProtectbrancheResponseBodyAllowedPushUsers setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

        public ExecLinkeantcodeAntcodeProtectbrancheResponseBodyAllowedPushUsers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ExecLinkeantcodeAntcodeProtectbrancheResponseBodyAllowedPushUsers setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public ExecLinkeantcodeAntcodeProtectbrancheResponseBodyAllowedPushUsers setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public ExecLinkeantcodeAntcodeProtectbrancheResponseBodyAllowedPushUsers setExternUid(String externUid) {
            this.externUid = externUid;
            return this;
        }
        public String getExternUid() {
            return this.externUid;
        }

        public ExecLinkeantcodeAntcodeProtectbrancheResponseBodyAllowedPushUsers setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ExecLinkeantcodeAntcodeProtectbrancheResponseBodyAllowedPushUsers setThemeId(Long themeId) {
            this.themeId = themeId;
            return this;
        }
        public Long getThemeId() {
            return this.themeId;
        }

        public ExecLinkeantcodeAntcodeProtectbrancheResponseBodyAllowedPushUsers setBio(String bio) {
            this.bio = bio;
            return this;
        }
        public String getBio() {
            return this.bio;
        }

        public ExecLinkeantcodeAntcodeProtectbrancheResponseBodyAllowedPushUsers setCanCreateProject(Boolean canCreateProject) {
            this.canCreateProject = canCreateProject;
            return this;
        }
        public Boolean getCanCreateProject() {
            return this.canCreateProject;
        }

        public ExecLinkeantcodeAntcodeProtectbrancheResponseBodyAllowedPushUsers setIsAdmin(Boolean isAdmin) {
            this.isAdmin = isAdmin;
            return this;
        }
        public Boolean getIsAdmin() {
            return this.isAdmin;
        }

        public ExecLinkeantcodeAntcodeProtectbrancheResponseBodyAllowedPushUsers setCanCreateGroup(Boolean canCreateGroup) {
            this.canCreateGroup = canCreateGroup;
            return this;
        }
        public Boolean getCanCreateGroup() {
            return this.canCreateGroup;
        }

        public ExecLinkeantcodeAntcodeProtectbrancheResponseBodyAllowedPushUsers setExpiresAt(String expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }
        public String getExpiresAt() {
            return this.expiresAt;
        }

        public ExecLinkeantcodeAntcodeProtectbrancheResponseBodyAllowedPushUsers setProjectsLimit(Long projectsLimit) {
            this.projectsLimit = projectsLimit;
            return this;
        }
        public Long getProjectsLimit() {
            return this.projectsLimit;
        }

        public ExecLinkeantcodeAntcodeProtectbrancheResponseBodyAllowedPushUsers setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ExecLinkeantcodeAntcodeProtectbrancheResponseBodyAllowedPushUsers setWebsiteUrl(String websiteUrl) {
            this.websiteUrl = websiteUrl;
            return this;
        }
        public String getWebsiteUrl() {
            return this.websiteUrl;
        }

        public ExecLinkeantcodeAntcodeProtectbrancheResponseBodyAllowedPushUsers setIdentities(java.util.List<String> identities) {
            this.identities = identities;
            return this;
        }
        public java.util.List<String> getIdentities() {
            return this.identities;
        }

        public ExecLinkeantcodeAntcodeProtectbrancheResponseBodyAllowedPushUsers setAccessLevel(Long accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }
        public Long getAccessLevel() {
            return this.accessLevel;
        }

        public ExecLinkeantcodeAntcodeProtectbrancheResponseBodyAllowedPushUsers setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public ExecLinkeantcodeAntcodeProtectbrancheResponseBodyAllowedPushUsers setRole(Long role) {
            this.role = role;
            return this;
        }
        public Long getRole() {
            return this.role;
        }

        public ExecLinkeantcodeAntcodeProtectbrancheResponseBodyAllowedPushUsers setPrivateToken(String privateToken) {
            this.privateToken = privateToken;
            return this;
        }
        public String getPrivateToken() {
            return this.privateToken;
        }

        public ExecLinkeantcodeAntcodeProtectbrancheResponseBodyAllowedPushUsers setRegistered(Boolean registered) {
            this.registered = registered;
            return this;
        }
        public Boolean getRegistered() {
            return this.registered;
        }

        public ExecLinkeantcodeAntcodeProtectbrancheResponseBodyAllowedPushUsers setColorSchemeId(Long colorSchemeId) {
            this.colorSchemeId = colorSchemeId;
            return this;
        }
        public Long getColorSchemeId() {
            return this.colorSchemeId;
        }

        public ExecLinkeantcodeAntcodeProtectbrancheResponseBodyAllowedPushUsers setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ExecLinkeantcodeAntcodeProtectbrancheResponseBodyAllowedPushUsers setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class ExecLinkeantcodeAntcodeProtectbrancheResponseBodyAllowedMergeUsers extends TeaModel {
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

        public static ExecLinkeantcodeAntcodeProtectbrancheResponseBodyAllowedMergeUsers build(java.util.Map<String, ?> map) throws Exception {
            ExecLinkeantcodeAntcodeProtectbrancheResponseBodyAllowedMergeUsers self = new ExecLinkeantcodeAntcodeProtectbrancheResponseBodyAllowedMergeUsers();
            return TeaModel.build(map, self);
        }

        public ExecLinkeantcodeAntcodeProtectbrancheResponseBodyAllowedMergeUsers setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ExecLinkeantcodeAntcodeProtectbrancheResponseBodyAllowedMergeUsers setCurrentSignInAt(String currentSignInAt) {
            this.currentSignInAt = currentSignInAt;
            return this;
        }
        public String getCurrentSignInAt() {
            return this.currentSignInAt;
        }

        public ExecLinkeantcodeAntcodeProtectbrancheResponseBodyAllowedMergeUsers setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

        public ExecLinkeantcodeAntcodeProtectbrancheResponseBodyAllowedMergeUsers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ExecLinkeantcodeAntcodeProtectbrancheResponseBodyAllowedMergeUsers setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public ExecLinkeantcodeAntcodeProtectbrancheResponseBodyAllowedMergeUsers setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public ExecLinkeantcodeAntcodeProtectbrancheResponseBodyAllowedMergeUsers setExternUid(String externUid) {
            this.externUid = externUid;
            return this;
        }
        public String getExternUid() {
            return this.externUid;
        }

        public ExecLinkeantcodeAntcodeProtectbrancheResponseBodyAllowedMergeUsers setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ExecLinkeantcodeAntcodeProtectbrancheResponseBodyAllowedMergeUsers setThemeId(Long themeId) {
            this.themeId = themeId;
            return this;
        }
        public Long getThemeId() {
            return this.themeId;
        }

        public ExecLinkeantcodeAntcodeProtectbrancheResponseBodyAllowedMergeUsers setBio(String bio) {
            this.bio = bio;
            return this;
        }
        public String getBio() {
            return this.bio;
        }

        public ExecLinkeantcodeAntcodeProtectbrancheResponseBodyAllowedMergeUsers setCanCreateProject(Boolean canCreateProject) {
            this.canCreateProject = canCreateProject;
            return this;
        }
        public Boolean getCanCreateProject() {
            return this.canCreateProject;
        }

        public ExecLinkeantcodeAntcodeProtectbrancheResponseBodyAllowedMergeUsers setIsAdmin(Boolean isAdmin) {
            this.isAdmin = isAdmin;
            return this;
        }
        public Boolean getIsAdmin() {
            return this.isAdmin;
        }

        public ExecLinkeantcodeAntcodeProtectbrancheResponseBodyAllowedMergeUsers setCanCreateGroup(Boolean canCreateGroup) {
            this.canCreateGroup = canCreateGroup;
            return this;
        }
        public Boolean getCanCreateGroup() {
            return this.canCreateGroup;
        }

        public ExecLinkeantcodeAntcodeProtectbrancheResponseBodyAllowedMergeUsers setExpiresAt(String expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }
        public String getExpiresAt() {
            return this.expiresAt;
        }

        public ExecLinkeantcodeAntcodeProtectbrancheResponseBodyAllowedMergeUsers setProjectsLimit(Long projectsLimit) {
            this.projectsLimit = projectsLimit;
            return this;
        }
        public Long getProjectsLimit() {
            return this.projectsLimit;
        }

        public ExecLinkeantcodeAntcodeProtectbrancheResponseBodyAllowedMergeUsers setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ExecLinkeantcodeAntcodeProtectbrancheResponseBodyAllowedMergeUsers setWebsiteUrl(String websiteUrl) {
            this.websiteUrl = websiteUrl;
            return this;
        }
        public String getWebsiteUrl() {
            return this.websiteUrl;
        }

        public ExecLinkeantcodeAntcodeProtectbrancheResponseBodyAllowedMergeUsers setIdentities(java.util.List<String> identities) {
            this.identities = identities;
            return this;
        }
        public java.util.List<String> getIdentities() {
            return this.identities;
        }

        public ExecLinkeantcodeAntcodeProtectbrancheResponseBodyAllowedMergeUsers setAccessLevel(Long accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }
        public Long getAccessLevel() {
            return this.accessLevel;
        }

        public ExecLinkeantcodeAntcodeProtectbrancheResponseBodyAllowedMergeUsers setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public ExecLinkeantcodeAntcodeProtectbrancheResponseBodyAllowedMergeUsers setRole(Long role) {
            this.role = role;
            return this;
        }
        public Long getRole() {
            return this.role;
        }

        public ExecLinkeantcodeAntcodeProtectbrancheResponseBodyAllowedMergeUsers setPrivateToken(String privateToken) {
            this.privateToken = privateToken;
            return this;
        }
        public String getPrivateToken() {
            return this.privateToken;
        }

        public ExecLinkeantcodeAntcodeProtectbrancheResponseBodyAllowedMergeUsers setRegistered(Boolean registered) {
            this.registered = registered;
            return this;
        }
        public Boolean getRegistered() {
            return this.registered;
        }

        public ExecLinkeantcodeAntcodeProtectbrancheResponseBodyAllowedMergeUsers setColorSchemeId(Long colorSchemeId) {
            this.colorSchemeId = colorSchemeId;
            return this;
        }
        public Long getColorSchemeId() {
            return this.colorSchemeId;
        }

        public ExecLinkeantcodeAntcodeProtectbrancheResponseBodyAllowedMergeUsers setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ExecLinkeantcodeAntcodeProtectbrancheResponseBodyAllowedMergeUsers setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

}
