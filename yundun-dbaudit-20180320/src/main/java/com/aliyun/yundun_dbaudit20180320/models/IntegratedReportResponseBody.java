// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class IntegratedReportResponseBody extends TeaModel {
    @NameInMap("ServerData")
    public String serverData;

    @NameInMap("RequestId")
    public String requestId;

    public static IntegratedReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        IntegratedReportResponseBody self = new IntegratedReportResponseBody();
        return TeaModel.build(map, self);
    }

    public IntegratedReportResponseBody setServerData(String serverData) {
        this.serverData = serverData;
        return this;
    }
    public String getServerData() {
        return this.serverData;
    }

    public IntegratedReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateIntegratedReportResponseBodyServerData extends TeaModel {
        @NameInMap("FileName")
        public String fileName;

        public static CreateIntegratedReportResponseBodyServerData build(java.util.Map<String, ?> map) throws Exception {
            CreateIntegratedReportResponseBodyServerData self = new CreateIntegratedReportResponseBodyServerData();
            return TeaModel.build(map, self);
        }

        public CreateIntegratedReportResponseBodyServerData setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

    }

}
