// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAccessKeyLeakDetailResponseBody extends TeaModel {
    /**
     * <p>The ID of the AccessKey pair that is leaked.</p>
     */
    @NameInMap("AccesskeyId")
    public String accesskeyId;

    /**
     * <p>The platform to which the asset belongs. The value is fixed as **Cloud platform**.</p>
     */
    @NameInMap("Asset")
    public String asset;

    /**
     * <p>The code snippet that is leaked.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The time when the AccessKey pair leak was handled.</p>
     */
    @NameInMap("DealTime")
    public String dealTime;

    /**
     * <p>The solution to the AccessKey pair leak. Valid values:</p>
     * <br>
     * <p>*   **manual**: manually deleted</p>
     * <p>*   **disable**: manually disabled</p>
     * <p>*   **add-whitelist**: added to the whitelist</p>
     * <p>*   **pending**: unhandled</p>
     */
    @NameInMap("DealType")
    public String dealType;

    /**
     * <p>The name of the GitHub file.</p>
     */
    @NameInMap("GithubFileName")
    public String githubFileName;

    /**
     * <p>The type of the GitHub file. Valid values:</p>
     * <br>
     * <p>*   Python</p>
     * <p>*   XML</p>
     * <p>*   GO</p>
     * <p>*   Javascript</p>
     * <p>*   INI</p>
     * <p>*   JSON</p>
     * <p>*   C++</p>
     */
    @NameInMap("GithubFileType")
    public String githubFileType;

    /**
     * <p>The time when the GitHub file was updated.</p>
     */
    @NameInMap("GithubFileUpdateTime")
    public String githubFileUpdateTime;

    /**
     * <p>The URL of the GitHub file.</p>
     */
    @NameInMap("GithubFileUrl")
    public String githubFileUrl;

    /**
     * <p>The name of the GitHub repository.</p>
     */
    @NameInMap("GithubRepoName")
    public String githubRepoName;

    /**
     * <p>The URL of the GitHub repository.</p>
     */
    @NameInMap("GithubRepoUrl")
    public String githubRepoUrl;

    /**
     * <p>The username of the GitHub user.</p>
     */
    @NameInMap("GithubUser")
    public String githubUser;

    /**
     * <p>The URL of the profile picture for the GitHub user.</p>
     */
    @NameInMap("GithubUserPicUrl")
    public String githubUserPicUrl;

    /**
     * <p>The first time when the AccessKey pair leak was detected.</p>
     */
    @NameInMap("GmtCreate")
    public String gmtCreate;

    /**
     * <p>The last time when the AccessKey pair leak was detected.</p>
     */
    @NameInMap("GmtModified")
    public String gmtModified;

    /**
     * <p>The remarks of the AccessKey pair leak.</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The platform on which the AccessKey pair leak is detected.</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The validity of the key that is associated with the AccessKey pair. Valid values:</p>
     * <br>
     * <p>*   **0**: to be confirmed.</p>
     * <p>*   **1**: valid.</p>
     * <p>*   **2**: invalid.</p>
     */
    @NameInMap("TokenValid")
    public Integer tokenValid;

    /**
     * <p>The type of the leak. The value is fixed as **AccessKey**.</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>Indicates whether the AccessKey pair leak is added to the whitelist. Valid values:</p>
     * <br>
     * <p>*   **no**: no</p>
     * <p>*   **yes**: yes</p>
     */
    @NameInMap("WhitelistStatus")
    public String whitelistStatus;

    /**
     * <p>The time when the AccessKey pair was added to the whitelist. Unit: milliseconds.</p>
     */
    @NameInMap("WhitelistTime")
    public Long whitelistTime;

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

    public DescribeAccessKeyLeakDetailResponseBody setTokenValid(Integer tokenValid) {
        this.tokenValid = tokenValid;
        return this;
    }
    public Integer getTokenValid() {
        return this.tokenValid;
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

    public DescribeAccessKeyLeakDetailResponseBody setWhitelistTime(Long whitelistTime) {
        this.whitelistTime = whitelistTime;
        return this;
    }
    public Long getWhitelistTime() {
        return this.whitelistTime;
    }

}
