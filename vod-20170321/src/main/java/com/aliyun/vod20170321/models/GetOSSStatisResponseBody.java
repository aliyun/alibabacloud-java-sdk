// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetOSSStatisResponseBody extends TeaModel {
    @NameInMap("MaxStorageUtilization")
    public Long maxStorageUtilization;

    @NameInMap("OssStatisList")
    public GetOSSStatisResponseBodyOssStatisList ossStatisList;

    @NameInMap("RequestId")
    public String requestId;

    public static GetOSSStatisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOSSStatisResponseBody self = new GetOSSStatisResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOSSStatisResponseBody setMaxStorageUtilization(Long maxStorageUtilization) {
        this.maxStorageUtilization = maxStorageUtilization;
        return this;
    }
    public Long getMaxStorageUtilization() {
        return this.maxStorageUtilization;
    }

    public GetOSSStatisResponseBody setOssStatisList(GetOSSStatisResponseBodyOssStatisList ossStatisList) {
        this.ossStatisList = ossStatisList;
        return this;
    }
    public GetOSSStatisResponseBodyOssStatisList getOssStatisList() {
        return this.ossStatisList;
    }

    public GetOSSStatisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetOSSStatisResponseBodyOssStatisListOSSMetric extends TeaModel {
        @NameInMap("StatTime")
        public String statTime;

        @NameInMap("StatTimeUTC")
        public String statTimeUTC;

        @NameInMap("StorageUtilization")
        public Long storageUtilization;

        public static GetOSSStatisResponseBodyOssStatisListOSSMetric build(java.util.Map<String, ?> map) throws Exception {
            GetOSSStatisResponseBodyOssStatisListOSSMetric self = new GetOSSStatisResponseBodyOssStatisListOSSMetric();
            return TeaModel.build(map, self);
        }

        public GetOSSStatisResponseBodyOssStatisListOSSMetric setStatTime(String statTime) {
            this.statTime = statTime;
            return this;
        }
        public String getStatTime() {
            return this.statTime;
        }

        public GetOSSStatisResponseBodyOssStatisListOSSMetric setStatTimeUTC(String statTimeUTC) {
            this.statTimeUTC = statTimeUTC;
            return this;
        }
        public String getStatTimeUTC() {
            return this.statTimeUTC;
        }

        public GetOSSStatisResponseBodyOssStatisListOSSMetric setStorageUtilization(Long storageUtilization) {
            this.storageUtilization = storageUtilization;
            return this;
        }
        public Long getStorageUtilization() {
            return this.storageUtilization;
        }

    }

    public static class GetOSSStatisResponseBodyOssStatisList extends TeaModel {
        @NameInMap("OSSMetric")
        public java.util.List<GetOSSStatisResponseBodyOssStatisListOSSMetric> OSSMetric;

        public static GetOSSStatisResponseBodyOssStatisList build(java.util.Map<String, ?> map) throws Exception {
            GetOSSStatisResponseBodyOssStatisList self = new GetOSSStatisResponseBodyOssStatisList();
            return TeaModel.build(map, self);
        }

        public GetOSSStatisResponseBodyOssStatisList setOSSMetric(java.util.List<GetOSSStatisResponseBodyOssStatisListOSSMetric> OSSMetric) {
            this.OSSMetric = OSSMetric;
            return this;
        }
        public java.util.List<GetOSSStatisResponseBodyOssStatisListOSSMetric> getOSSMetric() {
            return this.OSSMetric;
        }

    }

}
