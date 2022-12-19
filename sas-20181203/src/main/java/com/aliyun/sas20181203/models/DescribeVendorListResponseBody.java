// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVendorListResponseBody extends TeaModel {
    // The ID of the request, which is used to locate and troubleshoot issues.
    @NameInMap("RequestId")
    public String requestId;

    // An array that consists of the service providers.
    @NameInMap("VendorNameList")
    public java.util.List<String> vendorNameList;

    public static DescribeVendorListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVendorListResponseBody self = new DescribeVendorListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVendorListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVendorListResponseBody setVendorNameList(java.util.List<String> vendorNameList) {
        this.vendorNameList = vendorNameList;
        return this;
    }
    public java.util.List<String> getVendorNameList() {
        return this.vendorNameList;
    }

}
