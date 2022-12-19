// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAccessKeyLeakDetailResponseBody extends TeaModel {
    // The ID of the AccessKey pair that is leaked.
    @NameInMap("AccesskeyId")
    public String accesskeyId;

    // The platform to which the asset belongs. The value is fixed as **Cloud platform**.
    @NameInMap("Asset")
    public String asset;

    // The code snippet that is leaked.
    @NameInMap("Code")
    public String code;

    // The time when the AccessKey pair leak was handled.
    @NameInMap("DealTime")
    public String dealTime;

    // The solution to the AccessKey pair leak. Valid values:
    // 
    // *   **manual**: manually deleted
    // *   **disable**: manually disabled
    // *   **add-whitelist**: added to the whitelist
    // *   **pending**: unhandled
    @NameInMap("DealType")
    public String dealType;

    // The name of the GitHub file.
    @NameInMap("GithubFileName")
    public String githubFileName;

    // The type of the GitHub file. Valid values:
    // 
    // *   Python
    // *   XML
    // *   GO
    // *   Javascript
    // *   INI
    // *   JSON
    // *   C++
    @NameInMap("GithubFileType")
    public String githubFileType;

    // The time when the GitHub file was updated.
    @NameInMap("GithubFileUpdateTime")
    public String githubFileUpdateTime;

    // The URL of the GitHub file.
    @NameInMap("GithubFileUrl")
    public String githubFileUrl;

    // The name of the GitHub repository.
    @NameInMap("GithubRepoName")
    public String githubRepoName;

    // The URL of the GitHub repository.
    @NameInMap("GithubRepoUrl")
    public String githubRepoUrl;

    // The username of the GitHub user.
    @NameInMap("GithubUser")
    public String githubUser;

    // The URL of the profile picture for the GitHub user.
    @NameInMap("GithubUserPicUrl")
    public String githubUserPicUrl;

    // The first time when the AccessKey pair leak was detected.
    @NameInMap("GmtCreate")
    public String gmtCreate;

    // The last time when the AccessKey pair leak was detected.
    @NameInMap("GmtModified")
    public String gmtModified;

    // The remarks of the AccessKey pair leak.
    @NameInMap("Remark")
    public String remark;

    // The ID of the request, which is used to locate and troubleshoot issues.
    @NameInMap("RequestId")
    public String requestId;

    // The platform on which the AccessKey pair leak is detected.
    @NameInMap("Source")
    public String source;

    // The type of the leak. The value is fixed as **AccessKey**.
    @NameInMap("Type")
    public String type;

    // Indicates whether the AccessKey pair leak is added to the whitelist. Valid values:
    // 
    // *   **no**: The AccessKey pair leak is not added to the whitelist.
    // *   **yes**: The AccessKey pair leak is added to the whitelist.
    @NameInMap("WhitelistStatus")
    public String whitelistStatus;

    public static DescribeAccessKeyLeakDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccessKeyLeakDetailResponseBody self = new DescribeAccessKeyLeakDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAccessKeyLeakDetailResponseBody setAccesskeyId(String accesskeyId) {
        this.accesskeyId = accesskeyId;
        return this;
    }
    public String getAccesskeyId() {
        return this.accesskeyId;
    }

    public DescribeAccessKeyLeakDetailResponseBody setAsset(String asset) {
        this.asset = asset;
        return this;
    }
    public String getAsset() {
        return this.asset;
    }

    public DescribeAccessKeyLeakDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeAccessKeyLeakDetailResponseBody setDealTime(String dealTime) {
        this.dealTime = dealTime;
        return this;
    }
    public String getDealTime() {
        return this.dealTime;
    }

    public DescribeAccessKeyLeakDetailResponseBody setDealType(String dealType) {
        this.dealType = dealType;
        return this;
    }
    public String getDealType() {
        return this.dealType;
    }

    public DescribeAccessKeyLeakDetailResponseBody setGithubFileName(String githubFileName) {
        this.githubFileName = githubFileName;
        return this;
    }
    public String getGithubFileName() {
        return this.githubFileName;
    }

    public DescribeAccessKeyLeakDetailResponseBody setGithubFileType(String githubFileType) {
        this.githubFileType = githubFileType;
        return this;
    }
    public String getGithubFileType() {
        return this.githubFileType;
    }

    public DescribeAccessKeyLeakDetailResponseBody setGithubFileUpdateTime(String githubFileUpdateTime) {
        this.githubFileUpdateTime = githubFileUpdateTime;
        return this;
    }
    public String getGithubFileUpdateTime() {
        return this.githubFileUpdateTime;
    }

    public DescribeAccessKeyLeakDetailResponseBody setGithubFileUrl(String githubFileUrl) {
        this.githubFileUrl = githubFileUrl;
        return this;
    }
    public String getGithubFileUrl() {
        return this.githubFileUrl;
    }

    public DescribeAccessKeyLeakDetailResponseBody setGithubRepoName(String githubRepoName) {
        this.githubRepoName = githubRepoName;
        return this;
    }
    public String getGithubRepoName() {
        return this.githubRepoName;
    }

    public DescribeAccessKeyLeakDetailResponseBody setGithubRepoUrl(String githubRepoUrl) {
        this.githubRepoUrl = githubRepoUrl;
        return this;
    }
    public String getGithubRepoUrl() {
        return this.githubRepoUrl;
    }

    public DescribeAccessKeyLeakDetailResponseBody setGithubUser(String githubUser) {
        this.githubUser = githubUser;
        return this;
    }
    public String getGithubUser() {
        return this.githubUser;
    }

    public DescribeAccessKeyLeakDetailResponseBody setGithubUserPicUrl(String githubUserPicUrl) {
        this.githubUserPicUrl = githubUserPicUrl;
        return this;
    }
    public String getGithubUserPicUrl() {
        return this.githubUserPicUrl;
    }

    public DescribeAccessKeyLeakDetailResponseBody setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public DescribeAccessKeyLeakDetailResponseBody setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public DescribeAccessKeyLeakDetailResponseBody setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public DescribeAccessKeyLeakDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAccessKeyLeakDetailResponseBody setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public DescribeAccessKeyLeakDetailResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribeAccessKeyLeakDetailResponseBody setWhitelistStatus(String whitelistStatus) {
        this.whitelistStatus = whitelistStatus;
        return this;
    }
    public String getWhitelistStatus() {
        return this.whitelistStatus;
    }

}
