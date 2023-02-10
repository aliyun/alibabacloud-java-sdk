// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageScanAuthCountResponseBody extends TeaModel {
    @NameInMap("ImageScan")
    public DescribeImageScanAuthCountResponseBodyImageScan imageScan;

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
        @NameInMap("ImageScanCapacity")
        public Long imageScanCapacity;

        @NameInMap("InstanceId")
        public String instanceId;

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
