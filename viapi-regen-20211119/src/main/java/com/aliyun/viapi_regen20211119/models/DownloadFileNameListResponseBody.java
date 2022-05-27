// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class DownloadFileNameListResponseBody extends TeaModel {
    @NameInMap("Data")
    public DownloadFileNameListResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static DownloadFileNameListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DownloadFileNameListResponseBody self = new DownloadFileNameListResponseBody();
        return TeaModel.build(map, self);
    }

    public DownloadFileNameListResponseBody setData(DownloadFileNameListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DownloadFileNameListResponseBodyData getData() {
        return this.data;
    }

    public DownloadFileNameListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DownloadFileNameListResponseBodyData extends TeaModel {
        @NameInMap("OssHttpUrl")
        public String ossHttpUrl;

        public static DownloadFileNameListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DownloadFileNameListResponseBodyData self = new DownloadFileNameListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DownloadFileNameListResponseBodyData setOssHttpUrl(String ossHttpUrl) {
            this.ossHttpUrl = ossHttpUrl;
            return this;
        }
        public String getOssHttpUrl() {
            return this.ossHttpUrl;
        }

    }

}
