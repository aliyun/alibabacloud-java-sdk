// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribePopApiItemListResponseBody extends TeaModel {
    @NameInMap("Names")
    public java.util.List<String> names;

    @NameInMap("PopCode")
    public String popCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Long total;

    @NameInMap("Version")
    public String version;

    public static DescribePopApiItemListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePopApiItemListResponseBody self = new DescribePopApiItemListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePopApiItemListResponseBody setNames(java.util.List<String> names) {
        this.names = names;
        return this;
    }
    public java.util.List<String> getNames() {
        return this.names;
    }

    public DescribePopApiItemListResponseBody setPopCode(String popCode) {
        this.popCode = popCode;
        return this;
    }
    public String getPopCode() {
        return this.popCode;
    }

    public DescribePopApiItemListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePopApiItemListResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public DescribePopApiItemListResponseBody setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
