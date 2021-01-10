// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponseBody extends TeaModel {
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
    public java.util.List<QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponseBodyAllowedMergeUsers> allowedMergeUsers;

    @NameInMap("AllowedPushUsers")
    public java.util.List<QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponseBodyAllowedPushUsers> allowedPushUsers;

    @NameInMap("Commit")
    public QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponseBodyCommit commit;

    public static QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponseBody self = new QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponseBody setMergeAccessLevel(String mergeAccessLevel) {
        this.mergeAccessLevel = mergeAccessLevel;
        return this;
    }
    public String getMergeAccessLevel() {
        return this.mergeAccessLevel;
    }

    public QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponseBody setPushAccessLevel(String pushAccessLevel) {
        this.pushAccessLevel = pushAccessLevel;
        return this;
    }
    public String getPushAccessLevel() {
        return this.pushAccessLevel;
    }

    public QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponseBody setMatchedBranches(java.util.List<String> matchedBranches) {
        this.matchedBranches = matchedBranches;
        return this;
    }
    public java.util.List<String> getMatchedBranches() {
        return this.matchedBranches;
    }

    public QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponseBody setAllowedMergeUsers(java.util.List<QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponseBodyAllowedMergeUsers> allowedMergeUsers) {
        this.allowedMergeUsers = allowedMergeUsers;
        return this;
    }
    public java.util.List<QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponseBodyAllowedMergeUsers> getAllowedMergeUsers() {
        return this.allowedMergeUsers;
    }

    public QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponseBody setAllowedPushUsers(java.util.List<QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponseBodyAllowedPushUsers> allowedPushUsers) {
        this.allowedPushUsers = allowedPushUsers;
        return this;
    }
    public java.util.List<QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponseBodyAllowedPushUsers> getAllowedPushUsers() {
        return this.allowedPushUsers;
    }

    public QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponseBody setCommit(QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponseBodyCommit commit) {
        this.commit = commit;
        return this;
    }
    public QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponseBodyCommit getCommit() {
        return this.commit;
    }

    public static class QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponseBodyAllowedMergeUsers extends TeaModel {
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

        public static QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponseBodyAllowedMergeUsers build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponseBodyAllowedMergeUsers self = new QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponseBodyAllowedMergeUsers();
            return TeaModel.build(map, self);
        }

        public QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponseBodyAllowedMergeUsers setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponseBodyAllowedMergeUsers setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponseBodyAllowedMergeUsers setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponseBodyAllowedMergeUsers setExternUid(String externUid) {
            this.externUid = externUid;
            return this;
        }
        public String getExternUid() {
            return this.externUid;
        }

        public QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponseBodyAllowedMergeUsers setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponseBodyAllowedMergeUsers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponseBodyAllowedMergeUsers setNotificationLevel(Long notificationLevel) {
            this.notificationLevel = notificationLevel;
            return this;
        }
        public Long getNotificationLevel() {
            return this.notificationLevel;
        }

        public QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponseBodyAllowedMergeUsers setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponseBodyAllowedMergeUsers setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponseBodyAllowedMergeUsers setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponseBodyAllowedMergeUsers setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

    }

    public static class QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponseBodyAllowedPushUsers extends TeaModel {
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

        public static QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponseBodyAllowedPushUsers build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponseBodyAllowedPushUsers self = new QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponseBodyAllowedPushUsers();
            return TeaModel.build(map, self);
        }

        public QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponseBodyAllowedPushUsers setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponseBodyAllowedPushUsers setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponseBodyAllowedPushUsers setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponseBodyAllowedPushUsers setExternUid(String externUid) {
            this.externUid = externUid;
            return this;
        }
        public String getExternUid() {
            return this.externUid;
        }

        public QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponseBodyAllowedPushUsers setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponseBodyAllowedPushUsers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponseBodyAllowedPushUsers setNotificationLevel(Long notificationLevel) {
            this.notificationLevel = notificationLevel;
            return this;
        }
        public Long getNotificationLevel() {
            return this.notificationLevel;
        }

        public QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponseBodyAllowedPushUsers setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponseBodyAllowedPushUsers setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponseBodyAllowedPushUsers setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponseBodyAllowedPushUsers setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

    }

    public static class QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponseBodyCommit extends TeaModel {
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

        public static QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponseBodyCommit build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponseBodyCommit self = new QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponseBodyCommit();
            return TeaModel.build(map, self);
        }

        public QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponseBodyCommit setAuthoredDate(String authoredDate) {
            this.authoredDate = authoredDate;
            return this;
        }
        public String getAuthoredDate() {
            return this.authoredDate;
        }

        public QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponseBodyCommit setAuthorEmail(String authorEmail) {
            this.authorEmail = authorEmail;
            return this;
        }
        public String getAuthorEmail() {
            return this.authorEmail;
        }

        public QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponseBodyCommit setAuthorName(String authorName) {
            this.authorName = authorName;
            return this;
        }
        public String getAuthorName() {
            return this.authorName;
        }

        public QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponseBodyCommit setCommittedDate(String committedDate) {
            this.committedDate = committedDate;
            return this;
        }
        public String getCommittedDate() {
            return this.committedDate;
        }

        public QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponseBodyCommit setCommitterEmail(String committerEmail) {
            this.committerEmail = committerEmail;
            return this;
        }
        public String getCommitterEmail() {
            return this.committerEmail;
        }

        public QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponseBodyCommit setCommitterName(String committerName) {
            this.committerName = committerName;
            return this;
        }
        public String getCommitterName() {
            return this.committerName;
        }

        public QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponseBodyCommit setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponseBodyCommit setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponseBodyCommit setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponseBodyCommit setShortId(String shortId) {
            this.shortId = shortId;
            return this;
        }
        public String getShortId() {
            return this.shortId;
        }

        public QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponseBodyCommit setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponseBodyCommit setParentIds(java.util.List<String> parentIds) {
            this.parentIds = parentIds;
            return this;
        }
        public java.util.List<String> getParentIds() {
            return this.parentIds;
        }

    }

}
