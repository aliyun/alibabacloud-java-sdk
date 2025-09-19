// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAccessKeyLeakDetailResponseBody extends TeaModel {
    /**
     * <p>The ID of the AccessKey pair that is leaked.</p>
     * 
     * <strong>example:</strong>
     * <p>yourAccessKeyID</p>
     */
    @NameInMap("AccesskeyId")
    public String accesskeyId;

    /**
     * <p>The platform to which the asset belongs. The value is fixed as <strong>Cloud platform</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>Cloud platform</p>
     */
    @NameInMap("Asset")
    public String asset;

    /**
     * <p>The code snippet that is leaked.</p>
     * 
     * <strong>example:</strong>
     * <p>\n1231 \nak=yourAccessKeyID \n12311123 \nsk1999 \nsk1999sk1999 \nsk1999sk1999 \n\n\ntest001 ak hht \nak=yourAccessKeyID \nsk=yourAccessKeySecret</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The time when the AccessKey pair leak was handled.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-01-17 15:47:08</p>
     */
    @NameInMap("DealTime")
    public String dealTime;

    /**
     * <p>The solution to the AccessKey pair leak. Valid values:</p>
     * <ul>
     * <li><strong>manual</strong>: manually deleted</li>
     * <li><strong>disable</strong>: manually disabled</li>
     * <li><strong>add-whitelist</strong>: added to the whitelist</li>
     * <li><strong>pending</strong>: unhandled</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>add-whitelist</p>
     */
    @NameInMap("DealType")
    public String dealType;

    /**
     * <p>The name of the GitHub file.</p>
     * 
     * <strong>example:</strong>
     * <p>testAkLeak</p>
     */
    @NameInMap("GithubFileName")
    public String githubFileName;

    /**
     * <p>The type of the GitHub file. Valid values:</p>
     * <ul>
     * <li>Python</li>
     * <li>XML</li>
     * <li>GO</li>
     * <li>Javascript</li>
     * <li>INI</li>
     * <li>JSON</li>
     * <li>C++</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Python</p>
     */
    @NameInMap("GithubFileType")
    public String githubFileType;

    /**
     * <p>The time when the GitHub file was updated.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-07-06T09:49:33</p>
     */
    @NameInMap("GithubFileUpdateTime")
    public String githubFileUpdateTime;

    /**
     * <p>The URL of the GitHub file.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://github.com/Blue00Blue/ExamOnline/blob/6c932c10fc3f217783f3937e2b230f79656c18a7/testAk">https://github.com/Blue00Blue/ExamOnline/blob/6c932c10fc3f217783f3937e2b230f79656c18a7/testAk</a>****</p>
     */
    @NameInMap("GithubFileUrl")
    public String githubFileUrl;

    /**
     * <p>The name of the GitHub repository.</p>
     * 
     * <strong>example:</strong>
     * <p>ExamOnline</p>
     */
    @NameInMap("GithubRepoName")
    public String githubRepoName;

    /**
     * <p>The URL of the GitHub repository.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://github.com/Blue00Blue/ExamOn">https://github.com/Blue00Blue/ExamOn</a>****</p>
     */
    @NameInMap("GithubRepoUrl")
    public String githubRepoUrl;

    /**
     * <p>The username of the GitHub user.</p>
     * 
     * <strong>example:</strong>
     * <p>Blue00Blue</p>
     */
    @NameInMap("GithubUser")
    public String githubUser;

    /**
     * <p>The URL of the profile picture for the GitHub user.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://avatars.githubusercontent.com/u/26296896?s=48&v=">https://avatars.githubusercontent.com/u/26296896?s=48&amp;v=</a>****</p>
     */
    @NameInMap("GithubUserPicUrl")
    public String githubUserPicUrl;

    /**
     * <p>The first time when the AccessKey pair leak was detected.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-07-06 17:49:41</p>
     */
    @NameInMap("GmtCreate")
    public String gmtCreate;

    /**
     * <p>The last time when the AccessKey pair leak was detected.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-07-06 17:49:39</p>
     */
    @NameInMap("GmtModified")
    public String gmtModified;

    /**
     * <p>The remarks of the AccessKey pair leak.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>79CFF74D-E967-5407-8A78-EE03B925FDAA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The platform on which the AccessKey pair leak is detected.</p>
     * 
     * <strong>example:</strong>
     * <p>GitHub</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The validity of the key that is associated with the AccessKey pair. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: to be confirmed.</li>
     * <li><strong>1</strong>: valid.</li>
     * <li><strong>2</strong>: invalid.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TokenValid")
    public Integer tokenValid;

    /**
     * <p>The type of the leak. The value is fixed as <strong>AccessKey</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>AccessKey</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>Indicates whether the AccessKey pair leak is added to the whitelist. Valid values:</p>
     * <ul>
     * <li><strong>no</strong>: no</li>
     * <li><strong>yes</strong>: yes</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>no</p>
     */
    @NameInMap("WhitelistStatus")
    public String whitelistStatus;

    /**
     * <p>The time when the AccessKey pair was added to the whitelist. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1689172004478</p>
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
