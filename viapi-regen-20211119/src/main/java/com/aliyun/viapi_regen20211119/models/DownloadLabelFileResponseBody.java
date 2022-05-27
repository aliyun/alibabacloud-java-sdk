// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class DownloadLabelFileResponseBody extends TeaModel {
    @NameInMap("Data")
    public DownloadLabelFileResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static DownloadLabelFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DownloadLabelFileResponseBody self = new DownloadLabelFileResponseBody();
        return TeaModel.build(map, self);
    }

    public DownloadLabelFileResponseBody setData(DownloadLabelFileResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DownloadLabelFileResponseBodyData getData() {
        return this.data;
    }

    public DownloadLabelFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DownloadLabelFileResponseBodyData extends TeaModel {
        @NameInMap("OssHttpUrl")
        public String ossHttpUrl;

        public static DownloadLabelFileResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DownloadLabelFileResponseBodyData self = new DownloadLabelFileResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DownloadLabelFileResponseBodyData setOssHttpUrl(String ossHttpUrl) {
            this.ossHttpUrl = ossHttpUrl;
            return this;
        }
        public String getOssHttpUrl() {
            return this.ossHttpUrl;
        }

    }

}
