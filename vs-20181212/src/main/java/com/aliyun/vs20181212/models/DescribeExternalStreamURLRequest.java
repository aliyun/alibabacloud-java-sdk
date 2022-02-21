// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeExternalStreamURLRequest extends TeaModel {
    @NameInMap("Kind")
    public String kind;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("Profile")
    public String profile;

    @NameInMap("TxId")
    public String txId;

    @NameInMap("Url")
    public String url;

    public static DescribeExternalStreamURLRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeExternalStreamURLRequest self = new DescribeExternalStreamURLRequest();
        return TeaModel.build(map, self);
    }

    public DescribeExternalStreamURLRequest setKind(String kind) {
        this.kind = kind;
        return this;
    }
    public String getKind() {
        return this.kind;
    }

    public DescribeExternalStreamURLRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeExternalStreamURLRequest setProfile(String profile) {
        this.profile = profile;
        return this;
    }
    public String getProfile() {
        return this.profile;
    }

    public DescribeExternalStreamURLRequest setTxId(String txId) {
        this.txId = txId;
        return this;
    }
    public String getTxId() {
        return this.txId;
    }

    public DescribeExternalStreamURLRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
