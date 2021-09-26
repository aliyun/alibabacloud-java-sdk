// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class GetTopSqlTemplateListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TemplateList")
    public java.util.List<GetTopSqlTemplateListResponseBodyTemplateList> templateList;

    public static GetTopSqlTemplateListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTopSqlTemplateListResponseBody self = new GetTopSqlTemplateListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTopSqlTemplateListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTopSqlTemplateListResponseBody setTemplateList(java.util.List<GetTopSqlTemplateListResponseBodyTemplateList> templateList) {
        this.templateList = templateList;
        return this;
    }
    public java.util.List<GetTopSqlTemplateListResponseBodyTemplateList> getTemplateList() {
        return this.templateList;
    }

    public static class GetTopSqlTemplateListResponseBodyTemplateList extends TeaModel {
        @NameInMap("TemplateContent")
        public String templateContent;

        @NameInMap("ExecCostUS")
        public String execCostUS;

        @NameInMap("AffectRows")
        public String affectRows;

        @NameInMap("ExecCostUSMean")
        public String execCostUSMean;

        @NameInMap("LastCaptureTime")
        public String lastCaptureTime;

        @NameInMap("TemplateId")
        public String templateId;

        @NameInMap("CaptureCount")
        public String captureCount;

        public static GetTopSqlTemplateListResponseBodyTemplateList build(java.util.Map<String, ?> map) throws Exception {
            GetTopSqlTemplateListResponseBodyTemplateList self = new GetTopSqlTemplateListResponseBodyTemplateList();
            return TeaModel.build(map, self);
        }

        public GetTopSqlTemplateListResponseBodyTemplateList setTemplateContent(String templateContent) {
            this.templateContent = templateContent;
            return this;
        }
        public String getTemplateContent() {
            return this.templateContent;
        }

        public GetTopSqlTemplateListResponseBodyTemplateList setExecCostUS(String execCostUS) {
            this.execCostUS = execCostUS;
            return this;
        }
        public String getExecCostUS() {
            return this.execCostUS;
        }

        public GetTopSqlTemplateListResponseBodyTemplateList setAffectRows(String affectRows) {
            this.affectRows = affectRows;
            return this;
        }
        public String getAffectRows() {
            return this.affectRows;
        }

        public GetTopSqlTemplateListResponseBodyTemplateList setExecCostUSMean(String execCostUSMean) {
            this.execCostUSMean = execCostUSMean;
            return this;
        }
        public String getExecCostUSMean() {
            return this.execCostUSMean;
        }

        public GetTopSqlTemplateListResponseBodyTemplateList setLastCaptureTime(String lastCaptureTime) {
            this.lastCaptureTime = lastCaptureTime;
            return this;
        }
        public String getLastCaptureTime() {
            return this.lastCaptureTime;
        }

        public GetTopSqlTemplateListResponseBodyTemplateList setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public GetTopSqlTemplateListResponseBodyTemplateList setCaptureCount(String captureCount) {
            this.captureCount = captureCount;
            return this;
        }
        public String getCaptureCount() {
            return this.captureCount;
        }

    }

}
