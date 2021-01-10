// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponseBody extends TeaModel {
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
    public java.util.List<GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponseBodyAllowedMergeUsers> allowedMergeUsers;

    @NameInMap("AllowedPushUsers")
    public java.util.List<GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponseBodyAllowedPushUsers> allowedPushUsers;

    @NameInMap("Commit")
    public GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponseBodyCommit commit;

    public static GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponseBody self = new GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponseBody setMergeAccessLevel(String mergeAccessLevel) {
        this.mergeAccessLevel = mergeAccessLevel;
        return this;
    }
    public String getMergeAccessLevel() {
        return this.mergeAccessLevel;
    }

    public GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponseBody setPushAccessLevel(String pushAccessLevel) {
        this.pushAccessLevel = pushAccessLevel;
        return this;
    }
    public String getPushAccessLevel() {
        return this.pushAccessLevel;
    }

    public GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponseBody setMatchedBranches(java.util.List<String> matchedBranches) {
        this.matchedBranches = matchedBranches;
        return this;
    }
    public java.util.List<String> getMatchedBranches() {
        return this.matchedBranches;
    }

    public GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponseBody setAllowedMergeUsers(java.util.List<GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponseBodyAllowedMergeUsers> allowedMergeUsers) {
        this.allowedMergeUsers = allowedMergeUsers;
        return this;
    }
    public java.util.List<GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponseBodyAllowedMergeUsers> getAllowedMergeUsers() {
        return this.allowedMergeUsers;
    }

    public GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponseBody setAllowedPushUsers(java.util.List<GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponseBodyAllowedPushUsers> allowedPushUsers) {
        this.allowedPushUsers = allowedPushUsers;
        return this;
    }
    public java.util.List<GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponseBodyAllowedPushUsers> getAllowedPushUsers() {
        return this.allowedPushUsers;
    }

    public GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponseBody setCommit(GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponseBodyCommit commit) {
        this.commit = commit;
        return this;
    }
    public GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponseBodyCommit getCommit() {
        return this.commit;
    }

    public static class GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponseBodyAllowedMergeUsers extends TeaModel {
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

        public static GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponseBodyAllowedMergeUsers build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponseBodyAllowedMergeUsers self = new GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponseBodyAllowedMergeUsers();
            return TeaModel.build(map, self);
        }

        public GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponseBodyAllowedMergeUsers setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponseBodyAllowedMergeUsers setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponseBodyAllowedMergeUsers setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponseBodyAllowedMergeUsers setExternUid(String externUid) {
            this.externUid = externUid;
            return this;
        }
        public String getExternUid() {
            return this.externUid;
        }

        public GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponseBodyAllowedMergeUsers setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponseBodyAllowedMergeUsers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponseBodyAllowedMergeUsers setNotificationLevel(Long notificationLevel) {
            this.notificationLevel = notificationLevel;
            return this;
        }
        public Long getNotificationLevel() {
            return this.notificationLevel;
        }

        public GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponseBodyAllowedMergeUsers setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponseBodyAllowedMergeUsers setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponseBodyAllowedMergeUsers setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponseBodyAllowedMergeUsers setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

    }

    public static class GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponseBodyAllowedPushUsers extends TeaModel {
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

        public static GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponseBodyAllowedPushUsers build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponseBodyAllowedPushUsers self = new GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponseBodyAllowedPushUsers();
            return TeaModel.build(map, self);
        }

        public GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponseBodyAllowedPushUsers setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponseBodyAllowedPushUsers setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponseBodyAllowedPushUsers setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponseBodyAllowedPushUsers setExternUid(String externUid) {
            this.externUid = externUid;
            return this;
        }
        public String getExternUid() {
            return this.externUid;
        }

        public GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponseBodyAllowedPushUsers setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponseBodyAllowedPushUsers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponseBodyAllowedPushUsers setNotificationLevel(Long notificationLevel) {
            this.notificationLevel = notificationLevel;
            return this;
        }
        public Long getNotificationLevel() {
            return this.notificationLevel;
        }

        public GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponseBodyAllowedPushUsers setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponseBodyAllowedPushUsers setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponseBodyAllowedPushUsers setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponseBodyAllowedPushUsers setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

    }

    public static class GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponseBodyCommit extends TeaModel {
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

        public static GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponseBodyCommit build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponseBodyCommit self = new GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponseBodyCommit();
            return TeaModel.build(map, self);
        }

        public GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponseBodyCommit setAuthoredDate(String authoredDate) {
            this.authoredDate = authoredDate;
            return this;
        }
        public String getAuthoredDate() {
            return this.authoredDate;
        }

        public GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponseBodyCommit setAuthorEmail(String authorEmail) {
            this.authorEmail = authorEmail;
            return this;
        }
        public String getAuthorEmail() {
            return this.authorEmail;
        }

        public GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponseBodyCommit setAuthorName(String authorName) {
            this.authorName = authorName;
            return this;
        }
        public String getAuthorName() {
            return this.authorName;
        }

        public GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponseBodyCommit setCommittedDate(String committedDate) {
            this.committedDate = committedDate;
            return this;
        }
        public String getCommittedDate() {
            return this.committedDate;
        }

        public GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponseBodyCommit setCommitterEmail(String committerEmail) {
            this.committerEmail = committerEmail;
            return this;
        }
        public String getCommitterEmail() {
            return this.committerEmail;
        }

        public GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponseBodyCommit setCommitterName(String committerName) {
            this.committerName = committerName;
            return this;
        }
        public String getCommitterName() {
            return this.committerName;
        }

        public GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponseBodyCommit setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponseBodyCommit setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponseBodyCommit setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponseBodyCommit setShortId(String shortId) {
            this.shortId = shortId;
            return this;
        }
        public String getShortId() {
            return this.shortId;
        }

        public GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponseBodyCommit setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponseBodyCommit setParentIds(java.util.List<String> parentIds) {
            this.parentIds = parentIds;
            return this;
        }
        public java.util.List<String> getParentIds() {
            return this.parentIds;
        }

    }

}
