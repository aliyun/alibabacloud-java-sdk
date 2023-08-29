// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trusted_server20200613.models;

import com.aliyun.tea.*;

public class DescribeBootResponseBody extends TeaModel {
    @NameInMap("GmtCreate")
    public String gmtCreate;

    @NameInMap("GmtModified")
    public String gmtModified;

    @NameInMap("Id")
    public Long id;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("WhiteListAffiliation")
    public Integer whiteListAffiliation;

    @NameInMap("WhiteListDetail")
    public String whiteListDetail;

    public static DescribeBootResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBootResponseBody self = new DescribeBootResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBootResponseBody setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public DescribeBootResponseBody setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public DescribeBootResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DescribeBootResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBootResponseBody setWhiteListAffiliation(Integer whiteListAffiliation) {
        this.whiteListAffiliation = whiteListAffiliation;
        return this;
    }
    public Integer getWhiteListAffiliation() {
        return this.whiteListAffiliation;
    }

    public DescribeBootResponseBody setWhiteListDetail(String whiteListDetail) {
        this.whiteListDetail = whiteListDetail;
        return this;
    }
    public String getWhiteListDetail() {
        return this.whiteListDetail;
    }

}
