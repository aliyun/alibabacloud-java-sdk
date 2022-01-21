// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oms20160615.models;

import com.aliyun.tea.*;

public class GetAccessPolicyConfigResponseBody extends TeaModel {
    @NameInMap("AliUid")
    public String aliUid;

    @NameInMap("Compressed")
    public Boolean compressed;

    @NameInMap("Data")
    public String data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetAccessPolicyConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAccessPolicyConfigResponseBody self = new GetAccessPolicyConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAccessPolicyConfigResponseBody setAliUid(String aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public String getAliUid() {
        return this.aliUid;
    }

    public GetAccessPolicyConfigResponseBody setCompressed(Boolean compressed) {
        this.compressed = compressed;
        return this;
    }
    public Boolean getCompressed() {
        return this.compressed;
    }

    public GetAccessPolicyConfigResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetAccessPolicyConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
