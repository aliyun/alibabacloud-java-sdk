// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeantcodeAntcodeProtectrepositorybranchesResponseBody extends TeaModel {
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
    public java.util.List<QueryLinkeantcodeAntcodeProtectrepositorybranchesResponseBodyAllowedMergeUsers> allowedMergeUsers;

    @NameInMap("AllowedPushUsers")
    public java.util.List<QueryLinkeantcodeAntcodeProtectrepositorybranchesResponseBodyAllowedPushUsers> allowedPushUsers;

    @NameInMap("Commit")
    public QueryLinkeantcodeAntcodeProtectrepositorybranchesResponseBodyCommit commit;

    public static QueryLinkeantcodeAntcodeProtectrepositorybranchesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeantcodeAntcodeProtectrepositorybranchesResponseBody self = new QueryLinkeantcodeAntcodeProtectrepositorybranchesResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkeantcodeAntcodeProtectrepositorybranchesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkeantcodeAntcodeProtectrepositorybranchesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkeantcodeAntcodeProtectrepositorybranchesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkeantcodeAntcodeProtectrepositorybranchesResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public QueryLinkeantcodeAntcodeProtectrepositorybranchesResponseBody setMergeAccessLevel(String mergeAccessLevel) {
        this.mergeAccessLevel = mergeAccessLevel;
        return this;
    }
    public String getMergeAccessLevel() {
        return this.mergeAccessLevel;
    }

    public QueryLinkeantcodeAntcodeProtectrepositorybranchesResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryLinkeantcodeAntcodeProtectrepositorybranchesResponseBody setPushAccessLevel(String pushAccessLevel) {
        this.pushAccessLevel = pushAccessLevel;
        return this;
    }
    public String getPushAccessLevel() {
        return this.pushAccessLevel;
    }

    public QueryLinkeantcodeAntcodeProtectrepositorybranchesResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkeantcodeAntcodeProtectrepositorybranchesResponseBody setMatchedBranches(java.util.List<String> matchedBranches) {
        this.matchedBranches = matchedBranches;
        return this;
    }
    public java.util.List<String> getMatchedBranches() {
        return this.matchedBranches;
    }

    public QueryLinkeantcodeAntcodeProtectrepositorybranchesResponseBody setAllowedMergeUsers(java.util.List<QueryLinkeantcodeAntcodeProtectrepositorybranchesResponseBodyAllowedMergeUsers> allowedMergeUsers) {
        this.allowedMergeUsers = allowedMergeUsers;
        return this;
    }
    public java.util.List<QueryLinkeantcodeAntcodeProtectrepositorybranchesResponseBodyAllowedMergeUsers> getAllowedMergeUsers() {
        return this.allowedMergeUsers;
    }

    public QueryLinkeantcodeAntcodeProtectrepositorybranchesResponseBody setAllowedPushUsers(java.util.List<QueryLinkeantcodeAntcodeProtectrepositorybranchesResponseBodyAllowedPushUsers> allowedPushUsers) {
        this.allowedPushUsers = allowedPushUsers;
        return this;
    }
    public java.util.List<QueryLinkeantcodeAntcodeProtectrepositorybranchesResponseBodyAllowedPushUsers> getAllowedPushUsers() {
        return this.allowedPushUsers;
    }

    public QueryLinkeantcodeAntcodeProtectrepositorybranchesResponseBody setCommit(QueryLinkeantcodeAntcodeProtectrepositorybranchesResponseBodyCommit commit) {
        this.commit = commit;
        return this;
    }
    public QueryLinkeantcodeAntcodeProtectrepositorybranchesResponseBodyCommit getCommit() {
        return this.commit;
    }

    public static class QueryLinkeantcodeAntcodeProtectrepositorybranchesResponseBodyAllowedMergeUsers extends TeaModel {
        @NameInMap("AvatarUrl")
        public String avatarUrl;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("Email")
        public String email;

        @NameInMap("ExternUid")
        public String externUid;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("NotificationLevel")
        public Long notificationLevel;

        @NameInMap("State")
        public String state;

        @NameInMap("UpdatedAt")
        public String updatedAt;

        @NameInMap("Username")
        public String username;

        @NameInMap("WebUrl")
        public String webUrl;

        public static QueryLinkeantcodeAntcodeProtectrepositorybranchesResponseBodyAllowedMergeUsers build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeantcodeAntcodeProtectrepositorybranchesResponseBodyAllowedMergeUsers self = new QueryLinkeantcodeAntcodeProtectrepositorybranchesResponseBodyAllowedMergeUsers();
            return TeaModel.build(map, self);
        }

        public QueryLinkeantcodeAntcodeProtectrepositorybranchesResponseBodyAllowedMergeUsers setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public QueryLinkeantcodeAntcodeProtectrepositorybranchesResponseBodyAllowedMergeUsers setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public QueryLinkeantcodeAntcodeProtectrepositorybranchesResponseBodyAllowedMergeUsers setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public QueryLinkeantcodeAntcodeProtectrepositorybranchesResponseBodyAllowedMergeUsers setExternUid(String externUid) {
            this.externUid = externUid;
            return this;
        }
        public String getExternUid() {
            return this.externUid;
        }

        public QueryLinkeantcodeAntcodeProtectrepositorybranchesResponseBodyAllowedMergeUsers setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryLinkeantcodeAntcodeProtectrepositorybranchesResponseBodyAllowedMergeUsers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryLinkeantcodeAntcodeProtectrepositorybranchesResponseBodyAllowedMergeUsers setNotificationLevel(Long notificationLevel) {
            this.notificationLevel = notificationLevel;
            return this;
        }
        public Long getNotificationLevel() {
            return this.notificationLevel;
        }

        public QueryLinkeantcodeAntcodeProtectrepositorybranchesResponseBodyAllowedMergeUsers setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QueryLinkeantcodeAntcodeProtectrepositorybranchesResponseBodyAllowedMergeUsers setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public QueryLinkeantcodeAntcodeProtectrepositorybranchesResponseBodyAllowedMergeUsers setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public QueryLinkeantcodeAntcodeProtectrepositorybranchesResponseBodyAllowedMergeUsers setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

    }

    public static class QueryLinkeantcodeAntcodeProtectrepositorybranchesResponseBodyAllowedPushUsers extends TeaModel {
        @NameInMap("AvatarUrl")
        public String avatarUrl;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("Email")
        public String email;

        @NameInMap("ExternUid")
        public String externUid;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("NotificationLevel")
        public Long notificationLevel;

        @NameInMap("State")
        public String state;

        @NameInMap("UpdatedAt")
        public String updatedAt;

        @NameInMap("Username")
        public String username;

        @NameInMap("WebUrl")
        public String webUrl;

        public static QueryLinkeantcodeAntcodeProtectrepositorybranchesResponseBodyAllowedPushUsers build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeantcodeAntcodeProtectrepositorybranchesResponseBodyAllowedPushUsers self = new QueryLinkeantcodeAntcodeProtectrepositorybranchesResponseBodyAllowedPushUsers();
            return TeaModel.build(map, self);
        }

        public QueryLinkeantcodeAntcodeProtectrepositorybranchesResponseBodyAllowedPushUsers setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public QueryLinkeantcodeAntcodeProtectrepositorybranchesResponseBodyAllowedPushUsers setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public QueryLinkeantcodeAntcodeProtectrepositorybranchesResponseBodyAllowedPushUsers setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public QueryLinkeantcodeAntcodeProtectrepositorybranchesResponseBodyAllowedPushUsers setExternUid(String externUid) {
            this.externUid = externUid;
            return this;
        }
        public String getExternUid() {
            return this.externUid;
        }

        public QueryLinkeantcodeAntcodeProtectrepositorybranchesResponseBodyAllowedPushUsers setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryLinkeantcodeAntcodeProtectrepositorybranchesResponseBodyAllowedPushUsers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryLinkeantcodeAntcodeProtectrepositorybranchesResponseBodyAllowedPushUsers setNotificationLevel(Long notificationLevel) {
            this.notificationLevel = notificationLevel;
            return this;
        }
        public Long getNotificationLevel() {
            return this.notificationLevel;
        }

        public QueryLinkeantcodeAntcodeProtectrepositorybranchesResponseBodyAllowedPushUsers setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QueryLinkeantcodeAntcodeProtectrepositorybranchesResponseBodyAllowedPushUsers setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public QueryLinkeantcodeAntcodeProtectrepositorybranchesResponseBodyAllowedPushUsers setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public QueryLinkeantcodeAntcodeProtectrepositorybranchesResponseBodyAllowedPushUsers setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

    }

    public static class QueryLinkeantcodeAntcodeProtectrepositorybranchesResponseBodyCommit extends TeaModel {
        @NameInMap("AuthoredDate")
        public String authoredDate;

        @NameInMap("AuthorEmail")
        public String authorEmail;

        @NameInMap("AuthorName")
        public String authorName;

        @NameInMap("CommittedDate")
        public String committedDate;

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

        @NameInMap("Title")
        public String title;

        @NameInMap("ParentIds")
        public java.util.List<String> parentIds;

        public static QueryLinkeantcodeAntcodeProtectrepositorybranchesResponseBodyCommit build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeantcodeAntcodeProtectrepositorybranchesResponseBodyCommit self = new QueryLinkeantcodeAntcodeProtectrepositorybranchesResponseBodyCommit();
            return TeaModel.build(map, self);
        }

        public QueryLinkeantcodeAntcodeProtectrepositorybranchesResponseBodyCommit setAuthoredDate(String authoredDate) {
            this.authoredDate = authoredDate;
            return this;
        }
        public String getAuthoredDate() {
            return this.authoredDate;
        }

        public QueryLinkeantcodeAntcodeProtectrepositorybranchesResponseBodyCommit setAuthorEmail(String authorEmail) {
            this.authorEmail = authorEmail;
            return this;
        }
        public String getAuthorEmail() {
            return this.authorEmail;
        }

        public QueryLinkeantcodeAntcodeProtectrepositorybranchesResponseBodyCommit setAuthorName(String authorName) {
            this.authorName = authorName;
            return this;
        }
        public String getAuthorName() {
            return this.authorName;
        }

        public QueryLinkeantcodeAntcodeProtectrepositorybranchesResponseBodyCommit setCommittedDate(String committedDate) {
            this.committedDate = committedDate;
            return this;
        }
        public String getCommittedDate() {
            return this.committedDate;
        }

        public QueryLinkeantcodeAntcodeProtectrepositorybranchesResponseBodyCommit setCommitterEmail(String committerEmail) {
            this.committerEmail = committerEmail;
            return this;
        }
        public String getCommitterEmail() {
            return this.committerEmail;
        }

        public QueryLinkeantcodeAntcodeProtectrepositorybranchesResponseBodyCommit setCommitterName(String committerName) {
            this.committerName = committerName;
            return this;
        }
        public String getCommitterName() {
            return this.committerName;
        }

        public QueryLinkeantcodeAntcodeProtectrepositorybranchesResponseBodyCommit setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public QueryLinkeantcodeAntcodeProtectrepositorybranchesResponseBodyCommit setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryLinkeantcodeAntcodeProtectrepositorybranchesResponseBodyCommit setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryLinkeantcodeAntcodeProtectrepositorybranchesResponseBodyCommit setShortId(String shortId) {
            this.shortId = shortId;
            return this;
        }
        public String getShortId() {
            return this.shortId;
        }

        public QueryLinkeantcodeAntcodeProtectrepositorybranchesResponseBodyCommit setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public QueryLinkeantcodeAntcodeProtectrepositorybranchesResponseBodyCommit setParentIds(java.util.List<String> parentIds) {
            this.parentIds = parentIds;
            return this;
        }
        public java.util.List<String> getParentIds() {
            return this.parentIds;
        }

    }

}
