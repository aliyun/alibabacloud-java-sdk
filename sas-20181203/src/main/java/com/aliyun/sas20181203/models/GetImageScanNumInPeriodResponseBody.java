// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetImageScanNumInPeriodResponseBody extends TeaModel {
    @NameInMap("ImageScanData")
    public GetImageScanNumInPeriodResponseBodyImageScanData imageScanData;

    @NameInMap("RequestId")
    public String requestId;

    public static GetImageScanNumInPeriodResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetImageScanNumInPeriodResponseBody self = new GetImageScanNumInPeriodResponseBody();
        return TeaModel.build(map, self);
    }

    public GetImageScanNumInPeriodResponseBody setImageScanData(GetImageScanNumInPeriodResponseBodyImageScanData imageScanData) {
        this.imageScanData = imageScanData;
        return this;
    }
    public GetImageScanNumInPeriodResponseBodyImageScanData getImageScanData() {
        return this.imageScanData;
    }

    public GetImageScanNumInPeriodResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetImageScanNumInPeriodResponseBodyImageScanData extends TeaModel {
        @NameInMap("ImageScanCount")
        public Integer imageScanCount;

        public static GetImageScanNumInPeriodResponseBodyImageScanData build(java.util.Map<String, ?> map) throws Exception {
            GetImageScanNumInPeriodResponseBodyImageScanData self = new GetImageScanNumInPeriodResponseBodyImageScanData();
            return TeaModel.build(map, self);
        }

        public GetImageScanNumInPeriodResponseBodyImageScanData setImageScanCount(Integer imageScanCount) {
            this.imageScanCount = imageScanCount;
            return this;
        }
        public Integer getImageScanCount() {
            return this.imageScanCount;
        }

    }

}
