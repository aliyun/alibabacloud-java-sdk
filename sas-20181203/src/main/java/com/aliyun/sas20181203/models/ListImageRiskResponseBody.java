// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListImageRiskResponseBody extends TeaModel {
    @NameInMap("ImageRiskList")
    public java.util.List<ListImageRiskResponseBodyImageRiskList> imageRiskList;

    @NameInMap("PageInfo")
    public ListImageRiskResponseBodyPageInfo pageInfo;

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
        @NameInMap("Domains")
        public java.util.List<String> domains;

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
        @NameInMap("Digest")
        public String digest;

        @NameInMap("EndPointList")
        public java.util.List<ListImageRiskResponseBodyImageRiskListEndPointList> endPointList;

        @NameInMap("Endpoints")
        public String endpoints;

        @NameInMap("Image")
        public String image;

        @NameInMap("ImageAccessType")
        public String imageAccessType;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("InternetURLs")
        public String internetURLs;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RegistryType")
        public String registryType;

        @NameInMap("RepoId")
        public String repoId;

        @NameInMap("RepoName")
        public String repoName;

        @NameInMap("RepoNamespace")
        public String repoNamespace;

        @NameInMap("RepoType")
        public String repoType;

        @NameInMap("Statistics")
        public String statistics;

        @NameInMap("Tag")
        public String tag;

        @NameInMap("TagImmutable")
        public Integer tagImmutable;

        @NameInMap("Uuid")
        public String uuid;

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
        @NameInMap("Count")
        public Integer count;

        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

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
