// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageScanAuthCountResponseBody extends TeaModel {
    /**
     * <p>The authorization details of image security scanning.</p>
     */
    @NameInMap("ImageScan")
    public DescribeImageScanAuthCountResponseBodyImageScan imageScan;

    /**
     * <p>The ID of the request. The China Cloud generates a unique ID for each request. You can use the ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>892NYH839-0EDC-4CD0-A2EF-5BD294656C99</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeImageScanAuthCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageScanAuthCountResponseBody self = new DescribeImageScanAuthCountResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeImageScanAuthCountResponseBody setImageScan(DescribeImageScanAuthCountResponseBodyImageScan imageScan) {
        this.imageScan = imageScan;
        return this;
    }
    public DescribeImageScanAuthCountResponseBodyImageScan getImageScan() {
        return this.imageScan;
    }

    public DescribeImageScanAuthCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeImageScanAuthCountResponseBodyImageScan extends TeaModel {
        /**
         * <p>The total number of authorization quotas.</p>
         * 
         * <strong>example:</strong>
         * <p>15340</p>
         */
        @NameInMap("ImageScanCapacity")
        public Long imageScanCapacity;

        /**
         * <p>The instance ID of the purchased Security Center instance.</p>
         * 
         * <strong>example:</strong>
         * <p>sas-qdl123412****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The number of used authorization quotas.</p>
         * 
         * <strong>example:</strong>
         * <p>5489</p>
         */
        @NameInMap("ScanCount")
        public Long scanCount;

        public static DescribeImageScanAuthCountResponseBodyImageScan build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageScanAuthCountResponseBodyImageScan self = new DescribeImageScanAuthCountResponseBodyImageScan();
            return TeaModel.build(map, self);
        }

        public DescribeImageScanAuthCountResponseBodyImageScan setImageScanCapacity(Long imageScanCapacity) {
            this.imageScanCapacity = imageScanCapacity;
            return this;
        }
        public Long getImageScanCapacity() {
            return this.imageScanCapacity;
        }

        public DescribeImageScanAuthCountResponseBodyImageScan setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeImageScanAuthCountResponseBodyImageScan setScanCount(Long scanCount) {
            this.scanCount = scanCount;
            return this;
        }
        public Long getScanCount() {
            return this.scanCount;
        }

    }

}
