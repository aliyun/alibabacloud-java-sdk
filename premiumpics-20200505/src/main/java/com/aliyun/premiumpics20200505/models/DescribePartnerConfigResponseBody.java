// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.premiumpics20200505.models;

import com.aliyun.tea.*;

public class DescribePartnerConfigResponseBody extends TeaModel {
    @NameInMap("Contact")
    public String contact;

    @NameInMap("PartnerCode")
    public String partnerCode;

    @NameInMap("PartnerName")
    public String partnerName;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribePartnerConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePartnerConfigResponseBody self = new DescribePartnerConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePartnerConfigResponseBody setContact(String contact) {
        this.contact = contact;
        return this;
    }
    public String getContact() {
        return this.contact;
    }

    public DescribePartnerConfigResponseBody setPartnerCode(String partnerCode) {
        this.partnerCode = partnerCode;
        return this;
    }
    public String getPartnerCode() {
        return this.partnerCode;
    }

    public DescribePartnerConfigResponseBody setPartnerName(String partnerName) {
        this.partnerName = partnerName;
        return this;
    }
    public String getPartnerName() {
        return this.partnerName;
    }

    public DescribePartnerConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
