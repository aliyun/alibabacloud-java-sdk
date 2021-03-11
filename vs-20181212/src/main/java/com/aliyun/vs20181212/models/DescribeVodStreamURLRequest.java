// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeVodStreamURLRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ShowLog")
    public String showLog;

    @NameInMap("Url")
    public String url;

    @NameInMap("TxId")
    public String txId;

    public static DescribeVodStreamURLRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodStreamURLRequest self = new DescribeVodStreamURLRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVodStreamURLRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeVodStreamURLRequest setShowLog(String showLog) {
        this.showLog = showLog;
        return this;
    }
    public String getShowLog() {
        return this.showLog;
    }

    public DescribeVodStreamURLRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public DescribeVodStreamURLRequest setTxId(String txId) {
        this.txId = txId;
        return this;
    }
    public String getTxId() {
        return this.txId;
    }

}
