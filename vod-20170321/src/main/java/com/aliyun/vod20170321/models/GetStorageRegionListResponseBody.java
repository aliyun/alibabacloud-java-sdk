// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetStorageRegionListResponseBody extends TeaModel {
    @NameInMap("RegionList")
    public GetStorageRegionListResponseBodyRegionList regionList;

    @NameInMap("RequestId")
    public String requestId;

    public static GetStorageRegionListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetStorageRegionListResponseBody self = new GetStorageRegionListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetStorageRegionListResponseBody setRegionList(GetStorageRegionListResponseBodyRegionList regionList) {
        this.regionList = regionList;
        return this;
    }
    public GetStorageRegionListResponseBodyRegionList getRegionList() {
        return this.regionList;
    }

    public GetStorageRegionListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetStorageRegionListResponseBodyRegionListRegion extends TeaModel {
        @NameInMap("RegionID")
        public String regionID;

        public static GetStorageRegionListResponseBodyRegionListRegion build(java.util.Map<String, ?> map) throws Exception {
            GetStorageRegionListResponseBodyRegionListRegion self = new GetStorageRegionListResponseBodyRegionListRegion();
            return TeaModel.build(map, self);
        }

        public GetStorageRegionListResponseBodyRegionListRegion setRegionID(String regionID) {
            this.regionID = regionID;
            return this;
        }
        public String getRegionID() {
            return this.regionID;
        }

    }

    public static class GetStorageRegionListResponseBodyRegionList extends TeaModel {
        @NameInMap("Region")
        public java.util.List<GetStorageRegionListResponseBodyRegionListRegion> region;

        public static GetStorageRegionListResponseBodyRegionList build(java.util.Map<String, ?> map) throws Exception {
            GetStorageRegionListResponseBodyRegionList self = new GetStorageRegionListResponseBodyRegionList();
            return TeaModel.build(map, self);
        }

        public GetStorageRegionListResponseBodyRegionList setRegion(java.util.List<GetStorageRegionListResponseBodyRegionListRegion> region) {
            this.region = region;
            return this;
        }
        public java.util.List<GetStorageRegionListResponseBodyRegionListRegion> getRegion() {
            return this.region;
        }

    }

}
