// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class DownloadDatasetResponseBody extends TeaModel {
    @NameInMap("Data")
    public DownloadDatasetResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static DownloadDatasetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DownloadDatasetResponseBody self = new DownloadDatasetResponseBody();
        return TeaModel.build(map, self);
    }

    public DownloadDatasetResponseBody setData(DownloadDatasetResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DownloadDatasetResponseBodyData getData() {
        return this.data;
    }

    public DownloadDatasetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DownloadDatasetResponseBodyData extends TeaModel {
        @NameInMap("OssHttpUrl")
        public String ossHttpUrl;

        public static DownloadDatasetResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DownloadDatasetResponseBodyData self = new DownloadDatasetResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DownloadDatasetResponseBodyData setOssHttpUrl(String ossHttpUrl) {
            this.ossHttpUrl = ossHttpUrl;
            return this;
        }
        public String getOssHttpUrl() {
            return this.ossHttpUrl;
        }

    }

}
