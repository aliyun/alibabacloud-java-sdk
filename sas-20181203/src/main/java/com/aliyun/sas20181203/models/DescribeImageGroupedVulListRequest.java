// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageGroupedVulListRequest extends TeaModel {
    /**
     * <p>The alias of the vulnerability.</p>
     * 
     * <strong>example:</strong>
     * <p>High severity vulnerability that affects org.eclipse.jetty:jetty-server</p>
     */
    @NameInMap("AliasName")
    public String aliasName;

    /**
     * <p>The ID of the container cluster.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeGroupedContainerInstances~~">DescribeGroupedContainerInstances</a> operation to query the ID of the container cluster.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>c60b77fe62093480db6164a3c2fa5****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The number of the page to return. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The Common Vulnerabilities and Exposures (CVE) ID of the vulnerability.</p>
     * 
     * <strong>example:</strong>
     * <p>CVE-2017-15420</p>
     */
    @NameInMap("CveId")
    public String cveId;

    /**
     * <p>The ID of the asset group.</p>
     * 
     * <strong>example:</strong>
     * <p>1311</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The SHA-256 value of the image digest.</p>
     * 
     * <strong>example:</strong>
     * <p>w213412341dfsfasdfafadfasfasf</p>
     */
    @NameInMap("ImageDigest")
    public String imageDigest;

    /**
     * <p>The layer of the image.</p>
     * 
     * <strong>example:</strong>
     * <p>b1f5b9420803ad0657cf21566e3e20acc08581e7f22991249ef3aa80b8b1c587</p>
     */
    @NameInMap("ImageLayer")
    public String imageLayer;

    /**
     * <p>The tag of the image.</p>
     * 
     * <strong>example:</strong>
     * <p>oval</p>
     */
    @NameInMap("ImageTag")
    public String imageTag;

    /**
     * <p>Specifies whether to query the vulnerabilities in the latest images. If you do not specify this parameter, the vulnerabilities in all images are queried. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: does not query the vulnerabilities in the latest images.</li>
     * <li><strong>1</strong>: queries the vulnerabilities in the latest images.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("IsLatest")
    public Integer isLatest;

    /**
     * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The name of the vulnerability.</p>
     * 
     * <strong>example:</strong>
     * <p>debian:10:CVE-2019-9893</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The priority to fix the vulnerability. Valid values:</p>
     * <ul>
     * <li><strong>asap</strong>: high. You must fix the vulnerability at the earliest opportunity.</li>
     * <li><strong>later</strong>: medium. You can fix the vulnerability based on your business requirements.</li>
     * <li><strong>nntf</strong>: low. You can ignore the vulnerability.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>asap</p>
     */
    @NameInMap("Necessity")
    public String necessity;

    /**
     * <p>The number of entries to return on each page. Default value: <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the patch that is used to fix the vulnerability.</p>
     * 
     * <strong>example:</strong>
     * <p>1341512412</p>
     */
    @NameInMap("PatchId")
    public Long patchId;

    /**
     * <p>The ID of the image repository.</p>
     * 
     * <strong>example:</strong>
     * <p>qew****</p>
     */
    @NameInMap("RepoId")
    public String repoId;

    /**
     * <p>The instance ID of the image repository.</p>
     * 
     * <strong>example:</strong>
     * <p>i-qewqrqcsadf****</p>
     */
    @NameInMap("RepoInstanceId")
    public String repoInstanceId;

    /**
     * <p>The name of the image repository.</p>
     * 
     * <strong>example:</strong>
     * <p>libssh2</p>
     */
    @NameInMap("RepoName")
    public String repoName;

    /**
     * <p>The namespace to which the image repository belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>libssh2</p>
     */
    @NameInMap("RepoNamespace")
    public String repoNamespace;

    /**
     * <p>The region ID of the image repository.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RepoRegionId")
    public String repoRegionId;

    /**
     * <p>An array consisting of the types of the assets that you want to scan.</p>
     */
    @NameInMap("ScanRange")
    public java.util.List<String> scanRange;

    /**
     * <p>The type of the vulnerability that you want to query. Valid values:</p>
     * <ul>
     * <li><strong>cve</strong>: image system vulnerability</li>
     * <li><strong>sca</strong>: image application vulnerability</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cve</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The UUID of the asset. Separate multiple UUIDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>uuid-13134124****</p>
     */
    @NameInMap("Uuids")
    public String uuids;

    public static DescribeImageGroupedVulListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageGroupedVulListRequest self = new DescribeImageGroupedVulListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeImageGroupedVulListRequest setAliasName(String aliasName) {
        this.aliasName = aliasName;
        return this;
    }
    public String getAliasName() {
        return this.aliasName;
    }

    public DescribeImageGroupedVulListRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeImageGroupedVulListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeImageGroupedVulListRequest setCveId(String cveId) {
        this.cveId = cveId;
        return this;
    }
    public String getCveId() {
        return this.cveId;
    }

    public DescribeImageGroupedVulListRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeImageGroupedVulListRequest setImageDigest(String imageDigest) {
        this.imageDigest = imageDigest;
        return this;
    }
    public String getImageDigest() {
        return this.imageDigest;
    }

    public DescribeImageGroupedVulListRequest setImageLayer(String imageLayer) {
        this.imageLayer = imageLayer;
        return this;
    }
    public String getImageLayer() {
        return this.imageLayer;
    }

    public DescribeImageGroupedVulListRequest setImageTag(String imageTag) {
        this.imageTag = imageTag;
        return this;
    }
    public String getImageTag() {
        return this.imageTag;
    }

    public DescribeImageGroupedVulListRequest setIsLatest(Integer isLatest) {
        this.isLatest = isLatest;
        return this;
    }
    public Integer getIsLatest() {
        return this.isLatest;
    }

    public DescribeImageGroupedVulListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeImageGroupedVulListRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeImageGroupedVulListRequest setNecessity(String necessity) {
        this.necessity = necessity;
        return this;
    }
    public String getNecessity() {
        return this.necessity;
    }

    public DescribeImageGroupedVulListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeImageGroupedVulListRequest setPatchId(Long patchId) {
        this.patchId = patchId;
        return this;
    }
    public Long getPatchId() {
        return this.patchId;
    }

    public DescribeImageGroupedVulListRequest setRepoId(String repoId) {
        this.repoId = repoId;
        return this;
    }
    public String getRepoId() {
        return this.repoId;
    }

    public DescribeImageGroupedVulListRequest setRepoInstanceId(String repoInstanceId) {
        this.repoInstanceId = repoInstanceId;
        return this;
    }
    public String getRepoInstanceId() {
        return this.repoInstanceId;
    }

    public DescribeImageGroupedVulListRequest setRepoName(String repoName) {
        this.repoName = repoName;
        return this;
    }
    public String getRepoName() {
        return this.repoName;
    }

    public DescribeImageGroupedVulListRequest setRepoNamespace(String repoNamespace) {
        this.repoNamespace = repoNamespace;
        return this;
    }
    public String getRepoNamespace() {
        return this.repoNamespace;
    }

    public DescribeImageGroupedVulListRequest setRepoRegionId(String repoRegionId) {
        this.repoRegionId = repoRegionId;
        return this;
    }
    public String getRepoRegionId() {
        return this.repoRegionId;
    }

    public DescribeImageGroupedVulListRequest setScanRange(java.util.List<String> scanRange) {
        this.scanRange = scanRange;
        return this;
    }
    public java.util.List<String> getScanRange() {
        return this.scanRange;
    }

    public DescribeImageGroupedVulListRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribeImageGroupedVulListRequest setUuids(String uuids) {
        this.uuids = uuids;
        return this;
    }
    public String getUuids() {
        return this.uuids;
    }

}
