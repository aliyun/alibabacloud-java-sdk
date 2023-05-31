// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeQuaraFileDownloadInfoRequest extends TeaModel {
    /**
     * <p>The ID of the request source. Set the value to sas.</p>
     */
    @NameInMap("From")
    public String from;

    /**
     * <p>The ID of the quarantined file.</p>
     * <br>
     * <p>> If you do not specify this parameter, you cannot call the RollbackSuspEventQuaraFile operation to restore a quarantined file. You can call the [DescribeSuspEventQuaraFiles](~~DescribeSuspEventQuaraFiles~~) operation to query the IDs of quarantined files.</p>
     */
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
