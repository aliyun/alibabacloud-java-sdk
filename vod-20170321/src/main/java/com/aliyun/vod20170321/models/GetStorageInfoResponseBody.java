// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetStorageInfoResponseBody extends TeaModel {
    @NameInMap("DomainInfoList")
    public GetStorageInfoResponseBodyDomainInfoList domainInfoList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Storage")
    public GetStorageInfoResponseBodyStorage storage;

    @NameInMap("StorageACL")
    public String storageACL;

    public static GetStorageInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetStorageInfoResponseBody self = new GetStorageInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetStorageInfoResponseBody setDomainInfoList(GetStorageInfoResponseBodyDomainInfoList domainInfoList) {
        this.domainInfoList = domainInfoList;
        return this;
    }
    public GetStorageInfoResponseBodyDomainInfoList getDomainInfoList() {
        return this.domainInfoList;
    }

    public GetStorageInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetStorageInfoResponseBody setStorage(GetStorageInfoResponseBodyStorage storage) {
        this.storage = storage;
        return this;
    }
    public GetStorageInfoResponseBodyStorage getStorage() {
        return this.storage;
    }

    public GetStorageInfoResponseBody setStorageACL(String storageACL) {
        this.storageACL = storageACL;
        return this;
    }
    public String getStorageACL() {
        return this.storageACL;
    }

    public static class GetStorageInfoResponseBodyDomainInfoListDomainInfo extends TeaModel {
        @NameInMap("DefaultPlay")
        public Boolean defaultPlay;

        @NameInMap("DomainCname")
        public String domainCname;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("DomainStatus")
        public String domainStatus;

        public static GetStorageInfoResponseBodyDomainInfoListDomainInfo build(java.util.Map<String, ?> map) throws Exception {
            GetStorageInfoResponseBodyDomainInfoListDomainInfo self = new GetStorageInfoResponseBodyDomainInfoListDomainInfo();
            return TeaModel.build(map, self);
        }

        public GetStorageInfoResponseBodyDomainInfoListDomainInfo setDefaultPlay(Boolean defaultPlay) {
            this.defaultPlay = defaultPlay;
            return this;
        }
        public Boolean getDefaultPlay() {
            return this.defaultPlay;
        }

        public GetStorageInfoResponseBodyDomainInfoListDomainInfo setDomainCname(String domainCname) {
            this.domainCname = domainCname;
            return this;
        }
        public String getDomainCname() {
            return this.domainCname;
        }

        public GetStorageInfoResponseBodyDomainInfoListDomainInfo setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public GetStorageInfoResponseBodyDomainInfoListDomainInfo setDomainStatus(String domainStatus) {
            this.domainStatus = domainStatus;
            return this;
        }
        public String getDomainStatus() {
            return this.domainStatus;
        }

    }

    public static class GetStorageInfoResponseBodyDomainInfoList extends TeaModel {
        @NameInMap("DomainInfo")
        public java.util.List<GetStorageInfoResponseBodyDomainInfoListDomainInfo> domainInfo;

        public static GetStorageInfoResponseBodyDomainInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetStorageInfoResponseBodyDomainInfoList self = new GetStorageInfoResponseBodyDomainInfoList();
            return TeaModel.build(map, self);
        }

        public GetStorageInfoResponseBodyDomainInfoList setDomainInfo(java.util.List<GetStorageInfoResponseBodyDomainInfoListDomainInfo> domainInfo) {
            this.domainInfo = domainInfo;
            return this;
        }
        public java.util.List<GetStorageInfoResponseBodyDomainInfoListDomainInfo> getDomainInfo() {
            return this.domainInfo;
        }

    }

    public static class GetStorageInfoResponseBodyStorage extends TeaModel {
        @NameInMap("DefaultUpload")
        public Boolean defaultUpload;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("Location")
        public String location;

        @NameInMap("Region")
        public String region;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("StorageUsage")
        public Integer storageUsage;

        @NameInMap("Type")
        public Integer type;

        public static GetStorageInfoResponseBodyStorage build(java.util.Map<String, ?> map) throws Exception {
            GetStorageInfoResponseBodyStorage self = new GetStorageInfoResponseBodyStorage();
            return TeaModel.build(map, self);
        }

        public GetStorageInfoResponseBodyStorage setDefaultUpload(Boolean defaultUpload) {
            this.defaultUpload = defaultUpload;
            return this;
        }
        public Boolean getDefaultUpload() {
            return this.defaultUpload;
        }

        public GetStorageInfoResponseBodyStorage setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetStorageInfoResponseBodyStorage setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetStorageInfoResponseBodyStorage setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public GetStorageInfoResponseBodyStorage setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public GetStorageInfoResponseBodyStorage setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetStorageInfoResponseBodyStorage setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public GetStorageInfoResponseBodyStorage setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetStorageInfoResponseBodyStorage setStorageUsage(Integer storageUsage) {
            this.storageUsage = storageUsage;
            return this;
        }
        public Integer getStorageUsage() {
            return this.storageUsage;
        }

        public GetStorageInfoResponseBodyStorage setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

}
