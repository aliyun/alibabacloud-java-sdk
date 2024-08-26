// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class ListNisInspectionTaskReportsResponseBody extends TeaModel {
    @NameInMap("InspectionReportList")
    public java.util.List<ListNisInspectionTaskReportsResponseBodyInspectionReportList> inspectionReportList;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>hKrS+MVXkuOgztXnvdml194Cz/lMNdmr+DEh0th6dVlNEo/F148UPCh2itDku7Qj</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>0D213AF9-7B8A-51A8-B411-2D797A1A447B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>34</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListNisInspectionTaskReportsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNisInspectionTaskReportsResponseBody self = new ListNisInspectionTaskReportsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNisInspectionTaskReportsResponseBody setInspectionReportList(java.util.List<ListNisInspectionTaskReportsResponseBodyInspectionReportList> inspectionReportList) {
        this.inspectionReportList = inspectionReportList;
        return this;
    }
    public java.util.List<ListNisInspectionTaskReportsResponseBodyInspectionReportList> getInspectionReportList() {
        return this.inspectionReportList;
    }

    public ListNisInspectionTaskReportsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListNisInspectionTaskReportsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListNisInspectionTaskReportsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListNisInspectionTaskReportsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListNisInspectionTaskReportsResponseBodyInspectionReportList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>nir-7c3dd178738a429abe6d</p>
         */
        @NameInMap("InspectionReportId")
        public String inspectionReportId;

        public static ListNisInspectionTaskReportsResponseBodyInspectionReportList build(java.util.Map<String, ?> map) throws Exception {
            ListNisInspectionTaskReportsResponseBodyInspectionReportList self = new ListNisInspectionTaskReportsResponseBodyInspectionReportList();
            return TeaModel.build(map, self);
        }

        public ListNisInspectionTaskReportsResponseBodyInspectionReportList setInspectionReportId(String inspectionReportId) {
            this.inspectionReportId = inspectionReportId;
            return this;
        }
        public String getInspectionReportId() {
            return this.inspectionReportId;
        }

    }

}
