// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetImageScanNumInPeriodResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("ImageScanData")
    public GetImageScanNumInPeriodResponseBodyImageScanData imageScanData;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>7E0618A9-D5EF-4220-9471-C42B5E92****</p>
     */
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
        /**
         * <p>The number of image scans.</p>
         * 
         * <strong>example:</strong>
         * <p>150</p>
         */
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
