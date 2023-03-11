// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeWebLockFileTypeSummaryResponseBody extends TeaModel {
    /**
     * <p>An array that consists of events on web tamper proofing returned.</p>
     */
    @NameInMap("List")
    public java.util.List<DescribeWebLockFileTypeSummaryResponseBodyList> list;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of events on web tamper proofing.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeWebLockFileTypeSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebLockFileTypeSummaryResponseBody self = new DescribeWebLockFileTypeSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWebLockFileTypeSummaryResponseBody setList(java.util.List<DescribeWebLockFileTypeSummaryResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<DescribeWebLockFileTypeSummaryResponseBodyList> getList() {
        return this.list;
    }

    public DescribeWebLockFileTypeSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeWebLockFileTypeSummaryResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeWebLockFileTypeSummaryResponseBodyList extends TeaModel {
        /**
         * <p>The number of attempts.</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The type of the protected file. Valid values:</p>
         * <br>
         * <p>*   **php**: PHP file</p>
         * <p>*   **jsp**: JSP file</p>
         * <p>*   **asp**: ASP file</p>
         * <p>*   **aspx**: ASPX file</p>
         * <p>*   **js**: JS file</p>
         * <p>*   **cgi**: CGI file</p>
         * <p>*   **html**: HTML file</p>
         * <p>*   **htm**: HTM file</p>
         * <p>*   **xml**: XML file</p>
         * <p>*   **shtml**: SHTML file</p>
         * <p>*   **shtm**: SHTM file</p>
         * <p>*   **jpg**: JPG file</p>
         * <p>*   **gif**: GIF file</p>
         * <p>*   **png**: PNG file</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeWebLockFileTypeSummaryResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            DescribeWebLockFileTypeSummaryResponseBodyList self = new DescribeWebLockFileTypeSummaryResponseBodyList();
            return TeaModel.build(map, self);
        }

        public DescribeWebLockFileTypeSummaryResponseBodyList setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeWebLockFileTypeSummaryResponseBodyList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
