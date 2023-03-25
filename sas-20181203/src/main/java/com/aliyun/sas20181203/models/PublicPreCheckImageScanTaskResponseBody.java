// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class PublicPreCheckImageScanTaskResponseBody extends TeaModel {
    /**
     * <p>The data returned if the call is successful.</p>
     */
    @NameInMap("Data")
    public PublicPreCheckImageScanTaskResponseBodyData data;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static PublicPreCheckImageScanTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PublicPreCheckImageScanTaskResponseBody self = new PublicPreCheckImageScanTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public PublicPreCheckImageScanTaskResponseBody setData(PublicPreCheckImageScanTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public PublicPreCheckImageScanTaskResponseBodyData getData() {
        return this.data;
    }

    public PublicPreCheckImageScanTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class PublicPreCheckImageScanTaskResponseBodyData extends TeaModel {
        /**
         * <p>The number of images to scan in the task.</p>
         */
        @NameInMap("NeedAuthCount")
        public Integer needAuthCount;

        /**
         * <p>The quota for container image scan to be consumed by the task.</p>
         */
        @NameInMap("ScanImageCount")
        public Integer scanImageCount;

        public static PublicPreCheckImageScanTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PublicPreCheckImageScanTaskResponseBodyData self = new PublicPreCheckImageScanTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PublicPreCheckImageScanTaskResponseBodyData setNeedAuthCount(Integer needAuthCount) {
            this.needAuthCount = needAuthCount;
            return this;
        }
        public Integer getNeedAuthCount() {
            return this.needAuthCount;
        }

        public PublicPreCheckImageScanTaskResponseBodyData setScanImageCount(Integer scanImageCount) {
            this.scanImageCount = scanImageCount;
            return this;
        }
        public Integer getScanImageCount() {
            return this.scanImageCount;
        }

    }

}
