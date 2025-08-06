// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetPersonalStorageListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StorageInfoList")
    public GetPersonalStorageListResponseBodyStorageInfoList storageInfoList;

    public static GetPersonalStorageListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPersonalStorageListResponseBody self = new GetPersonalStorageListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPersonalStorageListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPersonalStorageListResponseBody setStorageInfoList(GetPersonalStorageListResponseBodyStorageInfoList storageInfoList) {
        this.storageInfoList = storageInfoList;
        return this;
    }
    public GetPersonalStorageListResponseBodyStorageInfoList getStorageInfoList() {
        return this.storageInfoList;
    }

    public static class GetPersonalStorageListResponseBodyStorageInfoListStorageInfo extends TeaModel {
        @NameInMap("ExtranetEndpoint")
        public String extranetEndpoint;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("IntranetEndpoint")
        public String intranetEndpoint;

        @NameInMap("Location")
        public String location;

        @NameInMap("OwnerId")
        public Long ownerId;

        @NameInMap("StorageACL")
        public String storageACL;

        @NameInMap("StorageClass")
        public String storageClass;

        public static GetPersonalStorageListResponseBodyStorageInfoListStorageInfo build(java.util.Map<String, ?> map) throws Exception {
            GetPersonalStorageListResponseBodyStorageInfoListStorageInfo self = new GetPersonalStorageListResponseBodyStorageInfoListStorageInfo();
            return TeaModel.build(map, self);
        }

        public GetPersonalStorageListResponseBodyStorageInfoListStorageInfo setExtranetEndpoint(String extranetEndpoint) {
            this.extranetEndpoint = extranetEndpoint;
            return this;
        }
        public String getExtranetEndpoint() {
            return this.extranetEndpoint;
        }

        public GetPersonalStorageListResponseBodyStorageInfoListStorageInfo setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetPersonalStorageListResponseBodyStorageInfoListStorageInfo setIntranetEndpoint(String intranetEndpoint) {
            this.intranetEndpoint = intranetEndpoint;
            return this;
        }
        public String getIntranetEndpoint() {
            return this.intranetEndpoint;
        }

        public GetPersonalStorageListResponseBodyStorageInfoListStorageInfo setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public GetPersonalStorageListResponseBodyStorageInfoListStorageInfo setOwnerId(Long ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public Long getOwnerId() {
            return this.ownerId;
        }

        public GetPersonalStorageListResponseBodyStorageInfoListStorageInfo setStorageACL(String storageACL) {
            this.storageACL = storageACL;
            return this;
        }
        public String getStorageACL() {
            return this.storageACL;
        }

        public GetPersonalStorageListResponseBodyStorageInfoListStorageInfo setStorageClass(String storageClass) {
            this.storageClass = storageClass;
            return this;
        }
        public String getStorageClass() {
            return this.storageClass;
        }

    }

    public static class GetPersonalStorageListResponseBodyStorageInfoList extends TeaModel {
        @NameInMap("StorageInfo")
        public java.util.List<GetPersonalStorageListResponseBodyStorageInfoListStorageInfo> storageInfo;

        public static GetPersonalStorageListResponseBodyStorageInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetPersonalStorageListResponseBodyStorageInfoList self = new GetPersonalStorageListResponseBodyStorageInfoList();
            return TeaModel.build(map, self);
        }

        public GetPersonalStorageListResponseBodyStorageInfoList setStorageInfo(java.util.List<GetPersonalStorageListResponseBodyStorageInfoListStorageInfo> storageInfo) {
            this.storageInfo = storageInfo;
            return this;
        }
        public java.util.List<GetPersonalStorageListResponseBodyStorageInfoListStorageInfo> getStorageInfo() {
            return this.storageInfo;
        }

    }

}
