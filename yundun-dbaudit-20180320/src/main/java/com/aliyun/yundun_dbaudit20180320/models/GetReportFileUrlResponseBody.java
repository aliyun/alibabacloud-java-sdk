// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class GetReportFileUrlResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ServerData")
    public GetReportFileUrlResponseBodyServerData serverData;

    public static GetReportFileUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetReportFileUrlResponseBody self = new GetReportFileUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetReportFileUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetReportFileUrlResponseBody setServerData(GetReportFileUrlResponseBodyServerData serverData) {
        this.serverData = serverData;
        return this;
    }
    public GetReportFileUrlResponseBodyServerData getServerData() {
        return this.serverData;
    }

    public static class GetReportFileUrlResponseBodyServerData extends TeaModel {
        @NameInMap("FileUrl")
        public String fileUrl;

        public static GetReportFileUrlResponseBodyServerData build(java.util.Map<String, ?> map) throws Exception {
            GetReportFileUrlResponseBodyServerData self = new GetReportFileUrlResponseBodyServerData();
            return TeaModel.build(map, self);
        }

        public GetReportFileUrlResponseBodyServerData setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

    }

}
