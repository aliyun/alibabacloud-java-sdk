// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVendorListResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>340D7FC4-D575-1661-8ACD-CFA7BE57B795</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>An array that consists of the service providers.</p>
     */
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
