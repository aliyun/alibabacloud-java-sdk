// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeNotifyTemplateListResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeNotifyTemplateListResponseBodyData> data;

    @NameInMap("Page")
    public DescribeNotifyTemplateListResponseBodyPage page;

    /**
     * <strong>example:</strong>
     * <p>B3FED5B9-190A-5952-93A4-24FBF0F0C573</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeNotifyTemplateListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNotifyTemplateListResponseBody self = new DescribeNotifyTemplateListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNotifyTemplateListResponseBody setData(java.util.List<DescribeNotifyTemplateListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeNotifyTemplateListResponseBodyData> getData() {
        return this.data;
    }

    public DescribeNotifyTemplateListResponseBody setPage(DescribeNotifyTemplateListResponseBodyPage page) {
        this.page = page;
        return this;
    }
    public DescribeNotifyTemplateListResponseBodyPage getPage() {
        return this.page;
    }

    public DescribeNotifyTemplateListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeNotifyTemplateListResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Dear $aliyunUID : Cloud Security Center Threat Analysis and Response has detected a newly discovered security incident $incidentName(Incident id :$incidentID) in $startTime, Please go to Cloud Security Center Console View.</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>yundun_soar_incident_generate</p>
         */
        @NameInMap("EventId")
        public String eventId;

        /**
         * <strong>example:</strong>
         * <p>[\&quot;aliyunUID\&quot;,\&quot;incidentName\&quot;,\&quot;incidentID\&quot;,\&quot;startTime\&quot;]</p>
         */
        @NameInMap("Params")
        public String params;

        /**
         * <strong>example:</strong>
         * <p>[Alibaba Cloud Threat Analysis and Response] has detected a newly discovered security incident $incidentName($incidentID)</p>
         */
        @NameInMap("Subject")
        public String subject;

        /**
         * <strong>example:</strong>
         * <p>incident generate</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        public static DescribeNotifyTemplateListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeNotifyTemplateListResponseBodyData self = new DescribeNotifyTemplateListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeNotifyTemplateListResponseBodyData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DescribeNotifyTemplateListResponseBodyData setEventId(String eventId) {
            this.eventId = eventId;
            return this;
        }
        public String getEventId() {
            return this.eventId;
        }

        public DescribeNotifyTemplateListResponseBodyData setParams(String params) {
            this.params = params;
            return this;
        }
        public String getParams() {
            return this.params;
        }

        public DescribeNotifyTemplateListResponseBodyData setSubject(String subject) {
            this.subject = subject;
            return this;
        }
        public String getSubject() {
            return this.subject;
        }

        public DescribeNotifyTemplateListResponseBodyData setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

    }

    public static class DescribeNotifyTemplateListResponseBodyPage extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeNotifyTemplateListResponseBodyPage build(java.util.Map<String, ?> map) throws Exception {
            DescribeNotifyTemplateListResponseBodyPage self = new DescribeNotifyTemplateListResponseBodyPage();
            return TeaModel.build(map, self);
        }

        public DescribeNotifyTemplateListResponseBodyPage setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public DescribeNotifyTemplateListResponseBodyPage setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeNotifyTemplateListResponseBodyPage setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
