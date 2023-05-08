// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class PublicPreCheckImageScanTaskResponseBody extends TeaModel {
    @NameInMap("Data")
    public PublicPreCheckImageScanTaskResponseBodyData data;

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
        @NameInMap("NeedAuthCount")
        public Integer needAuthCount;

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
