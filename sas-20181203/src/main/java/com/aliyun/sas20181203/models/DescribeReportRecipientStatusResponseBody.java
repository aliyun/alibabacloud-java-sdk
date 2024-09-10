// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeReportRecipientStatusResponseBody extends TeaModel {
    /**
     * <p>The report recipients.</p>
     */
    @NameInMap("ReportRecipientList")
    public java.util.List<DescribeReportRecipientStatusResponseBodyReportRecipientList> reportRecipientList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D65AADFC-1D20-5A6A-8F6A-9FA53C0DC1F8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeReportRecipientStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeReportRecipientStatusResponseBody self = new DescribeReportRecipientStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeReportRecipientStatusResponseBody setReportRecipientList(java.util.List<DescribeReportRecipientStatusResponseBodyReportRecipientList> reportRecipientList) {
        this.reportRecipientList = reportRecipientList;
        return this;
    }
    public java.util.List<DescribeReportRecipientStatusResponseBodyReportRecipientList> getReportRecipientList() {
        return this.reportRecipientList;
    }

    public DescribeReportRecipientStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeReportRecipientStatusResponseBodyReportRecipientList extends TeaModel {
        /**
         * <p>Indicates whether the email address is verified. Valid values:</p>
         * <ul>
         * <li>0: no</li>
         * <li>1: yes</li>
         * </ul>
         * <blockquote>
         * <p> If no email is specified when you create a report, the value of this parameter is empty.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IsVerify")
        public Integer isVerify;

        /**
         * <p>The email address of the report recipient.</p>
         * <blockquote>
         * <p> If no email is specified when you create a report, the value of this parameter is empty.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:username@example.com">username@example.com</a></p>
         */
        @NameInMap("Recipient")
        public String recipient;

        public static DescribeReportRecipientStatusResponseBodyReportRecipientList build(java.util.Map<String, ?> map) throws Exception {
            DescribeReportRecipientStatusResponseBodyReportRecipientList self = new DescribeReportRecipientStatusResponseBodyReportRecipientList();
            return TeaModel.build(map, self);
        }

        public DescribeReportRecipientStatusResponseBodyReportRecipientList setIsVerify(Integer isVerify) {
            this.isVerify = isVerify;
            return this;
        }
        public Integer getIsVerify() {
            return this.isVerify;
        }

        public DescribeReportRecipientStatusResponseBodyReportRecipientList setRecipient(String recipient) {
            this.recipient = recipient;
            return this;
        }
        public String getRecipient() {
            return this.recipient;
        }

    }

}
