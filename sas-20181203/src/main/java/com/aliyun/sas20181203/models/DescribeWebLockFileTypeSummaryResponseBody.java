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
     * 
     * <strong>example:</strong>
     * <p>4BB99533-4FDC-5B9C-A5E4-5AE3E9BE5C78</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of events on web tamper proofing.</p>
     * 
     * <strong>example:</strong>
     * <p>639</p>
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
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The type of the protected file. Valid values:</p>
         * <ul>
         * <li><strong>php</strong>: PHP file</li>
         * <li><strong>jsp</strong>: JSP file</li>
         * <li><strong>asp</strong>: ASP file</li>
         * <li><strong>aspx</strong>: ASPX file</li>
         * <li><strong>js</strong>: JS file</li>
         * <li><strong>cgi</strong>: CGI file</li>
         * <li><strong>html</strong>: HTML file</li>
         * <li><strong>htm</strong>: HTM file</li>
         * <li><strong>xml</strong>: XML file</li>
         * <li><strong>shtml</strong>: SHTML file</li>
         * <li><strong>shtm</strong>: SHTM file</li>
         * <li><strong>jpg</strong>: JPG file</li>
         * <li><strong>gif</strong>: GIF file</li>
         * <li><strong>png</strong>: PNG file</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>jsp</p>
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
