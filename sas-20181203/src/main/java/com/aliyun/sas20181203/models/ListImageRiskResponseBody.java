// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListImageRiskResponseBody extends TeaModel {
    /**
     * <p>An array that consists of security information about the image.</p>
     */
    @NameInMap("ImageRiskList")
    public java.util.List<ListImageRiskResponseBodyImageRiskList> imageRiskList;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public ListImageRiskResponseBodyPageInfo pageInfo;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>050ACC7A-D4FD-55C6-B861-BA9569C1****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListImageRiskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListImageRiskResponseBody self = new ListImageRiskResponseBody();
        return TeaModel.build(map, self);
    }

    public ListImageRiskResponseBody setImageRiskList(java.util.List<ListImageRiskResponseBodyImageRiskList> imageRiskList) {
        this.imageRiskList = imageRiskList;
        return this;
    }
    public java.util.List<ListImageRiskResponseBodyImageRiskList> getImageRiskList() {
        return this.imageRiskList;
    }

    public ListImageRiskResponseBody setPageInfo(ListImageRiskResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public ListImageRiskResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public ListImageRiskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListImageRiskResponseBodyImageRiskListEndPointList extends TeaModel {
        /**
         * <p>An array that consists the details of the domain name in the endpoint.</p>
         */
        @NameInMap("Domains")
        public java.util.List<String> domains;

        /**
         * <p>The type of the domain name in the endpoint. Valid values:</p>
         * <ul>
         * <li><strong>internet</strong>: Internet</li>
         * <li><strong>intranet</strong>: internal network</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>internet</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListImageRiskResponseBodyImageRiskListEndPointList build(java.util.Map<String, ?> map) throws Exception {
            ListImageRiskResponseBodyImageRiskListEndPointList self = new ListImageRiskResponseBodyImageRiskListEndPointList();
            return TeaModel.build(map, self);
        }

        public ListImageRiskResponseBodyImageRiskListEndPointList setDomains(java.util.List<String> domains) {
            this.domains = domains;
            return this;
        }
        public java.util.List<String> getDomains() {
            return this.domains;
        }

        public ListImageRiskResponseBodyImageRiskListEndPointList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListImageRiskResponseBodyImageRiskList extends TeaModel {
        /**
         * <p>The digest value of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>3f8efc2184cf1d24936b49c27286a284714b77be34c80c9ee38ca6bf322445****</p>
         */
        @NameInMap("Digest")
        public String digest;

        /**
         * <p>An array that consists of the details of the endpoint.</p>
         */
        @NameInMap("EndPointList")
        public java.util.List<ListImageRiskResponseBodyImageRiskListEndPointList> endPointList;

        /**
         * <p>The endpoint of Container Registry.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://172.20.XXX.XXX/test">https://172.20.XXX.XXX/test</a></p>
         */
        @NameInMap("Endpoints")
        public String endpoints;

        /**
         * <p>The image of the container.</p>
         * 
         * <strong>example:</strong>
         * <p>.aliyuncs.com/sas_test/baseline:exploit</p>
         */
        @NameInMap("Image")
        public String image;

        /**
         * <p>The registration status of the image repository. Valid values:</p>
         * <ul>
         * <li><strong>IN_SAS</strong>: The image repository is registered with Security Center.</li>
         * <li><strong>NOT_IN_SAS</strong>: The image repository is not registered with Security Center.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>IN_SAS</p>
         */
        @NameInMap("ImageAccessType")
        public String imageAccessType;

        /**
         * <p>The ID of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>f922bfeb6960436fe3f0e7b62fc6b9a0b47980986669c367c22433269404****</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The public endpoint of the image repository.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>registry-registry.cn-shenzhen-finance-1.cr.aliyuncs.com/xxxx/docker-</strong></strong></p>
         */
        @NameInMap("InternetURLs")
        public String internetURLs;

        /**
         * <p>The region of the image repository.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The type of the image repository. Valid values:</p>
         * <ul>
         * <li><strong>acr</strong></li>
         * <li><strong>harbor</strong></li>
         * <li><strong>quay</strong></li>
         * <li><strong>CI/CD</strong>: Jenkins</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>harbor</p>
         */
        @NameInMap("RegistryType")
        public String registryType;

        /**
         * <p>The ID of the image repository.</p>
         * 
         * <strong>example:</strong>
         * <p>crr-bk2l746eyxca1****</p>
         */
        @NameInMap("RepoId")
        public String repoId;

        /**
         * <p>The name of the image repository.</p>
         * 
         * <strong>example:</strong>
         * <p>scan_test</p>
         */
        @NameInMap("RepoName")
        public String repoName;

        /**
         * <p>The name of the namespace to which the repository belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>vultar***</p>
         */
        @NameInMap("RepoNamespace")
        public String repoNamespace;

        /**
         * <p>The type of the repository. Valid values:</p>
         * <ul>
         * <li><code>PUBLIC</code></li>
         * <li><code>PRIVATE</code></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PRIVATE</p>
         */
        @NameInMap("RepoType")
        public String repoType;

        /**
         * <p>The statistics on a security event.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;baselineNum&quot;: 0,
         *     &quot;newSuspicious&quot;: 0,
         *     &quot;vul&quot;: 0
         * }</p>
         */
        @NameInMap("Statistics")
        public String statistics;

        /**
         * <p>The tag that is added to the image.</p>
         * 
         * <strong>example:</strong>
         * <p>0.1.0</p>
         */
        @NameInMap("Tag")
        public String tag;

        /**
         * <p>Indicates whether the image version is immutable. If the image version is immutable, only the image of the latest version in the image repository can be overwritten. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: The image version is mutable.</li>
         * <li><strong>1</strong>: The image version is immutable.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TagImmutable")
        public Integer tagImmutable;

        /**
         * <p>The UUID of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>624778f3-5bf2-423c-ac0c-47a62c05****</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        /**
         * <p>The endpoint of the image repository in the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>-registry-registry-vpc.cn-shenzhen-finance-1.cr.aliyuncs.com/xxxx/docker-</strong></strong></p>
         */
        @NameInMap("VpcURLs")
        public String vpcURLs;

        public static ListImageRiskResponseBodyImageRiskList build(java.util.Map<String, ?> map) throws Exception {
            ListImageRiskResponseBodyImageRiskList self = new ListImageRiskResponseBodyImageRiskList();
            return TeaModel.build(map, self);
        }

        public ListImageRiskResponseBodyImageRiskList setDigest(String digest) {
            this.digest = digest;
            return this;
        }
        public String getDigest() {
            return this.digest;
        }

        public ListImageRiskResponseBodyImageRiskList setEndPointList(java.util.List<ListImageRiskResponseBodyImageRiskListEndPointList> endPointList) {
            this.endPointList = endPointList;
            return this;
        }
        public java.util.List<ListImageRiskResponseBodyImageRiskListEndPointList> getEndPointList() {
            return this.endPointList;
        }

        public ListImageRiskResponseBodyImageRiskList setEndpoints(String endpoints) {
            this.endpoints = endpoints;
            return this;
        }
        public String getEndpoints() {
            return this.endpoints;
        }

        public ListImageRiskResponseBodyImageRiskList setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public ListImageRiskResponseBodyImageRiskList setImageAccessType(String imageAccessType) {
            this.imageAccessType = imageAccessType;
            return this;
        }
        public String getImageAccessType() {
            return this.imageAccessType;
        }

        public ListImageRiskResponseBodyImageRiskList setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public ListImageRiskResponseBodyImageRiskList setInternetURLs(String internetURLs) {
            this.internetURLs = internetURLs;
            return this;
        }
        public String getInternetURLs() {
            return this.internetURLs;
        }

        public ListImageRiskResponseBodyImageRiskList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListImageRiskResponseBodyImageRiskList setRegistryType(String registryType) {
            this.registryType = registryType;
            return this;
        }
        public String getRegistryType() {
            return this.registryType;
        }

        public ListImageRiskResponseBodyImageRiskList setRepoId(String repoId) {
            this.repoId = repoId;
            return this;
        }
        public String getRepoId() {
            return this.repoId;
        }

        public ListImageRiskResponseBodyImageRiskList setRepoName(String repoName) {
            this.repoName = repoName;
            return this;
        }
        public String getRepoName() {
            return this.repoName;
        }

        public ListImageRiskResponseBodyImageRiskList setRepoNamespace(String repoNamespace) {
            this.repoNamespace = repoNamespace;
            return this;
        }
        public String getRepoNamespace() {
            return this.repoNamespace;
        }

        public ListImageRiskResponseBodyImageRiskList setRepoType(String repoType) {
            this.repoType = repoType;
            return this;
        }
        public String getRepoType() {
            return this.repoType;
        }

        public ListImageRiskResponseBodyImageRiskList setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public ListImageRiskResponseBodyImageRiskList setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public ListImageRiskResponseBodyImageRiskList setTagImmutable(Integer tagImmutable) {
            this.tagImmutable = tagImmutable;
            return this;
        }
        public Integer getTagImmutable() {
            return this.tagImmutable;
        }

        public ListImageRiskResponseBodyImageRiskList setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public ListImageRiskResponseBodyImageRiskList setVpcURLs(String vpcURLs) {
            this.vpcURLs = vpcURLs;
            return this;
        }
        public String getVpcURLs() {
            return this.vpcURLs;
        }

    }

    public static class ListImageRiskResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The number of entries returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>23</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListImageRiskResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListImageRiskResponseBodyPageInfo self = new ListImageRiskResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public ListImageRiskResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public ListImageRiskResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListImageRiskResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListImageRiskResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
