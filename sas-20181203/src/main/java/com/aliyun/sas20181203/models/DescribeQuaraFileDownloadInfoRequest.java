// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeQuaraFileDownloadInfoRequest extends TeaModel {
    @NameInMap("From")
    public String from;

    @NameInMap("QuaraFileId")
    public Integer quaraFileId;

    public static DescribeQuaraFileDownloadInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeQuaraFileDownloadInfoRequest self = new DescribeQuaraFileDownloadInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeQuaraFileDownloadInfoRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public DescribeQuaraFileDownloadInfoRequest setQuaraFileId(Integer quaraFileId) {
        this.quaraFileId = quaraFileId;
        return this;
    }
    public Integer getQuaraFileId() {
        return this.quaraFileId;
    }

}
