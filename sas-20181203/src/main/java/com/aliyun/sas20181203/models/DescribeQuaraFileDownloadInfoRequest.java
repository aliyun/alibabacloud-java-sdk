// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeQuaraFileDownloadInfoRequest extends TeaModel {
    /**
     * <p>The source identifier of the request. Set the value to sas.</p>
     * 
     * <strong>example:</strong>
     * <p>sas</p>
     */
    @NameInMap("From")
    public String from;

    /**
     * <p>The ID of the quarantined file.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, calling the RollbackSuspEventQuaraFile operation does not cancel the quarantine of the file in the quarantine box, which means the call does not take effect. Call the <a href="~~DescribeSuspEventQuaraFiles~~">DescribeSuspEventQuaraFiles</a> operation to obtain the quarantined file ID (the value of the Id parameter).</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123</p>
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
