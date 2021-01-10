// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeantcodeAntcodeUnprotectbrancheResponseBody extends TeaModel {
    @NameInMap("Commit")
    public ExecLinkeantcodeAntcodeUnprotectbrancheResponseBodyCommit commit;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("PushAccessLevel")
    public String pushAccessLevel;

    @NameInMap("MergeAccessLevel")
    public String mergeAccessLevel;

    @NameInMap("AllowedPushUsers")
    public java.util.List<ExecLinkeantcodeAntcodeUnprotectbrancheResponseBodyAllowedPushUsers> allowedPushUsers;

    @NameInMap("MatchedBranches")
    public java.util.List<String> matchedBranches;

    @NameInMap("Id")
    public Long id;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("AllowedMergeUsers")
    public java.util.List<ExecLinkeantcodeAntcodeUnprotectbrancheResponseBodyAllowedMergeUsers> allowedMergeUsers;

    @NameInMap("Name")
    public String name;

    public static ExecLinkeantcodeAntcodeUnprotectbrancheResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeantcodeAntcodeUnprotectbrancheResponseBody self = new ExecLinkeantcodeAntcodeUnprotectbrancheResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecLinkeantcodeAntcodeUnprotectbrancheResponseBody setCommit(ExecLinkeantcodeAntcodeUnprotectbrancheResponseBodyCommit commit) {
        this.commit = commit;
        return this;
    }
    public ExecLinkeantcodeAntcodeUnprotectbrancheResponseBodyCommit getCommit() {
        return this.commit;
    }

    public ExecLinkeantcodeAntcodeUnprotectbrancheResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecLinkeantcodeAntcodeUnprotectbrancheResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public ExecLinkeantcodeAntcodeUnprotectbrancheResponseBody setPushAccessLevel(String pushAccessLevel) {
        this.pushAccessLevel = pushAccessLevel;
        return this;
    }
    public String getPushAccessLevel() {
        return this.pushAccessLevel;
    }

    public ExecLinkeantcodeAntcodeUnprotectbrancheResponseBody setMergeAccessLevel(String mergeAccessLevel) {
        this.mergeAccessLevel = mergeAccessLevel;
        return this;
    }
    public String getMergeAccessLevel() {
        return this.mergeAccessLevel;
    }

    public ExecLinkeantcodeAntcodeUnprotectbrancheResponseBody setAllowedPushUsers(java.util.List<ExecLinkeantcodeAntcodeUnprotectbrancheResponseBodyAllowedPushUsers> allowedPushUsers) {
        this.allowedPushUsers = allowedPushUsers;
        return this;
    }
    public java.util.List<ExecLinkeantcodeAntcodeUnprotectbrancheResponseBodyAllowedPushUsers> getAllowedPushUsers() {
        return this.allowedPushUsers;
    }

    public ExecLinkeantcodeAntcodeUnprotectbrancheResponseBody setMatchedBranches(java.util.List<String> matchedBranches) {
        this.matchedBranches = matchedBranches;
        return this;
    }
    public java.util.List<String> getMatchedBranches() {
        return this.matchedBranches;
    }

    public ExecLinkeantcodeAntcodeUnprotectbrancheResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ExecLinkeantcodeAntcodeUnprotectbrancheResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ExecLinkeantcodeAntcodeUnprotectbrancheResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ExecLinkeantcodeAntcodeUnprotectbrancheResponseBody setAllowedMergeUsers(java.util.List<ExecLinkeantcodeAntcodeUnprotectbrancheResponseBodyAllowedMergeUsers> allowedMergeUsers) {
        this.allowedMergeUsers = allowedMergeUsers;
        return this;
    }
    public java.util.List<ExecLinkeantcodeAntcodeUnprotectbrancheResponseBodyAllowedMergeUsers> getAllowedMergeUsers() {
        return this.allowedMergeUsers;
    }

    public ExecLinkeantcodeAntcodeUnprotectbrancheResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public static class ExecLinkeantcodeAntcodeUnprotectbrancheResponseBodyCommit extends TeaModel {
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

        public static ExecLinkeantcodeAntcodeUnprotectbrancheResponseBodyCommit build(java.util.Map<String, ?> map) throws Exception {
            ExecLinkeantcodeAntcodeUnprotectbrancheResponseBodyCommit self = new ExecLinkeantcodeAntcodeUnprotectbrancheResponseBodyCommit();
            return TeaModel.build(map, self);
        }

        public ExecLinkeantcodeAntcodeUnprotectbrancheResponseBodyCommit setShortId(String shortId) {
            this.shortId = shortId;
            return this;
        }
        public String getShortId() {
            return this.shortId;
        }

        public ExecLinkeantcodeAntcodeUnprotectbrancheResponseBodyCommit setCommitter(String committer) {
            this.committer = committer;
            return this;
        }
        public String getCommitter() {
            return this.committer;
        }

        public ExecLinkeantcodeAntcodeUnprotectbrancheResponseBodyCommit setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ExecLinkeantcodeAntcodeUnprotectbrancheResponseBodyCommit setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ExecLinkeantcodeAntcodeUnprotectbrancheResponseBodyCommit setAuthor(String author) {
            this.author = author;
            return this;
        }
        public String getAuthor() {
            return this.author;
        }

        public ExecLinkeantcodeAntcodeUnprotectbrancheResponseBodyCommit setAuthoredDate(String authoredDate) {
            this.authoredDate = authoredDate;
            return this;
        }
        public String getAuthoredDate() {
            return this.authoredDate;
        }

        public ExecLinkeantcodeAntcodeUnprotectbrancheResponseBodyCommit setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

        public ExecLinkeantcodeAntcodeUnprotectbrancheResponseBodyCommit setParentIds(java.util.List<String> parentIds) {
            this.parentIds = parentIds;
            return this;
        }
        public java.util.List<String> getParentIds() {
            return this.parentIds;
        }

        public ExecLinkeantcodeAntcodeUnprotectbrancheResponseBodyCommit setAuthorName(String authorName) {
            this.authorName = authorName;
            return this;
        }
        public String getAuthorName() {
            return this.authorName;
        }

        public ExecLinkeantcodeAntcodeUnprotectbrancheResponseBodyCommit setCheckSuites(java.util.List<String> checkSuites) {
            this.checkSuites = checkSuites;
            return this;
        }
        public java.util.List<String> getCheckSuites() {
            return this.checkSuites;
        }

        public ExecLinkeantcodeAntcodeUnprotectbrancheResponseBodyCommit setCommitterName(String committerName) {
            this.committerName = committerName;
            return this;
        }
        public String getCommitterName() {
            return this.committerName;
        }

        public ExecLinkeantcodeAntcodeUnprotectbrancheResponseBodyCommit setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ExecLinkeantcodeAntcodeUnprotectbrancheResponseBodyCommit setAuthorEmail(String authorEmail) {
            this.authorEmail = authorEmail;
            return this;
        }
        public String getAuthorEmail() {
            return this.authorEmail;
        }

        public ExecLinkeantcodeAntcodeUnprotectbrancheResponseBodyCommit setCommitterEmail(String committerEmail) {
            this.committerEmail = committerEmail;
            return this;
        }
        public String getCommitterEmail() {
            return this.committerEmail;
        }

        public ExecLinkeantcodeAntcodeUnprotectbrancheResponseBodyCommit setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ExecLinkeantcodeAntcodeUnprotectbrancheResponseBodyCommit setCommittedDate(String committedDate) {
            this.committedDate = committedDate;
            return this;
        }
        public String getCommittedDate() {
            return this.committedDate;
        }

    }

    public static class ExecLinkeantcodeAntcodeUnprotectbrancheResponseBodyAllowedPushUsers extends TeaModel {
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

        public static ExecLinkeantcodeAntcodeUnprotectbrancheResponseBodyAllowedPushUsers build(java.util.Map<String, ?> map) throws Exception {
            ExecLinkeantcodeAntcodeUnprotectbrancheResponseBodyAllowedPushUsers self = new ExecLinkeantcodeAntcodeUnprotectbrancheResponseBodyAllowedPushUsers();
            return TeaModel.build(map, self);
        }

        public ExecLinkeantcodeAntcodeUnprotectbrancheResponseBodyAllowedPushUsers setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ExecLinkeantcodeAntcodeUnprotectbrancheResponseBodyAllowedPushUsers setCurrentSignInAt(String currentSignInAt) {
            this.currentSignInAt = currentSignInAt;
            return this;
        }
        public String getCurrentSignInAt() {
            return this.currentSignInAt;
        }

        public ExecLinkeantcodeAntcodeUnprotectbrancheResponseBodyAllowedPushUsers setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

        public ExecLinkeantcodeAntcodeUnprotectbrancheResponseBodyAllowedPushUsers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ExecLinkeantcodeAntcodeUnprotectbrancheResponseBodyAllowedPushUsers setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public ExecLinkeantcodeAntcodeUnprotectbrancheResponseBodyAllowedPushUsers setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public ExecLinkeantcodeAntcodeUnprotectbrancheResponseBodyAllowedPushUsers setExternUid(String externUid) {
            this.externUid = externUid;
            return this;
        }
        public String getExternUid() {
            return this.externUid;
        }

        public ExecLinkeantcodeAntcodeUnprotectbrancheResponseBodyAllowedPushUsers setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ExecLinkeantcodeAntcodeUnprotectbrancheResponseBodyAllowedPushUsers setThemeId(Long themeId) {
            this.themeId = themeId;
            return this;
        }
        public Long getThemeId() {
            return this.themeId;
        }

        public ExecLinkeantcodeAntcodeUnprotectbrancheResponseBodyAllowedPushUsers setBio(String bio) {
            this.bio = bio;
            return this;
        }
        public String getBio() {
            return this.bio;
        }

        public ExecLinkeantcodeAntcodeUnprotectbrancheResponseBodyAllowedPushUsers setCanCreateProject(Boolean canCreateProject) {
            this.canCreateProject = canCreateProject;
            return this;
        }
        public Boolean getCanCreateProject() {
            return this.canCreateProject;
        }

        public ExecLinkeantcodeAntcodeUnprotectbrancheResponseBodyAllowedPushUsers setIsAdmin(Boolean isAdmin) {
            this.isAdmin = isAdmin;
            return this;
        }
        public Boolean getIsAdmin() {
            return this.isAdmin;
        }

        public ExecLinkeantcodeAntcodeUnprotectbrancheResponseBodyAllowedPushUsers setCanCreateGroup(Boolean canCreateGroup) {
            this.canCreateGroup = canCreateGroup;
            return this;
        }
        public Boolean getCanCreateGroup() {
            return this.canCreateGroup;
        }

        public ExecLinkeantcodeAntcodeUnprotectbrancheResponseBodyAllowedPushUsers setExpiresAt(String expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }
        public String getExpiresAt() {
            return this.expiresAt;
        }

        public ExecLinkeantcodeAntcodeUnprotectbrancheResponseBodyAllowedPushUsers setProjectsLimit(Long projectsLimit) {
            this.projectsLimit = projectsLimit;
            return this;
        }
        public Long getProjectsLimit() {
            return this.projectsLimit;
        }

        public ExecLinkeantcodeAntcodeUnprotectbrancheResponseBodyAllowedPushUsers setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ExecLinkeantcodeAntcodeUnprotectbrancheResponseBodyAllowedPushUsers setWebsiteUrl(String websiteUrl) {
            this.websiteUrl = websiteUrl;
            return this;
        }
        public String getWebsiteUrl() {
            return this.websiteUrl;
        }

        public ExecLinkeantcodeAntcodeUnprotectbrancheResponseBodyAllowedPushUsers setIdentities(java.util.List<String> identities) {
            this.identities = identities;
            return this;
        }
        public java.util.List<String> getIdentities() {
            return this.identities;
        }

        public ExecLinkeantcodeAntcodeUnprotectbrancheResponseBodyAllowedPushUsers setAccessLevel(Long accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }
        public Long getAccessLevel() {
            return this.accessLevel;
        }

        public ExecLinkeantcodeAntcodeUnprotectbrancheResponseBodyAllowedPushUsers setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public ExecLinkeantcodeAntcodeUnprotectbrancheResponseBodyAllowedPushUsers setRole(Long role) {
            this.role = role;
            return this;
        }
        public Long getRole() {
            return this.role;
        }

        public ExecLinkeantcodeAntcodeUnprotectbrancheResponseBodyAllowedPushUsers setPrivateToken(String privateToken) {
            this.privateToken = privateToken;
            return this;
        }
        public String getPrivateToken() {
            return this.privateToken;
        }

        public ExecLinkeantcodeAntcodeUnprotectbrancheResponseBodyAllowedPushUsers setRegistered(Boolean registered) {
            this.registered = registered;
            return this;
        }
        public Boolean getRegistered() {
            return this.registered;
        }

        public ExecLinkeantcodeAntcodeUnprotectbrancheResponseBodyAllowedPushUsers setColorSchemeId(Long colorSchemeId) {
            this.colorSchemeId = colorSchemeId;
            return this;
        }
        public Long getColorSchemeId() {
            return this.colorSchemeId;
        }

        public ExecLinkeantcodeAntcodeUnprotectbrancheResponseBodyAllowedPushUsers setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ExecLinkeantcodeAntcodeUnprotectbrancheResponseBodyAllowedPushUsers setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class ExecLinkeantcodeAntcodeUnprotectbrancheResponseBodyAllowedMergeUsers extends TeaModel {
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

        public static ExecLinkeantcodeAntcodeUnprotectbrancheResponseBodyAllowedMergeUsers build(java.util.Map<String, ?> map) throws Exception {
            ExecLinkeantcodeAntcodeUnprotectbrancheResponseBodyAllowedMergeUsers self = new ExecLinkeantcodeAntcodeUnprotectbrancheResponseBodyAllowedMergeUsers();
            return TeaModel.build(map, self);
        }

        public ExecLinkeantcodeAntcodeUnprotectbrancheResponseBodyAllowedMergeUsers setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ExecLinkeantcodeAntcodeUnprotectbrancheResponseBodyAllowedMergeUsers setCurrentSignInAt(String currentSignInAt) {
            this.currentSignInAt = currentSignInAt;
            return this;
        }
        public String getCurrentSignInAt() {
            return this.currentSignInAt;
        }

        public ExecLinkeantcodeAntcodeUnprotectbrancheResponseBodyAllowedMergeUsers setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

        public ExecLinkeantcodeAntcodeUnprotectbrancheResponseBodyAllowedMergeUsers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ExecLinkeantcodeAntcodeUnprotectbrancheResponseBodyAllowedMergeUsers setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public ExecLinkeantcodeAntcodeUnprotectbrancheResponseBodyAllowedMergeUsers setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public ExecLinkeantcodeAntcodeUnprotectbrancheResponseBodyAllowedMergeUsers setExternUid(String externUid) {
            this.externUid = externUid;
            return this;
        }
        public String getExternUid() {
            return this.externUid;
        }

        public ExecLinkeantcodeAntcodeUnprotectbrancheResponseBodyAllowedMergeUsers setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ExecLinkeantcodeAntcodeUnprotectbrancheResponseBodyAllowedMergeUsers setThemeId(Long themeId) {
            this.themeId = themeId;
            return this;
        }
        public Long getThemeId() {
            return this.themeId;
        }

        public ExecLinkeantcodeAntcodeUnprotectbrancheResponseBodyAllowedMergeUsers setBio(String bio) {
            this.bio = bio;
            return this;
        }
        public String getBio() {
            return this.bio;
        }

        public ExecLinkeantcodeAntcodeUnprotectbrancheResponseBodyAllowedMergeUsers setCanCreateProject(Boolean canCreateProject) {
            this.canCreateProject = canCreateProject;
            return this;
        }
        public Boolean getCanCreateProject() {
            return this.canCreateProject;
        }

        public ExecLinkeantcodeAntcodeUnprotectbrancheResponseBodyAllowedMergeUsers setIsAdmin(Boolean isAdmin) {
            this.isAdmin = isAdmin;
            return this;
        }
        public Boolean getIsAdmin() {
            return this.isAdmin;
        }

        public ExecLinkeantcodeAntcodeUnprotectbrancheResponseBodyAllowedMergeUsers setCanCreateGroup(Boolean canCreateGroup) {
            this.canCreateGroup = canCreateGroup;
            return this;
        }
        public Boolean getCanCreateGroup() {
            return this.canCreateGroup;
        }

        public ExecLinkeantcodeAntcodeUnprotectbrancheResponseBodyAllowedMergeUsers setExpiresAt(String expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }
        public String getExpiresAt() {
            return this.expiresAt;
        }

        public ExecLinkeantcodeAntcodeUnprotectbrancheResponseBodyAllowedMergeUsers setProjectsLimit(Long projectsLimit) {
            this.projectsLimit = projectsLimit;
            return this;
        }
        public Long getProjectsLimit() {
            return this.projectsLimit;
        }

        public ExecLinkeantcodeAntcodeUnprotectbrancheResponseBodyAllowedMergeUsers setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ExecLinkeantcodeAntcodeUnprotectbrancheResponseBodyAllowedMergeUsers setWebsiteUrl(String websiteUrl) {
            this.websiteUrl = websiteUrl;
            return this;
        }
        public String getWebsiteUrl() {
            return this.websiteUrl;
        }

        public ExecLinkeantcodeAntcodeUnprotectbrancheResponseBodyAllowedMergeUsers setIdentities(java.util.List<String> identities) {
            this.identities = identities;
            return this;
        }
        public java.util.List<String> getIdentities() {
            return this.identities;
        }

        public ExecLinkeantcodeAntcodeUnprotectbrancheResponseBodyAllowedMergeUsers setAccessLevel(Long accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }
        public Long getAccessLevel() {
            return this.accessLevel;
        }

        public ExecLinkeantcodeAntcodeUnprotectbrancheResponseBodyAllowedMergeUsers setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public ExecLinkeantcodeAntcodeUnprotectbrancheResponseBodyAllowedMergeUsers setRole(Long role) {
            this.role = role;
            return this;
        }
        public Long getRole() {
            return this.role;
        }

        public ExecLinkeantcodeAntcodeUnprotectbrancheResponseBodyAllowedMergeUsers setPrivateToken(String privateToken) {
            this.privateToken = privateToken;
            return this;
        }
        public String getPrivateToken() {
            return this.privateToken;
        }

        public ExecLinkeantcodeAntcodeUnprotectbrancheResponseBodyAllowedMergeUsers setRegistered(Boolean registered) {
            this.registered = registered;
            return this;
        }
        public Boolean getRegistered() {
            return this.registered;
        }

        public ExecLinkeantcodeAntcodeUnprotectbrancheResponseBodyAllowedMergeUsers setColorSchemeId(Long colorSchemeId) {
            this.colorSchemeId = colorSchemeId;
            return this;
        }
        public Long getColorSchemeId() {
            return this.colorSchemeId;
        }

        public ExecLinkeantcodeAntcodeUnprotectbrancheResponseBodyAllowedMergeUsers setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ExecLinkeantcodeAntcodeUnprotectbrancheResponseBodyAllowedMergeUsers setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

}
