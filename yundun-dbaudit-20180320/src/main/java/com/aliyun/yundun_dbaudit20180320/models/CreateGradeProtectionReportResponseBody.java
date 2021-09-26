// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class CreateGradeProtectionReportResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ServerData")
    public CreateGradeProtectionReportResponseBodyServerData serverData;

    public static CreateGradeProtectionReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateGradeProtectionReportResponseBody self = new CreateGradeProtectionReportResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateGradeProtectionReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateGradeProtectionReportResponseBody setServerData(CreateGradeProtectionReportResponseBodyServerData serverData) {
        this.serverData = serverData;
        return this;
    }
    public CreateGradeProtectionReportResponseBodyServerData getServerData() {
        return this.serverData;
    }

    public static class CreateGradeProtectionReportResponseBodyServerData extends TeaModel {
        @NameInMap("FileName")
        public String fileName;

        public static CreateGradeProtectionReportResponseBodyServerData build(java.util.Map<String, ?> map) throws Exception {
            CreateGradeProtectionReportResponseBodyServerData self = new CreateGradeProtectionReportResponseBodyServerData();
            return TeaModel.build(map, self);
        }

        public CreateGradeProtectionReportResponseBodyServerData setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

    }

}
