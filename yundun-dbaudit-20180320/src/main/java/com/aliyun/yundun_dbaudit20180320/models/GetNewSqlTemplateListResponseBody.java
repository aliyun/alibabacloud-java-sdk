// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class GetNewSqlTemplateListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("Results")
    public java.util.List<GetNewSqlTemplateListResponseBodyResults> results;

    public static GetNewSqlTemplateListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetNewSqlTemplateListResponseBody self = new GetNewSqlTemplateListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetNewSqlTemplateListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetNewSqlTemplateListResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public GetNewSqlTemplateListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetNewSqlTemplateListResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public GetNewSqlTemplateListResponseBody setResults(java.util.List<GetNewSqlTemplateListResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<GetNewSqlTemplateListResponseBodyResults> getResults() {
        return this.results;
    }

    public static class GetNewSqlTemplateListResponseBodyResults extends TeaModel {
        @NameInMap("TemplateContent")
        public String templateContent;

        @NameInMap("TemplateId")
        public String templateId;

        @NameInMap("FirstCaptureTime")
        public String firstCaptureTime;

        public static GetNewSqlTemplateListResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            GetNewSqlTemplateListResponseBodyResults self = new GetNewSqlTemplateListResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public GetNewSqlTemplateListResponseBodyResults setTemplateContent(String templateContent) {
            this.templateContent = templateContent;
            return this;
        }
        public String getTemplateContent() {
            return this.templateContent;
        }

        public GetNewSqlTemplateListResponseBodyResults setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public GetNewSqlTemplateListResponseBodyResults setFirstCaptureTime(String firstCaptureTime) {
            this.firstCaptureTime = firstCaptureTime;
            return this;
        }
        public String getFirstCaptureTime() {
            return this.firstCaptureTime;
        }

    }

}
